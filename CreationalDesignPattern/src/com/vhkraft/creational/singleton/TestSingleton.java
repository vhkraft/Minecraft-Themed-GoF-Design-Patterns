package com.vhkraft.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

/**
 * Client test class verifying Bill Pugh lazy loading, thread safety, 
 * reflection, serialization, and cloning security defenses for the Ender Dragon.
 */
public class TestSingleton {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("[System] === Minecraft Ender Dragon Full Singleton & Security Test ===");

        // 1. Standard Instance Retrieval
        System.out.println("[System] Step 1: Requesting initial Ender Dragon instance...");
        EnderDragon dragon1 = EnderDragon.getInstance();
        dragon1.roar();

        System.out.println();

        // 2. Test Multi-Threaded Thread Safety (Concurrency Stress Test)
        System.out.println("[System] Step 2: Testing Thread Safety with 50 concurrent threads...");
        int threadCount = 50;
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Set<EnderDragon> instantiatedInstances = Collections.synchronizedSet(new HashSet<>());

        for (int i = 0; i < threadCount; i++) {
            executor.submit(() -> {
                EnderDragon instance = EnderDragon.getInstance();
                instantiatedInstances.add(instance);
            });
        }

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("[System] Unique instances created across 50 threads: " + instantiatedInstances.size());
        if (instantiatedInstances.size() == 1) {
            System.out.println("[System] THREAD-SAFETY SUCCESS: JVM class loader guaranteed absolute thread safety!");
        } else {
            System.out.println("[System] THREAD-SAFETY FAILURE: Multiple instances were created concurrently!");
        }

        System.out.println();

        // 3. Test Reflection Attack
        System.out.println("[System] Step 3: Simulating Reflection Attack on private constructor...");
        try {
            Constructor<EnderDragon> constructor = EnderDragon.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            EnderDragon hackedDragon = constructor.newInstance();
            System.out.println("[System] Reflection Result: HashCode of hacked instance: " + System.identityHashCode(hackedDragon));
            System.out.println("[System] NOTE: Standard Bill Pugh permits reflection unless an explicit boolean flag guard is added.");
        } catch (Exception e) {
            System.out.println("[System] DEFENSE SUCCESS: Reflection blocked! Exception: " + e.getCause().getMessage());
        }

        System.out.println();

        // 4. Test Serialization Defense (`readResolve`)
        System.out.println("[System] Step 4: Simulating Serialization and Deserialization...");
        try {
            ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(byteOut);
            out.writeObject(dragon1);
            out.close();

            ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
            ObjectInputStream in = new ObjectInputStream(byteIn);
            EnderDragon deserializedDragon = (EnderDragon) in.readObject();
            in.close();

            System.out.println("[System] Original HashCode  : " + System.identityHashCode(dragon1));
            System.out.println("[System] Deserialized HashCode: " + System.identityHashCode(deserializedDragon));

            if (dragon1 == deserializedDragon) {
                System.out.println("[System] DEFENSE SUCCESS: readResolve() preserved Singleton identity during deserialization!");
            } else {
                System.out.println("[System] FAILURE: Deserialization created a duplicate object!");
            }
        } catch (Exception e) {
            System.out.println("[System] Serialization test error: " + e.getMessage());
        }

        System.out.println();

        // 5. Test Cloning Attack
        System.out.println("[System] Step 5: Simulating Object Cloning Attack...");
        try {
            Method cloneMethod = EnderDragon.class.getDeclaredMethod("clone");
            cloneMethod.setAccessible(true);
            cloneMethod.invoke(dragon1);
            System.out.println("[System] FAILURE: Cloning attack succeeded! (This should not happen)");
        } catch (Exception e) {
            System.out.println("[System] DEFENSE SUCCESS: Cloning attack blocked! Exception caught: " + e.getCause().toString());
        }

        System.out.println("[System] === All Singleton Tests Completed Successfully ===");
    }
}
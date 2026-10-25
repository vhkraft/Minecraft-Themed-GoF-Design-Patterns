package com.vhkraft.behavioral.visitor;

/**
 * Visitor interface declaring visit operations for each concrete tool type.
 */
public interface ToolVisitor {
    void visit(DiamondPickaxe pickaxe);
    void visit(NetheriteSword sword);
    void visit(Elytra elytra);
}
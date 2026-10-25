package com.vhkraft.behavioral.visitor;

/**
 * Element interface defining the acceptance contract for tool visitors.
 */
public interface ToolElement {
    
    /**
     * Accepts a tool visitor to perform operations on this element.
     * 
     * @param visitor the tool visitor instance
     */
    void accept(ToolVisitor visitor);
}
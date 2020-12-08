package com.kun.behavior.visitor;


public interface PartVisitor {

    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);

}

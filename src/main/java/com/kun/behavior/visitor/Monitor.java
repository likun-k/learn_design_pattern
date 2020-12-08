package com.kun.behavior.visitor;

public class Monitor implements ComputerPart {

    @Override
    public void accept(PartVisitor partVisitor) {
        partVisitor.visit(this);
    }
}

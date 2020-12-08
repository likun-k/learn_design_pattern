package com.kun.behavior.visitor;

public class Keyboard implements ComputerPart {

    @Override
    public void accept(PartVisitor partVisitor) {
        partVisitor.visit(this);
    }
}

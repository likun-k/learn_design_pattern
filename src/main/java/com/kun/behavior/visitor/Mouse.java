package com.kun.behavior.visitor;

public class Mouse implements ComputerPart {

    @Override
    public void accept(PartVisitor partVisitor) {
        partVisitor.visit(this);
    }
}

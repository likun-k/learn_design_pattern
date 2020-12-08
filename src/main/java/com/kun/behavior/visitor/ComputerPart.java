package com.kun.behavior.visitor;

public interface ComputerPart {

    void accept(PartVisitor partVisitor);

}

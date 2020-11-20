package com.kun.behavior.command;

public interface Command {

    default void execute(){
        throw new Error("method cannot be called");
    }

    default void redo(){
        throw new Error("method cannot be called");
    }

    default void undo(){
        throw new Error("method cannot be called");
    }

}

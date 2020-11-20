package com.kun.behavior.command;

public class TurnOnCommand implements Command {

    private Bulb bulb;

    public TurnOnCommand(Bulb bulb){
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.turnOn();
    }

    @Override
    public void redo() {
        bulb.turnOff();
    }

    @Override
    public void undo() {
        this.execute();
    }
}

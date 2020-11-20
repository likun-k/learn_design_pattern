package com.kun.behavior.command;

public class TurnOffCommand implements Command {

    private Bulb bulb;

    public TurnOffCommand(Bulb bulb){
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.turnOff();
    }

    @Override
    public void redo() {
        bulb.turnOn();
    }

    @Override
    public void undo() {
        this.execute();
    }
}

package com.kun.behavior.command;

public class Test {

    public static void main(String[] args) {
        Bulb bulb = new Bulb();
        bulb.status();

        Command turnOnCommand = new TurnOnCommand(bulb);
        Command turnOffCommand = new TurnOffCommand(bulb);

        Invoke invoke = new Invoke();
        invoke.submit(turnOnCommand);
        bulb.status();

        invoke.submit(turnOffCommand);
        bulb.status();

    }

}

class Invoke{

    public void submit(Command command){
        command.execute();
    }

}

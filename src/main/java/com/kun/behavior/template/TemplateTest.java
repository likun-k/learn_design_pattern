package com.kun.behavior.template;

public class TemplateTest {

    public static void main(String[] args) {
        Server tcpServer = new TcpServer();
        tcpServer.doServer();
    }

}

abstract class Server{
    final void doServer(){
        step1();
        step2();
    }
    abstract void step1();
    abstract void step2();

}

class TcpServer extends Server{
    @Override
    void step1() {
        System.out.println("tcp step1 ");
    }
    @Override
    void step2() {
        System.out.println("tcp step2 ");
    }
}

class MqttServer extends Server{
    @Override
    void step1() {
        System.out.println("mqtt step1 ");
    }
    @Override
    void step2() {
        System.out.println("mqtt step2 ");
    }
}

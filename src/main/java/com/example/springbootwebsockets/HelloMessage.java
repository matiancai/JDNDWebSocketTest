package com.example.springbootwebsockets;

public class HelloMessage {
    private String name;

    public HelloMessage(){
    }

    public HelloMessage(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

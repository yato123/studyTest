package com.test.spock.entity;

public class User {
    String name;
    String age;

    public String getName(){
        return this.name;
    }
    public String getAge(){
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public User (){
    }

    public User (String name,String age){
        this.name=name;
        this.age=age;
    }
}

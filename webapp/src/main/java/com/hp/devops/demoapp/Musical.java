package com.hp.devops.demoapp;

public class Musical {
    public int id;
    public String name = "tom exception";
    public String PASSWORD = "password";
    public String PASSWORD6 = "password6";
    public String PASSWORD8 = "password8";
    public String PASSWORD10 = "password10";
    public String PASSWORD11 = "password11";
    public String PASSWORD12 = "password12";
    public String PASSWORD13 = "password13";
    public String PASSWORD14 = "password14";
    public String PASSWORD15 = "password15";
    public int age;
    public int type1;
    public int type3;
    public int type2;
    public int type4;
    public int type11;
    public int type12;
    public int type13;
    public int type14;
    public int type15;
    public int type16;
    public int type17;
    public int type18;
    public Musical() {
        System.out.println("not   important      constructor");
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
       
    }


    public void setMusical() throws ExceptionInInitializerError {
        throw new ExceptionInInitializerError("some customize   exception with the name of " + name  + age + type2 + type18 + PASSWORD15);
    }

}

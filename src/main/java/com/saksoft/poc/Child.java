package com.saksoft.poc;

public class Child extends Parent{
    public void m1(){
        System.out.println("M1 of Child");
    }

    public void m2(){
        System.out.println("M2 of Child");
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.m1();
        //parent.m2();
    }
}

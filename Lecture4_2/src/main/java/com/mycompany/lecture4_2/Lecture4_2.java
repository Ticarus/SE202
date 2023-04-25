package com.mycompany.lecture4_2;

public class Lecture4_2 {

    public static void main(String[] args) {
        singleton_ex();
    }
    
    public static void singletonlazy_ex(){
        SingletonLazy singleton1 = SingletonLazy.getInstance();
        SingletonLazy singleton2 = SingletonLazy.getInstance();
        
        System.out.println("singleton1 ==> " + singleton1);
        System.out.println("singleton2 ==> " + singleton2);
        
        System.out.println(singleton1 == singleton1);
    }
    //-----------------------------------------------------------------------------
    public static void fame_ex(){
        Fame f1 = Fame.getInstance();
        Fame f2 = Fame.getInstance();
        
        System.out.println("f1 ==> " + f1);
        System.out.println("f2 ==> " + f2);
        
        System.out.println("The value of the count " + Fame.getCount());
    }
    //-----------------------------------------------------------------------------
    public static void singleton_ex(){
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();
        
        System.out.println("PART I");
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
        
        x.s = (x.s).toUpperCase();
        System.out.println("PART II");
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
        
        z.s = (z.s).toLowerCase();
        System.out.println("PART III");
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
    }
}

package org.example.inheritance;

import static java.lang.System.out;

interface MyInterface1 {
  int types = 10;
  public static void myStaticMethodInterface() {

    out.println("Static-Interface MEthod");
  }
  public default void myInstanceMethodInterface() {

    out.println("Instance-Interface MEthod");
  }
}

public class InheritanceMethodsInInterfaces implements MyInterface1 {
  //  static int types = 300;

  public void myInstanceContext() {

    MyInterface1.myStaticMethodInterface();

    this.myInstanceMethodInterface();
    myInstanceMethodInterface();
  }

  public static void myStaticContext() {

    MyInterface1.myStaticMethodInterface();
  }

  public static void main(String[] args) {

    out.println("Hiding - 'overiding a class-var: " + types);
  }
}
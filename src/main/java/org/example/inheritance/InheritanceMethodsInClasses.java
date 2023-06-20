package org.example.inheritance;

import static java.lang.System.out;

class MyClass {
  public static int types = 20;
  public static void myStaticMethodFromClass() {

    out.println("Static-Class MEthod");
  }
  public void myInstanceMethodFromClass() {

    out.println("Instance-Class MEthod");
  }
}

public class InheritanceMethodsInClasses extends MyClass
{

  public void myInstanceContext() {
    myStaticMethodFromClass();
    MyClass.myStaticMethodFromClass();

    this.myInstanceMethodFromClass();
    myInstanceMethodFromClass();

  }

  public static void myStaticContext() {
    myStaticMethodFromClass();
    MyClass.myStaticMethodFromClass();


  }

  public static void main(String[] args) {

    MyClass.myStaticMethodFromClass();
    out.println("Hiding - 'overiding a class-var: " + types);
  }
}
package org.example.inheritance;

import static java.lang.System.out;

class MyClass {
  public static int staticVar = 20;
  public int instanceVar = 20;
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
    final int staticVar1 = staticVar;
    final int staticVar2 = MyClass.staticVar;

    this.myInstanceMethodFromClass();
    myInstanceMethodFromClass();
    final int instanceVar1 = instanceVar;
    final int instanceVar2 = this.instanceVar;

  }

  public static void myStaticContext() {
    myStaticMethodFromClass();
    MyClass.myStaticMethodFromClass();

    final int staticVar1 = staticVar;
    final int staticVar2 = MyClass.staticVar;

  }

  public static void main(String[] args) {

    MyClass.myStaticMethodFromClass();
    out.println("Hiding - 'overiding a class-var: " + staticVar);
  }
}
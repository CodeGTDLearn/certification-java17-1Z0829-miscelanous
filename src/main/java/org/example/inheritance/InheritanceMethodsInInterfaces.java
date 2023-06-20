package org.example.inheritance;

import static java.lang.System.out;

interface MyInterface1 {
  int PUBLIC_STATIC_FINAL_IMPLICITLY_VAR = 10;
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
    final int var1 = MyInterface1.PUBLIC_STATIC_FINAL_IMPLICITLY_VAR;
    final int var2 = PUBLIC_STATIC_FINAL_IMPLICITLY_VAR;
    final int var3 = this.PUBLIC_STATIC_FINAL_IMPLICITLY_VAR;

    this.myInstanceMethodInterface();
    myInstanceMethodInterface();
  }

  public static void myStaticContext() {
    MyInterface1.myStaticMethodInterface();
    final int var1 = MyInterface1.PUBLIC_STATIC_FINAL_IMPLICITLY_VAR;
    final int va2 = PUBLIC_STATIC_FINAL_IMPLICITLY_VAR;
  }

  public static void main(String[] args) {

    out.println("Hiding - 'overiding a class-var: " + PUBLIC_STATIC_FINAL_IMPLICITLY_VAR);
  }
}
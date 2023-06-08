package org.example.initializers;

import static java.lang.System.*;

class Dad {
  {
    out.println("\n"+"dad-instance-initializer");
  }

  static {
    out.println("\n"+"dad-static-initializer");
  }

  static String staticVarDad = getStaticVarDad();
  String instanceVarDad = getInstanceVarDad();


  private static String getStaticVarDad() {
    final String s = "dad-static-variable";
    out.println(s);
    return s;
  }

  private String getInstanceVarDad() {
    final String s = "dad-instance-variable";
    out.println(s);
    return s;
  }

  Dad() {

    out.println("dad-constr" + "\n");
  }
}

class Son extends Dad {
  {
    out.println("son-instance-initializer");
  }
  String instanceVarSon = getInstanceVarSon();

  static {
    out.println("\n"+"son-static-initializer");
  }
  static String staticVarSon = getStaticVarSon();



  private static String getStaticVarSon() {
    final String s = "son-static-variable";
    out.println(s);
    return s;
  }

  private String getInstanceVarSon() {
    final String s = "son-instance-variable";
    out.println(s);
    return s;
  }

  Son() {

    out.println("son-constr");
  }
}

public class InitOrderInheritance {
  public static void main(String[] args) {
    //One o = null;
    out.println("Starting-Son");

    Son t = new Son();

    out.println("\n"+"Ending-Son");

  }
}
package org.example.inheritance;

class A {
}

public class Anonymous_Class {


  public class Inner {


    public void m() {

      System.out.println("This is my Original Behaviour");

    }


  }

 public static void main(String args[]) {

   new Anonymous_Class().new Inner().m();

    new Anonymous_Class().new Inner() {
      public void m() {
        System.out.println("Inner_changing his behaviour by itself.");
      }
    }.m();
    var tc = new Anonymous_Class();
  }
}
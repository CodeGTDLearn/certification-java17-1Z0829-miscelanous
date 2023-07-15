package org.example.inheritance;

class A {
}

public class Class_Overriding_itself {


  public class Inner {


    public void m() {

      System.out.println("This is my Original Behaviour");

    }


  }

 public static void main(String args[]) {

   new Class_Overriding_itself().new Inner().m();

    new Class_Overriding_itself().new Inner() {
      public void m() {
        System.out.println("Inner_changing his behaviour by itself.");
      }
    }.m();
    var tc = new Class_Overriding_itself();
  }
}
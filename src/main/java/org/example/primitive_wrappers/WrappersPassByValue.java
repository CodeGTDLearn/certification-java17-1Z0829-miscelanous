package org.example.primitive_wrappers;

public class WrappersPassByValue {
  public static void testIntsStatic(Integer obj, int var) {

    obj = var++;
    obj++;
  }

  public void testIntsInstance(Integer obj, int var) {

    obj = var++;
    obj++;
  }

  public static void main(String[] args) {

    WrappersPassByValue t = new WrappersPassByValue();
    Integer val1 = new Integer(5);
    int val2 = 9;
    t.testIntsInstance(val1++, ++ val2);
    System.out.println(val1 + " " + val2);


    val1 = new Integer(5);
    val2 = 9;
    t.testIntsStatic(val1++, ++ val2);
    System.out.println(val1 + " " + val2);
  }
}
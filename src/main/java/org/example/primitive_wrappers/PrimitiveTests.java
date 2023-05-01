package org.example.primitive_wrappers;

public class PrimitiveTests {
  public static void main(String[] args) {

    short x = 3;
    int y = 40000;
    x += y;            //   (short)(40000 + 3);

    var myshort = x;

    System.out.println(myshort);
  }
}
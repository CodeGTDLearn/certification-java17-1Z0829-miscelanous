package org.example.generics;

import static java.lang.System.out;

public class MyRawGenericClass<T> {

  T myVariable;

  public <T> String transform(T t) {

    return t.toString() + "-" + t.hashCode()+ "-" + t.getClass();
  }

  public static void main(String[] args) {

    MyRawGenericClass gc = new MyRawGenericClass();
    out.println(gc.transform(1));
    out.println(gc.transform("hello"));

    MyRawGenericClass<String> gcStr = new MyRawGenericClass<String>();
    out.println(gcStr.transform(1.1));

    out.println(gc.myVariable);
  }
}
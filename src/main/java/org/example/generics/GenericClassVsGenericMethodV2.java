package org.example.generics;

public class GenericClassVsGenericMethodV2<T> {

  T instanceVariable;

  public  String usingGenericTypeClass(T t) {

    return t.toString() + "-GenericTypeClass-" + t.getClass();
  }

  public <T> String usingGenericTypeMethod(T t) {

    return t.toString() + "-GenericTypeMethod-" + t.getClass();
  }

  public static void main(String[] args) {

    GenericClassVsGenericMethodV2 gc = new GenericClassVsGenericMethodV2();

    System.out.println(gc.usingGenericTypeMethod(1));

    System.out.println(gc.usingGenericTypeClass(1.1));

    System.out.println(gc.instanceVariable);
  }
}
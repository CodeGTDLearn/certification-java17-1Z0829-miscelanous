package org.example.generics;

public class GenericClassVsGenericMethodV1<T> {
  public <T> String transform(T t) {

    return t.toString() + "-" + t.hashCode() + " - GenericClassVsGenericMethodV1";
  }

  public static void main(String[] args) {

    GenericClassVsGenericMethodV1 gc = new GenericClassVsGenericMethodV1();
    System.out.println(gc.transform(1));
    System.out.println(gc.transform("hello"));
    GenericClassVsGenericMethodV1<String> gcStr = new GenericClassVsGenericMethodV1<String>();
    System.out.println(gcStr.transform(1.1));
  }
}
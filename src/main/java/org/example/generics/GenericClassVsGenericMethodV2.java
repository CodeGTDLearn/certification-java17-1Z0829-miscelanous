package org.example.generics;

public class GenericClassVsGenericMethodV2<T> {

  T instanceVariable;


  public <T> String transform(T t) {

    return t.toString() + "-" + t.hashCode() + " - GenericClassVsGenericMethodV2";
  }

  public static void main(String[] args) {

    GenericClassVsGenericMethodV2 gc = new GenericClassVsGenericMethodV2();
    System.out.println(gc.transform(1));
    System.out.println(gc.transform("hello"));
    GenericClassVsGenericMethodV2<String> gcStr = new GenericClassVsGenericMethodV2<String>();
    System.out.println(gcStr.transform(1.1));
  }
}
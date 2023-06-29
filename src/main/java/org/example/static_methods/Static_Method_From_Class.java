package org.example.static_methods;


 class Classic2 {
  final int version = 1;
  static int staticVersion = 1;


  static void StaticMethod() {

    System.out.println("Classic2 Static Method");
  }


  public void read() {


  }
}

class MediaReader2 extends Classic2 {
  static int staticVersion = 3;
  int version = 2;

  static void StaticMethod() {

    System.out.println("MediaReader2 Static Method");
  }

  public void read() {

    System.out.println(((Classic2) this).version);
    System.out.println(version);
    System.out.println(staticVersion);
    Classic2.StaticMethod();
    StaticMethod();
  }
}

public class Static_Method_From_Class {
  public static void main(String[] args) {

    MediaReader2 mr = new MediaReader2();
    mr.read();
  }
}
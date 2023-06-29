package org.example.static_methods;


interface Classic {
  int version = 1;


  static void StaticMEthod() {

    System.out.println("Interface Static Method");
  }


  public void read();
}

class MediaReader implements Classic {
  int version = 2;

  static void StaticMEthod() {

    System.out.println("Classic Static Method");
  }

  public void read() {

    System.out.println(((Classic) this).version);
    System.out.println(version);
    Classic.StaticMEthod();
    StaticMEthod();
  }
}

public class Static_Method_Test {
  public static void main(String[] args) {

    MediaReader mr = new MediaReader();
    mr.read();
  }
}
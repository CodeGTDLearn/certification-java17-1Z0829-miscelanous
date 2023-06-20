package org.example.inheritance;

interface Eatable {
  int types = 10;
}

class Food implements Eatable {
  public static int types = 20;
}

public class Fruit extends Food implements Eatable {
  public static void main(String[] args) {

//    types = 30;
//    System.out.println(types);

    Food.types = 30;
    System.out.println(Eatable.types);
  }
}
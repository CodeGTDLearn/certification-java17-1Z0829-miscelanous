package org.example.inheritance;

import static java.lang.System.out;

interface Eatable {
  int types = 10;
}

class Food implements Eatable {
  public static int types = 20;
}

public class Fruit extends Food // implements Eatable
{
//  static int types = 300;

  public static void main(String[] args) {

        out.println("Hiding - 'overiding a class-var: " + types);
    out.println(
         "Addressing - Access class-var on Parent-Class: " + Food.types);
  }
}
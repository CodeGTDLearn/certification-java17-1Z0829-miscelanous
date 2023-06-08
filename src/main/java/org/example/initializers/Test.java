package org.example.initializers;

class Pai {
  {
    System.out.println("pai-instance");
  }
  static {
    System.out.println("1) pai-static");
  }


  Pai() {

    System.out.println("pai-constr" + "\n");
  }
}

class Filho extends Pai {
  static {
    System.out.println("1) Filho - static");
  }

  {
    System.out.println("Filho - instance");
  }

  Filho() {

    System.out.println("Filho-constr");
  }
}

public class Test {
  public static void main(String[] args) {
    //One o = null;
    Filho t = new Filho();
  }
}
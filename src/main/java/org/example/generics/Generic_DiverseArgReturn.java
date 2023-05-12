package org.example.generics;

public class Generic_DiverseArgReturn {
  public static void main(String args[]) {

    String res1 = Generic_DiverseArgReturn.<String, String>myMethod("teste");
    System.out.println(res1);

    String res2 = Generic_DiverseArgReturn.myMethod(10);
    System.out.println(res2);
  }


  public static <T, U> T myMethod(U arg) {

    T myGenReturn;

    if (arg instanceof String s1) {
      myGenReturn = (T) ("O parâmetro é uma String: " + s1);
    } else if (arg instanceof Integer) {
      myGenReturn = (T) ("O parâmetro é um Integer: " + arg);
    } else {
      myGenReturn = (T) ("O parâmetro é de um tipo desconhecido: " + arg);
    }
    return myGenReturn;
  }
}
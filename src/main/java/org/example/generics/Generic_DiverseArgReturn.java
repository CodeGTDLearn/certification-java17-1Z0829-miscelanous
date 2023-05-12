package org.example.generics;

public class Generic_DiverseArgReturn {
  public static void main(String args[]) {

    String resultado1 = Generic_DiverseArgReturn.<String, String>meuMetodo("teste");
    System.out.println(resultado1); // imprime "O parâmetro é uma String: teste"

    String resultado2 = Generic_DiverseArgReturn.<String, Integer>meuMetodo(10);
    System.out.println(resultado2); // imprime "O parâmetro é um Integer: 10"

    String resultado3 = Generic_DiverseArgReturn.<String, Double>meuMetodo(3.14);
    System.out.println(resultado3); // imprime "O parâmetro é de um tipo desconhecido: 3.14"
  }


  public static <T, U> T meuMetodo(U parametro) {

    T valor1;
    if (parametro instanceof String) {
      valor1 = (T) ("O parâmetro é uma String: " + parametro);
    } else if (parametro instanceof Integer) {
      valor1 = (T) ("O parâmetro é um Integer: " + parametro);
    } else {
      valor1 = (T) ("O parâmetro é de um tipo desconhecido: " + parametro);
    }
    return valor1;
  }
}
package org.example.generics;

public class Generic_ReturnMethod {

  <T> T generic_Return_Argument(T element) {

    return element;

  }

  <T> String generic_Argument(T element) {

    return element.toString();

  }

  <T extends Number> T generic_ReturnArgumentBounded(T number) {

    show("\n Showing my Number: " + number.getClass()
                                          .toGenericString() + " - " + number);

    return number;
  }


  public static void main(String args[]) {

    Generic_ReturnMethod gen = new Generic_ReturnMethod();

    final String retWord = gen.generic_Return_Argument("myWord");
    show(retWord + retWord.getClass().toGenericString());

    final int retInt = gen.generic_Return_Argument(5);
    System.out.println(retInt);

    final Integer myWrapper = gen.generic_Return_Argument(55);
    show(myWrapper + myWrapper.getClass().toGenericString());

    final Long aLong = gen.generic_ReturnArgumentBounded(45L);

    show(gen.generic_Argument(55L));
  }

  private static void show(String myWrapper) {

    System.out.println(myWrapper);
  }
}
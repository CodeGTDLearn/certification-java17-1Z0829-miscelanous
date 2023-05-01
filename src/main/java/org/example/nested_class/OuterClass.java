package org.example.nested_class;

public class OuterClass {

  public static int OuterStatic = 0;
  public int OuterInstance = 0;

  static {

    final int outerStatic = OuterStatic;
    final int nestedStatic = NestedClass.NestedStatic;
//    OuterInstance;
  }

  {
    final int outerStatic = OuterStatic;
    final int nestedStatic = NestedClass.NestedStatic;
    final int outerInstance = OuterInstance;

  }


  static void staticMethod() {

    final int xx = OuterStatic;
//    OuterInstance;
    final int nestedStatic = NestedClass.NestedStatic;

  }

  void instanceMethod() {

    final int xx = OuterStatic;
    final int nestedStatic = NestedClass.NestedStatic;


    final int outerInstance = OuterInstance;

  }


  



  static class NestedClass {

    public static int NestedStatic = 0;
    public int NestedInstance = 0;

    static {

      final int outerStatic = OuterStatic;
      final int nestedStatic = NestedStatic;
//      OuterInstance;
//      NestedInstance;
    }

    {
      final int outerStatic = OuterStatic;
      final int nestedStatic = NestedStatic;
//      OuterInstance;
      final int nestedInstance = NestedInstance;
    }

    static void StaticMethod() {

      final int xx = OuterStatic;
      final int nestedStatic = NestedStatic;
//      OuterInstance;
//      NestedInstance;

      final int i = NestedStatic;
      //      NestedInstance;
    }

    void NonStaticMethod1() {

      final int xx = OuterStatic;
      final int nestedStatic = NestedStatic;

//      OuterInstance;
      final int xxx = NestedInstance;
    }
  }
}
package org.example.overloads;

public class LoadTest {

  public static void main(String[] args) throws Exception {

    LoadTest t = new LoadTest();
    //    int i = t.getLoad();
    //    double d = t.getLoad();
    //    System.out.println(i + d);
  }

  //  public int getLoad() {
  //
  //    return 1;
  //  }

  public double getLoad() {

    return 3.0;
  }

  public double getLoad(double myDouble) {

    return myDouble;
  }

  public double getLoad(double myDouble, String myTitle) {

    System.out.println(myTitle + myDouble);
    return myDouble;
  }

  public double getLoad(String myTitle, double myDouble) {

    System.out.println(myTitle + myDouble);
    return myDouble;
  }

  public String getLoadVarArgs(String[] myTitle) {

    System.out.println(myTitle[0]);
    return myTitle[0];
  }

//  public String getLoadVarArgs(String... myTitle) {
//
//    System.out.println(myTitle[0]);
//    return myTitle[0];
//  }
}
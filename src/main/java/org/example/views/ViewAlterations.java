package org.example.views;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class ViewAlterations {
  public static void main(String[] args) {

    String[] origem = {"a", "b"};

    for (var st : origem) out.println("Origin: " + st);
    out.println();

    List<String> view = Arrays.asList(origem);
    for (var st : view) out.println("Create View: " + st);
    out.println();


    out.println("Change View-Item[1] / Origin-Item[0]" + "\n");
    origem[0] = "changeOrigin";
    view.set(1, "changeView");

/*╔═════════════════════╗
  ║ DIRECT REMOVE + ADD ║
  ╠═════════════════════╣
  ║     not allowed     ║
  ╚═════════════════════╝*/
    // view.add("changeView");
    // view.remove("changeView");

    for (var st : origem) out.println("Final Origin: " + st);
    out.println();
    for (var st : view) out.println("Final View: " + st);


  }
}
//    view.sort(Comparator.reverseOrder());
//    for (var st : view) System.out.println("Revert View: " + st);
//    System.out.println();
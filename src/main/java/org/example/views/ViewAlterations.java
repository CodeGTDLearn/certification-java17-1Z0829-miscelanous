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



/*╔═════════════════════╗
  ║ DIRECT REMOVE + ADD ║
  ╠═════════════════════╣
  ║     not allowed     ║
  ╚═════════════════════╝*/
    // view.add("changeView");
    // view.remove("changeView");

    origem[0] = "Origin Item-Changed";
    view.set(1, "View Item-Changed");
    out.println("Change Origin-Item[0]");
    for (var st : origem) out.println("Final Origin: " + st);
    out.println();
    out.println("Change View-Item[1]");
    for (var st : view) out.println("Final View: " + st);
  }
}
//    view.sort(Comparator.reverseOrder());
//    for (var st : view) System.out.println("Revert View: " + st);
//    System.out.println();
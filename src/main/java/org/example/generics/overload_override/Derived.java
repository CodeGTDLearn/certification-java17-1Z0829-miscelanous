package org.example.generics.overload_override;

import java.util.Map;
import java.util.TreeMap;

class Derived extends Base {


  // OVER-LOAD
//  public <T, Z> TreeMap<T, Z> getMap(T t, Z z) {
//
//    return new TreeMap<T, Z>();
//  }


  // OVERRIDE
  public Map<Double, Long> getMap(Number t, Number z) {

    return new TreeMap<Double, Long>();
  }

  // OVERRIDE
  //  public Map<Integer, Integer> getMap(Number t, Number z) {
  //
  //    return new HashMap<Integer, Integer>();
  //  }
}
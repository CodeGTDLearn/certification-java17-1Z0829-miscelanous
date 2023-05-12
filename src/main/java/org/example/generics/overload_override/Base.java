package org.example.generics.overload_override;

import java.util.HashMap;
import java.util.Map;

class Base {
  public <T extends Number, Z extends Number> Map<T, Z> getMap(T t, Z z) {

    return new HashMap<T, Z>();
  }


  public <T extends Number, Z extends Number, K> Map<K, K> getMapTriple(T t, Z z, K k) {

    return new HashMap<K, K>();
  }
}
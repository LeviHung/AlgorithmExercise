

import java.util.ArrayList;
import java.util.List;

/*
 * Another solution for designing a hash table from nimrod46 on GitHub.
 */

/**
 * This is just an example on how you could write a HashTable as it was shown on the course,
 * this is not how it's implemented in Java, please refer to {@link java.util.HashMap}
 */
public class MyHashTable {

  private static class MyNodes extends ArrayList<MyNode> {
  }

  private final int length;
  private MyNodes[] data;

  public MyHashTable(int size) {
    length = size;
    data = new MyNodes[length];
  }

  public void set(String key, int value) {
    if (data[hash(key)] == null) {
      data[hash(key)] = new MyNodes();
    }
    data[hash(key)].add(new MyNode(key, value));
  }

  public int get(String key) {
    if (data[hash(key)] == null) {
      return 0;
    }
    for (MyNode node : data[hash(key)]) {
      if (node.getKey().equals(key)) {
        return node.getValue();
      }
    }
    return 0;
  }

  public List<String> keys() {
    List<String> keys = new ArrayList<>();
    for (int i = 0; i < length; i++) {
      if (data[i] != null) {
        for (int j = 0; j < data[i].size(); j++) {
          keys.add(data[i].get(j).getKey());
        }
      }
    }
    return keys;
  }

  private int hash(String key) {
    int hash = 0;
    for (int i = 0; i < key.length(); i++) {
      hash = (hash + key.charAt(i) * i) % length;
    }
    return hash;
  }
}


class MyNode {
    private String key;
    private int value;


  public MyNode(String key, int value) {
    this.key = key;
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}

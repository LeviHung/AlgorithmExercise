import java.util.ArrayList;

/*
 * MyArrayListHashTable Class
 */
public class MyArrayListHashTable {

  private static class BucketNodes extends ArrayList<BucketNode> {
  }

  private BucketNodes data[];

  /*
   * Constructor
   * @param size The size of the hash table
   */
  public MyArrayListHashTable(int size)
  {
    data = new BucketNodes[size];
  }

  private int getHash(String key) 
  {
    int hash = 0;
    for (int i = 0; i < key.length(); i++) {
      hash = (hash + key.charAt(i) * i) % this.data.length;
    }
    return hash;
  }

  public void set(String key, int value)
  {
    int address = this.getHash(key);

    if (this.data[address] == null) {
      this.data[address] = new BucketNodes();
    }

    BucketNode bn = new	BucketNode(key, value); 
    this.data[address].add(bn);

  }

  public int get(String key)
  {
    int address = this.getHash(key);

    if (this.data[address] != null) {
      for (int i = 0; i < this.data[address].size(); i++) {
        if (key.equals(this.data[address].get(i).getKey())) {
          return this.data[address].get(i).getValue();
        }
      }
    }
    return 0; 
  }

  public ArrayList<String> getKeys()
  {
    ArrayList<String> keyList = new ArrayList<String>();

    for (int i = 0; i < this.data.length; i++) {
      if (this.data[i] != null) {
        for (int j = 0; j < this.data[i].size(); j++) {
          keyList.add(this.data[i].get(j).getKey());
        }				
      }
    }

    return keyList;
  }
}

class BucketNode {
  private String key;
  private int value;

  public BucketNode(String key, int value)
  {
    this.key = key;
    this.value = value;
  }

  public String getKey()
  {
    return this.key;
  }

  public int getValue()
  {
    return this.value;
  }

  public void setKey(String key)
  {
    this.key = key;
  }

  public void setValue(int value)
  {
    this.value = value;
  }
}

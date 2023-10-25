class Lista {
  private String[] data;
  private int lastItem = 0;

  public Lista() {
    this.data = new String[10];
  }
  
  public void add(String entrada) {
    if (lastItem > data.length - 1) {
      data[lastItem + 1] = entrada;
      lastItem++;
    }
  }

  public int size() {
    return lastItem;
  }

  public boolean contains(String entrada) {
    for (int index = 0; index < lastItem; index++) {
      if (data[index].equals(entrada)) return true;
    }

    return false;
  }

  public String get(int index) {
    return data[index];
  }

  public void clear() {
    this.data = new String[10];
    lastItem = 0;
  }
    
}
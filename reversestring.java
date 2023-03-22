class main {
  public static void main(String[] args) {
    String Str = "shireesha";
    String bag = "";
    for (int i = 0; i <Str.length(); i++) {
      bag =Str.charAt(i) + bag;
    }
    
    System.out.println(bag);
  }
}

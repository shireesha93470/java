class Main {
    public static void main(String[] args) {
     int width = 6;  
     int height = 6;
for (int i = 0; i < height; i++) {
     String a= "";
   
    for (int j = 0; j < width - i; j++) {
        a += " ";
    }
  
    for (int  k = 0; k < 2 * i - 1; k++) {
        a += "*";
    }
    System.out.println(a);
}
}
}

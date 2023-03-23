public class Main {
   public static void main(String[] args) {
    int a[][]={{1,2},
               {3,4}};
    for(int i=0;i<a.length;i++){
    String bag="";
    for(int j=a.length-1;j>=0;j--){
    bag=bag+a[j][i]+" ";
   }
   System.out.println(bag);

}
}
}


public class Main {
  public static void main(String[] args) {
   int[] a={1,2,3,4};
   int[] b={5,6,7,8};
   
   Array bag=new Array()
   for(int i=0;i<a.length;i++){
   bag=bag+a[i]+" ";
   }
   for(int j=0;j<b.length;j++){
   bag=bag+b[j]+" ";
   }
    System.out.println(bag);
  }
}


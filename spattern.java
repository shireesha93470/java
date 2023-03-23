
   
public class Main {
  public static void main(String[] args) {
  int height=5;
 for (int i = 0; i < height; i++){
     for (int j = 0; j < height; j++) {
       if ((i == 0 || i == height / 2|| i == height - 1)){
              System.out.printf("*");
            }else if (i < height / 2&& j == 0){
                System.out.printf("*");
            }else if (i > height / 2&& j == height - 1){
                System.out.printf("*");
            }else
                System.out.printf(" ");
        }
        System.out.printf("\n");
       }
}
    
  
}





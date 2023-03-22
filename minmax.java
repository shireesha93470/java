public class Main{   
 public static void main(String[] args) {  
 String str= "grass is greener on the other side";
 String bag="";  
     for(int i = 0; i < str.length(); i++) {  
       for(int j = i+1; j < str.length(); j++) {  
        if(str[i] == str[j] ){
          bag=bag+i;
          System.out.println(bag);
        }
        }
        }
        }
        }
        
        
        

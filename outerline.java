public class Main {
    public static void main(String[] args) {
        int  n=5;
        for(int i=0;i<=n;i++){
        String bag="";
        for(int j=0;j<=n;j++){
        if(i==0||i==n){
        bag=bag+"*"+" ";
        }else if(j==0||j==n){
        bag=bag+"*"+" ";
        }else {
        bag=bag+"  ";
        }
        }
        System.out.println(bag);
        
        
    


}
}
}

class Main {
    public static void main(String[] args) {
        int fact=1;
       int  n=100;
        if(n==0||n==1){
            System.out.println(n);
        }else{
            for(int i=1;i<=n;i++){
               fact=fact*i; 
            }
        
        System.out.println(fact);
    }
}
}

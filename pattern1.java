class Main{
public static void main(String[] args){
 int n=20;
for(int i=1;i<=n;i++){
String bag="";
for(int j=n-1;j<=i;j++){
if(i==1||i==n){
bag=bag+"[";
}else if(j<n||j==n){
bag=bag+"*";
}

System.out.println(bag);
}
}
}
}



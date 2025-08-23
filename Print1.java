import java.util.*;
class Print1{
public static void main(String args[]) {
Scanner l=new Scanner(System.in);
System.out.println("Enter the no of rows:");
int n,j,i;
n=l.nextInt();
int twoD[][]=new int[n][];
for(i=0;i<n;i++){
twoD[i]=new int[i+1];
}
for(i=0;i<n;i++){
for(j=0;j<i+1;j++){
if(j%2==0){
twoD[i][j]=1;
}
else{
twoD[i][j]=0;
}
}
}
for(i=0;i<n;i++){
for(j=0;j<i+1;j++){
System.out.print(twoD[i][j]+" ");
}
System.out.println();
}
}
}
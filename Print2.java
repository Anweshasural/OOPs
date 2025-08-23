import java.util.*;
class Print2{
public static void main(String args[]) {
Scanner l=new Scanner(System.in);
System.out.println("Enter the no of rows:");
int n,j,i;
n=l.nextInt();
char twoD[][]=new char[n][];
for(i=0;i<n;i++){
twoD[i]=new char[i+1];
}
for(i=0;i<n;i++){
for(j=0;j<i+1;j++){
twoD[i][j]='*';
}}
for(i=0;i<n;i++){
for(j=0;j<i+1;j++){
System.out.print(twoD[i][j]+" ");
}
System.out.println();
}
}}
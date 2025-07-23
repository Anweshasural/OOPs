import java.util.*;
class bubblesort{
public static void main(String args[]){
int n=Integer.parseInt(args[0]);
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=Integer.parseInt(args[i+1]);
for(int j=(arr.length-1);j>=0;j--){
 for(int k=1;k<=j;k++){
if(arr[k-1]>arr[k]){
int temp=arr[k-1];
arr[k-1]=arr[k];
arr[k]=temp;
}
}
}
for(int p=0;p<n;p++){
System.out.println(arr[p]);
}
}}

import java.util.*;
public class primenochecker{
public static void main(String args[]){
int num1=Integer.parseInt(args[0]);
int count=0,i=0;
if(num1==2)
System.out.println(num1 +"");
else{
for(i=1;i<=num1;i++){
if(num1%i==0)
count++;
}
}
if(count==2)
System.out.println(num1);
}
}
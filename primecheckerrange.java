import java.util.*;
public class primecheckerrange{
public static void main(String args[]){
int lower=Integer.parseInt(args[0]);
int upper=Integer.parseInt(args[1]);
for(int j=lower;j<=upper;j++){
int count=0,i;
if(j==2)
System.out.println(j +"");
else{
for(i=1;i<=j;i++){
if(j%i==0)
count++;
}
}
if(count==2)
System.out.println(j);
}
}
}

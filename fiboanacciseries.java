import java.util.*;
class fiboanacciseries{
public static void main(String args[]){
int n1=Integer.parseInt(args[0]);
int fterm=0, secterm=1;
for(int i=1;i<=n1;++i){
System.out.println(fterm+" ");
int nextterm=fterm+secterm;
fterm=secterm;
secterm=nextterm;
}
}
}

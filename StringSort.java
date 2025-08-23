class StringSort{
public static void main(String args[]) {
int l;
l=args.length;
int i,j;
String a[]=new String[l];
String temp;
for(i=0;i<l;i++){
a[i]=args[i];
}
for( i=0;i<l-1;i++){
for( j=0;j<l-i-1;j++){
if((a[j].compareTo(a[j+1]))>0){
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(i=0;i<l;i++){
System.out.print(a[i]+"");
}
}
}

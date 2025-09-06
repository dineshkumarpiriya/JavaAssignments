public class SumOfDigits{

public static void main(String[] args){
int n=9876;
int a=0;
while(n>0){
int digit=n%10;
a+=digit;
if(a>0&&a<10){
break;}


}
System.out.println(a);


}
}
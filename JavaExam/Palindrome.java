public class Palindrome{
public static void main(String[] args){
String s="madam";
String reverse="";
for(int i=s.length()-1;i>=0;i--){
reverse+=s.charAt(i);
}
System.out.println(reverse);
if(s.equals(reverse)){
System.out.println("true");
}
else{
System.out.println("false");
}
}
}
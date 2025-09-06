public class Anagram{
public static void main(String[] args){
String s1="liten";
String s2="silent";
boolean status=true;
if(s1.length()==s2.length()){
  for(int i=0;i<s1.length();i++){
	char ch=s1.charAt(i);
	
		if(s2.indexOf(ch)==-1){
			status=false;
		}
	

				}

	
if(status){
System.out.println("anagrams");
}
else{
System.out.println("not anagrams");

}
}
else{
System.out.println("lengths are not same...so not anagrams");
}
}
}
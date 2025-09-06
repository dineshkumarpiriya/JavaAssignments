public class FirstNonRepeatingCharacter{
public static void main(String[] args){
String s="kkdj";
for(int i=0;i<s.length();i++){
	int count=0;
	char ch=s.charAt(i);
	for(int j=0;i<s.length();i++){
	if(ch==s.charAt(j)){
	count++;
	                   }
	
		                     }
	if(count==1){
	System.out.println(ch);
	break;
		}
	
}

}
}
public class FrequencyCount{
public static void main(String[] args){
int[] a={2,3,2,5,3,4,5,2};
for(int i=0;i<a.length;i++){
int count=0;
int ele=a[i];
for(int j=0;j<a.length;j++){
if(ele==a[j]){
count++;
}
}
System.out.println(ele+"count "+count);

}

}
}
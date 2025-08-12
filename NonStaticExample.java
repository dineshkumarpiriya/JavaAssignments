public class NonStaticExample {

    String name="Dinesh kumar";
    //non static fields
    int age=22;
    public static void main(String[] args){

        NonStaticExample obj=new NonStaticExample();
        System.out.println(obj.name);
        System.out.println(obj.age);

        
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        sayHello("Eko");
        sayHello("eko" , "kurniawan");

    }
    static void sayHello(String firstName){
        System.out.println("Hello" + firstName);
    }
    static void sayHello(String firstName,String lastName){
        System.out.println("hello" + firstName + "" + lastName);
    }
}

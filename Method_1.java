//create interface
public interface Method_1 {
    void display1();
    default void dispaly2(){
        System.out.println("This is method 1");
    }
}

//create class using implements interface
class Method_2 implements Method_1{
    public void display1(){
        System.out.println("This is method 2");
    }
}

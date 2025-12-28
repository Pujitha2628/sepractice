package practice;

/*
ONLY JOB
I Love You
Pujitha weds Purushotham
 */


public class Demo {
    public static void main(String[] args) {
        //Static methods can be called in two ways
        A();    //direct calling
        Demo.A();   //calling with class name

        //non-static methods/functions should be called with object reference
        Demo demo = new Demo();
        demo.B();
        demo.getName("pujitha");

        Demo.getDetails("pujitha", 95);
        getDetails("pujitha", 95);

    }

    public static void A() {
        System.out.println("Method A");
    }

    public void B() {
        System.out.println("Method B");

    }

    private void getName(String name) {
        System.out.println("My name is " + name);

    }

    private static void getDetails(String name, int age) {
        System.out.println("My name is " + name + " and I am " + age + " years old");
    }
}

package inheritance;

public class Mother {
    static {
        System.out.println("===========> static initializer Mother");
    }

    {
        System.out.println("===========> instance initializer Mother");
    }

    public Mother() {
    }

    public Mother(String test) {
        System.out.println(test);
    }

    public void sayHello() {
        System.out.println("<== Mother hello ==>");
    }
}

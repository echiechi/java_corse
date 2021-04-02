package inheritance;

public class Child extends Mother {
    static {
        System.out.println("===========> static initializer Child");
    }

    {
        System.out.println("===========> instance initializer Child");
    }

    public Child() {
    }

    public Child(String testChild) {
        super(testChild);
    }

    public void isChild() {
        System.out.println("<== child ==>");
    }

    public void invokeMomsMethod() {
        super.sayHello();
        System.out.println("my method");
    }

    public void sayHello() {
        System.out.println("<=== hello from override ===>");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj instanceof Child;
    }
}

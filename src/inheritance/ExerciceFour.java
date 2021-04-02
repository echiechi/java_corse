package inheritance;

public class ExerciceFour {

    public static void inheritance() {
        System.out.println("<== Extends ==>");
        System.out.println("All classes extend Object class implicitly");
        System.out.println("Object class has these methods: toString(), hashCode(), equals(), clone()");
        System.out.println("instance of child can be referenced by Mother: Mother c = new Child()");
        System.out.println("can use methods from mother class only c.sayHello()");
        Mother c = new Child();
        c.sayHello();
        System.out.println("if I want to use child method I need to do type casting ((Child) c).isChild()");
        ((Child) c).isChild();
        System.out.println("if I want to figure out instance I will use instanceof (instanceof returns false if instance if null)");
        System.out.println("c instanceof Child = " + (c instanceof Child));
        System.out.println("instance of can only be used between mother and child ");
    }

    public static void methodsInInheritance() {
        System.out.println("<=== child classes invoke super class methods ===>");
        System.out.println("child class uses super key word to run mother class method");
        System.out.println("example super.sayHello()");
        System.out.println("Child c = new Child(); c.invokeMomsMethod();");
        Child c = new Child();
        c.invokeMomsMethod();

        System.out.println("can invoke super class constructor by using super() key word but it must be the first line in child constructor");
        Mother m = new Child("hello from child constructor");

        System.out.println("Initialisation sequence");
        System.out.println("=> class static block (static initializer) static { } <== runs only once class is loaded (mother first and then child)");
        System.out.println("=> instance initializer <= runs every time object is created");
        System.out.println("=> object constructor runs");
        System.out.println("=> child instance initializer");
        System.out.println("=> child object constructor");
        System.out.println("ps=> Object class does not have instance initializer");
    }

    public static void polyMorphismOverride() {
        System.out.println("<=== Overriding methods ===>");
        System.out.println("a subclass can override a method from super class");
        System.out.println("they must have same signature( name/ return type/arguments / same access modifier or one less restrictive");
        System.out.println("annotated by Override / (not mandatory)");
        System.out.println("new Mother().sayHello()");
        new Mother().sayHello();
        System.out.println("new Child().sayHello()");
        new Child().sayHello();

        System.out.println("final classes can't be extended");
        System.out.println("final methods cant't be overridden");
        System.out.println("override equals method ( look Child class )");
        System.out.println("LocalDate/BigDecimal / String have their equals method overridden");

        System.out.println("Abstract classes can't be instantiated");
        System.out.println("sub class must override abstract method");
        System.out.print("AbstractSuper s = new SubClassForAbstractSuper(); s.use(); ");
        AbstractSuper s = new SubClassForAbstractSuper();
        s.use();
        System.out.print("AbstractSuper s2 = new SubClassForAbstractSuper2(); s2.use(); ");
        AbstractSuper s2 = new SubClassForAbstractSuper2();
        s2.use();


    }
}

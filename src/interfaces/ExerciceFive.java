package interfaces;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ExerciceFive implements InterfaceInside, FunctionalInterface<String> {
    @Override
    public String onlyOne() {
        return "Functional Interface can have only one abstract methods";
    }

    @Override
    public String getGeneric(String myGeneric) {
        return myGeneric;
    }

    @Override
    public void myMethod(String in) {
        System.out.println(in);
        myThirdMethod();
    }

    public static void callInterfaceMethods() {
        System.out.println(new ExerciceFive().onlyOne());
        System.out.println(new ExerciceFive().getGeneric("Generics add dynamic type"));
        new ExerciceFive().myMethod("by default public abstarct\n" +
                "can have method body because if private \n " +
                "any conflict in default method with another interface will make user define he's own code\n" +
                "extending does not cause conflict\n" +
                "must widen the access modifier and not restrict it");
        new ExerciceFive().myMethodDef("--> test default with overriden method in client");
        System.out.println("Comparable<T> is a functional interface with a int compareTo(T obj) method");
        System.out.println("Arrays.sort(array) uses compareTo method by default");
        System.out.println("Comparator<T> is a functional interface with a int compare(T obj1, T obj2) method");
        System.out.println("Arrays.sort(array, myComparator()) can use a comparator made by user");
        System.out.println("Cloneable interface is a type-marker interface (it has no body) it's used to check if Object could use clone method using obj instanceof Cloneable");
        System.out.println("composite design patterns combines interfaces with objects implementing those interfaces to provide a combined behaviour");
        File f = new File("C:\\Users\\hp\\Documents\\wassim\\java_exercices\\images\\composite.PNG");
        Desktop dt = Desktop.getDesktop();
        try {
            dt.open(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

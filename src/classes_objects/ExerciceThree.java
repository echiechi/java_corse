package classes_objects;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

import static classes_objects.Product.RATE;

public class ExerciceThree {

    public static void simpleClass() {
        System.out.println("shadowing using this.test in a method that has a variable called test");
        Product p = new Product();
        p.setPrice(BigDecimal.valueOf(10));
        System.out.println("Initial value " + BigDecimal.valueOf(10) + " Product price " + p.getPrice() + " Rate = " + RATE);
    }

    public static void overloading() {
        System.out.println("<== overloading ==>");
        System.out.println("Method with the same name/return type but with different params");
        Product p = new Product();
        p.setPrice(BigDecimal.valueOf(10));
        System.out.println("Price as BigDecimal = p.setPrice(BigDecimal.valueOf(10)) = " + p.getPrice());
        p.setPrice(10.0);
        System.out.println("Price as double = p.setPrice(10.0) = " + p.getPrice());
        p.setPrice(10, 0.2);
        System.out.println("Price with discount = p.setPrice(10, 0.2) = " + p.getPrice());
        System.out.println("inside the class constructor you can call the constructor like this it must be the first line ===> this(123.3) ");
    }

    public static void varArgs() {
        System.out.println("<=== Var Args ===>");
        System.out.println("public void someMethod(double... params){");
        System.out.println("example you can access => params[0]");
        System.out.println("can use it in constructors too public Product(double... args){}");
        new Product(123.3, 123.39, 1);
    }

    public static void immutableObj() {
        System.out.println("<=== immutable objects states in created and never modified ===>");
        System.out.println("every thing is private only getters and constructor are public");
    }

    public static void enums() {
        System.out.println("<=== enums are classes with a predefined final instance list ===>");
        System.out.println("enum.ordinal() => returns numeric value of enum");
        System.out.println("Normal enum = >");
        for (int i = 0; i < ProdType.values().length; i++) {
            System.out.println(ProdType.values()[i]);
        }

        System.out.println("enums with private constructor and members and public getter ==>");
        for (int i = 0; i < ProdTypeTwo.values().length; i++) {
            System.out.println("ProdTypeTwo.values()[i] = " + ProdTypeTwo.values()[i] + " , ProdTypeTwo.values()[i].getName() = " + ProdTypeTwo.values()[i].getName()
                    + " , ProdTypeTwo.values()[i].getDigit() = " + ProdTypeTwo.values()[i].getDigit());
        }
        File f = new File("C:\\Users\\hp\\Documents\\wassim\\java_exercices\\images\\enumImg.png");
        Desktop dt = Desktop.getDesktop();
        try {
            dt.open(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void memoryInJava() {
        System.out.println("<=== heap and stack ===>");
        System.out.println(" Each thread has its own stack / but heap is shared between threads");
        System.out.println("local variables in method are stored in stack");
        System.out.println("object references are stored in stack");
        System.out.println("Objects are stored in the heap");
        System.out.println("stack/heap is eligible  for clean up when all references are null ");
        System.out.println("Objects are passed by reference in method and primitives are passed as copies");

        File f = new File("C:\\Users\\hp\\Documents\\wassim\\java_exercices\\images\\heapAndStack.png");
        Desktop dt = Desktop.getDesktop();
        try {
            dt.open(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

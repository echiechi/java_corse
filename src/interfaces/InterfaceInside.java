package interfaces;

public interface InterfaceInside {
    public static final String FINAL_VAR = "hello";

    void myMethod(String in); // by default public abstarct

    default void myMethodDef(String in){
        myMethod(in);
    }
    private void mySecondMethod(String in) {//can have method body because it's private
        System.out.printf(in);
    }



    default void myThirdMethod() {
        mySecondMethod("call mySecondMethod inside myThirdMethod");
        System.out.println("call myThirdMethod");
    }// any conflict in default method with another interface will make user define he's own code
    // extending does not cause conflict
    //must widen the access modifier and not restrict it

}

package primitives_and_flowcontrol;

public class ExerciceOne {


    public static void primitives() {

        System.out.println("<==== Max values ====>");
        System.out.println("byte = 8bit =>" + Byte.MAX_VALUE);
        System.out.println("byte = 16bit =>" + Short.MAX_VALUE);
        System.out.println("same as short byte = 16bit =>" + Character.MAX_VALUE);
        System.out.println("byte = 32bit =>" + Integer.MAX_VALUE);
        System.out.println("byte = 64bit =>" + Long.MAX_VALUE);
        System.out.println("byte = 32bit =>" + Float.MAX_VALUE);
        System.out.println("byte = 64bit =>" + Double.MAX_VALUE);
        System.out.println("Byte cycle => if 128 and I add +1 I get -127 " + (((byte) 128) + 1));
        System.out.println("<==== basic operations ====>");
        int a = 2;
        System.out.println("a = " + a);
        System.out.println("increment after display should show => " + a++);
        System.out.println("now should show => " + a);
        System.out.println("increment before display => " + ++a);
        System.out.println("should remain the same =>" + a);

        System.out.println("<==== casting in primitives ====>");
        int x = 3, y = 2;
        System.out.println("x = " + x + " y = " + y);
        System.out.println("(should show no float/double )x / y = " + (x / y));
        double z = x / y;
        System.out.println("(will show double but without decimal part haha ) z = x / y = " + z);
        System.out.println("right value yey (will show float because float > int )(float)x/y =>" + (float) x / y);
        System.out.println("same thing for double");
        System.out.println("<==== Rounding ====>");
        double z1 = (double) x / y;
        System.out.println(Math.round(z1));
        System.out.println("Math.round(1.33F)" + Math.round(z1));
    }


    public static void flowControl() {

        int a = 0;
        System.out.println("<<= NOT RECOMMENDED  to use & and | =>>");
        System.out.println("&& evaluates first arg and evaluate the second only if needed exple false && a-- < 0 " + (false && a-- < 0) + " a = " + a);
        System.out.println("& evaluates both args => false & --a < 0 " + (false & --a < 0) + " a = " + a);

        System.out.println("|| evaluates first arg and evaluate the second only if needed exple false || a-- < 0 " + (false || a-- < 0) + " a = " + a);
        System.out.println("| evaluates both args => false | --a < 0 " + (false | --a < 0) + " a = " + a);


        char myChar = 'q';
        System.out.println("myChar -= 32 returns a char but myChar = myChar + 32 => cast to and int ( cause 2 byte addition )");
        if(myChar >= 'a' && myChar <= 'z'){
            System.out.println("myChart -= 32 returns upper case");
            myChar -= 32;
        }else {
            System.out.println("myChart -= 32 returns lower case");
            myChar += 32;
        }

        System.out.println("my Char " + myChar);
    }
}

package collections;

import java.util.*;

public class Collections {

    public static void collec() {
        System.out.println("initial capacity of all collections is 16");
        System.out.println("all Iterable => Collection => List ");

        List<String> myList = new ArrayList<>();
        myList.add("test1");
        myList.add("test2");
        System.out.println("create an array list: List<String> myList = new ArrayList<>();myList.add(\"test1\"); myList.add(\"test2\");");
        System.out.println("myList = " + myList);
        System.out.println("adding an element will push other elements forward myList.add(0,\"test3\")");
        myList.add(0, "test3");
        System.out.println("myList = " + myList);
        System.out.println("set will modify given element => myList.set(0, \"test0\")");
        myList.set(0, "test0");
        System.out.println("myList = " + myList);
        System.out.println("can't jump position in add myList.add(5,\"test4\")");
        // myList.add(5, "test4");
        System.out.println("List.of() / Arrays.asList()<= read only list");

        System.out.println("In a set you can define a load factor that tells the HashSet when to stop accepting values in a certin group and create a new one new HashSet<>(20, 0.75)");
        System.out.println("Set.of() <= read only set");

        Deque<String> d = new ArrayDeque<>();

        System.out.println("Deque pile et file behaviour : Deque<String> d = new ArrayDeque<>()");
        System.out.println("d.addFirst(\"test0\");\n" +
                "        d.addFirst(\"test1\");\n" +
                "        d.addLast(\"test2\");\n" +
                "        d.addLast(\"test3\");\n" +
                ".offerFirst(\"testOffer\");\n" +
                "        d.offerLast(\"testOffer\");");
        d.addFirst("test0");
        d.addFirst("test1");
        d.addLast("test2");
        d.addLast("test3");
        d.offerFirst("testOffer");
        d.offerLast("testOffer");
        System.out.println(d);
        System.out.println("d.pollFirst(); will get and remove first element : " + d.pollFirst());
        System.out.println("d.d.pollLast(); will get and remove last element : " + d.pollLast());
        System.out.println(d);

        System.out.println("Map.of() read only map");
        System.out.println("containsKey to find if key is in a map");
        System.out.println("containsValue to find if value is in a map");

        System.out.println("using Iterator => ");
        System.out.println("Iterator<String> iterator = myList.iterator();\n" +
                "        while (iterator.hasNext()){\n" +
                "            System.out.println(iterator.next());\n" +
                "            iterator.remove();" +
                "}");
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println("myList : "+ myList);
    }
}

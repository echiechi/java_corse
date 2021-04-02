package arraysloops;

import java.util.Arrays;

public class ArraysLoops {

    public static void arraysMethod(){
        int[] arr = new int[]{1,2,3};
        int arr2[][] = new int[][]{{1,2,3},{4,8,9}};
        System.out.println("array creation : int[] arr = new int[5];");
        System.out.println("multidimentional array : int arr2[][] = new int[5][2];");
        System.out.println("default values : int[] arr = new int[]{1,2,3};");
        System.out.println("default values multidimentional array : int arr2[][] = new int[][]{{1,2,3},{4,8,9}};");
        System.out.println("copy array with range in both source and destination: System.arraycopy(Object src,  int  srcPos, Object dest, int destPos, int length)");
        System.out.println("copy array:  Arrays.copyOf(int[] original, int newLength)");
        System.out.println("copy with range: Arrays.copyOfRange(T[] original, int from, int to)");
        System.out.println("fill array with values Arrays.fill(short[] a, int fromIndex, int toIndex, short val)");
        System.out.println("search in arrays=> uses equals method : Arrays.binarySearch(T[] a, T key)");
        System.out.println("sort arrays=> uses Comparable interface : Arrays.sort(T[]), Arrays.sort(T[], Comparator) uses Comparator");
        System.out.println("foreach loop: for(int a: arr){}");
        System.out.println("you can label a loop => mylabel:\n" +
                "for(int i=0; i< 5; i++){}");
        System.out.println("break mylabel; wlll stop the labaled loop");
        System.out.println("break; will stop the loop");
        System.out.println("continue mylabel; will stop one iteration of the labeled loop");
        System.out.println("continue; will stop one iteration where the continue is used");
    }
}

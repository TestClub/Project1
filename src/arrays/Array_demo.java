package arrays;

public class Array_demo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray=new int[10];

        // initialize first element
        anArray[0]=100;
        // initialize second element
        anArray[5]=200;

// Prining out in the console
        System.out.println("Element at index 0: "
                + anArray[0]);
        System.out.println("Element at index 5: "
                + anArray[5]);
        System.out.println("Element at index 2: "
                + anArray[2]);

    }
}

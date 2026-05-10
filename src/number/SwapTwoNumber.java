package number;

//Question: WAP to swap two numbers without using third variable
public class SwapTwoNumber {

    public static void main(String[] args) {
        swapTwoInteger(4, 17);
    }

    private static void swapTwoInteger(int a, int b) {
        System.out.println("Before Swapping: a = " + a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping: a = " + a + " b = " + b);
    }

}

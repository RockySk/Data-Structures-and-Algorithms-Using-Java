package Section_2_Operators;

public class Two_Unary_Operator {
    public static void main(String[] args) {
//        int a = 10;
//        int b = ++a;
//        int c = a++;
//
//        int f = 15;
//        int d = --f;
//        int e = f--;
//
//        System.out.println("the value of a is:" +a);
//        System.out.println("the value of b is:" +b);
//        System.out.println("the value of c is:" +c);
//        System.out.println("the value of d is:" +d);
//        System.out.println("the value of e is:" +e);


        int a = 10;
        System.out.println("Initial value of a: " + a); // Initial value of a: 10

        int b = ++a;
        System.out.println("After pre-increment, a becomes: " + a); // After pre-increment, a becomes: 11
        System.out.println("Value of b after pre-increment: " + b); // Value of b after pre-increment: 11

        int c = a++;
        System.out.println("After post-increment, a becomes: " + a); // After post-increment, a becomes: 12
        System.out.println("Value of c after post-increment: " + c); // Value of c after post-increment: 11

        int f = 15;
        System.out.println("\nInitial value of f: " + f); // Initial value of f: 15

        int d = --f;
        System.out.println("After pre-decrement, f becomes: " + f); // After pre-decrement, f becomes: 14
        System.out.println("Value of d after pre-decrement: " + d); // Value of d after pre-decrement: 14

        int e = f--;
        System.out.println("After post-decrement, f becomes: " + f); // After post-decrement, f becomes: 13
        System.out.println("Value of e after post-decrement: " + e); // Value of e after post-decrement: 14

    }
}

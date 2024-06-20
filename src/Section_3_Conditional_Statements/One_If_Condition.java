package Section_3_Conditional_Statements;

public class One_If_Condition {
    public static void main(String[] args) {
        int age = 14;
        if (age < 13) {
            System.out.println("You are not adult");
        }
        else if (age >= 13 && age <= 18) {
            System.out.println("You are a teenager");

        }
         else  {
            System.out.println("You are an adult");
        }



    }
}

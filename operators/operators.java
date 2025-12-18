package operators;

public class operators {
    public static void main(String[] args) {
        int x = 100 + 500;
        int y = 400;
        ++x;
        System.out.println(x);
        System.out.println(--x);
        System.out.println(x*=4);
        System.out.println(x+=400);
        System.out.println(x > y);
        System.out.println(x >= y);

        int age = 18;
        System.err.println(age > 18);


        int passLength = 9;
        System.out.println(passLength < 10);
        System.out.println(passLength < 10 && passLength > 23);
        System.out.println(passLength < 10 || passLength > 23);
        System.out.println(!(passLength < 10 || passLength > 23));

        /** 
         * 
         * 
         * Here are some common operators, from highest to lowest priority:

                () - Parentheses
                *, /, % - Multiplication, Division, Modulus
                +, - - Addition, Subtraction
                >, <, >=, <= - Comparison
                ==, != - Equality
                && - Logical AND
                || - Logical OR
                = - Assignmen
         * 
         * 
         * 
         * 
        */


            int math = (24444 + 5353 * (987 * 6)) / 4;
            System.out.println(math);

    }
}


// type casting - java 

/*
        2 types of casting

    Widening Casting (automatic) - converting a smaller type to a larger type size
            byte -> short -> char -> int -> long -> float -> double

    Narrowing Casting (manual) - converting a larger type to a smaller type size
            double -> float -> long -> int -> char -> short -> byte

*/



public class TypeCasting {
    public static void main(String[] args){

        // widenong casting 
        int myInt = 9;
        double myDouble = myInt; // automatic casting

        System.out.println(myDouble);

        
    }
}
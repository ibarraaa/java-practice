// JAVA METHOD!!!
class Main {
    
    
    static int plusMethod(int x, int y){
        return x + y;
    }
    
    static double plusMethod(double x, double y){
        return x + y;
    }
    
    public static int sum(int k){
        if(k > 0){
            return k + sum(k - 1);
        }else {
            return 0;
        }
    }
    
    public static int sum1(int start, int end){
        if(start > end){
            return end + sum1(start, end - 1);
        }else{
            return end;
        }
    }
    
    
    // main
    public static void main(String[] args) {
        
        
        int myInt = plusMethod(3737, 3030);
        double myDouble = plusMethod(3363.48, 136.52);
        
        System.out.println("Int: " + myInt);
        System.out.println("double: " + myDouble);
        
        int result = sum(10);
        System.out.println("Result: " + result);
        
         int result1 = sum1(5, 10);
        System.out.println("Result: " + result1);
        
    }
}

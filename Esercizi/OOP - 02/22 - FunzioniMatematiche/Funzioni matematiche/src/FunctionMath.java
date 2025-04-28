public class FunctionMath {

    public static int abs(int x){
        return Math.abs(x);
    }
    public static double abs(double x){
        return Math.abs(x);
    }
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){

                return false;

            }
            else if(n % i == 1){
                return true;
            }

        }
    }
}


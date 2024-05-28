import java.util.Scanner;

public class banr {
    public static long factorial(int number) {
        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;}
        
    public static double sin(double a) {

    if (a == Double.NEGATIVE_INFINITY || !(a < Double.POSITIVE_INFINITY)) {
        return Double.NaN;
    }

    final double PI = 3.14159265358979323846;
    a %= 2 * PI;
    if (a < 0) {
        a = 2 * PI - a;
    }
    int sign = 1;
    if (a > PI) {
        a -= PI;
        sign = -1;
    }
    final int PRECISION = 10;
    double temp = 0;
    for (int i = 0; i <= PRECISION; i++) {
        temp += Math.pow(-1, i) * (Math.pow(a, 2 * i + 1) / factorial(2 * i + 1));
    }
    return sign * temp;}
    
    public static double cos(double a){
    double cos;
    double sine = sin(a);
    double sineSq = Math.pow(sine, 2);
    cos = 1-sineSq;
    cos = Math.sqrt(cos);
    
    
    return cos;
    }
    
    public static double raiz(double a){
    double result = Math.sqrt(a);
        
    return result;
    }
    
    public static double sqrt(double a) {
    if (a < 1)
        return 1.0 / sqrt(1.0 / a);
    double guess = 1;
    double add = a / 2;
    while (add >= Math.ulp(guess)) {
        double guess2 = guess + add;
        double result = guess2 * guess2;
        if (result < a)
            guess = guess2;
        else if (result == a)
            return guess2;
        add /= 2;
    }
    return guess;
}

    public static double pot(double a, double b){
    double result = Math.pow(a, b);
    return result;}

}


package recursividad;

public class ejercicio5 {
    
    public static void main(String[] args) {
 
        int posicion=4;
        int resultado=fibonacci(posicion);
        System.out.println(resultado);
 
    }
 
    public static int fibonacci(int n) {
 
        if (n==0) {
            return 0;
        } else if (n==1) {
            return 1;
        } else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
 
    }
    
}

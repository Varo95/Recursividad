package recursividad;

public class ejercicio8 {
    public static void main(String[] args) {
 
        int base=24;
        int exponente=-5;
 
        System.out.println(potencia(base,exponente));
 
    }
 
    public static double potencia(int base, int exponente) {
 
        if (exponente==0) {
            return 1;
        } else if (exponente==1) {
            return base;
        } else if (exponente<0) {
            return potencia(base,exponente+1) / base;
        } else {
            return base*potencia(base,exponente-1);
        }
    }
    
}

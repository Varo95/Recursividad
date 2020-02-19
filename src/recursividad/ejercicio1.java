package recursividad;

public class ejercicio1 {
 
    public static void main(String[] args) {
        int n=4; 
        int resultado=sumanumeros(n);
        System.out.println(resultado);
        
    }
     
    public static int sumanumeros(int numero){ 
        int result;
        if(numero==1){
            return 1;
        }else{
            result=numero+sumanumeros(numero-1);
        }
        return result;
    }   
}

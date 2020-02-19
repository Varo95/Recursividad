package recursividad;

public class ejercicio2 {
    
public static void main(String[] args) {
         
        int[] array={6,8,9,20,4};
        array(array, 0);
}
     
    public static void array(int[] array, int n){
         
        if (n == (array.length-1)){
           System.out.println(array[n]);
        }else{
            System.out.println(array[n]);
            array(array, n+1);
        } 
    }
}

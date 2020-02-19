package recursividad;

public class ejercicio3 {
    
    public static void main(String[] args) {
         
        int[] array={1,2,3,4,5};
        int buscar=3;
        int posicion=buscararray(array, buscar,0);
        System.out.println(posicion);
        
    }
     
    public static int buscararray(int[] array, int buscar ,int indice){
         
       if(indice==array.length || array[indice]==buscar){   
            if(indice==array.length){
               return -1; 
            }else{
                return indice;
            }    
        }else{
            return buscararray(array, buscar, indice+1);
        }  
    }
    
}

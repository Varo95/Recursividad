package recursividad;

public class ejercicio7 {
    
    public static void main(String[] args) {
         
        String palabra="Alvaro";
        System.out.println(invertirString(palabra,palabra.length()-1));    
    }
     
     public static String invertirString(String palabra, int longitud){
         
        if(longitud==0){
            return palabra.charAt(longitud)+"";
        }else{
            return palabra.charAt(longitud)+(invertirString(palabra,longitud-1));
        }  
    }   
}

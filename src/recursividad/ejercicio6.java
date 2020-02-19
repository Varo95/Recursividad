package recursividad;

public class ejercicio6 {
    
    public static void main(String[] args) {
 
        int a=1024;
        System.out.println(invertir(a, 2));
    }
     
    public static int invertir(int num, int pos){
         
        if(num<10){
            return num; 
        }else{
            return (num % 10)*(int)Math.pow(10,pos)+(invertir(num/10, pos-1));
        }  
    }
}

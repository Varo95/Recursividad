package recursividad;


public class clase {
    public static void main(String[] args){
        P(6);
    }
private static void P(int i){
    if(i>0){
        System.out.println(i);
        P(i-1);
    }else{
        System.out.println("Fin");
    }
    System.out.println(i+"Fin de programa");
    System.out.println("Fin de verdad");
}
    
}

public class operador {
    /**
     * @param args
     */
    public static void main(String[] args){
        int a=25;
        int b=5;
        int suma = a+b;
        int resta = a-b;
        int multiplicacion = a*b;
        int division = a/b;
        System.out.println("\nOperaciones Matematica  Author JC + - * /\n");
        System.out.println("La suma de a y b es " +  a + " mas " + b + " es igual a "+ suma+" "+(a>b));
        System.out.println("La resta de a y b es " + a + " menos " + b + " es igual a "+ resta+" "+(a>b || b<a));
        System.out.println("La multiplicacion de a y b es " + a + " por " + b + " es igual a "+ multiplicacion+" "+(a>b) );
        System.out.println("La division de a y b es " + a + " div " + b + " es igual a "+ division+" "+(a>b));
    }
}

package ventas_mes;

import java.util.Scanner;

public class promedio {
  /**
   * @param args
   */
  public static void main(String[] args) {
    double[] ventas_mes=new double[30];
    Scanner sc = new Scanner(System.in); 
      for(int i=0; i<ventas_mes.length;i++){
        System.out.println("\nauthor"+" "+"JC\n");
        System.out.println("\nIngrese la venta "+(i+1)+"\n");
        ventas_mes[i]= sc.nextDouble();
        System.out.println("venta dia "+(i+1)+" "+": $"+ventas_mes[i]+"\n");
      };
      for(int i=0; i<ventas_mes.length; i++){
        if (ventas_mes[i]>=700000) {
          System.out.println("\nVenta dia "+(i+1)+" "+": $"+ventas_mes[i]);
          System.out.println(" La venta "+(i+1)+" es mayor a 700000 ");
        }else{
          System.out.println("\nVenta dia "+(i+1)+" "+": $"+ventas_mes[i]); 
          System.out.println("La venta "+(i+1)+" es menor a 700000 ");
      }
      sc.close();
    }
    for(int i=0; i<ventas_mes.length; i++){
        if (ventas_mes[i]>700000) {
          System.out.println("\nMayor venta del mes Dia "+(i+1)+" "+": $"+ventas_mes[i]);
          System.out.println("venta fecha "+(i+1)+" es mayor a 700000 ");
        }
  }
}
}



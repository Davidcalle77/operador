public class intercambio {
  public static void main(String[] args) {
    System.out.println("\nintercambio de variables Author JC\n");
  String a = "Juan" ;
  String b = "David";
  String c;
  System.out.println("a = "+""+a+" "+"b = "+b);
  c=a;
  a=b;
  b=c;
  System.out.println("a = "+""+a+" "+"b = "+b+"\n");

  int d = 27;
  int e = 37;
  int f;
  System.out.println("d = "+""+d+" "+"e = "+e);
  f=d;
  d=e;
  e=f;
  System.out.println("d = "+""+d+" "+"e = "+e);
  }
}

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		 Integer opcion;
		 Integer a;
		 Integer b;
		 Integer resultado;
		 System.out.println("holaaaaa");
		 do{
		 System.out.println("Ingrese su operación /n 1 para sumar /n 2 para\r\n" + "restar /n 3 para multiplicar /n 4 para dividir");
		 opcion = teclado.nextInt();
		 }while(opcion < 1 && opcion > 4); 
		 System.out.println("Ingrese el primer numero");
		 a = teclado.nextInt();
		 System.out.println("Ingrese el segundo numero");
		 b = teclado.nextInt();
		 
 if(opcion.equals(1)){
 resultado = a + b;
 }else if(opcion.equals(2)){
 resultado = a - b;
 }else if(opcion.equals(3)){
 resultado = a * b;
 }else{
 resultado = a / b;
 }
 System.out.println("El resultado es " + resultado.toString());
 }
}

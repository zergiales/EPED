package Recursividad;

public class Lanzador {

	public static void main(String[] args) {
		
		Ejemplo1 ej1= new Ejemplo1();
		Ejemplo2 ej2= new Ejemplo2();
		Ejemplo3 ej3= new Ejemplo3();
		int A[]= {2,3,5,7,11,13,17};// array para el ej3
		int n= A.length;

		System.out.println("---EJEMPLO 1----");
		System.out.println("Resultado facotrial: "+ej1.factorial(4));
		System.out.println("--------------------");
		System.out.println("---EJEMPLO 2----");
		System.out.println("Fibonacci: "+ej2.fibonacci(9));
		System.out.println("--------------------");
		System.out.println("---EJEMPLO 3----");
		System.out.println("Recursividad LINEAL-DIVISION: "+ej3.busqueda_binaria(A, 7, 3, n-1));
		System.out.println("--------------------");

	}

}

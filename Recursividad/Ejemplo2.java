package Recursividad;

public class Ejemplo2 {
	
	public int fibonacci(int n) {
		if(n>1) {
			return fibonacci(n-1) + fibonacci(n-2); //funcion recursiva
		}
		else if(n==1){ //caso base 
			return 1;
		}
		else if(n==0) { //caso base
			return 0;
		}
		else { //si da error
			System.out.println("debe ser mayor o igual a 1");
			return -1;
		}
	}
}

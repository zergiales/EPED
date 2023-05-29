package Recursividad;
/**
 * En este ejemplo vamos a ver como implementamos la recursion 
 * - Si el numero es = 0 , devuelve 1.
 * - En otro caso, devolverá n multiplicado por el factorial de n-1
 * - Para ello vamos utilizar un metodo que tiene java llamado factorial(n)
 *  donde insertamos un parametro 
 * @author sergi
 *
 */
public class Ejemplo1 {
	
	public static long factorial(int n) {
		if(n<=1) // caso base (si n es menor que 1 !recursivo)
			return 1; // resultado no recursivo 
		else
			//metodo recursivo 
			return  n * factorial(n-1); 
		/**
		 * - llamamos al propio metodo, restado uno [facotiral(n-1)]
		 * --> cuando n<=1 devuelve 1 y luego finalmente hacemos:
		 *    - hacemos n por el 
		 */
	}
	 //int resultado = factorial(5);
	 
	 
	
}

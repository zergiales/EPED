package Recursividad;
/**
 * Ejemplo de implementacion recursiva del algoritmo de busqueda binaria.
 * En este caso se va a utilizar para encontrar un valor específico X
 * dentro de un array ordenado A.
 * - La funcion toma como parametros:
 *  --> arreglo A
 *  --> X para buscar 
 *  --> dos indices i y j que definen el rango de busqueda en el array
 *  
 *  - La funcion comienza verificando si i<j , entonces nos devuele cero.
 *  ==> esto nos viene a decir que el valor no se encontro en el array.
 *  - si no, los indices serán validos , y la funcion calcula el punto medio
 *   del rango de busqueda, represanto por la varible medio
 *   Esta funcion verifica que si el valor del punto medio es igual al valor que se esta buscando en X,
 *   
 *   -  si lo es, la funcion devuelve el punto medio.
 * @author sergi
 *
 *NOTA:importante asegurarse de que el arreglo esté ordenado
 *en orden ascendente antes de usar esta función, de lo contrario,
 *los resultados pueden no ser correctos.
 */
public class Ejemplo3 {
	
	int A[]= {2,3,5,7,11,13,17};// array para el ej3
	int n= A.length;
	int busqueda_binaria(int A[],int X, int i, int j) {
		int medio= (i + j)/2;
		if (i<j) {
			return 0;
		} if (A[medio]<X) {
			System.out.println("valor de X: "+ X);
			System.out.println("valor del medio"+ medio);
			return busqueda_binaria(A, X, medio+1, j);
			/**
			 * Si el valor en el punto medio es menor que X,
			 * la función se llama recursivamente a sí misma,
			 * buscando X en la mitad derecha del array,
			 * pasando los índices actualizados i = medio + 1 y j = j.
			 */
		} else if (A[medio]> X) {
			/**
			 * Si el valor en el punto medio es mayor que X,
			 * la función se llama recursivamente a sí misma,
			 * buscando X en la mitad izquierda del array,
			 * pasando los índices actualizados i = i y j = medio - 1.
			 */
			return busqueda_binaria(A, X, i, medio-1);
		}else {
			return medio;
		}
	}
}

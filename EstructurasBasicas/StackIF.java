package EstructurasBasicas;
/**
 * EXPLICACION DE UNA LISTA:
 * 
 * Representa una pila de elementos
 * --> una pila es una especializacion de una secuencia, que mantiene el orden
 * de almacenamiento de sus elementos y una pol�tica de acceso
 * LIFO
 * 	Last In Fist Out  (el ultimo que entra es el primeor que sale)
 * @param <E>
 */
public interface StackIF<E> extends SequenceIF<E> {
	
	/**
	 * Devuelve el elemento situado en la cima de la pila
	 * @pre !isEmpty();
	 * @return la cima de la pila
	 */
	public E getTop();
	
	/**
	 * Incluye un elemento en la cima de la pila.Modifica el tama�o de la misma
	 * @param elem el elemento que se quiere a�adir en la cima
	 */
	public void push(E elem);

	/**
	 * Elimina la cima de la pila --> modifica por tanto el tam�o de la pila.
	 * @Pre !isEmpty();
	 */
	public void pop();
	
	/**
	 * USO T�PICOS DE LAS PILAS
	 * 
	 * - Cuando los lenguajes de prog estan llamando a m�todos o funciones, todas
	 * 	las llamadas se van organizando en forma de pila, por lo que se devuelve el control a la que había antes
	 * 
	 * cuando la ultima llamada se termina se borra
	 */
	
}

package EstructurasBasicas;
/**
 * EXPLICACION DE UNA LISTA:
 * 
 * Representa una pila de elementos
 * --> una pila es una especializacion de una secuencia, que mantiene el orden
 * de almacenamiento de sus elementos y una política de acceso
 * LIFO
 * 	Lat In Fist Out
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
	 * Incluye un elemento en la cima de la pila.Modifica el tamaño de la misma
	 * @param elem el elemento que se quiere añadir en la cima
	 */
	public void push(E elem);

	/**
	 * Elimina la cima de la pila --> modifica por tanto el tamño de la pila.
	 * @Pre !isEmpty();
	 */
	public void pop();
	
	/**
	 * USO TÍPICOS DE LAS PILAS
	 * 
	 * - Cuando los lenguajes de prog estan llamando a métodos o funciones, todas
	 * 	las llamadas se van organizando en forma de pila, por lo que se devuelve el control a la que había antes
	 */
	
}

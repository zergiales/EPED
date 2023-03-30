package EstructurasBasicas;
/**
 * Representa una cola de elementos
 * 
 * COLA: es una especializacion de una secuencia, que mantiene el orden de alamacenamiento
 * de sus elementos y una política de acceso siguiendo una política FIFO
 * First In First Out
 *
 * @param <E>
 */
public interface QueueIF<E> extends SequenceIF<E> {

	/**
	 * Devuelve el primer elemto de la cola
	 * @pre !isEmpty()
	 * @return la cabeza de la cola (al primer elemento)
	 */
	public E getFirst();
	
	/**
	 * Incluye un elemento al final de la cola y modifica el tamaño de la misma.
	 * @param elem el elemento que debe ENCOLAR (añadir)
	 */
	public void enqueue(E elem);
	
	/**
	 * Elimina el primer elemento de la cola. Modifica el tamaño de la misma
	 * @pre !isEmpty() ----> como condicion pre el metodo tiene que dearnos true para ver que no esta vacio 
	 */
	
}

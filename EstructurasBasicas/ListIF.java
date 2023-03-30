package EstructurasBasicas;

public interface ListIF<E> extends SequenceIF<E> {
	
	/**
	 * Devuelve el elemento de la lista que ocupa la posición
	 * indicada por el parámetro
	 * 
	 * @param pos la posicion ha comenzado en 1
	 * @pre: 1 <= pos <= size()
	 * @return el elemento en la posicion pos
	 */
	public E get (int pos);
	
	/**
	 *Modifica la posicion dad por el parámetro pos para que contenga
	 *el valor dado por el parametro e.
	 *
	 * @param pos la posicion cuyo valor se debe modificar, comenzando en 1
	 * @pre: 1<= pos <=size()
	 */
	public void set (int pos, E e);
	
	/**
	 * Inserta un elemento en la Lista
	 * @param elem El elemento que hay que añadir
	 * @param pos La posicion en la que se debe añadir elem, comenzando en 1.
	 * @pre: 1<= pos <=size()+1
	 */
	public void insert (E element, int pos);
	
	/**
	 * Elmina el elemento que ocupa la posicion del parametro
	 * @param pos la posicion que ocupa el elemento a eliminar comenzando en 1
	 * @pre: 1 <= pos <= size()
	 */
	public void remove(int pos);
}

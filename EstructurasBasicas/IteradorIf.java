package EstructurasBasicas;
//Iterador de elementos
public interface IteradorIf<E> {
	/*
	 * Obtiene el siguiente elemento de la iteracci�n
	 * @Pre: hasNext()
	 * @return: el siguiente elemento de la iteracci�n
	 */
	public E getNext();
	
	/*
	 * Comprueba si a�n quedan elementos por iterar
	 * @return true si el iterador dispone de m�s elementos.
	 */
	public boolean hasNext();
	
	/*
	 * Vuelve la posicion del iterador al principio. Esto
	 * permite reutilizar un iterador sin crear otro nuevo.
	 */
	public void reset();
}

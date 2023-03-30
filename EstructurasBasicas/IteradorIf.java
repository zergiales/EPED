package EstructurasBasicas;
//Iterador de elementos
public interface IteradorIf<E> {
	/*
	 * Obtiene el siguiente elemento de la iteracción
	 * @Pre: hasNext()
	 * @return: el siguiente elemento de la iteracción
	 */
	public E getNext();
	
	/*
	 * Comprueba si aún quedan elementos por iterar
	 * @return true si el iterador dispone de más elementos.
	 */
	public boolean hasNext();
	
	/*
	 * Vuelve la posicion del iterador al principio. Esto
	 * permite reutilizar un iterador sin crear otro nuevo.
	 */
	public void reset();
}

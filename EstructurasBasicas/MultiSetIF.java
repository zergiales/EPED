package EstructurasBasicas;
/**
 * 
 * Representa un multiconjunto, que es un contenedor que
 * permite almacenar elemntos de los que puede haber múltiples
 * instancias dentro del multiconjunto
 *
 * @param <E>
 */
public interface MultiSetIF<E> extends ContainerIF<E> {
	/*
	 * Añade varias instancias de un elemento al multiconjunto
	 * 
	 * @pre: n > 0 && premult = multiplicity(e)
	 * @post: multiplicity(e) = premult + n
	 * 	
	 */
	public void addMultiple (E e, int n);
	
	/*
	 * Elimina varias instancias de un elemento del multiconjunto
	 * 
	 * @pre: 0<n<= multiplicity(e) && premult = multiplicity(e)
	 * @post: multiplicity(e) = premult - n
	 */
	public void removeMultiple(E e, int n);
	
	/*
	 * Devuelve la multiplicidad de un elemento dentro del multiconjunto
	 * 
	 * @return: multiplicidad de e (0 si no está contenido)
	 */
	public int multiplicity (E e);
}

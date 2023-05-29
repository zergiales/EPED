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
	/**
	 * Añade varias instancias de un elemento e al multiconjunto
	 * 
	 * @pre: n > 0 && premult = multiplicity(e) [minimmo mayor que 0] 
	 * -------
	 * premult = multiplicity(e) 
	 *  es el valor de la multiplicidad del valor e ates de ejecutar el metodo de addMultiple
	 * se añaden n intancias del elemento e
	 * -----
	 * @post: multiplicity(e) = premult + n
	 * 	
	 */
	public void addMultiple (E e, int n);
	
	/*
	 * Elimina varias instancias de un elemento del multiconjunto
	 *  -----
	 * n no puede superar a la multiplicidad antes de ejecutar el metodo
	 * 
	 * la multiplicidad del elemento es la que teniamos menos la que hemos quitado 
	 * ----
	 * @pre: 0<n<= multiplicity(e) && premult = multiplicity(e)
	 * @post: multiplicity(e) = premult - n
	 */
	public void removeMultiple(E e, int n);
	
	/*
	 * Devuelve la multiplicidad de un elemento dentro del multiconjunto
	 * 
	 * @return: multiplicidad de e (0 si no esta contenido)
	 */
	public int multiplicity (E e);

	/**
	 * Realiza la unión del multiconjunto llamante con el parametro
	 */
	public void union(MultiSetIF<E> s);

	//realiza la interssecion del multiconjunto llamante con el parametro
	public void interseccion (MultiSetIF s);
}

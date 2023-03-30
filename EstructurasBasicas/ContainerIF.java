package EstructurasBasicas;
/*
 * Caso donde nos centramos en el funcionamiento de un contendor
 * Un contenedor es una coleccion de elementos que NO GUARDAN 
 * ning�n tipo de orden entre si.
 */
public interface ContainerIF<E> extends CollectionIF<E> {
	//a�ade un elemento e al contenedor
	public void add(E e);
	
	/*
	 * Elimina el elemnto e del contenedor
	 * @pre: this.contains (e) ---> esto es que ya esta dentro del contenedor
	 *
	 * NOTA=> 
	 * Contains(String)
	 * Devuelve un valor que indica si una subcadena especificada
	 * aparece dentro de esta cadena.
	 * 
	 * @post: !this.contains(e)
	 * NOTA: Si ponemos ! es para hacer una negacion de la misma
	 */
	public void remove(E e);
	
	//devuelve un iterador para el contenedor
	public IteradorIf<E> iterador();
}

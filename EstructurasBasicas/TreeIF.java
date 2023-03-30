package EstructurasBasicas;
/**
 * Representa un árbol, que es una coleccion cuyos elementos
 * se organizan jerarquicamente
 */
public abstract interface TreeIF<E> extends CollectionIF<E> {
	/**
	 * Obtiene el elemento situado en la raíz del árbol
	 * @pre: !isEmpty()
	 * @return el elemento que ocupa la raíz del árbol
	 */
	public E getRoot();
	
	/**
	 * Decide si el árbol es una hoja (no tiene hijos)
	 * @return ture si el árbol es no vacío y no tiene hijos
	 */
	public boolean isLeaf();
	
	//devuelve el número de hijos del árbol
	public int getNumChildren();
	
	/**
	 * Devuelve el fan-out del árbol: la distancia máxima desde la
	 * raíz a cualquiera de sus hojas
	 */
	public int getHeight();
	
	/**
	 * Obtiene un iterador para el arbol
	 * @param mode el tipo de recorrido indicado por los valores
	 * enumerados definidos en cada TAD concreto.
	 */
	public IteradorIf<E> iterator (Object mode);
}

package EstructurasBasicas;
/**
 * Representa un �rbol, que es una coleccion cuyos elementos
 * se organizan jerarquicamente
 */
public abstract interface TreeIF<E> extends CollectionIF<E> {
	/**
	 * Obtiene el elemento situado en la ra�z del �rbol
	 * @pre: !isEmpty()
	 * @return el elemento que ocupa la ra�z del �rbol
	 */
	public E getRoot();
	
	/**
	 * Decide si el �rbol es una hoja (no tiene hijos)
	 * @return ture si el �rbol es no vac�o y no tiene hijos
	 */
	public boolean isLeaf();
	
	//devuelve el n�mero de hijos del �rbol
	public int getNumChildren();
	
	/**
	 * Devuelve el fan-out del �rbol: la distancia m�xima desde la
	 * ra�z a cualquiera de sus hojas
	 */
	public int getHeight();
	
	/**
	 * Obtiene un iterador para el arbol
	 * @param mode el tipo de recorrido indicado por los valores
	 * enumerados definidos en cada TAD concreto.
	 */
	public IteradorIf<E> iterator (Object mode);
}

package EstructurasBasicas;
/**
 * Reopresenta un arbol binario de elementos, en el que un nodo
 * pueda tener, a lo sumo, dos hijos:
 * fan-out <= 2 para todos los nodos
 */
public interface BTreeIF<E> extends TreeIF<E> {
	//valor enumerado que indica los tipos de recorrido ofrecidos por los arboles binarios
	public enum IteratorModes{
		PREORDER,
		POSTORDER,
		BREADTH,
		INORDER,
		RLBREADTH
	}
	
	/**
	 * Obtiene el hijo izquierdo del arbol llamante
	 * @return el hijo izquierdo del arbol llamante
	 */
	public BTreeIF<E> getLeftChild();
	
	/**
	 * Obtiene el hijo derecho del arbol llamante
	 * @return el hijo derecho del arbol llamante
	 */
	public BTreeIF<E> getRightChild();
	
	/**
	 * Modifica la raiz del arbol
	 * @param el elemento que se quiere poner como raiz del arbol
	 */
	public void setRoot (E e);
	
	/**
	 * Pone el arbol parametro como hijo izquierdo del arbol llamante
	 * --> Si ya antes teniamos un hijo izquierdo, el antiguo dejará de ser accesible (se pierde)
	 * @pre: !isEmpty()
	 * @param chil el arbol que se debe poner como hijo derecho
	 */
	public void setRightChild (BTreeIF <E> child);
	
	//Elimina el hijo izquierdo del arbol
	public void removeLeftChild();
	
	//Elimina el hijo derecho del arbol
	public void removeRightChild();
}

package EstructurasBasicas;
/**
 * Representa un arbol de busqueda binaria, en el que los elementos
 * se organizan automaticamente segun su orden
 */
public interface BSTreeIF<E extends Comparable<E>> extends TreeIF<E> {
	/**
	 *  valor enumerado que indica los tipos de recorrido
	 *  ofrecidos por los arboles de busuqeda binaria
	 */
	public enum IteratorModes{
		DIRECTORDER,
		REVERSEORDER
	}
	
	/**
	 * Valor enumerado que indica cual es la ordenacion de los elementos dentro
	 * del arbol (ascendente o descendente)
	 */
	public enum Order{
		ASCENDING,
		DESCENDING
	}
	
	/**
	 * Añade un elemento no contenido previamente en el arvol
	 * @pre: !contains(e)
	 * @post: contains(e)
	 */
	public void add(E e);
	
	/**
	 * Elimina un elemento previamente contenido en el arbol
	 * @pre: contain(e)
	 * @post: !contains(e)
	 */
	public void remove(E e);
	
	public Order getOrder();
}

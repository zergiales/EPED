package EstructurasBasicas;
/**
 * tema 4
 * @author sergi
 *
 * @param <E>
 */
public class Collection<E> implements CollectionIF<E> {
	protected int size;
	
	//constructor por defecto
	public Collection() { size=0;}
	
	//devuelve el numero de elemntos de la coleccion
	public boolean isEmpty() {return size==0;} //si esto es verdad es verda y si es falso devuelve un falso
	
	//vacia la coleccion
	public void clear() { size =0;}//al crear una coleccion o borrar el size = 0
	
	abstract public boolean contains(E e);
}

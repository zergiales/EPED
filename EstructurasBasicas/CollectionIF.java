package EstructurasBasicas;
/**
 * INTERFACE DE COLECCION
 * Representa una coleccion de elementos, sin ningún tipo de relacion
 * entre ellos.Solo la pertenecia a la misma coleccion y ya.
 */
public interface CollectionIF<E> {
	//devuelve el num de elementos de la coleccion 
	public int size(); 
	
	/*
	 * Devuelve un valor boolean si esta vacio o no (true o flse)
	 *
	 *	true: la coleccion no contiene elementos
	 *	false: la coleccion si contiene elementos 
	 */
	public boolean isEmpty();
	
	//metodo que elimina elementos de la coleccion
	public void clear();
}

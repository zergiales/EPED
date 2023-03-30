package EstructurasBasicas;

/*
 * representa un conjunto => contenedor que permite almacenar
 * elementos qe ser�n �nicos dentro del conjunto
 * 
 * RECORDAR: el conjunto representa elconjunt matem�tico de
 * conjunto finito , en los cuales cada elemento esta una �NICA
 * VEZ!!
 */
public interface SetIF<E> extends ContainerIF<E> {
	//realiza la uni�n del conjunto que llama con el paramatero
	public void union(SetIF<E> s);
	
	//Realiza la interseccion del conjunto que llama con el parametro 
	 public void interssecion(SetIF<E> s);
	
	 /*
	 * Realiza la diferencia del conjunto que llama con el
	 * parametro (los elementos que est�n en el llamante pero
	 * no en el par�metro) 
	 */
	 public void difference(SetIF<E> s);
	 
	 // Devuelve verdadero si el conjunto parametro es subconjunto
	 public boolean isSubset(SetIF<E> s);
}

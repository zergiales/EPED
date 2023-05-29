package EstructurasBasicas;

/*
 * representa un conjunto => contenedor que permite almacenar
 * elementos que serán únicos dentro del conjunto
 * 
 * RECORDAR: el conjunto representa elconjunt matemático de
 * conjunto finito , en los cuales cada elemento esta una ÚNICA
 * VEZ!!
 */
public interface SetIF<E> extends ContainerIF<E> {
	
	//realiza la unión del conjunto que llama con el paramatero E
	public void union(SetIF<E> s);
	
	//Realiza la interseccion del conjunto que llama con el parametro 
	//modifia el confunto diamante
	 public void interssecion(SetIF<E> s);
	
	 /*
	 * Realiza la diferencia del conjunto que llama con el
	 * parametro (los elementos que están en el llamante pero
	 * no en el parámetro) 
	 */
	 public void difference(SetIF<E> s);
	 
	 // Devuelve verdadero si el conjunto parametro es subconjunto del conjunto diamante
	 public boolean isSubset(SetIF<E> s);
}

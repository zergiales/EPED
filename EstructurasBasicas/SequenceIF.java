package EstructurasBasicas;
//Ejemplo de secuencia [ coleccion de elementos que se organizan linealmente]
public interface SequenceIF<E> extends CollectionIF<E> {
	/*
	 * - Devuelve el iterador sobre la secuencia
	 * - No necesita parámetros puesto que el recorrido es lineal y único.
	 */
	
	public IteradorIf<E> iterator();
}

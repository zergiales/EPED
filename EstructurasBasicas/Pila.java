package EstructurasBasicas;

public interface Pila<E> {
	boolean estaVacia();
	E cima();
	void apilar(E elem);
	void desapilar();
}

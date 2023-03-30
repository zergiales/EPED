package EstructurasBasicas;
public class PilaArray<E> implements Pila<E>{
	private E[]vec;
	private int tam;
	
	public PilaArray(){
		vec=(E[]) new Object[100];
		tam=0;
	}
	
	public boolean estaVacia() {return tam==0;}

	public E cima() {return vec[tam-1];}
	//le pasamos por parametro un elemnto de tipo E
	/**
	 * si el tam es igual a la longitud de vec imprime el apilar y dentro de un objeto apila 
	 */
	public void apilar(E elem) {
		if(tam == vec.length) {
			System.out.println("apilar");
			Object[] tmp = new Object[2*tam];
			System.arraycopy(vec, 0, tmp, 0, tam-1); //copia en un array unos parametro
			/**
			 * EXPLICACION DE .arraycopy()
			 *  Este metodo sirve para copiar unos cuantos datos de un array en otro
			 *  
			 *  - parametro 1: objeto origen
			 *  - parametro 2: int que en nuestro caso es un 0 --> entiendo que es la posicion(ORIGEN)
			 *  - parametro 3: objeto destino
			 *  - parametro 4: int que en nuestro caso es o --> entiendo que es la posicion donde se le manda (DESTINO) 
			 *  - parametro 5: en este caso le pasamos un valor del tam, que es tam-1 [dato que tenemos que mandar]
			 */
			vec = (E[]) tmp;
		}
		vec[tam++]=elem;
	}
	//consultar si esto esta bien 
	public void desapilar(E elem) {
		 vec[--tam]=elem;
		 
	}

	@Override
	public void desapilar() {
		// TODO Auto-generated method stub
		
	}
	
}

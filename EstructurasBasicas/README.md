
# Estructuras de datos Básicas
>
>Los programas manejan información mediante el uso de estructuras (variables, vectores, matrices, árboles...). Éstas pueden manipularse, crearse o eliminarse.
>[!IMPORTANT]
>**Una estructura de Datos** permite establecer una forma particular de almacenar y organizar información.
Un **registro o array**  permiten el acceso a sus datos individuales mediante operaciones aritméticas sobre su dirección conocido el tamaño de cada uno de sus datos.

# Tipo Abstracto de Datos

**TAD - Tipo Abstracto de Datos.** Un tipo Abstracto de Datos es un conjunto de valores y de operaciones definidos mediante una especificación independiente (interface) de cualquier representación. El objetivo, por  tanto de un TAD es seperar la interface (definición de las operaciones) de la implementación de las operacion (representación de datos más los algoritmos de las operaciones)
**TAD = valores + operaciones**
<img src="../Assets/I b/EsquemaTad.png" width="300" height="300">

# Interface
>
>Ejemplo de intez en java

```java
//La interface no se ejecuta
public interface Pila <E>{
    boolean estaVacia();
    E cima();
    void apilar (E elemen);
    void desapilar();
}
```

Podemos implementar esta interfaz en la siguiente estructura de datos

```java
public class PilaArray <E> implements Pila <E>{
    private E[] vec;
    private int tam;

    public PilaArray(){
        vec = (E[]) new Object[100];
        tam = 0;
    }

    boolean estaVacia() {
        return tam ==0;
    }
    E cima(){
        return vec[tam-1];
    }
    void apilar(E elem){
        if(tam == vec.length){
            Oject[] tmp = new Object[2*tam];
            System.arraycopy(vec,0,tmp,0,tam-1);
            vec = (E[]) tmp;
        }
        vec [tam ++] = elem;       
    }
    void desapilar(){
        return vec[--tam];
    }
}
```

## Definición axiomática (TAD)

**TAD** _pila [elemento]_

**Operaciones:**

+ crear: --> pila
+ esta_vacia: pila --> booleano
+ cima: pila --> elemento
+ apilar: pila, elemento --> pila
+ desapilar: pila --> pila

**Precondiciones:**

+ cima(p) <-> `NO esta_vacia(p)`
+ desapilar(p) <-> `'NO esta_vacia(p)`

**Ecuaciones**

+ esta_vacia(crear) == T
+ esta_vacia (apilar(p,x)) == F
+ cima(apilar(p,x)) == x
+ desapilar (apilar(p,x)) == p

---

# Iteradores
>
>Son un caso especial de Interfaces, que nos permiten **recorrer** el TAD. Son sencillos e usar y eficientes, pero en algunos casos (TAD-árboles) son difíciles de implementar. Que operaciones necesitan:

¿Hay más elementos por recorrer?
Dame el siguiente elemento
Vuelve a situarte al principio

```java
//Representa un terador de elementos
public interface Iterator<E> {
    
    // Obtiene el siguiente elemento de la iteración.
    // @Pre: hasNect()
    // @return: el siguiente elemento de la iteración
    public E getNext();
    
    //Comprueba si aún quedan elementos por iterar.
    //@return true si el itrador dispone de más elementos.
    public boolean hasNext();

    //Vuelve la posición del iterador al principio.
    // --> Esto permite reutilizar un iterador sin crear otro nuevo
    public void reset();
}
```

>[!NOTE]
>Para cada uno de los <U>**TAD que se van a estudiar en el curso**</u> se dará una interfae que seguiremos obligatoriamente para el uso de dicho TAD.
---
>[!IMPORTANT]
>Estas interfaces representa una especia de contrato, es decirm cualquier programa que implemente el TAD al que representa deberá implementar todas sus operaciones (métodos).
---
>[!NOTE]
>Dichos programas podrán incoporar nuevos métodos públicos a su interfaz siempreque éstos se definan e implementen. **PRÁCTICA DE LA ASIGNATURA**.
---
>[!TIP]
>La implementación de una parte fundamental de un TAD, ya que permite su utilización en programas reales.
---

# Estructuras de datos básicas

<img src="../Assets/I b/EsquemaEb.png" width="100%" height="70%">

## Colecciones

+ Conjunto de elementos que no tiene restricciones adicionales.
  + Solo importa si un elemento está o no en dicho conjunto.

>[!Note]
> :eyes: Todos los demás TADS van a extender de colección. La colección de los elementos puede ser mediante estructuras _lineales_ o estructuras _jerárquicas_.

### Operaciones

+ Consultar cual es el tamaño de la colección.
+ Vaciar la colección, consultar si esta vacía o no.
+ Comprobar si un elemento pertenece o no a la colección.

### Interface de Coleccion

 ```java
 /*
 * Representa una colección de elementos, sin ningún tipo de relación entre 
 *    ellos más que la pertenencia a la misma colección
 */
public interface CollectionIF<E> {
    // Devuelve el número de elementos de la colección
    public int size();
    // Devuelve true si la coleccióm no contiene elementos
    public boolean isEmpty();
    // Devuelve true si es está en la colección
    public boolean contains (E e);
    // Elimina todos los elementos de la colección
    public void clear();
}
```
## Contenedores

+ Es una colección de elementos sin orden entre sí.
  + Importa si un elemento esta o no.

### Operaciones

+ Añadir un elemento
+ Eliminar un elemento existente
+ Recorrer los elementos

### Interface de Contenedor

``` java
/**
 * Representa un contenedor, que es una clección de elementos que
 * no guardan ningún orden entre sí.
 */
public interface ContainerIF<E> extendes CollectionIF<E> {
    // Añade un elemento al contenedor
    public void add(E e);
    /**
     * Elimina un elemento e del contenedor
     * @pre: this.contains(e)
     * @post: !this.contains(e)
     */
    public void remove (E e);

    //Devuelve un iterador para el contenedor
    public IteratorIF<E> iterator ();
}
```

## Conjuntos

+ Representa el concepto matemático de conjunto finito.
+ Cada elemento está solo una vez.

### Operaciones

+ Operaciones conjuntistas típicas: _unión, intersección, diferencia (Propias de la teoría de conjuntos)_.
+ Comprobar si un conjunto es subconjunto de otro conjunto.

### Interface de un Conjunto

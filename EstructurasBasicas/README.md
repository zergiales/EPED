
# Estructuras de datos Básicas
>Los programas manejan información mediante el uso de estructuras (variables, vectores, matrices, árboles...). Éstas pueden manipularse, crearse o eliminarse.
>[!IMPORTANT]
>**Una estructura de Datos** permite establecer una forma particular de almacenar y organizar información.
Un **registro o array**  permiten el acceso a sus datos individuales mediante operaciones aritméticas sobre su dirección conocido el tamaño de cada uno de sus datos.

# Tipo Abstracto de Datos
**TAD - Tipo Abstracto de Datos.** Un tipo Abstracto de Datos es un conjunto de valores y de operaciones definidos mediante una especificación independiente (interface) de cualquier representación. El objetivo, por  tanto de un TAD es seperar la interface (definición de las operaciones) de la implementación de las operacion (representación de datos más los algoritmos de las operaciones)
**TAD = valores + operaciones**
/*
falta poner una imagen aqui de 
 */
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

**PRECONDICONES**
+ cima(p) <-> 'NO esta_vacia(p)'
+ desapilar(p) <-> 'NO esta_vacia(p)'

**ECUACIONES**
+ esta_vacia(crear) == T
+ esta_vacia (apilar(p,x)) == F
+ cima(apilar(p,x)) == x
+ desapilar (apilar(p,x)) == p
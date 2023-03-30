package EstructurasBasicas;

/**
 * Representa un arbol general de elementos, en el que un nodo
 * puede tener cualquier numero de hijos
 */
public interface GTreeIF<E> extends TreeIF<E>{
    
    /**
     * Valor enumerado que indica los tipos de recorridos
     * ofrecidos por los arboles generales
     * 
     * - con enum definimos los diferentesmodos de iteracion
     * para la estructuras de datos o algoritmo.
     * 
     * --> con esto podemos crear un objeto de tipo 'iteratorModes' y utilizarlos
     * para especificar el modo de iteracion deseado en una funcion o método que realiza
     * el recorrido del arbol
     * 
     */
    public enum IteratorModes{
        PREORDER,// desde el nodo de la raiz al hijo derecho y se hace este proceso de maner recursiva
        POSTORDER,// proviene de que la visita al nodo se realiza antes de visitar a los hijos
        BREADTH// visita por niveles los nodos de forma horizontal, de izquierda a derecha, antes de pasar al siguiente nivel en el arbol
    }

    /**
     * Modifica la raiz del arbol
     * @param ele elemento que se quiere poner como raiz del arbol
     */
    public void setRoot(E e);
}
package AnalisisBasicoAlgoritmo;

public class Ejemplo1 {
    
    /**
     * algritmo de ordenamiento por insercción
     * 
     * operación basica de coste de cte 0 -> 1
     * @param v[] que es el que vamos a ordenar , el arreglo v
     * 
     * 1. Definimos cual es el tamaño del problema 
     * 2. Calculamos el coste de cada una de las instrucciones y luego irlo acumulando
     * 
     */
    public void ordenar( int[] v){
        //coste del for
        for(int i =2; i<= v.length;i++){
            //campos variables 
            int p= i;
            int x =v[i];
            boolean seguir = true;
            //coste del while
            while (p > 1 && seguir) {
                //coste del if 
                if (x< v[p - 1]) {
                    v[p] = v[p - 1];
                    p =p-1;
                }else{
                    seguir = false;
                }
                p = p-1;
            }
            v[p] = x;
        }
    }
}

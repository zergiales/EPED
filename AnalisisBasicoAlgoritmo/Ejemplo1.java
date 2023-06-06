package AnalisisBasicoAlgoritmo;

public class Ejemplo1 {
    
    /**
     * algritmo de ordenamiento por insercción
     * 
     * operación basica de coste de cte 0 -> 1
     * @param v[] que es el que vamos a ordenar , el arreglo v
     */
    public void ordenar( int[] v){
        for(int i =2; i<= v.length;i++){
            //campos variables 
            int p= i;
            int x =v[i];
            boolean seguir = true;
            while (p > 1 && seguir) {
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


import java.util.HashMap;

public class kata {

    public static void main(String[] args) {
        int[] vector = {2, 2, 11, 4, 2, 6, 11, 2, 3, 5, 11, 5};
        HashMap<Integer, Integer> counts = new HashMap<>();
        int value;
        for (int i=0; i<vector.length; i++){ 
            //for(int i: vector);
            //if(counts.get(i)==null){
            //counts.put(i,1);
            if (counts.containsKey(vector[i])){
                //counts.put(vector[i], counts.get(vector[i]) + 1); me ahorro las dos lineas inferiores
                //actualiza la clave en lugar de tener que borrarla
                value = counts.get(vector[i]);
                counts.remove(vector[i]);
                counts.put(vector[i], value + 1);
            }else{
                counts.put(vector[i], 1);
            }
        }
        
        /*Otra solucion mas eficaz
         * for(Integer number : vector){
         * if (counts.containsKey(number))
         *      counts.put(number, counts.get(number) + 1);
         * else
         *      counts.put(number,1);
         */
        
        /*
         * 
         */
        for (Integer key : counts.keySet() ) {
            System.out.println(key + "--->" + counts.get(key));
        }
    }
}


//////TRABAJAR CON EL COLLECTION SORT
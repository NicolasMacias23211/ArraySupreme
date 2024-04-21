package ces2.arraysupreme;

import java.util.Random;

public class ArraySupreme {
    
    public ArraySupreme(int Long){
        int[] Array = new int[Long];
        long result = fillArray(Array);
        System.out.println("El resultado de la suma de los impares es: "+result);
    }
    
    private long fillArray(int[] array) {
        Random random = new Random();
        long amount = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000 - 500 + 1) + 500;
            amount = array[i] % 2 != 0 ? amount + array[i] : amount;
            System.out.println("El numero generado en la posicion "+(i+1)+" es "+array[i]);
        }
        return amount;
    }

    
}

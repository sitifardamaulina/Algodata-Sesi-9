/* Selesction Sort
 * Nama : Siti Farda Maulina
 * NIM  : 20200040036
 * Kelas: TI20A
 */
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] data = {23, 18, 15, 8, 27, 31, 40, 45};
                
        int min = data[0];
        int index = 0;
        int swappingProcess = 0;
        
        long startTime = System.nanoTime();
        
        for (int i =0; i < data.length - 1; i++){
            for (int j = i; j < data.length; j++){
                if (data[j] < min ) {
                    min = data[j];
                    index = j;
                    swappingProcess++;
                  
                }
                System.out.println(Arrays.toString(data) +" - Total Swap : " + swappingProcess);
            }
            if ( min < data[i] ) {
                data[index] = data[i];
                data[i] = min;
            }
            min = data[i + 1];
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Total waktu : " + timeElapsed + " nano detik");
    }
    
}

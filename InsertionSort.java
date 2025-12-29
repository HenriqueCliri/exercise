
public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int j = 1; j < arr.length; ++j){
            int key = arr[j];
            int i = j - 1;

            while(i >= 0 && arr[i] > key){
                arr[i + 1] = arr[i];
                --i;
            }
            arr[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};

        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();

        insertionSort(arr);

        System.out.print("Vetor Ordenado: ");
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}


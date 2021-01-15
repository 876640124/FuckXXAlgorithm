package algorithm.chn.practice;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3, 4, 5, 6, 0};
        int[] arr2 = {2, 1, 3, 4, 5, 6, 0};
        heapSort1(arr1);
        heapSort2(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]!=arr2[i]){
                System.err.println("error");
                return;
            }
        }
        System.out.println("success");
    }

    public static void heapSort1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while (heapSize > 0) {
            heapify(arr, 0, heapSize);
            swap(arr, 0, --heapSize);
        }

    }

    public static void heapSort2(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            heapify(arr, i, arr.length - 1);
        }
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while (heapSize > 0) {
            heapify(arr, 0, heapSize);
            swap(arr, 0, --heapSize);
        }
    }

    /**
     * 排出最大堆
     *
     * @param arr
     * @param i
     */
    public static void heapInsert(int[] arr, int i) {
        int index = (i + 1) / 2;
        while (arr[(i - 1) / 2] < arr[i]) {
            swap(arr, (i - 1) / 2, i);
            i = (i - 1) / 2;
        }
    }

    public static void heapify(int[] arr, int index, int heapSize) {
        while (2 * index + 1 < heapSize) {
            int tmp = 2 * index + 1;
            // 得到孩子节点较大的数
            int largest = tmp + 1 < heapSize && arr[tmp] < arr[tmp + 1] ? tmp + 1 : tmp;
            largest = arr[largest] > arr[tmp] ? largest : tmp;
            if (index == largest) {
                return;
            }
            swap(arr, largest, index);
            index = largest;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

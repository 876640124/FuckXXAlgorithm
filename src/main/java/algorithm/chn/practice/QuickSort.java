package algorithm.chn.practice;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 6, 7, 3, 8};
        quickSort2(arr,0,arr.length-1);
        System.out.println(arr);
    }


    public static void quickSort2(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        swap(arr,(int)(Math.random()*(r-l+1)),r);
        int[] mid = process2(arr, l, r);
        quickSort1(arr, l, mid[0]-1);
        quickSort1(arr, mid[1]+1, r);
    }

    public static int[] process2(int[] arr, int l, int r) {
        if (l>r){
            return new int[]{-1,-1};
        }if (l==r){
            return new int[]{l,l};
        }
        int less = l - 1;
        int more = r;
        int index = l;
        while (index < more) {
            if (arr[index] == arr[r]) {
                index++;
            } else if (arr[index] < arr[r]) {
                swap(arr, index++, ++less);
            } else {
                swap(arr,index,--more);
            }
        }
        swap(arr,index,r);
        return new int[]{less+1,more};
    }

    public static void quickSort1(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = process1(arr, l, r);
        quickSort1(arr, l, mid-1);
        quickSort1(arr, mid + 1, r);
    }

    public static int process1(int[] arr, int l, int r) {
        int less = l - 1;
        int more = r;
        int index = l;
        while (index < more) {
            if (arr[index] == arr[r]) {
                index++;
            } else if (arr[index] < arr[r]) {
                swap(arr, index++, ++less);
            } else {
                swap(arr,index,--more);
            }
        }
        swap(arr,index,r);
        return index;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

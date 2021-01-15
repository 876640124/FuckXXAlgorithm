package algorithm.chn.practice;

public class NetherlandFlag {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 5, 7, 2};
        sort(arr, 0, arr.length - 1);
        System.out.println(arr);
    }

    public static int[] sort(int[] arr, int L, int R) {
        if (L > R) {
            return new int[]{-1, -1};
        }
        if (L == R) {
            return new int[]{L, R};
        }
        // 定义左边窗口
        int less = L;
        // 定义右侧窗口
        int more = R;
        // 定义当前位置
        int index = L;
        while (index < more) {
            if (arr[index] == arr[R]) {
                index++;
            } else if (arr[index] < arr[R]) {
                swap(arr, index++, less--);
            } else {
                swap(arr, index, --more);
            }
        }
        swap(arr, R, more);
        return new int[]{L, R};
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

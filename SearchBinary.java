import java.util.Arrays;

// Массив
class MyArray {
    private int[] arrs;
    private int search;

    MyArray() {
        System.out.print("Массив пуст. ");
    }

    MyArray(int i) {
        this.arrs = new int[i];
        for (int j = 0; j < arrs.length; j++) {
            this.arrs[j] = (int) (j + Math.random() * 10);
        }
    }

    int[] getArrs() {
        return this.arrs;
    }

    int[] sortBubble() {
        for (int i = 0; i < arrs.length; i++) {
            for (int j = i + 1; j < arrs.length; j++) {
                if (arrs[i] > arrs[j]) {
                    int k = arrs[i];
                    arrs[i] = arrs[j];
                    arrs[j] = k;
                }
            }
        }
        return this.arrs;
    }

    void searchBinary(int search) {
        this.search = search;
        int low = 0;
        int high = arrs.length;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (this.search < arrs[mid]) {
                high = mid - 1;
            } else if (this.search > arrs[mid]) {
                low = mid + 1;
            } else {
                System.out.printf("Число %d найдено\n", arrs[mid]);
                break;
                //return arrs[mid];
            }
        }
        System.out.println("Поиск окончен.");
        //return 0;
    }


}

class BinarySearch {
    /*
    public static void main(String[] args) {
        MyArray arrOb = new MyArray(10);
        System.out.println("Исходный массив: " + Arrays.toString(arrOb.getArrs()));
        System.out.println("Отсортированный массив: " + Arrays.toString(arrOb.sortBubble()));
        arrOb.searchBinary(3);
        System.out.print("Повторяющийся элементы: " + Arrays.toString(arrOb.searchDuplicate()));
        //arrOb.searchDuplicate();

    }*/
}

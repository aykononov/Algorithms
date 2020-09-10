import java.util.Arrays;

class SortBubble {

    // Метод генерации нового массива с указанием размерности в параметре
    private static int[] newArrsRandom(int len) {
        int[] arrs = new int[len];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = (int) (i + Math.random() * 10);
        }
        return arrs;
    }

    // Метод сортировки Пузырьком с параметром типа массив
    private static int[] sortBubble(int[] inArrs) {
        int k;
        for (int i = 0; i < inArrs.length; i++) {
            for (int j = i + 1; j < inArrs.length; j++) {
                if (inArrs[i] < inArrs[j]) {
                    k = inArrs[j];
                    inArrs[j] = inArrs[i];
                    inArrs[i] = k;
                }
            }
        }
        return inArrs;
    }

    public static void main (String[]args){
        System.out.println("Создаем массив и сортируем методом Пузырька.");
        System.out.println("Исходный массив: " + Arrays.toString(newArrsRandom(10)));
        System.out.println("Отсортированный: " + Arrays.toString(sortBubble(newArrsRandom(10))));
    }
}
/* --------------------------------------------------
Создаем массив и сортируем методом Пузырька.
Исходный массив: [6, 7, 3, 12, 5, 10, 13, 11, 13, 16]
Отсортированный: [3, 5, 6, 7, 10, 11, 12, 13, 13, 16]
 */
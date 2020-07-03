
public class BubbleSort {
    public static void main (String [] args) {
        int [] nums = new int [10];
        System.out.print("\nСгенерированный массив: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(0 + Math.random() * 100);
            System.out.print(nums[i] + " ");
        }

        // Алгоритм пузырьковой сортирвки
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        System.out.print("\nОтсортированный массив: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");
    }
}

/* ----------------------------------------------------
Сгенерированный массив: 66 77 9 80 1 69 39 93 2 35
Отсортированный массив: 1 2 9 35 39 66 69 77 80 93
 */
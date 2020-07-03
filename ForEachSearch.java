// Поиск в неупорядоченном массиве с примененим цикла for each.

package Algorithms;

public class ForEachSearch {
    public static void main(String[] args){
        int[] arrs = {6,5,7,3,4,8,2,9,1,0};
        int find = 2;
        boolean found = false;
        // Последовательный просмотр каждого элемента до первого совпадения
        for (int x : arrs) {
            if (x == find) {
                found = true;
                System.out.println("Значение найдено: " + x);
                break;
            }
        }
        if(!found) {
           System.out.println("Значение НЕ найдено: " + find);
        }
    }
}
/*
ВАЖНО!
Оператор break не предназначен в качестве обычного средства выхода из цикла.
Для этого служит условное выражение в цикле.
Этот оператор следует использовать для выхода из цикла только в особых случаях.
 */
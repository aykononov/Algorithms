// Поиск в неупорядоченном массиве с применением цикла for each.

class ForEachSearch {
    public static void main(String[] args){
        int[] arrs = {1,2,3,4,5}; // исходный массив
        int find = 6; // число для поиска
        boolean found = false;
            // Последовательный просмотр каждого элемента до первого совпадения
            for (int x : arrs) {
                if (x == find) {
                    found = true;
                    System.out.println("Значение: " + x + " - Найдено.");
                    break; // Прервать поиск
                }
            }
            if (!found) {
                System.out.println("Значение: " + find + " - НЕ найдено.");
            }
        }
}

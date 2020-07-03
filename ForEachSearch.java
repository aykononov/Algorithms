// Поиск в неупорядоченном массиве с применением цикла for each.

class ForEachSearch {
    public static void main(String[] args){
        int[] arrs = {6,5,7,3,4,8,2,9,1,1};
        int find = 0;
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

 */
// Определение ФАКТОРИАЛА, используя рекурсию.

class FactorialUsingRecursion {

    // Рекурсивный метод
    int factRecursion(int n) {
        int result;
        if(n == 1) return 1;
        result = factRecursion(n - 1) * n;
        return result;
    }

    public static void main (String[] args) {
        FactorialUsingRecursion dimFact = new FactorialUsingRecursion();
        System.out.println("Факториал(1) = " + dimFact.factRecursion(1));
        System.out.println("Факториал(2) = " + dimFact.factRecursion(2));
        System.out.println("Факториал(3) = " + dimFact.factRecursion(3));
    }
}
/* -------------------
Факториал(1) = 1
Факториал(2) = 2
Факториал(3) = 6
 */

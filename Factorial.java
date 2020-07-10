// Определение ФАКТОРИАЛА, используя рекурсию.
class Factorial {

    // Рекурсивный метод
    int fact(int n) {
        int result;
        if(n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }

    public static void main (String[] args) {
        Factorial dimFact = new Factorial();
        System.out.println("Факториал(1) = " + dimFact.fact(1));
        System.out.println("Факториал(2) = " + dimFact.fact(2));
        System.out.println("Факториал(3) = " + dimFact.fact(3));
    }
}
/* -------------------
Факториал(1) = 1
Факториал(2) = 2
Факториал(3) = 6
 */

// Развернуть строку в обратном порядке (используя Лямбда-выражение)
interface Reversal {
    String getReversal(String str);
}
public class StringReversalLambda {
    public static void main(String[] args) {
        Reversal strOb = (str) -> {
          String result = "";
          for (int i = str.length()-1; i >= 0; i--) {
              result += str.charAt(i);
          }
          return result;
        };

        System.out.println("Строка в обратном порядке : " + strOb.getReversal("Строка"));
    }
}
/* -------------------------------
Строка в обратном порядке : акортС
 */
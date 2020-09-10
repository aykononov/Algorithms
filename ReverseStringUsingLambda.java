// Развернуть строку в обратном порядке (используя Лямбда-выражение)
interface StringFunc {
    String getReversal(String str);
}
class ReverseStringUsingLambda {
    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
          String result = "";
          for (int i = str.length()-1; i >= 0; i--) {
              result += str.charAt(i);
          }
          return result;
        };

        System.out.println("Строка в обратном порядке : " + reverse.getReversal("Строка"));
    }
}
/* -------------------------------
Строка в обратном порядке : акортС
 */
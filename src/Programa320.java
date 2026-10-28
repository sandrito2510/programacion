public class Programa320 {
    public static void main(String[] args) {
        String a = "";
        String b = "";

        for (int i = 1, j = 1; i <= 16; i++) {
            if (i % 2 != 0 && i <= 9) {
                a += i + " ";
            }
            if (i % 2 == 0 && i <= 10) {
                b += j + " ";
                j *= 2;
            }
        }

        System.out.println(a);
        System.out.println(b);
    }
}
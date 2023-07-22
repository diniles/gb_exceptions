package seminar1.task3;

public class Answer {
    public int[] divArrays(int[] a, int[] b) {
        {
            int lengthA = a.length;
            int lengthB = b.length;

            if (lengthA == lengthB) {
                int[] c = new int[lengthA];
                for (int i = 0; i < lengthA; i++) {
                    if (b[i] == 0) {
                        throw new RuntimeException("Division by zero");
                    }
                    c[i] = a[i] / b[i];
                }
                return c;
            } else {
                return new int[]{0};
            }
        }
    }
}
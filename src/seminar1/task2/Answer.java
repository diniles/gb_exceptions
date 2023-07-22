package seminar1.task2;

class Answer {
    public int[] subArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        int lengthA = a.length;
        int lengthB = b.length;

        if (lengthA == lengthB) {
            int[] c = new int[lengthA];
            for (int i = 0; i < lengthA; i++) {
                c[i] = a[i] - b[i];
            }
            return c;
        } else {
            return new int[]{0};
        }
    }
}

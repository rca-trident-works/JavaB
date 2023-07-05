public class Ex4_1_3 {
    public static void main(String[] args) {
        int[] values = new int[10];
        for (int i = 1; i < values.length + 1; i++) {
            values[i] = i;
        }

        for (int i = 1; i < values.length + 1; i++) {
            System.out.println(values[i]);
        }
    }
}

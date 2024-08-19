public class P4 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr2 = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("for [" + i + "]: " + arr[i]);
        }

        System.out.println();

        int i = 0;
        while (i < arr.length) {
            System.out.println("while [" + i + "]: " + arr[i]);
            i++;
        }

        System.out.println();

        i = 0;
        do {
            System.out.println("do-while[" + i + "]: " + arr[i]);
            i++;
        } while (i < arr.length);

        System.out.println();

        for (var item : arr) {
            System.out.println("for-each[" + (item - 1) + "]: " + item);
        }

        System.out.println();

        int sum = 0;
        for (i = 0; i < arr.length; i++) {
            sum += arr[i] + arr2[i];
        }
        System.out.println("Sum is: " + sum);

    }

}

class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3};

        int minFreq = arr.length;
        int result = arr[0];

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count < minFreq) {
                minFreq = count;
                result = arr[i];
            }
        }

        System.out.println(result);
    }
}
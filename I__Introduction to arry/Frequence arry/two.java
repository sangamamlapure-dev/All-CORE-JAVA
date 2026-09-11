class Main {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 3};
        int[] arr2 = {3, 2, 3, 1, 2};

        if (arr1.length != arr2.length) {
            System.out.println("false");
            return;
        }

        for (int i = 0; i < arr1.length; i++) {

            int count1 = 0;
            int count2 = 0;

            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    count1++;
                }

                if (arr1[i] == arr2[j]) {
                    count2++;
                }
            }

            if (count1 != count2) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }
}
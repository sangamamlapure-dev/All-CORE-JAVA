class Codex {
    public static void main(String[] args) {

        String s = "programming,ming";
        String arr[] = s.split(",");

        int start = arr[0].length() - arr[1].length();
        String suffix =arr[0].substring(start,arr[0].length());

        if (suffix.equals(arr[1])) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
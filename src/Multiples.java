public class Multiples {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 1; i < 1000; i++) {
            if (i%3 == 0 || i%5 == 0)
                cnt++;
        }

        System.out.println("There are " + cnt + " multiples of 3 or 5 below 1000");
    }
}

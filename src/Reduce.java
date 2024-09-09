public class Reduce {
    public static void main(String[] args) {
        int i = 100, cnt = 0;

        while (i != 0) {
            cnt++;
            if (i%2 == 0)
                i /= 2;
            else
                i--;
        }

        System.out.println("It takes " + cnt + " steps to reduce 100 to 0");
    }
}

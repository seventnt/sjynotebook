
public class xunhuan {
    public static void main(String[] args) {
        int a, b = 9, sum = 0, cout = 0;
        for (a = 1; a <= 11; a++) {
            b = 9 * a;
            System.out.println(b);
            sum = sum + b;
            cout++;
        }
        System.out.println(sum);
        System.out.println(cout);

        int x = 1;
        while (x <= 100) {
            x++;
            if (x % 3 == 0) {
                System.out.println(x);
            }
        }
    }
}

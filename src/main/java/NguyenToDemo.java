public class NguyenToDemo {
    public static void main(String[] args) {
        System.out.println("10 so dau tien cua day fibonacci la: ");
        for (int i = 0; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrimeNumber(int n){
        if (n<2){
            return false;
        }
        int snt=(int)Math.sqrt(n);
        for (int i = 0; i < snt; i++) {
            if (n % i==0){
                return false;
            }
        }
        return true;
    }
}

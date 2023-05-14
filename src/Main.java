public class Main {
    public static void main(String[] args) {

        long[] sales = new long[]{1, 5, 200, 400};
        SalesManager saleManager = new SalesManager(sales);
        long max = saleManager.max();
        System.out.println(max);
    }
}
public class Main {
    public static void main(String[] args) {

        long[] sales = new long[]{1, 6, 200, 400};
        SalesManager saleManager = new SalesManager(sales);
        long max = saleManager.max();
        long min = SalesManager.min();
        long average = SalesManager.average();

        System.out.println(max);
        System.out.println(min);
        System.out.println(average);


    }
}
public class Main {
    public static void main(String[] args) {

        int[] sales = new int[]{1, 5, 200, 400};
        SalesManager saleManager = new SalesManager(sales);
        int max = saleManager.max();
        System.out.println(max);
    }
}
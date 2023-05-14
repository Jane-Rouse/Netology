public class Main {
    public static void main(String[] args) {

        int[] sales = new int[]{1, 6, 200, 400};
        SalesManager saleManager = new SalesManager(sales);
        int max = saleManager.max();
        int min = SalesManager.min();
        int average = SalesManager.average();

        System.out.println(max);
        System.out.println(min);
        System.out.println(average);


    }
}
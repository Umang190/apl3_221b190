public class Example {

    public static void main(String[] args) {

        LazySolution solution1 = LazySolution.getSolution();
        System.out.println(solution1.hashCode());

        LazySolution solution2 = LazySolution.getSolution();
        System.out.println(solution2.hashCode());
    }
}
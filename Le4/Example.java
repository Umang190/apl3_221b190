public class Example {

    public static void main(String[] args) {

        EagerSolution solution1 = EagerSolution.getSolution();
        System.out.println(solution1.hashCode());

        EagerSolution solution2 = EagerSolution.getSolution();
        System.out.println(solution2.hashCode());
    }
}
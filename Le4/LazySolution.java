public class LazySolution {
    
    private static LazySolution solution;

    private LazySolution() {}

    public synchronized static LazySolution getSolution() {
        if (solution == null) {
            solution = new LazySolution();
        }
        return solution;
    }
}
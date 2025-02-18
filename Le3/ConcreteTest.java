abstract class AbsTest implements Testable {
}
class ConcreteTest extends AbsTest {
    @Override
    public void display() {
        System.out.println("Display method in ConcreteTest class.");
    }

    public static void main(String[] args) {
        ConcreteTest obj = new ConcreteTest();
        obj.display();
    }
}
interface SwimBehavior {
    void swim();
}

interface FlyBehavior {
    void fly();
}

interface QuackBehavior {
    void quack();
}

class Swim implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("Swimming...");
    }
}

class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with wings...");
    }
}

class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Cannot fly.");
    }
}

class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacking...");
    }
}

class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeaking...");
    }
}

class Mute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silent...");
    }
}

class Duck {
    SwimBehavior swimBehavior;
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(SwimBehavior swim, FlyBehavior fly, QuackBehavior quack) {
        this.swimBehavior = swim;
        this.flyBehavior = fly;
        this.quackBehavior = quack;
    }

    void performSwim() {
        swimBehavior.swim();
    }

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }
}
class RubberDuck extends Duck {
    public RubberDuck() {
        super(new Swim(), new NoFly(), new Squeak());
    }
}

class WoodenDuck extends Duck {
    public WoodenDuck() {
        super(new Swim(), new NoFly(), new Mute());
    }
}

class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new Swim(), new FlyWithWings(), new Quack());
    }
}

class LakeDuck extends Duck {
    public LakeDuck() {
        super(new Swim(), new FlyWithWings(), new Quack());
    }
}

public class DuckGame {
    public static void main(String[] args) {
        Duck rd = new RubberDuck();
        Duck wd = new WoodenDuck();
        Duck rhd = new RedHeadDuck();
        Duck ld = new LakeDuck();

        System.out.println("Rubber Duck:");
        rd.performSwim();
        rd.performFly();
        rd.performQuack();

        System.out.println("\nWooden Duck:");
        wd.performSwim();
        wd.performFly();
        wd.performQuack();

        System.out.println("\nRedHead Duck:");
        rhd.performSwim();
        rhd.performFly();
        rhd.performQuack();

        System.out.println("\nLake Duck:");
        ld.performSwim();
        ld.performFly();
        ld.performQuack();
    }
}
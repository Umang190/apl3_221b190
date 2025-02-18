// Abstract class representing a Bharatvanshi
abstract class Bharatvanshi {
    // All Bharatvanshis are fighters
    abstract void fight();
}

// Abstract class for Pandavs extending Bharatvanshi
abstract class Pandav extends Bharatvanshi {
    void obey() {
        System.out.println(this.getClass().getSimpleName() + " is obedient.");
    }
    boolean kind = true;
}

// Concrete class for Arjun
class Arjun extends Pandav {
    @Override
    void fight() {
        System.out.println("Arjun is an excellent warrior.");
    }
}

// Concrete class for Bheem
class Bheem extends Pandav {
    Bheem() {
        this.kind = false; // Bheem is less kind
    }

    @Override
    void fight() {
        System.out.println("Bheem is a powerful warrior.");
    }
}

// Abstract class for Kauravs extending Bharatvanshi
abstract class Kaurav extends Bharatvanshi {
    void disobey() {
        System.out.println(this.getClass().getSimpleName() + " disobeys.");
    }
    boolean kind = false;
}

// Concrete class for Duryodhan
class Duryodhan extends Kaurav {
    @Override
    void fight() {
        System.out.println("Duryodhan is a strong but cruel warrior.");
    }
}

// Concrete class for Vikarn (exception in Kauravs)
class Vikarn extends Kaurav {
    Vikarn() {
        this.kind = true;
    }
    
    void obey() {
        System.out.println("Vikarn is obedient.");
    }
    
    @Override
    void fight() {
        System.out.println("Vikarn is a noble warrior.");
    }
}

// Main class to test the hierarchy
public class Mahabharat {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();
        
        System.out.println("--- Pandavs ---");
        arjun.fight();
        arjun.obey();
        System.out.println("Arjun is kind: " + arjun.kind);
        
        bheem.fight();
        bheem.obey();
        System.out.println("Bheem is kind: " + bheem.kind);
        
        System.out.println("\n--- Kauravs ---");
        duryodhan.fight();
        duryodhan.disobey();
        System.out.println("Duryodhan is kind: " + duryodhan.kind);
        
        vikarn.fight();
        vikarn.obey();
        System.out.println("Vikarn is kind: " + vikarn.kind);
    }
}

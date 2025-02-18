public class Voice2 {

    private boolean isPrepared = false;

    public void templateMethod() {
     
        prepareVoice();

        hearVoice();
    }

    private void prepareVoice() {
        if (!isPrepared) {
            Animal[] animals = new Animal[5];
            animals[0] = new Cow();
            animals[1] = new Dog();
            animals[2] = new Pig();
            animals[3] = new Goat();
            animals[4] = new Lion();

            isPrepared = true;

            System.out.println("Voices have been prepared--->>>\n");
        } else {
            System.out.println("Voices are already prepared->>>\n");
        }
    }

    private void hearVoice() {
        if (isPrepared) {
            Animal[] animals = new Animal[5];
            animals[0] = new Cow();
            animals[1] = new Dog();
            animals[2] = new Pig();
            animals[3] = new Goat();
            animals[4] = new Lion();
            
            System.out.println("Now, let's hear the voices::::\n");
            for (Animal animal : animals) {
                animal.makeVoice();
            }
        } else {
            System.out.println("Please prepare the voices first...\n");
        }
    }
}

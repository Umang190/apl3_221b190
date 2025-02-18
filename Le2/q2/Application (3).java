public class Application {

    public static void main(String[] args) {

        Voice2 voice2 = new Voice2();

        voice2.templateMethod();
        
        System.out.println("Attempting to hear without preparing voices:\n");
        //voice2.hearVoice();            This will create an Error because we have declared hearVoices as a Private function
    }
}

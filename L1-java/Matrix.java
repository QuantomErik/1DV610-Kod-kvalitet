import java.util.Scanner;

/**
 * The Matrix class simulates an interactive dialogue with a user,
 * inspired by the Matrix movie. It utilizes a typewriter effect
 * for displaying text to the console.
 */
public class Matrix {

   private String name;
   private Scanner scanner;

   // ANSI escape codes for colors
   public static final String ANSI_RED = "\u001B[31m";
   public static final String ANSI_GREEN = "\u001B[32m";
   public static final String ANSI_RESET = "\u001B[0m";


   /**
     * Constructs a new Matrix object and initializes the scanner and name.
     */
   public Matrix() {
    this.scanner = new Scanner(System.in);
    this.name = "";
   }

   /**
     * Starts the interactive dialogue with the user. The dialogue
     * features multiple choices and displays text with a typewriter effect.
     *
     * @throws InterruptedException if the thread is interrupted during sleep.
     */
   public void start() throws InterruptedException{
    System.out.println(ANSI_GREEN + "Operator:...Who is this? ");
    this.name = scanner.nextLine();

    simulateTypingEffect("Morpheus: Hello " + this.name + "...I've been looking for you. I image that right now you're feeling a bit like Alice. Tumbling down the rabbit hole?",7);
    delay(1500);

    simulateTypingEffect("Morpheus: Do you belive in fate, " + this.name + "?",7);
    System.out.println("1: Yes");
    System.out.println("2: No");

    String response = scanner.nextLine();

    if (response.equals("1") || response.equals("2")) {
        simulateTypingEffect("Morpheus: I know exactly what you mean. Let me tell you why you're here. You're here because you know something. What you know, you can't explain. But you feel it. You've felt it your entire life. Do you know what I'm talking about?",7);
    } else {
        simulateTypingEffect("Morpheus: Interesting choice, but the truth remains elusive.",7);
        return;
    }

    delay(1500);

    System.out.println("1: The Matrix");
    System.out.println("2: No");

    String response2 = scanner.nextLine();

    if (response2.equals("1")) {
        simulateTypingEffect("Morpheus: The Matrix is everywhere, it is all around us. Even now, in this very room. You have to make a choice...", 7);
        delay(1500);

        simulateTypingEffect("You take the blue pill and the story ends. You wake in your bed and believe whatever you want to believe. You take the red pill and you stay in Wonderland and I show you how deep the rabbit-hole goes. Remember -- all I am offering is the truth, nothing more.",7);

        System.out.println("1: Blue pill");
        System.out.println("2: Red pill");

        String pillChoise = scanner.nextLine();

        if (!pillChoise.equals("2")) {
        simulateTypingEffect("Morpheus: You wake up in your bed and belive whatever you want to believe.",7);
        } else {
            delay(1500);
            simulateTypingEffect(ANSI_RED + "Morpheus: Welcome to the real world...",30);
        }

    } else {
        simulateTypingEffect("Morpheus: It seems you are not ready to know the truth yet.",7);
    }
   }

   /**
     * Prints the given text to the console one character at a time,
     * creating a typewriter effect.
     *
     * @param text  the text to display with the typewriter effect.
     * @param speed the delay in milliseconds between each character.
     * @throws InterruptedException if the thread is interrupted during sleep.
     */
   public void simulateTypingEffect(String text, int speed) throws InterruptedException {
    for (int i = 0; i < text.length(); i++) {
        System.out.print(text.charAt(i));
        delay(speed);
    }
    System.out.println();

   }

   /**
     * Pauses the execution for the specified amount of time.
     *
     * @param ms the delay time in milliseconds.
     * @throws InterruptedException if the thread is interrupted during sleep.
     */
   public void delay(int ms) throws InterruptedException {
    Thread.sleep(ms);
   }


   /**
     * The main method to start the Matrix game.
     *
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        try {
            Matrix matrixGame = new Matrix();
            matrixGame.start();
        } catch (InterruptedException e) {
            System.out.println("This line is not secure...");
        }
    }
}
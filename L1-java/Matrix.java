import java.util.Scanner;

public class Matrix {

   private String name;
   private Scanner scanner;

   // ANSI escape codes for colors
   public static final String ANSI_RED = "\u001B[31m";
   public static final String ANSI_GREEN = "\u001B[32m";
   public static final String ANSI_RESET = "\u001B[0m";

   //Constructor
   public Matrix() {
    this.scanner = new Scanner(System.in);
    this.name = "";
   }

   public void start() throws InterruptedException{
    System.out.println(ANSI_GREEN + "Operator:...Who is this? ");
   }


    public static void main(String[] args) {
        try {
            Matrix matrixGame = new Matrix();
            matrixGame.start();
        } catch (InterruptedException e) {
            System.out.println("This line is not secure...");
        }
    }



}
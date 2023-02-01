import java.util.Scanner;

public class WorkEfficient {
    public static void main(String[] args) {
        // Declaration global variables
        int timeTakenWorker;
        Scanner se = new Scanner(System.in);

        // Retrieve time taken by worker
        System.out.println("Enter the Time Taken by Worker : ");
        timeTakenWorker = se.nextInt();

        if (timeTakenWorker > 0){
            if (timeTakenWorker < 2) {
                // determine message to display
                if (timeTakenWorker >= 2 || timeTakenWorker < 3) {
                    System.out.println("to be highly efficient");
                } else if (timeTakenWorker >= 3 || timeTakenWorker < 4) {
                    System.out.println(" to improve speed");
                }else if(timeTakenWorker >= 4 || timeTakenWorker < 5){
                    System.out.println("training to improve his speed");
                }else {
                    System.out.println("You just got fired");
                }
            }else {
                System.out.println("Keep on your speed .");
            }
        }
    }

}

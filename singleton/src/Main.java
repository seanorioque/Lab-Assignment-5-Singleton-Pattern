//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PagIbig app = PagIbig.getInstance();

        System.out.println("Your queue number is: " + app.getQueueNumber());
        System.out.println("Your queue number is: " + app.getQueueNumber());
        System.out.println("Your queue number is: " + app.getQueueNumber());
        System.out.println("Your queue number is: " + app.getQueueNumber());// customer getting a queue number

        System.out.println("Current queued number is: " + app.callingQueueNumber());//Current client number
        app.resetQueueNumber(100); // reset the queue and remove all numbers in the queue
    }
}
public class BackgroundJobExecution {

    public static void main(String[] args) {

        // Runnable Functional Interface using Lambda
        Runnable task = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(2000); // Simulate delay
            } catch (InterruptedException e) {
                System.out.println("Task interrupted");
            }
            System.out.println("Background job completed!");
        };

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Main method continues...");
    }
}

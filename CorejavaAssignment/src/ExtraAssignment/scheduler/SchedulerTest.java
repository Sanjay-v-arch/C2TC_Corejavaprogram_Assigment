package ExtraAssignment.scheduler;

public class SchedulerTest {
	public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Task 1: Print current time every 2 seconds
        scheduler.scheduleTask(() -> System.out.println("Task 1: Current time is " + java.time.LocalTime.now()), 2);

        // Task 2: Print a message every 5 seconds
        scheduler.scheduleTask(() -> System.out.println("Task 2: Hello from Task 2!"), 5);

        // Task 3: Print a counter every 3 seconds
        final int[] counter = {0};
        scheduler.scheduleTask(() -> {
            counter[0]++;
            System.out.println("Task 3: Counter = " + counter[0]);
        }, 3);

        // Let it run for 20 seconds, then shutdown
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Shutting down scheduler...");
        scheduler.shutdownScheduler();
    }

}

package ExtraAssignment.scheduler;
import java.util.concurrent.*;

public class TaskScheduler {
	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(5);

    public void scheduleTask(Task task, int intervalInSeconds) {
        scheduler.scheduleAtFixedRate(() -> task.execute(), 0, intervalInSeconds, TimeUnit.SECONDS);
    }

    public void shutdownScheduler() {
        scheduler.shutdown();
        try {
            if (!scheduler.awaitTermination(5, TimeUnit.SECONDS)) {
                scheduler.shutdownNow();
            }
        } catch (InterruptedException e) {
            scheduler.shutdownNow();
        }
    }

}

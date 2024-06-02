import java.sql.Timestamp;

public class TimeEstimator {

    public static long processToRun() throws InterruptedException {
        long startTime = System.currentTimeMillis();

        Thread.sleep(5000);

        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

    public static void main(String[] args) throws InterruptedException {
        int processCount = 0;
        long totalProcessingTime = 0L;

        final int expectedProcesses = 20;

        System.out.println("            Starting time: " + new Timestamp(System.currentTimeMillis()));

        while(processCount < expectedProcesses) {
            long processTime = processToRun();
            processCount++;
            totalProcessingTime = totalProcessingTime + processTime;

            long avgProcessingTime = totalProcessingTime / processCount;
            long estimatedTimeLeft = (expectedProcesses - processCount) * avgProcessingTime;

            Timestamp timestamp = new Timestamp(System.currentTimeMillis() + estimatedTimeLeft);

            System.out.print("\rEstimated completion time: " + timestamp);
        }

        System.out.println("\n   Actual completion time: " + new Timestamp(System.currentTimeMillis()));

    }
}

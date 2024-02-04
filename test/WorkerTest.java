import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkerTest {
    @Test
    void testCalculateWeeklyPay() {
        Worker worker = new Worker("00000A", "John", "Doe", "Worker", 1990, 40.0);

        // Weekly pay for 45 hours (40 regular + 5 overtime) at $40 per hour
        double expectedPay = 40 * 40.0 + 5 * 1.5 * 40.0;
        assertEquals(expectedPay, worker.calculateWeeklyPay(45), 0.01);
    }

    @Test
    void testDisplayWeeklyPay() {
        Worker worker = new Worker("00000B", "Jane", "Dow", "Worker", 1980, 20.0);

        // Expected display string for 45 hours (40 regular + 5 overtime) at $20 per hour
        String expected = "Regular Hours: 40.0 Pay: $800.0\n" +
                "Overtime Hours: 5.0 Pay: $150.0\n" +
                "Total Pay: $950.0";

        // Actual display string
        String display = worker.displayWeeklyPay(45);

        assertEquals(expected, display);
    }
}

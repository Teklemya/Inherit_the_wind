import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryWorkerTest {
    @Test
    void testCalculateWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("00000C", "Zack", "Bass", "Manager", 1985, 0.0, 52000.0);

        // Weekly pay should be 52000 / 52 = 1000.0
        assertEquals(1000.0, salaryWorker.calculateWeeklyPay(40), 0.01);
    }

    @Test
    void testDisplayWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("00000D", "Mark", "Matt", " Product Manager", 1995, 0.0, 104000.0);

        // Expected display string
        String expected = "Weekly pay: $2000.0 (a fraction of the yearly salary)";

        // Actual display string
        String display = salaryWorker.displayWeeklyPay(40);

        assertEquals(expected, display);
    }
}

import java.util.Calendar;
import java.util.ArrayList;
public class Main {
        public static void main(String[] args) {
            // Create an ArrayList to store workers
            ArrayList<Worker> workers = new ArrayList<>();

            // Create 3 Worker instances with reasonable hourly rates
            Worker worker1 = new Worker("W001", "John", "Doe", "Worker", 1990, 20.0);
            Worker worker2 = new Worker("W002", "Alice", "Smith", "Worker", 1995, 18.0);
            Worker worker3 = new Worker("W003", "Bob", "Johnson", "Worker", 1988, 22.0);

            // Create 3 SalaryWorker instances with reasonable salary rates
            SalaryWorker salaryWorker1 = new SalaryWorker("S001", "Emma", "Jones", "Manager", 1982, 0.0, 60000.0);
            SalaryWorker salaryWorker2 = new SalaryWorker("S002", "Michael", "Brown", "Manager", 1975, 0.0, 75000.0);
            SalaryWorker salaryWorker3 = new SalaryWorker("S003", "Olivia", "Miller", "Manager", 1990, 0.0, 70000.0);

            // Add workers to the ArrayList
            workers.add(worker1);
            workers.add(worker2);
            workers.add(worker3);
            workers.add(salaryWorker1);
            workers.add(salaryWorker2);
            workers.add(salaryWorker3);

            // Simulate 3 weekly pay periods
            for (int week = 1; week <= 3; week++) {
                System.out.println("Week " + week + " Payroll:");

                // Display header
                System.out.printf("%-10s%-15s%-15s%-15s%-15s\n", "ID", "Name", "Title", "Hourly Rate", "Weekly Pay");

                // Calculate and display pay for each worker
                for (Worker worker : workers) {
                    double hoursWorked = (week == 2) ? 50 : 40; // Adjust hours for week 2

                    double hourlyRate = (worker instanceof SalaryWorker) ? 0.0 : ((Worker) worker).getHourlyPayRate();


                    // Calculate weekly pay
                    double weeklyPay = worker.calculateWeeklyPay(hoursWorked);

                    // Display worker information and weekly pay
                    System.out.printf("%-10s%-15s%-15s%-15s%-15.2f\n",
                            worker.getID(), worker.FullName(), worker.getTitle(), worker instanceof SalaryWorker ? "N/A" : ((Worker) worker).hourlyPayRate, weeklyPay);
                }

                System.out.println(); // Add a blank line between weeks
            }
        }
    }

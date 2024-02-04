public class Worker extends Person {
    protected double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double regularPay = Math.min(40, hoursWorked) * hourlyPayRate;
        double overtimePay = Math.max(0, hoursWorked - 40) * 1.5 * hourlyPayRate;
        return regularPay + overtimePay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        double regularPay = Math.min(40, hoursWorked) * hourlyPayRate;
        double overtimePay = Math.max(0, hoursWorked - 40) * 1.5 * hourlyPayRate;
        double totalPay = regularPay + overtimePay;

        return "Regular Hours: " + Math.min(40, hoursWorked) + " Pay: $" + regularPay +
                "\nOvertime Hours: " + Math.max(0, hoursWorked - 40) + " Pay: $" + overtimePay +
                "\nTotal Pay: $" + totalPay;
    }
}

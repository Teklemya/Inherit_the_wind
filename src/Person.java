import javax.swing.plaf.PanelUI;
import java.util.Calendar;
import java.util.Scanner;

public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

//    static private int IDSeed;
//
//    public static void setIDSeed(int IDSeed) { Person.IDSeed = IDSeed; }
//
//    public static int getIDSeed() {return IDSeed;}

    public Person(){

    }
    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String FullName(){
        return this.getFirstName() +" "+ this.getLastName();
    }
    public String FormalName(){
        return this.title +" "+ this.firstName+" "+ this.lastName;
    }

//Calculate the current age
    public String getAge(){
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int age = currentYear - YOB;
        return Integer.toString(age);
    }
    //    Calculate Age at a specific year
    public String getAge(int year) {
        int specificYear = 2075;
        int specificAge = specificYear - year;
        return Integer.toString(specificAge);
    }

    public String toCSVDataRecord(){
        return this.ID + ", " + this.firstName + ", " + this.lastName + ", " + this.title + ", " + YOB;
    }
}



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person  p1, p2, p3, p4, p5,p6;

    @BeforeEach
    void setUp() {
        p1 = new Person("00000A", "Tom", "Wulf", "prof.", 1980);
        p2 = new Person("00000B", "Bol", "Won", "prof.", 1999);
        p3 =  new Person("00000C", "Ben", "tony", "prof.", 1992);
        p4 = new Person("00000D", "Ban", "dolly", "prof.", 1992);
        p5 = new Person("00000E","Taz", "popel", "prof.", 1990);
        p6 = new Person("00000F", "Bless", "passion", "prof.", 1998);

    }

    @Test
    void setID() {
        p1.setID("00000B");
        assertEquals("00000B", p1.getID());
    }

    @Test
    void setFirstName() {
        p1.setFirstName("Tom");
        assertEquals("Tom", p1.getFirstName());
    }

    @Test
    void setLastName() {
        p1.setLastName("Wulf");
        assertEquals("Wulf", p1.getLastName());
    }

    @Test
    void setTitle() {
        p1.setTitle("Prof.");
        assertEquals("Prof.", p1.getTitle());
    }

    @Test
    void setYOB() {
        p1.setYOB(1968);
        assertEquals(1968, p1.getYOB());
    }

    @Test
    void toCSVDataRecord() {
        p1.setID("0000B");
        p1.setFirstName("orma");
        p1.setLastName("cosna");
        p1.setTitle("Prof");
        p1.setYOB(2000);
        assertEquals("0000B, orma, cosna, Prof, 2000", p1.toCSVDataRecord());
    }
    @Test
    void TestFullName(){
        p1.setFirstName("X");
        p1.setLastName("Y");
        assertEquals("X Y",p1.FullName());
    }
    @Test
    void testFormalName(){
        p1.setTitle("Esq");
        p1.setFirstName("Bob");
        p1.setLastName("Maddy");
    assertEquals("Esq Bob Maddy",p1.FormalName());
    }
    @Test
    void testGetCurrentYear(){
        Person p1 = new Person();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        assertEquals(2024, Integer.parseInt(p1.getAge()));
    }
    @Test
    void testGetAge() {
        int yearOfBirth = p1.getYOB();
        assertEquals(44, Integer.parseInt(p1.getAge(yearOfBirth)));
    }


}


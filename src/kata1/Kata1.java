package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        System.out.println("hola mundo");
        Calendar date = GregorianCalendar.getInstance();
        date.set(1949,9,24);
        
        Person person = new Person("Pablo", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}

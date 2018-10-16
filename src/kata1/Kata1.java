package kata1;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        System.out.println("hola mundo");
        LocalDate date = LocalDate.of(1949, 9, 24);
        
        
        Person person = new Person("Pablo", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}

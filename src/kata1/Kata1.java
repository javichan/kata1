package kata1;

import java.time.LocalDate;
import java.time.Month;

public class Kata1 {
    
    public static void main(String[] args) {
        
        LocalDate date;
        date = LocalDate.of(1994, Month.JUNE, 21);
        Person person = new Person("Javi",date);
        System.out.println(person.getName()+ " tiene " + person.getAge() 
                + " años");
        
    }
   
}

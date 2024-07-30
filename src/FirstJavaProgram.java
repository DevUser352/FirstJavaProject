import model.Dog;
import model.Person;

import java.time.LocalDate;

public class FirstJavaProgram {
    public static void main(String[] args) {
        Person ravi = new Person("Ravi","Kumar", LocalDate.of(2000,2,2));
        Person janet = new Person("Janet", "Jackson",LocalDate.of(2001,3,5));

        ravi.setSpouse(janet);

        Dog fido = new Dog("Fido",LocalDate.of(2020,1,1));
        ravi.setPet(fido);
        System.out.println(ravi);

    }
}

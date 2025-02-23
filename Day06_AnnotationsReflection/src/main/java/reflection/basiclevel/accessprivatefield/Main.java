package reflection.basiclevel.accessprivatefield;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        try{
            Person person=new Person(20);
            person.displayAge();

            Field ageField=Person.class.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.set(person,50);

            int modifiedAge =(int)ageField.get(person);
            System.out.println("Modified age is "+modifiedAge);

            person.displayAge();

        }catch (NoSuchFieldException e){
            System.out.println(e.getMessage());
        }
        catch (IllegalAccessException f){
            System.out.println(f.getMessage());
        }


    }
}

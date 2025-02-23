package reflection.basiclevel.dynamicallycreateobjects;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
            try{
                Class<Student>cls=Student.class;
                Constructor<Student>cons=cls.getConstructor(String.class,int.class);
                Student student=cons.newInstance("John",2169);
                student.display();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
    }
}

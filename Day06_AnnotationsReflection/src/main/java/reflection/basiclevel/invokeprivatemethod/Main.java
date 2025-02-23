package reflection.basiclevel.invokeprivatemethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
       try{
           Calculator calculator=new Calculator();
           Class<?>cls=calculator.getClass();
           Method method= cls.getDeclaredMethod("multiply", int.class, int.class);
           method.setAccessible(true);
           int result = (int)method.invoke(calculator,50,60);
           System.out.println("result is "+result);

       }catch (NoSuchMethodException e){
           System.out.println(e.getMessage());
       }catch (IllegalAccessException f){
           System.out.println(f.getMessage());
       }catch (InvocationTargetException g){
           System.out.println(g.getMessage());
       }



    }
}

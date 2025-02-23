package annotations.exercise.suppressuncheckedwarnings;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList ar = new ArrayList();
        ar.add(10);
        ar.add(20);
        System.out.println(ar.toString());


    }
}

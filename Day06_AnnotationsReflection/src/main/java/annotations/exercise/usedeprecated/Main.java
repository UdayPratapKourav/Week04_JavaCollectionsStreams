package annotations.exercise.usedeprecated;

public class Main {
    public static void main(String[] args) {
        LegacyAPI la = new LegacyAPI();
        la.oldFeature();

        la.newFeature();
    }
}

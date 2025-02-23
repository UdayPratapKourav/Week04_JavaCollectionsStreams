package annotations.advancedlevel.cacheresultannotation;

class MathOperations implements IMathOperations {
    @CacheResult
    public int factorial(int n) {
        System.out.println("Computing factorial for: " + n);
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}

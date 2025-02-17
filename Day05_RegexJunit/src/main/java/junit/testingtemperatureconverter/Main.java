package junit.testingtemperatureconverter;

public class Main {
    public static void main(String[] args) {
        // Test cases for temperature conversions

        double celsius1 = 0;
        double fahrenheit1 = TemperatureConverter.celsiusToFahrenheit(celsius1);
        System.out.println(celsius1 + "°C is " + fahrenheit1 + "°F");

        double fahrenheit2 = 32;
        double celsius2 = TemperatureConverter.fahrenheitToCelsius(fahrenheit2);
        System.out.println(fahrenheit2 + "°F is " + celsius2 + "°C");

        double celsius3 = 100;
        double fahrenheit3 = TemperatureConverter.celsiusToFahrenheit(celsius3);
        System.out.println(celsius3 + "°C is " + fahrenheit3 + "°F");

        double fahrenheit4 = 212;
        double celsius4 = TemperatureConverter.fahrenheitToCelsius(fahrenheit4);
        System.out.println(fahrenheit4 + "°F is " + celsius4 + "°C");
    }
}
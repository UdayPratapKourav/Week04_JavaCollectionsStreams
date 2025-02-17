package junit.testingdateformatter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DateFormatterTest {

    // Test valid date conversion
    @Test
    void testValidDate() {
        assertEquals("25-12-2024", DateFormatter.formatDate("2024-12-25"), "Date should be formatted correctly.");
        assertEquals("01-01-2023", DateFormatter.formatDate("2023-01-01"), "Date should be formatted correctly.");
        assertEquals("15-08-2022", DateFormatter.formatDate("2022-08-15"), "Date should be formatted correctly.");
    }

    // Test invalid date format
    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("25-12-2024");
        });
        assertEquals("Invalid date format. Please use yyyy-MM-dd.", exception.getMessage());
    }

    // Test empty string
    @Test
    void testEmptyString() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("");
        });
        assertEquals("Invalid date format. Please use yyyy-MM-dd.", exception.getMessage());
    }
}
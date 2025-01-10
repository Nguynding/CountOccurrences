import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CountOccurrencesTest {

    // Kiểm thử với mảng rỗng
    @Test
    void testEmptyArray() {
        Integer[] array = {};
        assertEquals(0, CountOccurrences.countOccurrences(array, 1));
    }

    // Kiểm thử khi phần tử không tồn tại trong mảng
    @Test
    void testElementNotInArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        assertEquals(0, CountOccurrences.countOccurrences(array, 6));
    }

    // Kiểm thử khi phần tử xuất hiện nhiều lần
    @Test
    void testElementAppearsMultipleTimes() {
        Integer[] array = {1, 2, 3, 2, 2, 4};
        assertEquals(3, CountOccurrences.countOccurrences(array, 2));
    }

    // Kiểm thử với mảng chứa nhiều kiểu dữ liệu
    @Test
    void testArrayWithDifferentDataTypes() {
        Object[] array = {"apple", 1, 'a', 1.0, "apple"};
        assertEquals(2, CountOccurrences.countOccurrences(array, "apple"));
        assertEquals(1, CountOccurrences.countOccurrences(array, 1));
        assertEquals(0, CountOccurrences.countOccurrences(array, "banana"));
    }

    // Kiểm thử với phần tử null trong mảng
    @Test
    void testNullElement() {
        Object[] array = {null, "test", null, 1};
        assertEquals(2, CountOccurrences.countOccurrences(array, null));
    }

    // Kiểm thử với mảng null
    @Test
    void testNullArray() {
        Integer[] array = null;
        assertEquals(0, CountOccurrences.countOccurrences(array, 1));
    }

    // Kiểm thử khi phần tử là null nhưng không có trong mảng
    @Test
    void testNullElementNotInArray() {
        String[] array = {"a", "b", "c"};
        assertEquals(0, CountOccurrences.countOccurrences(array, null));
    }

    // Kiểm thử khi mảng có null nhưng tìm phần tử khác null
    @Test
    void testArrayHasNullButSearchForNonNull() {
        String[] array = {null, "a", null, "b"};
        assertEquals(1, CountOccurrences.countOccurrences(array, "a"));
    }
}

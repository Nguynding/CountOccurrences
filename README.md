# CountOccurrences
## Mô tả dự án
Dự án này cung cấp một hàm countOccurrences dùng để đếm số lần xuất hiện của một phần tử trong một mảng.

Ngoài ra, dự án bao gồm các bài kiểm thử JUnit để đánh giá tính đúng đắn của hàm này.

## CountOccurrences
```java
public class CountOccurrences {

    // Phương thức đếm số lần xuất hiện của phần tử trong mảng
    public static <T> int countOccurrences(T[] array, T element) {
        int count = 0;
        if (array == null) return 0;
        for (T item : array) {
            if (item == null && element == null) {
                count++;
            } else if (item != null && item.equals(element)) {
                count++;
            }
        }
        return count;
    }
}
```
## CountOccurrencesTest
```java
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
```
## Kết quả chạy chương trình
![image](https://github.com/user-attachments/assets/08615534-0985-4e1d-bcb2-2ff8911f4450)
![image](https://github.com/user-attachments/assets/165bdef7-b518-4719-bded-0aae99e6d8b7)

## Nguồn tham khảo
https://chatgpt.com/share/67810259-3c5c-8007-b678-fb63ce994e29

# Tác giả
Nguyễn Diệu Linh 

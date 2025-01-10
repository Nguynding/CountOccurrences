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
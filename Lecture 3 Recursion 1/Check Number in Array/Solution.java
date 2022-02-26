public class Solution {

    public static boolean checkNumber(int input[], int x) {

        return name(input, x, 0);

    }

    private static boolean name(int input[], int x, int count) {
        if (count == input.length) {
            return false;
        }
        if (input[count] == x) {
            return true;
        }
        return name(input, x, count + 1);
    }
}

public class Lower {

    public static void main(String[] args) {
        String[] strings = {"ABCD", "ABCD1235667", "abcdABCD", "abc123456AB"};
        for (String s :strings) {
            System.out.println(toLowerCase(s));
        }

        int[] values = {1, 2, -3, -4};
        int max = getMaxValue(values);
        System.out.print("Max: ");
        System.out.println(max);
        //
        int number = 100;
        int value = number < 0 ? -number : number;
        System.out.print(value);
    }

    public static String toLowerCase(String s) {
        char[] values = s.toCharArray();
        for (int i = 0; i < values.length; ++i) {
            if (Character.isLetter(values[i]) && Character.isUpperCase(values[i])) {
                values[i] = Character.toLowerCase(values[i]);
            }
        }
        return new String(values);
    }

    public static int getMaxValue(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Numbers array cannot be empty or null");
        }
        int absMax = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (Math.abs(numbers[i]) > Math.abs(absMax)) {
                absMax = numbers[i];
            }
        }
        return absMax;
    }
    
}

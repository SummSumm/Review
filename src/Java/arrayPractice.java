package Java;

import java.util.Arrays;

public class arrayPractice {
    public static void main(String[] args) {
        //         ARRAY
        // 1. Size is fixed
        // 2. Has index
        // 3. mutable
        // 4. Multidimentional
        // 5. Fast
        // 6. Primitives and non-primitives
        // 7. Iteratable

        int[] nums = {10, 20, 30};
        int[] nums2 = new int[3];

        nums2[0] = 40;
        nums2[1] = 50;
        nums2[2] = 60;
        nums2[2] = 100;
        System.out.println(Arrays.toString(nums2));

        System.out.println("--------------------------------");
        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);

        }

        System.out.println("---------------------------------");

        for (int i =  nums2.length-1; i >= 0; i--) {
            System.out.println(nums2[i]);

        }
// Reverse String dene
        System.out.println("--------------------------------");

        char [] chars = {'A', 'B', 'C', 'D', 'E'};
        char []reversedChar = new char[chars.length];
        for (char each : chars) {
            System.out.println("Each char "  + each);
        }

    }
}

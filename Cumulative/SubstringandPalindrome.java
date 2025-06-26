package Cumulative;

import java.util.*;

public class SubstringandPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scanner.nextLine().replaceAll(" ", ""); // Remove spaces for substring check
        scanner.close();

        String longest = findLongestSubstring(str);
        System.out.println("\nLongest Substring Without Repeating Characters: " + longest);
        System.out.println("Length: " + longest.length());

        if (isPalindrome(longest)) {
            System.out.println("✅ It is a palindrome.");
        } else {
            System.out.println("❌ It is not a palindrome.");
        }
    }

    public static String findLongestSubstring(String str) {
        Set<Character> set = new LinkedHashSet<>();
        int left = 0, right = 0;
        int maxLen = 0;
        int startIndex = 0;

        while (right < str.length()) {
            char current = str.charAt(right);

            if (!set.contains(current)) {
                set.add(current);
                if (right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    startIndex = left;
                }
                right++;
            } else {
                set.remove(str.charAt(left));
                left++;
            }
        }

        return str.substring(startIndex, startIndex + maxLen);
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}

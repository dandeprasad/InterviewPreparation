package Interview.paypay;

public class PalindromicArray {

    public static void main(String[] args) {
        String[] arr = {"aa", "bab", "cde", "aba", "ab"};
        System.out.println(solution(arr)); // Output: true
    }

    public static boolean solution(String[] arr) {
        int n = arr.length;
        boolean[] isUsed = new boolean[n];

        for (int i = 0; i < n - 1; i++) {
            if (!isUsed[i]) {
                String str1 = arr[i];
                String str2 = arr[i + 1];

                if (isPalindrome(str1 + str2)) {
                    isUsed[i] = true;
                    isUsed[i + 1] = true;
                } else if (isPalindrome(str2 + str1)) {
                    isUsed[i] = true;
                    isUsed[i + 1] = true;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

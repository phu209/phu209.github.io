import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);

        int[] nums3 = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums3,val));

        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);

        int[] nums4 = {0,1,0,3,12};
        moveZeroes(nums4);*/

        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));

        String s1 = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s1));

        /*String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));*/
    }

    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int num : nums) {
            int count = 0;
            while (num != 0){
                num = num/10;
                count++;
            }
            if (count%2==0) result++;
        }
        return result;
    }
    //1295. Find Numbers with Even Number of Digits
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/958284443/

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m+n ; i++) {
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
    //88. Merge Sorted Array
    //https://leetcode.com/problems/merge-sorted-array/submissions/958293430/

    public static int removeElement(int[] nums3, int val) {
        int count = 0;                              // dem cac phan tu khong phai la val
        for (int i = 0; i < nums3.length; i++) {    // duyet phan tu mang
            if (nums3[i] != val){                   // neu phan tu khong phai la val
                nums3[count] = nums3[i];
                count++;
            }
        }
        return count;
    }
    //27. Remove Element
    //https://leetcode.com/problems/remove-element/submissions/961499621/

    public static void duplicateZeros(int[] arr) {
        int[] res = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length && j < arr.length; i++){
            if (arr[i] != 0){
                res[j] = arr[i];            //them phan tu do neu nhu khac 0
            } else {
                j++;                        //bang 0 thi tang j len 1 (tu gan gia tri tai j++ = 0)
            }
            j++;                            //1 trong 2 TH kia deu tang j len 1
        }

        //dung vong lap de gan lai gia tri phan tu cho arr
        for (int i = 0; i < arr.length; i++){
            arr[i] = res[i];
        }

        System.out.println(Arrays.toString(arr));
    }
    //1089. Duplicate Zeros
    //https://leetcode.com/problems/duplicate-zeros/submissions/961514498/

    public static void moveZeroes(int[] nums4) {
        int j = 0;
        // duyet mang cac phan tu khac 0 thi luu nao nums4[j], sau do tang j len 1
        for (int i = 0; i < nums4.length; i++) {
            if (nums4[i] != 0) {
                nums4[j] = nums4[i];
                j++;
            }
        }

        // duyet lai mang de gan cac gia tri con lai bang 0
        for (int i = j; i < nums4.length; i++) {
            nums4[i] = 0;
        }
        System.out.println(Arrays.toString(nums4));
    }
    //283. Move Zeroes
    //https://leetcode.com/problems/move-zeroes/submissions/961540455/

    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count = 0;                              //đếm số lần lặp lại
            for (int j = 0; j < s.length(); j++) {
                if (i == j) continue;
                if (s.charAt(i) == s.charAt(j)){        //duyệt mảng nếu bằng nhau thì tăng count lên 1
                    count++;
                }
            }
            if (count == 0) return i;                   // Tại vị trí duyệt i nếu count = 0 thì trả vị trí i
        }
        return -1;
    }
    //387. First Unique Character in a String
    //https://leetcode.com/problems/first-unique-character-in-a-string/submissions/962200934/

    public static int balancedStringSplit(String s1) {
        int l = 0;
        int r = 0;
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'L') l++;
            else r++;
            if (l == r) count++;
        }return count;
    }
    //1221. Split a String in Balanced Strings
    //https://leetcode.com/problems/split-a-string-in-balanced-strings/submissions/962211110/

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a1 = "";
        String a2 = "";
        for (int i = 0; i < word1.length; i++) {
            a1 += word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            a2 += word2[i];
        }
        return a1.equals(a2);
    }
    //1662. Check If Two String Arrays are Equivalent
    //https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/submissions/961547196/
}
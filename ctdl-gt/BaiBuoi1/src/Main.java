import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,7,1,5};
        int target = 9;
        int n = 2;
        System.out.println(Arrays.toString(twoSum(nums,target)));

        int[] nums1 = {4,1,2,1,2};
        System.out.println(singleNumber(nums1));

        int[] nums2 = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums2));

        int[] nums3 = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums3));

        int[] rec1 = {0, 0, 2, 2};
        int[] rec2 = {1, 1, 3, 3};
        System.out.println(isRectangleOverlap(rec1,rec2));

        System.out.println(Arrays.toString(shuffle(nums,n)));

        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }return arr;
    }
    //https://leetcode.com/problems/two-sum/submissions/953976800/

    public static int singleNumber(int[] nums1) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            count = 0;
            for (int j = 0; j < nums1.length; j++) {
                if (nums1[i] == nums1[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums1[i];
            }
        }
        return 0;
    }
    //https://leetcode.com/problems/single-number/submissions/957764961/

    public static int majorityElement(int[] nums2) {
        int a = 0;
        for(int i = 0; i < nums2.length;i++) {
            int count = 0;
            for(int j = i; j < nums2.length;j++) {
                if(nums2[j] == nums2[i]) {
                    count++;
                }
            }
            if(count > (double) nums2.length/2) {
                a = nums2[i];
            }
        }
        return a;
    }
    //https://leetcode.com/problems/majority-element/submissions/956888184/

    public static int findMaxConsecutiveOnes(int[] nums3) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums3.length; i++) {
            if (nums3[i] == 1) {
                count++;
                max = Math.max(max,count);
            } else if (nums3[i] == 0) {
                count = 0;
            }
        }return max;
    }
    //https://leetcode.com/problems/max-consecutive-ones/submissions/956351025/

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return  rec1[0] < rec2[2] && rec1[1] < rec2[3] && rec1[2] > rec2[0] && rec1[3] > rec2[1];
    }
    //https://leetcode.com/problems/rectangle-overlap/submissions/956355242/

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int a = 0;
        for (int i = 0; i < n; i++) {
            ans[a] = nums[i];
            a+=2;
        }
        int b = 1;
        for (int i = n; i < 2*n; i++) {
            ans[b] = nums[i];
            b+=2;
        }
        return ans;
    }
    //https://leetcode.com/problems/shuffle-the-array/submissions/957500272/

    public static int[] runningSum(int[] nums) {
        int[] a = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+= nums[i];
            a[i] = sum;
        }
        return a;
    }
    //https://leetcode.com/problems/running-sum-of-1d-array/submissions/956344327/
}
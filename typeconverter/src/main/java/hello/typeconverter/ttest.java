package hello.typeconverter;

public class ttest {

    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int count =  nums[0] + nums[1] + nums[2];
        int p1 = 1;
        int p2 = 3;

        for (int i = 1; i < n; i++) {
            if(p2 == n) break;
            if(Math.abs(count - target) > Math.abs((nums[p1] + nums[p2] + nums[p1+1]) - target )) {
                count = nums[p1] + nums[p2] + nums[p1+1];
                p1++;
                p2++;
            }
        }
        return count;

    }
}

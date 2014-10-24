public class arrays {
    public int[] frontPiece(int[] nums) {
	int[] retnums = new int[2];
	if (nums.length <= 2) {
	    return nums;
	}
	else {
	    retnums[0] = nums[0];
	    retnums[1] = nums[1];
	}
	return retnums;
    }

    public int sum13(int[] nums) {
	int retint = 0;
	int a = nums.length;
	for (int i = 0;i<a;i = i + 1) {
      if (nums[i] == 13) {
	  i = i + 1;
      }
      else {
	  retint = retint + nums[i];
      }
	}
	return retint;
    }
}

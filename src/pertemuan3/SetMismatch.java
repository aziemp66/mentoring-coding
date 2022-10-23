package pertemuan3;

public class SetMismatch {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 4 };
		int[] result = findErrorNums(nums);
		System.out.println(result[0] + " " + result[1]);
	}

	public static int[] findErrorNums(int[] nums) {
		int[] result = new int[2];

		// [1,2,3,2] //lenght = 4
		for (int i = 1; i <= nums.length; i++) {
			int count = 0;
			for (int j : nums) {
				if (i == j) {
					count++;
					if (count > 1) {
						result[0] = i;
					}
				}
			}
			if (count == 0) {
				result[1] = i;
			}
		}
		return result;
	}
}
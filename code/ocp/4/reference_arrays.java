String[] bugs = { "cricket", "beetle", "ladybug" };
String[] alias = bugs;

System.out.println(bugs.equals(alias)); // true
System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0

int[] nums = { 2, 45, 1, 3 };
int[] nums2 = nums;

System.out.println(nums.equals(nums2)); // true

int[] nums = { 2, 45, 1, 3 };
int[] nums2 = { 2, 45, 1, 3 };
System.out.println(nums.equals(nums2)); // false

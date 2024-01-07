System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1})); // -1 (Arrays are the same)
System.out.println(Arrays.mismatch(new String[] {"a"}, new String[] {"A"})); // 0 (Entries at element 0 are not equal)
System.out.println(Arrays.mismatch(new int[] {1, 2}, new int[] {1})); // 1
/*
    The element at index =1= is not equal.
    Or, more specifically, one array has an element at index 1, and the other does not
*/

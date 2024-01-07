import java.util.*; // import whole package including Arrays
import java.util.Arrays; // import just Arrays

int[] numbers = { 6, 9, 1 };
Arrays.sort(numbers);

for (int i = 0; i < numbers.length; i++)
    System.out.print(numbers[i] + " ");

String[] names = { "DeadPool", "BatMan", "AquaMan" };

Arrays.sort(names);

for (String name: names)
    System.out.println(name);

import java.util.Arrays;

public class SneakyOutcomes {

    public static int[] findDuplicates(int[] givenOutcomes) {
        // Sort the array.  Duplicates will now follow each other.
        Arrays.sort(givenOutcomes);

        int[] duplicateValues = new int[2]; // Array to store the two duplicates
        int duplicateCounter = 0; // Counter for the duplicates array

        // Iterate through the sorted array, looking for identical elements that follow each other.
        for (int i = 0; i < givenOutcomes.length - 1; i++) {
            if (givenOutcomes[i] == givenOutcomes[i + 1]) {
                duplicateValues[duplicateCounter] = givenOutcomes[i];  // Found a duplicate
                duplicateCounter++; // Increment the index for the duplicates array.
                i++; // Skip the next element (since it's also the duplicate).
            }
        }

        return duplicateValues;
    }

    public static void main(String[] args) {
        int[] givenOutcomes = {123456, 234567, 123347, 456789, 567890, 678901, 789012, 890123, 901234, 112233, 223344, 334455, 789012, 222234, 123347};
        int[] duplicateValues = findDuplicates(givenOutcomes);
        for (int duplicate : duplicateValues) {
            System.out.print(duplicate + " ");
        }
        System.out.println(); // Newline
    }
}
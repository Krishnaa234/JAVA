import java.util.*;

public class ArrayInsertion {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[] elements = {5, 6};
        int[] positions = {2, 4};

        int[] result = insertElements(arr, elements, positions);

        // Print the result array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] insertElements(int[] arr, int[] elements, int[] positions) {
        ArrayList<Integer> resultList = new ArrayList<>();

        int arrIndex = 0, elementIndex = 0, positionIndex = 0;

        while (arrIndex < arr.length || elementIndex < elements.length) {
            if (positionIndex < positions.length && arrIndex == positions[positionIndex] - 1) {
                resultList.add(elements[elementIndex]);
                elementIndex++;
                positionIndex++;
            } else {
                resultList.add(arr[arrIndex]);
                arrIndex++;
            }
        }

        // Convert the ArrayList to int array
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}
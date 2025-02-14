import java.util.*;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int positions = 2;
        List<Integer> rotatedList = rotateList(inputList, positions);
        System.out.println(rotatedList);
    }

    public static List<Integer> rotateList(List<Integer> list, int positions) {
        int n = list.size();
        int effectivePositions = positions % n;
        
        // Rotate the list
        List<Integer> rotatedList = new ArrayList<>(list.subList(effectivePositions, n));
        rotatedList.addAll(list.subList(0, effectivePositions));
        
        return rotatedList;
    }
}

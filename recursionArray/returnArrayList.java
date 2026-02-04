package recursionArray;
import java.util.*;

public class returnArrayList {
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 3, 5, 3};
        System.out.print(findAll(arr, 3, 0));
    }

    static List<Integer> findAll(int[] arr, int target, int index){
        if(index == arr.length){
            return new ArrayList<>();
        }

        List<Integer> list = findAll(arr, target, index + 1);

        if(arr[index] == target){
            list.add(0, index);  // add in front to maintain order
        }
        return list;
    }
}

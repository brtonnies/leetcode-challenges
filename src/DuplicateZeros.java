import java.util.LinkedList;
import java.util.Queue;

/*
        Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
            --> Note that elements beyond the length of the original array are not written.
            --> Do the above modifications to the input array in place, do not return anything from your function.
 */

public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<arr.length; i++)
            q.add(arr[i]);

        int tmp;
        for(int i = 0; i < arr.length; i++){
            tmp = q.poll();
            if(tmp == 0){
                arr[i] = tmp;
                if(i+1 < arr.length)
                    arr[++i] = tmp;
            } else
                arr[i] = tmp;
        }
    }

}

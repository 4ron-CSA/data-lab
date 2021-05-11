public class ExerciseExpanded {
    
    public ExerciseExpanded()
    {
        //what instance variables do we need?
        System.out.println("\nHello!");
    }
    
    public static Exercise[] mergeSort(Exercise[] current, int length) {
        
        if (length < 2) {
            return current;
        }
        
        int mid = length / 2;
        
        Exercise[] left = new Exercise[mid]; 
        Exercise[] right = new Exercise[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = current[i];
        }
        
        for (int i = mid; i < length; i++) {
            right[i - mid] = current[i];
        }
        
        mergeSort(left, mid);
        mergeSort(right, length - mid);

        merge(current, left, right);
        
        return current;
    }

    public static void merge(
        Exercise[] current, Exercise[] left, Exercise[] right) {

        int leftSize = left.length;
        int rightSize = right.length;
        
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            // change line 42 (below) so that it uses .getCaloriesBurned(int weight) for a specific weight
            if (left[i].averageCalsBurned() <= right[j].averageCalsBurned()) {
                current[k++] = left[i++];
            }
            else {
                current[k++] = right[j++];
            }
        }
        
        while (i < leftSize) {
            current[k++] = left[i++];
        }
        while (j < rightSize) {
            current[k++] = right[j++];
        }
        
    }
}
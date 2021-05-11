import core.data.*;

//Question to Answer: What exercise is most effective (burns most calories) for what body type?

public class MainTester {
    static String filename = "exercise_dataset.csv";
    
    public static void main(String[] args) {
        DataSource ds = DataSource.connect(filename);
        ds.load();
        ds.printUsageString();
        
        //Retriveing an exercise data line
        Exercise e0 = ds.fetch("Exercise","Activity, Exercise or Sport (1 hour)","130 lb", "155 lb","180 lb","205 lb");
        System.out.println(e0);
        Exercise[] e1 = ds.fetchArray("Exercise","Activity, Exercise or Sport (1 hour)","130 lb", "155 lb","180 lb","205 lb");
        for(int i = 0; i < e1.length; i++)
        {
            //System.out.println(i + " " + e1[i].getExerciseName());
        }
        
        int[] weights = {130,155,180,205};
        ExerciseExpanded obj = new ExerciseExpanded();
        Exercise[] e2 = obj.mergeSort(e1,e1.length);
        for(int i = 0; i < e2.length-1; i++)
        {
            for(int j = 0; j <= 3; j++)
            {
                if(e2[i].getCaloriesBurned(weights[j]) > e2[i+1].getCaloriesBurned(weights[j]))
                {
                    System.out.println("the calories burned here are different!");
                }
            }
            //System.out.println(i + " " + e2[i].getExerciseName() + " || Cals burned: " + e2[i].getCaloriesBurned(130) + " - " + e2[i].getCaloriesBurned(155));
        }
        
    }
}
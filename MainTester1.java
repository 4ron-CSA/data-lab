import core.data.*;

//Question to Answer: What exercise is most effective (burns most calories) for what body type?

public class MainTester {
    static String filename = "exercise_dataset.csv";
    
    public static void main(String[] args) {
        DataSource ds = DataSource.connect(filename);
        ds.load();
        ds.printUsageString();
        
        //Retriveing an exercise data line
        Exercise e1 = ds.fetch("Exercise","Activity, Exercise or Sport (1 hour)","130 lb", "155 lb","180 lb","205 lb");
        System.out.println(e1);
        Exercise[] e0 = ds.fetchArray("Exercise","Activity, Exercise or Sport (1 hour)","130 lb", "155 lb","180 lb","205 lb");
        for(int i = 0; i < e0.length; i++)
        {
            System.out.println(i + " " + e0[i].getExerciseName());
        }
    }
}
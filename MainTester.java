import core.data.*;

//Question to Answer: What exercise is most effective (burns most calories) for what body type?

public class MainTester {
    static String filename = "exercise_dataset.csv";
    
    public static void main(String[] args) {
        DataSource ds = DataSource.connect(filename);
        ds.load();
        ds.printUsageString();
        
        //Retriveing an exercise data line
        Exercise e1 = ds.fetch("Exercise","Activity, Exercise or Sport (1 hour)",130,"130 lb");
        System.out.println(e1);
    }
}
public class Exercise {
    
    //"Exercise (1 hour)",130 lb,155 lb,180 lb,205 lb,Calories per kg
    private String exerciseName; //for one hour
    private int lb130; //in 130 pounds
    private int lb155; //in 155 pounds
    private int lb180; //in 180 pounds
    private int lb205; //in 205 pounds
    
    public Exercise(String exercise, int weight, int calories){
        this.exerciseName = exercise;
        this.weight = weight;
        this.caloriesBurned = calories;
    }
    
    public String getExerciseName()
    {
        return this.exerciseName;
    }
    
    public int getWeight()
    {
        return this.weight;
    }
    
    public int getCaloriesBurned()
    {
        return this.caloriesBurned;
    }
    
    public String toString()
    {
        return "When a 130 lb person does " + this.exerciseName + " for an hour, they will burn " + this.lb130 + " calories.";
    }
}
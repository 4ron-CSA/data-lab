public class Exercise {
    
    //"Exercise (1 hour)",130 lb,155 lb,180 lb,205 lb,Calories per kg
    private String exerciseName; //for one hour
    private int lb130; //holds calories burned for this weight for the exercise
    private int lb155; //holds calories burned for this weight for the exercise
    private int lb180; //holds calories burned for this weight for the exercise
    private int lb205; //holds calories burned for this weight for the exercise
    
    public Exercise(String exercise, int lb130, int lb155,int lb180, int lb205){
        this.exerciseName = exercise;
        this.lb130 = lb130;
        this.lb155 = lb155;
        this.lb180 = lb180;
        this.lb205 = lb205;
    }
    
    public String getExerciseName()
    {
        return this.exerciseName;
    }
    
    public String getWeight()
    {
        return "The different body weights are (in pounds) : 130, 155, 180, 205";
    }
    
    public int getCaloriesBurned(int weight)
    {
        if(weight == 130){
            return lb130;
        } else if(weight == 155){
            return lb155;
        } else if(weight == 180){
            return lb180;
        } else if(weight == 205){
            return lb205;
        } else {
            return -1;
        }
    }
    
    //rounded to nearest int
    public int averageCalsBurned()
    {
        return (this.lb130 + this.lb155 + this.lb180 + this.lb205) / 4;
    }
    
    public String toString()
    {
        return this.exerciseName + " for one hour burns, on average (for all bodyweights), " + averageCalsBurned() + " Calories.";
    }
}
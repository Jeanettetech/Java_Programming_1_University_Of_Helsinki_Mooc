
public class Statistics {
    private int count;
    private int sum;
    ;
    public Statistics(){
        this.count = count;
        this.sum = sum;
    }
    public void addNumber(int number){
        this.sum = sum+number;
        this.count++;
        
    }
    public int getCount(){
        return this.count;
    }
    public int sum(){
        return this.sum;
        
    }
    public double average(){
        double average = 0;
        if(this.sum !=0 && this.count !=0){
           average = 1.0*this.sum/this.count;
        }
        
       return average;
        

       
        
    }
}

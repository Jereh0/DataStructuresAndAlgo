
package activitytwomain;


public class ActivityTwoClassFour extends ActivityTwoClassThree {
    
    public ActivityTwoClassFour(int Size){
        super(Size);
    } 
    public double peek(){
        if (!isEmpty()){
            return Stacks[top];
        }
        else {
            System.out.println("\nSTACK IS EMPTY, SO YOU CANNOT PEEK ANYTHING.");
            return -1;
        }
    }
}

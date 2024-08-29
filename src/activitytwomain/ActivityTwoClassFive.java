
package activitytwomain;


public class ActivityTwoClassFive extends ActivityTwoClassFour{
    
    public ActivityTwoClassFive(int Size){
        super(Size);
    }
    public void stackStack(){ 
        for (int i = 0; i <= top; i++) {
            if (!isFull()) {
                System.out.print ("\nADDED TO NEW STACK: "
                + Stacks[i]);
                newStack.push(Stacks[i]);
            } 
            
            else {
                System.out.println("\nYOUR STACK IS FULL");
            }
            
        }

    }
}

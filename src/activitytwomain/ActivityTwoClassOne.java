
package activitytwomain;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ActivityTwoClassOne {
    int Size;
    double[] Stacks;
    int top;
    
    Stack<Double> newStack = new Stack<>();
    
    public  ActivityTwoClassOne(int Size){
            this.Size = Size;
            Stacks = new double [this.Size];
            top = -1;
      }
    
    public void push (double number){
         if (!isFull()) {
           Stacks[++top] = number;
        }else{
             System.out.println("\nYOUR STACK IS FULL.");
         }
    }
    public void loopNewStack(){
        if(isEmpty()){
            System.out.println("STACK IS EMPTY!");
        } 
        else {
            System.out.print("\nNew Stack Elements: ");
            for (int i = 0; i <= top; i++) {               
                System.out.println(newStack.get(i));
            }
        }
    }
    public void loopStack(){
        if (isEmpty()) {
            System.out.println("\nSTACK IS EMPTY! ");
        }
         else {
            System.out.println("\nStack:");        
            for (int i = top; i >= 0; i-- ) {
            System.out.println(Stacks[i]);           
            }
        }
    }
    public double pop(){
        if (!isEmpty()) {
            return Stacks[top--];
        }
        else {
            System.out.println("\nSTACK IS EMPTY, INPUT VALUES FIRST." );
            return -1;          
        }
    }
    public double  bottomElement(){
        if (!isEmpty()) {
            return Stacks[0];
        }
        else {
            System.out.println("\nSTACK IS EMPTY, SO YOU CAN'T SEE THE BOTTOM." );
            return -1;
        }
    }
    public boolean isFull(){
        return(top == Size -1);
    }
    public boolean isEmpty(){
        return(top == -1);
    }
}

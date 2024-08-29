
package activitytwomain;


public class ActivityTwoClassTwo extends ActivityTwoClassOne {
    
    public ActivityTwoClassTwo (int Size){
        super (Size);
    } 
    public void countElements(){
        if (!isEmpty()) {
            int count = top + 1;
            System.out.println("\nElements in stack: " + count);
        }
        
        else {
            System.out.println("\nStack is empty!");  
        }
    }
    
}

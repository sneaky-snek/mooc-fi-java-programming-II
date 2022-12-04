
package mooc.logic;
import mooc.ui.UserInterface;

/**
 *
 * @author sneakysnek
 */
public class ApplicationLogic {
    private final UserInterface ui;
    
    public ApplicationLogic(UserInterface ui){
        this.ui = ui;
    }
    
    public void execute(int times){
        for(int i = 0; i < times; i++){
            System.out.println("Application logic is working");  
        ui.update();
        }
    }
    
}

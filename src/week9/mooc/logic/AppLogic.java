package week9.mooc.logic;

import week9.mooc.ui.UserInterface;

public class AppLogic {
    private UserInterface ui;
    public AppLogic(UserInterface ui){
        this.ui=ui;
    }
    public void execute(int howManyTimes){
        for (int i=0;i<howManyTimes;i++){
            System.out.println("The application logic works ");
            ui.update();
        }
    }
}

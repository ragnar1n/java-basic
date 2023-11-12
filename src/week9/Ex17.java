package week9;

import week9.mooc.ui.UserInterface;
import week9.mooc.logic.AppLogic;
import week9.mooc.ui.TextUserInterface;
public class Ex17 {
        public static void main(String[] args) {
            UserInterface ui = new TextUserInterface();
            new AppLogic(ui).execute(3);
        }
}

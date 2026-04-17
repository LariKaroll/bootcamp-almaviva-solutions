import control.Menu;
import control.OptionMenu;


public class Main {
    public static void main(String[] args) {
        OptionMenu optionMenu = new OptionMenu();
        Menu menu = new Menu();

        int index = -1;

        do {
            menu.startPrograma();
            optionMenu.startOption(index);

        }while (index == 0);
    }
}
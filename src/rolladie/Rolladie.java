package rolladie;

import rolladie.commands.Command;

public class Rolladie {
    enum gameState {
        MENU,
        INTRO,
        INGAME,
        OUTRO
    }

    public static void main(String[] args) {
        UIHandler ui = new UIHandler();
        CommandParser parser = new CommandParser(ui);

        while (true) {
            String input = ui.getUserInput("cmd ");
            Command command = parser.parseInput(input);
            if (command.execute()) {
                break;
            }
        }
    }
}
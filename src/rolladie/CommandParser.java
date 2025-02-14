package rolladie;

import rolladie.commands.*;
import rolladie.commands.MoveCommand.Direction;;

public class CommandParser {
    private final UIHandler ui;
    
    public CommandParser(UIHandler ui) {
        this.ui = ui;
    }

    /**
     * Process trimmed user input and map to game commands
     * @param input
     * @return
     */
    public Command parseInput(String input) {
        String parts[] = input.split(" ", 2);
        String command = parts[0].toLowerCase();

        switch (command) {
        case "w":
            return new MoveCommand(ui, Direction.UP);
        case "a":
            return new MoveCommand(ui, Direction.LEFT);
        case "s":
            return new MoveCommand(ui, Direction.DOWN);
        case "d":
            return new MoveCommand(ui, Direction.RIGHT);
        case "q":
            return new ExitCommand();
        }
        return new Command();
    }
}

package rolladie.commands;

import rolladie.MessageType;
import rolladie.UIHandler;

public class MoveCommand extends Command {
    private final UIHandler ui;
    private Direction direction;

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public MoveCommand(UIHandler ui, Direction direction) {
        this.ui = ui;
        this.direction = direction;
    }

    public boolean execute() {
        ui.printFeedback(MessageType.SUCCESS, "yay" + direction.name());
        return false;
    }
}

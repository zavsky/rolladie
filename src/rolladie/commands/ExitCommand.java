package rolladie.commands;

public class ExitCommand extends Command {
    public boolean execute() {
        System.out.println("bye");
        return true;
    }
}

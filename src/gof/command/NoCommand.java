package gof.command;

public class NoCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {
        System.out.println("\n");
    }
}

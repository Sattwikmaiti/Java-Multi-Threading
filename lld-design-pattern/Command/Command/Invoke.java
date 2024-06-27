package Command.Command;

import java.util.Stack;


public class Invoke {

    CommandInterface command;
    Stack<CommandInterface> history = new Stack<>();

    public Invoke()
    {

    }

    public void setCommand(CommandInterface command){
        this.command = command;
    }


    public void executeCommand(){
        command.execute();
        history.push(command);
    }


    public void undo()
    {
        if(!history.isEmpty())
        {
            CommandInterface command = history.pop();
            command.undo();
        }
    }

        


    
}

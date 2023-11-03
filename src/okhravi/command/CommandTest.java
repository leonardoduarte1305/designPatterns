package okhravi.command;

import okhravi.command.implementations.commands.DecreaseCommand;
import okhravi.command.implementations.commands.IncreaseCommand;
import okhravi.command.implementations.commands.TurnOffCommand;
import okhravi.command.implementations.commands.TurnOnCommand;
import okhravi.command.implementations.invoker.FourButtonsController;
import okhravi.command.implementations.receiver.Lamp;
import okhravi.command.interfaces.Command;

public class CommandTest {

    // Youtube Video
    // https://youtu.be/9qA5kw8dcSU?list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc

    public static void main(String[] args) {
        // Receiver  Which will be commanded
        Lamp lamp = new Lamp();

        // Creating the Commands to configure the Controller to command that receiver
        Command onCommand = new TurnOnCommand(lamp);
        Command offCommand = new TurnOffCommand(lamp);
        Command upCommand = new IncreaseCommand(lamp);
        Command downCommand = new DecreaseCommand(lamp);

        // Configuring the Controller
        FourButtonsController fourButtonsController = new FourButtonsController(onCommand, offCommand, upCommand, downCommand);

        // Performing the commands
        fourButtonsController.whenPressingOn();
        fourButtonsController.whenPressingUp();
        fourButtonsController.whenPressingDown();
        fourButtonsController.whenPressingDown();
        fourButtonsController.whenPressingDown();
        fourButtonsController.whenPressingOff();
    }
}

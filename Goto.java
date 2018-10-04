import java.util.*;

public class Goto {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //GOTO SETUP (3 lines)
        String label = "continue";
        out:do switch (label) {
        case "continue": //instead of "label:"

        System.out.print("goto: ");
        label = scanner.next(); //instead of "goto label;"
        continue; //transfer the flow of control to the label

        case "5": //instead of "label:"
        System.out.println("5");
        label = "hello"; //instead of "goto label;"
        continue; //transfer the flow of control to the label

        case "4": //instead of "label:"
        System.out.println("4");
        label = "5"; //instead of "goto label;"
        continue; //transfer the flow of control to the label

        case "3": //instead of "label:"
        System.out.println("3");
        label = "4"; //instead of "goto label;"
        continue; //transfer the flow of control to the label

        case "2": //instead of "label:"
        System.out.println("2");
        label = "3"; //instead of "goto label;"
        continue; //transfer the flow of control to the label

        case "1": //instead of "label:"
        System.out.println("1");
        label = "2"; //instead of "goto label;"
        continue; //transfer the flow of control to the label

        case "hello": //instead of "label:"
        System.out.println("Hello World!");
        label = "continue"; //instead of "goto label;"
        continue; //transfer the flow of control to the label

        case "exit": //instead of "label:"
        System.out.println("exit");

        //GOTO CLOSE (3 lines)
        default:
        break out;
        } while (true);
	}
}

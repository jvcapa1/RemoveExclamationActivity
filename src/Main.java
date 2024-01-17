import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Type your sentence to remove the Exclamation : ");
        Scanner scan = new Scanner(System.in);
        String s =scan.nextLine();

        System.out.println("\n\n\n you type: "+s);
        String output = RemoveExclamation.removeExclamation(s);
        System.out.println("\n\n\n you type: "+output);





    }
}
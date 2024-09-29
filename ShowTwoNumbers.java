import javax.swing.JOptionPane;
public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1;
        String strNum2;
        String StrNotification = "You've hust entered: ";

        strNum1=JOptionPane.showInputDialog(null,"Please input the fisrt number: ","input the first number",
                                            JOptionPane.INFORMATION_MESSAGE);
        StrNotification+= strNum1+" and ";
        strNum2=JOptionPane.showInputDialog(null,"Please input the second number: ","input the first number",
                                            JOptionPane.INFORMATION_MESSAGE);
        StrNotification+= strNum2;

        JOptionPane.showMessageDialog(null, StrNotification,
                    "show two numbers",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}

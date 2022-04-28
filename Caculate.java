import javax.swing.JOptionPane;

public class Caculate {
   public static void main(String[] args) {
       String strNum1, strNum2;
       strNum1 = JOptionPane.showInputDialog(null, 
       "Please input the first number: ", "Input the first number",
       JOptionPane.INFORMATION_MESSAGE);
       double num1 = Double.parseDouble(strNum1);
       strNum2 = JOptionPane.showInputDialog(null, 
       "Please input the seccond number: ", "Input the seccond number",
       JOptionPane.INFORMATION_MESSAGE);
       double num2 = Double.parseDouble(strNum2);
       double sum= num1+num2;
       double different= num1-num2;
       double product= num1*num2;
       double quotient= num1/num2;
       JOptionPane.showMessageDialog(null, sum,
       "Sum two Numbers",JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null, different,
       "Different two Numbers",JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null, product,
       "Product two Numbers",JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null, quotient,
       "Quotient two Numbers",JOptionPane.INFORMATION_MESSAGE);
       System.exit(0);
   }
}

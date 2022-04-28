import javax.swing.JOptionPane;
public class giaiptbac1 {
    public static void main(String[] args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, 
        "Nhập hệ số của x: a= ",JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null, 
        "Nhập hệ số tự do: b= ", JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(strNum2);
        if (a==0){
            if (b==0){
                JOptionPane.showMessageDialog(null,
                "Phương trình vô số nghiệm");
            }else{
                JOptionPane.showMessageDialog(null,
                "Phương trình vô nghiệm");}
        }
        else {
            double nghiem=-b/a;
            JOptionPane.showMessageDialog(null,nghiem,
            "Phương trình có nghiệm là ",JOptionPane.INFORMATION_MESSAGE);
        }
    System.exit(0);
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SignupGUI extends JFrame {
    private JPanel signupPanel;
    private JButton cancelButton;
    private JButton continueButton;
    private JTextField userName;
    private JPasswordField passwordField1;
    private JTextField bioText;
    private JPasswordField passwordField2;
    private JRadioButton wolfRadioButton;
    private JRadioButton tigerRadioButton;
    private JRadioButton horseRadioButton;
    private JRadioButton eagleRadioButton;
    private JRadioButton lionRadioButton;
    private JRadioButton bearRadioButton;
    private JTextField emailtextField1;
    private JButton yourAvatarButton;
    private JLabel avatarPath;
    private Client client;
    String animal;

    public SignupGUI(Client client) {
        this.client=client;

        setContentPane(signupPanel);


        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(wolfRadioButton.isSelected() && animal==null)
                {
                    animal = "src\\Icons\\wolf.jpg";
                }
                if(lionRadioButton.isSelected() && animal==null)
                {
                    animal = "src\\Icons\\lion.jpg";
                }
                if(tigerRadioButton.isSelected() && animal==null)
                {
                    animal = "src\\Icons\\tiger.jpg";
                }
                if(bearRadioButton.isSelected() && animal==null)
                {
                    animal = "src\\Icons\\bear.jpg";
                }
                if(eagleRadioButton.isSelected() && animal==null)
                {
                    animal = "src\\Icons\\eagle.jpg";
                }
                if(horseRadioButton.isSelected() && animal==null)
                {
                    animal = "src\\Icons\\horse.jpg";
                }

                if(userName.getText().length() == 0 && passwordField1 != passwordField2 && passwordField1.getText().length()!=0 && animal==null){
                    JOptionPane.showMessageDialog(signupPanel,"ERROR in signing up. Please try again !");
                    dispose();
                }
                else
                {
                   client.signUp("user@o.pl","user","1234","bio","src\\Icons\\tiger.jpg");
                   dispose();
                }
            }
        });
        yourAvatarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                if(fc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
                    File plik = fc.getSelectedFile();
                    animal=plik.getAbsolutePath();
                    avatarPath.setText(animal);
                }
            }
        });
    }

    public static void main(String[] args) {
//        JFrame frame = new JFrame("SignupGUI");
//        frame.setContentPane(new SignupGUI().signupPanel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
    }
}

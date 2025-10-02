/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.*;
  import java.awt.event.*;
public class JTextField_Jframe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame frame = new JFrame("Input Sederhana");
          JTextField textField = new JTextField(20);
          JButton button = new JButton("Kirim");

          JLabel label = new JLabel("Masukkan nama:");
          JLabel output = new JLabel("");
          
          button.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                  String nama = textField.getText();
                  output.setText("Halo " + nama + "!");
              }
          });

          JPanel panel = new JPanel();
          panel.add(label);
          panel.add(textField);
          panel.add(button);
          panel.add(output);

          frame.add(panel);
          frame.setSize(300, 150);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setVisible(true);
    }
    
}

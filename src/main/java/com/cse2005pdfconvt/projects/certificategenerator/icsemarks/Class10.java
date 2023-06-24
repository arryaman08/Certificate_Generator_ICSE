package com.cse2005pdfconvt.projects.certificategenerator.icsemarks;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Class10 extends JFrame implements ActionListener
{
    JButton backbutton;
   static String subNames3[]= new String[13];
    JTextField tf1=new JTextField();
    JButton button=new JButton("SUBMIT", null);
    static int grp3_mark;

    Class10()
    {
        subNames3[0]="PHYSICAL EDUCATION: ";
        subNames3[1]="COMPUTER APPLICATION: ";
        subNames3[2]="ECONOMICS APPLICATION: ";
        subNames3[3]="HOME SCIENCE: ";
        subNames3[4]="ARTS: ";
        
        button.setBounds(250, 300, 200, 50);
        button.addActionListener(this);
        button.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(800, 800);

        Font font= new Font("Consolas", Font.BOLD, 35);

        JLabel message= new JLabel("Enter the Internal Assesment Marks(100)");
        message.setFont(new Font("Arial", Font.CENTER_BASELINE, 35));
        message.setBounds(70,20 , 1000, 50);

        JLabel label2= new JLabel(subNames3[Class9.c], null, 0);
        label2.setBounds(90, 150, 0700, 0100);
        label2.setFont(font);

        tf1.setBounds(520,150,100,50);


        
        this.add(message);
        this.add(label2);
        this.add(tf1);
        this.add(button);

         backbutton= new JButton("<");
        backbutton.setBounds(10,20,50,50);
        backbutton.setFont(new Font("Consolas", Font.CENTER_BASELINE, 15));
        this.add(backbutton);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button)
        {
            grp3_mark= Integer.valueOf(tf1.getText());
            Class11 objj= new Class11();
            this.dispose();
        }
        if(e.getSource()==backbutton)
        {
            Class9 obj= new Class9();
        }
    }
}

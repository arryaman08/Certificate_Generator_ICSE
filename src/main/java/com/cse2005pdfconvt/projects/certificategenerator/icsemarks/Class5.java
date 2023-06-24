package com.cse2005pdfconvt.projects.certificategenerator.icsemarks;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class5 extends JFrame implements ActionListener
{
    JButton button;
    JCheckBox checkBox[]= new JCheckBox[15];
    static  int c=-1;
    static int flag=-1;
    
    Class5()
    {   
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(800, 800);
        //this.getContentPane().setBackground(Color.lightGray);

        Font font= new Font("Consolas", Font.BOLD, 35);
        Font font1= new Font("Calibiri", Font.BOLD,15 );



        JLabel label= new JLabel("Group 1 Subjects");
        label.setBounds(150, 40, 500, 100);
        label.setFont(font);

        

         checkBox[0]= new JCheckBox("English");
        checkBox[0].setBounds(280, 120, 100,50);
        checkBox[0].setFont(font1);
        checkBox[0].setFocusable(false);
        checkBox[0].setSelected(true);
        checkBox[0].setEnabled(false);

        
         checkBox[1]= new JCheckBox("History and Civics");
        checkBox[1].setBounds(280, 160, 200,50);
        checkBox[1].setFont(font1);
        checkBox[1].setFocusable(false);
        checkBox[1].setSelected(true);
        checkBox[1].setEnabled(false);

        checkBox[2]= new JCheckBox("Geography");
        checkBox[2].setBounds(280, 200, 200,50);
        checkBox[2].setFont(font1);
        checkBox[2].setFocusable(false);
        checkBox[2].setSelected(true);
        checkBox[2].setEnabled(false);


        
        checkBox[4]= new JCheckBox("Odia");
        checkBox[4].setBounds(280, 240, 100,50);
        checkBox[4].setFont(font1);
        checkBox[4].setFocusable(false);

         checkBox[5]= new JCheckBox("Marathi");
        checkBox[5].setBounds(280, 280, 100,50);
        checkBox[5].setFont(font1);
        checkBox[5].setFocusable(false);

         checkBox[6]= new JCheckBox("Gujurati");
        checkBox[6].setBounds(280, 320, 100,50);
        checkBox[6].setFont(font1);
        checkBox[6].setFocusable(false);

        checkBox[7]= new JCheckBox("Bengali");
        checkBox[7].setBounds(280, 360, 100,50);
        checkBox[7].setFont(font1);
        checkBox[7].setFocusable(false);

         checkBox[8]= new JCheckBox("Sanskrit");
        checkBox[8].setBounds(280, 400, 100,50);
        checkBox[8].setFont(font1);
        checkBox[8].setFocusable(false);

         checkBox[9]= new JCheckBox("Maithili");
        checkBox[9].setBounds(280, 440, 100,50);
        checkBox[9].setFont(font1);
        checkBox[9].setFocusable(false);

         checkBox[10]= new JCheckBox("Punjabi");
        checkBox[10].setBounds(280, 480, 100,50);
        checkBox[10].setFont(font1);
        checkBox[10].setFocusable(false);

         checkBox[11]= new JCheckBox("Telugu");
        checkBox[11].setBounds(280, 520, 100,50);
        checkBox[11].setFont(font1);
        checkBox[11].setFocusable(false);

         checkBox[12]= new JCheckBox("Hindi");
        checkBox[12].setBounds(280, 560, 130,50);
        checkBox[12].setFont(font1);
        checkBox[12].setFocusable(false);

        checkBox[3]= new JCheckBox("Any other language approved by CISCE");
        checkBox[3].setBounds(280, 600, 500,50);
        checkBox[3].setFont(font1);
        checkBox[3].setFocusable(false);

        button= new JButton("Submit", null);
        button.setBounds(300,660,130,50);
        button.setFocusable(false);
        button.setFont(new Font("Consolas", Font.BOLD, 20));
        button.addActionListener(this);



        this.add(label);
        this.add(checkBox[0]);
        this.add(checkBox[1]);
        this.add(checkBox[7]);
        this.add(checkBox[4]);
        this.add(checkBox[5]);
        this.add(checkBox[6]);
        this.add(checkBox[2]);
        this.add(checkBox[8]);
        this.add(checkBox[9]);
        this.add(checkBox[10]);
        this.add(checkBox[11]);
        this.add(checkBox[12]);
        this.add(checkBox[3]);
        this.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e)
     {
            if(e.getSource()==button)
            {
                if(checkBox[12].isSelected())
                {
                    flag=1;
                }
int a=-1;
                for(int i=3;i<=12;i++)
                {
                    if(checkBox[i].isSelected())
                    {
                       c=i;
                       
                      a=a+1;
                       
                       
                    }
                   
                    
                }
                if(a<0){
                        
                    JOptionPane.showMessageDialog(null, "Please select a language to continue",
                                                                         "Warning", JOptionPane.WARNING_MESSAGE);
                }
                else if(a>0)
                {
                        
                    JOptionPane.showMessageDialog(null, "Please select only one language to continue",
                                                                         "Warning", JOptionPane.WARNING_MESSAGE);
                }
                else 
                {
                    this.dispose();
                    Class6 obj3= new Class6();

                }
            }   
    }    
}

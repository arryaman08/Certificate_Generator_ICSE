package com.cse2005pdfconvt.projects.certificategenerator.icsemarks;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class9 extends JFrame implements ActionListener
{
    JButton button,button1;
   static JCheckBox checkBox[]= new JCheckBox[15];
    static  int c=-1;
    static int d=-1;
    
    Class9()
    {   
         

       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(800, 800);

         button1= new JButton("<");
       button1.setBounds(10,20,50,50);
       button1.setFont(new Font("Consolas", Font.CENTER_BASELINE, 15));
       button1.addActionListener(this);
       this.add(button1);

        Font font= new Font("Consolas", Font.BOLD, 35);
        Font font1= new Font("Calibiri", Font.BOLD,15 );



        JLabel label= new JLabel("Group 3 Subject");
        label.setBounds(150, 40, 500, 100);
        label.setFont(font);

        

         checkBox[0]= new JCheckBox("Physical Education");
        checkBox[0].setBounds(280, 120, 200,50);
        checkBox[0].setFont(font1);
        checkBox[0].setFocusable(false);
        

        
         checkBox[1]= new JCheckBox("Computer Applicatrion");
        checkBox[1].setBounds(280, 160, 200,50);
        checkBox[1].setFont(font1);
        checkBox[1].setFocusable(false);
       

        checkBox[2]= new JCheckBox("Economics Application");
        checkBox[2].setBounds(280, 200, 200,50);
        checkBox[2].setFont(font1);
        checkBox[2].setFocusable(false);
     


        
        checkBox[3]= new JCheckBox("Home Science");
        checkBox[3].setBounds(280, 240, 200,50);
        checkBox[3].setFont(font1);
        checkBox[3].setFocusable(false);

        checkBox[4]= new JCheckBox("Arts");
        checkBox[4].setBounds(280, 280, 100,50);
        checkBox[4].setFont(font1);
        checkBox[4].setFocusable(false);


        button= new JButton("Submit", null);
        button.setBounds(300,400,130,50);
        button.setFocusable(false);
        button.setFont(new Font("Consolas", Font.BOLD, 20));
        button.addActionListener(this);



        this.add(label);
        this.add(checkBox[0]);
        this.add(checkBox[1]);
        this.add(checkBox[2]);
        this.add(checkBox[3]);
        this.add(checkBox[4]);

        this.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e)
     {
            if(e.getSource()==button)
            {
                int a=-1;
                for(int i=0;i<=4;i++)
                {
                    if(checkBox[i].isSelected())
                    {
                       c=i;
                       
                      a=a+1;
                       
                       
                    }
                   
                    
                }
                if(a<0){
                        
                    JOptionPane.showMessageDialog(null, "Please select a subject to continue",
                                                                         "Warning", JOptionPane.WARNING_MESSAGE);
                }
                else if(a>0)
                {
                        
                    JOptionPane.showMessageDialog(null, "Please select only one subject to continue",
                                                                         "Warning", JOptionPane.WARNING_MESSAGE);
                }
                else 
                {
                    this.dispose();
                    Class10 obj3= new Class10();

                }
            } 
            
             if(e.getSource()==button1)
            {
                this.dispose();
                Class8 obj2= new Class8();
            }
     }
                   

}
           
           

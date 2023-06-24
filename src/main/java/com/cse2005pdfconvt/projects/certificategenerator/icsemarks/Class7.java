package com.cse2005pdfconvt.projects.certificategenerator.icsemarks;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class Class7 extends JFrame implements ActionListener
{
    JButton button,button1;
    JCheckBox checkBox[]= new JCheckBox[15];
    static  int c=-1;
    static int count[]= new int[6];
    
    Class7()
    {   
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(800, 800);

        Font font= new Font("Consolas", Font.BOLD, 35);
        Font font1= new Font("Calibiri", Font.BOLD,15 );



        JLabel label= new JLabel("Group 2 Subjects");
        label.setBounds(150, 40, 500, 100);
        label.setFont(font);

        

         checkBox[0]= new JCheckBox("Mathematics");
        checkBox[0].setBounds(280, 120, 150,50);
        checkBox[0].setFont(font1);
        checkBox[0].setFocusable(false);
        

        checkBox[2]= new JCheckBox("Commerce");
        checkBox[2].setBounds(280, 200, 200,50);
        checkBox[2].setFont(font1);
        checkBox[2].setFocusable(false);

        checkBox[3]= new JCheckBox("Environmental Science");
        checkBox[3].setBounds(280, 240, 200,50);
        checkBox[3].setFont(font1);
        checkBox[3].setFocusable(false);

        checkBox[4]= new JCheckBox("Economics");
        checkBox[4].setBounds(280, 280, 150,50);
        checkBox[4].setFont(font1);
        checkBox[4].setFocusable(false);

        checkBox[1]= new JCheckBox("Science");
        checkBox[1].setBounds(280, 160, 200,50);
        checkBox[1].setFont(font1);
        checkBox[1].setFocusable(false);
        
   
        

  


        button= new JButton("Submit", null);
        button.setBounds(300,350,130,50);
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

       button1= new JButton("<");
       button1.setBounds(10,20,50,50);
       button1.setFont(new Font("Consolas", Font.CENTER_BASELINE, 15));
       button1.addActionListener(this);

       this.add(button1);
        

    }

    @Override
    public void actionPerformed(ActionEvent e)
     {
        
        int a=0;
            if(e.getSource()==button)
            {
                
                
                for(int i=0;i<=4;i++){
                    if(checkBox[i].isSelected())
                    {
                       
                       count[a]=i;
                       a++;
                      
                       
                       
                    }
                   
                    
                }
                if(a==0){
                        
                    JOptionPane.showMessageDialog(null, "Please select the required options",
                                                                         "Warning", JOptionPane.WARNING_MESSAGE);
                }
                else if(a==1)
                {
                    JOptionPane.showMessageDialog(null, "Please select two subjects",
                                                            "Warning", JOptionPane.WARNING_MESSAGE);
        
        
                    
                }
                else if(a>2)
                {
                    JOptionPane.showMessageDialog(null, "Please select only two subjects",
                                                            "Warning", JOptionPane.WARNING_MESSAGE);
        
        
                    
                }
                
                else if((Class7.count[0]==0 && Class7.count[1]==3) || (Class7.count[0]==1 && Class7.count[1]==4)|| (Class7.count[0]==3 && Class7.count[1]==4)|| (Class7.count[0]==1 && Class7.count[1]==2) )
                {
                    JOptionPane.showMessageDialog(null, "Contact CISCE for this Particular Subject Combination\n Email: council@cisce.org",
                                                            "Warning", JOptionPane.WARNING_MESSAGE);
        
        
                    
                }
                else
                {
                    this.dispose();
                    
                    Class8 obj5= new Class8();

                    
                }

                System.out.println("the value of "+count[0]+" "+count[1]);
            }  
            
            if(e.getSource()==button1)
            {
                this.dispose();
                Class6 obj2= new Class6();
            }
    } 
 
}
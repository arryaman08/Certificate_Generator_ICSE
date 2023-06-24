package com.cse2005pdfconvt.projects.certificategenerator.icsemarks;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
class InvalidInputException extends Exception
{
    InvalidInputException(String s)
    {
        super(s);
    }
}
public class Class6 extends JFrame implements ActionListener
{
    int me1,me2,mm,mphy,mche,mhis,mbio,mcomp,modia, mgeo;
    JTextField tf1,tf2,tf3,tf4,tf5,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16;

    JButton button1, button2;
    Font font;

   static int avgm[]=new int[10];// marks out of 80
   static int intMarks[]=new int[10];//out of 20
   static String subNames[]= new String[13];
   JButton button;


   
    Class6()
    {
        subNames[0]="ENGLISH: ";
        subNames[1]="HISTORY AND CIVICS: ";
        subNames[2]="GEOGRAPHY: ";
        subNames[3]="Any other languages approved by CISCE: ";
        subNames[4]="ODIA: ";
        subNames[5]="MARATHI: ";
        subNames[6]="GUJURATI: ";
        subNames[7]="BENGALI: ";
        subNames[8]="SANSKRIT: ";
        subNames[9]="MAITHILI: ";
        subNames[10]="PUNJABI: ";
        subNames[11]="TELUGU: ";
        subNames[12]="HINDI: ";

       
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(850, 900);
//for marks out of 80
        button1= new JButton("SUBMIT", null);
        button1.setBounds(500, 170, 100, 50);
        button1.addActionListener((ActionListener) this);
        font=new Font("Consolas", Font.BOLD, 20);

        JLabel message= new JLabel("Enter Paper Marks (80)");
        message.setFont(new Font("Arial", Font.CENTER_BASELINE, 35));
        message.setBounds(200,20 , 1000, 50);

        JLabel label7= new JLabel("ENGLISH-1:", null, 0);
        label7.setBounds(120, 100, 0300, 0100);
        label7.setFont(font);

        

        JLabel label8= new JLabel("ENGLISH-2:", null, 0);
        label8.setBounds(55, 150, 0500, 0100);
        label8.setFont(font);

        JLabel label9= new JLabel("HISTORY AND CIVICS:", null, 0);
        label9.setBounds(100, 200, 0500, 0100);
        label9.setFont(font);
        
      

        
    

    

         tf7= new JTextField();
        tf7.setBounds(400,120,60,30);

         tf8= new JTextField();
        tf8.setBounds(400,160,60,30);

         tf9= new JTextField();
        tf9.setBounds(400,210,60,30);

   

       
//for internal assessment


        

       

 

        this.add(message);
        this.add(label7);
        this.add(label8);
        this.add(label9);
        
        
       
       
       
        this.add(tf7);
        this.add(tf8);
        this.add(tf9);
        
        
       
       
      

      // this.add(button1);

       JLabel message2= new JLabel("Enter Internal Assessment Marks (20)");
       message2.setFont(new Font("Arial", Font.CENTER_BASELINE, 35));
       message2.setBounds(120,360 , 1000, 50);

       JLabel label1= new JLabel("ENGLISH-1:", null, 0);
       label1.setBounds(115, 440, 0300, 0100);
       label1.setFont(font);

       

       JLabel label2= new JLabel("ENGLISH-2:", null, 0);
       label2.setBounds(117, 480, 0300, 0100);
       label2.setFont(font);

       JLabel label3= new JLabel("HISTORY AND CIVICS:", null, 0);
       label3.setBounds(10, 520, 500, 0100);
       label3.setFont(font);

       JLabel label5= new JLabel("GEOGRAPHY:", null, 0);
       label5.setBounds(117, 560, 0300, 0100);
       label5.setFont(font);

       

   

        tf1= new JTextField();
       tf1.setBounds(400,453,60,30);

        tf2= new JTextField();
       tf2.setBounds(400,500,60,30);

        tf3= new JTextField();
       tf3.setBounds(400,540,60,30);

       tf4= new JTextField();
       tf4.setBounds(400,580,60,30);

       //special case for hindi
       if(Class5.flag==-1)
       {
                  
        JLabel label10= new JLabel(subNames[Class5.c], null, 0);
        label10.setBounds(115, 0370, 0300, 0100);
        label10.setFont(font);
        this.add(label10);

             tf10= new JTextField();
        tf10.setBounds(400,260,60,30);
        this.add(tf10);


       }

          JLabel label4= new JLabel(subNames[Class5.c], null, 0);
       label4.setBounds(115, 600, 0300, 0100);
       label4.setFont(font);

       tf5= new JTextField();
       tf5.setBounds(400, 620, 60, 30);

       this.add(label4);
       this.add(tf5);

       this.add(label1);
       this.add(label2);
       this.add(label3);
       
       this.add(label5);

       this.add(tf1);
       this.add(tf2);
       this.add(tf3);
       this.add(tf4);
       
       this.add(message2);
       button2= new JButton("SUBMIT", null);
       button2.setBounds(300, 700, 100, 50);
       
       font=new Font("Consolas", Font.BOLD, 20);
       button2.addActionListener(this);

       button= new JButton("<");
       button.setBounds(10,20,50,50);
       button.setFont(new Font("Consolas", Font.CENTER_BASELINE, 15));
       button.addActionListener(this);

       this.add(button);
       this.add(button2);
    }



    @Override
    public void actionPerformed(ActionEvent e) 
    {
        try{
            
           if(e.getSource()==button2)
           {
            
            intMarks[0]=Integer.valueOf(tf1.getText());
            intMarks[1]=Integer.valueOf(tf2.getText());
            intMarks[2]=Integer.valueOf(tf3.getText());
            intMarks[4]= Integer.valueOf(tf4.getText());
            intMarks[3]= Integer.valueOf(tf5.getText());

            

            
                

            avgm[0]=Integer.valueOf(tf7.getText());
            avgm[1]=Integer.valueOf(tf8.getText());
            avgm[3]=Integer.valueOf(tf9.getText());

            if(Class5.flag==-1)
            {
                avgm[2]= Integer.valueOf(tf10.getText());
            }
            int ab=-1;

            //for checking if entered >80 or < 0
            
            for(int i=0;i<5;i++)
            {
                if((intMarks[i]>20 || intMarks[i]<0) || (avgm[i]>80 || avgm[i]<0))
                {
                  
                     throw new InvalidInputException("Please enter valid marks");
                     
                                                                       
                }
                
            }
            

            if(ab!=1)
            {
                this.dispose();
                 Class7 obj2= new Class7();
            }

            System.out.println("eng1"+avgm[0]);
            System.out.println("eng2"+avgm[1]);
            System.out.println("history"+avgm[3]);
            System.out.println("odia"+avgm[2]);

            }
        }
            catch(Exception ae)
            {
                System.out.println("hey i am in exception");
                 JOptionPane.showMessageDialog(null,"Please enter valid inputs", "Warning", JOptionPane.WARNING_MESSAGE);
                 
            }

            if(e.getSource()==button)
            {
                this.dispose();;
                Class5 obj=new Class5();
            }
           
           
           }



           
           
        
    }




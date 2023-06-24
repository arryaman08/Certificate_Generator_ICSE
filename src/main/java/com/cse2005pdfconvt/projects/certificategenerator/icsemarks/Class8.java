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
public class Class8 extends JFrame implements ActionListener
{
    JButton backbutton;
    int me1,me2,mm,mphy,mche,mhis,mbio,mcomp,modia, mgeo;
    JTextField tf0,tf1,tf2,tf3,tf4,tf5,tf6,tf7;//paper marks
    JTextField Itf0,Itf1,Itf2,Itf3,Itf4,Itf5,Itf6,Itf7;//internal marks

   static int pap_mark[]=new int[14];
   static int int_mark[]=new int[14];
    static int vs=-1;

    JButton button1,button;

   static int avgm[]=new int[10];//internal marks
  static  String subNames2[]= new String[13];
  static  String subNames4[]= new String[13];



   
    Class8()
    {
        subNames2[0]="MATHEMATICS: ";
        subNames2[1]="SCIENCE: ";
        subNames2[2]="PHYSICS: ";
        subNames2[3]="CHEMISTRY: ";
        subNames2[4]="BIOLOGY: ";
        subNames2[5]="COMMERCE: ";
        subNames2[6]="ENVIRONMENTAL SCIENCE: ";
        subNames2[7]="ECONOMICS: ";

        subNames4[0]="MATHEMATICS: ";
        subNames4[1]="SCIENCE: ";
        subNames4[2]="COMMERCE: ";
        subNames4[3]="ENVIRONMENTAL SCIENCE: ";
        subNames4[4]="ECONOMICS: ";

        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(900, 700);

        
       backbutton= new JButton("<");
        
       backbutton.setBounds(25,25,50,50);
       backbutton.setFont(new Font("Consolas", Font.PLAIN, 15));
       backbutton.addActionListener(this);

       this.add(backbutton);

        button1= new JButton("SUBMIT", null);
        button1.setBounds(700, 400, 100, 50);
        button1.addActionListener((ActionListener) this);
        Font font=new Font("Consolas", Font.BOLD, 20);

        JLabel message= new JLabel("Enter the Paper Marks(80)");
        message.setFont(new Font("Arial", Font.CENTER_BASELINE, 35));
        message.setBounds(100,20 , 1000, 50);

        this.add(message);
        
        this.add(button1);

        
        

    
        //printing the required cases using if else
        
        //science and maths
        if((Class7.count[0]==0 && Class7.count[1]==1) || (Class7.count[1]==0 && Class7.count[0]==1)  )
        {
            //paper marks
            JLabel label0= new JLabel(subNames2[0], null, 0);
        label0.setBounds(110, 100, 0300, 0100);
        label0.setFont(font);

        

        JLabel label2= new JLabel(subNames2[2], null, 0);
        label2.setBounds(90, 150, 0300, 0100);
        label2.setFont(font);

        JLabel label3= new JLabel(subNames2[3], null, 0);
        label3.setBounds(95, 200, 0300, 0100);
        label3.setFont(font);

       

            this.add(label0);
            this.add(label2);
            this.add(label3);
            
            

            tf0= new JTextField();
            tf0.setBounds(400,120,60,30);
    
            tf2= new JTextField();
            tf2.setBounds(400,160,60,30);
    
            tf3= new JTextField();
            tf3.setBounds(400,210,60,30);
    
            

            this.add(tf0);
            this.add(tf2);
            this.add(tf3);
            

            //message
            JLabel message1= new JLabel("Enter the Internal Assesment Marks(20)");
            message1.setBounds(100,301 , 1000, 50);
            message1.setFont(new Font("Arial", Font.CENTER_BASELINE, 35));

            //internal marks
            JLabel labelI0= new JLabel(subNames2[0], null, 0);
            labelI0.setBounds(110, 360, 0300, 0100);
            labelI0.setFont(font);
    
            
    
            JLabel labelI2= new JLabel(subNames2[2], null, 0);
            labelI2.setBounds(90, 400, 0300, 0100);
            labelI2.setFont(font);
    
            JLabel labelI3= new JLabel(subNames2[3], null, 0);
            labelI3.setBounds(95, 440, 0300, 0100);
            labelI3.setFont(font);

            JLabel labelI4= new JLabel(subNames2[4], null, 0);
            labelI4.setBounds(95, 480, 0300, 0100);
            labelI4.setFont(font);


                this.add(message1);
                this.add(labelI0);
                this.add(labelI2);
                this.add(labelI3);
                this.add(labelI4);
                
    
                Itf0= new JTextField();
                Itf0.setBounds(400,370,60,30);
        
                Itf2= new JTextField();
                Itf2.setBounds(400,420,60,30);
        
                Itf3= new JTextField();
                Itf3.setBounds(400,460,60,30);

                
                Itf4= new JTextField();
                Itf4.setBounds(400,500,60,30);
        
                
    
                this.add(Itf0);
                this.add(Itf2);
                this.add(Itf3);
                this.add(Itf4);
                

        }

        //EVS and Science
        if((Class7.count[0]==3 && Class7.count[1]==1) || (Class7.count[1]==3 && Class7.count[0]==1)  )
        {
            //paper marks
            JLabel label6= new JLabel(subNames2[6], null, 0);
            label6.setBounds(110, 100, 0500, 0100);
            label6.setFont(font);

            JLabel label2= new JLabel(subNames2[2], null, 0);
        label2.setBounds(90, 150, 0300, 0100);
        label2.setFont(font);

        JLabel label3= new JLabel(subNames2[3], null, 0);
        label3.setBounds(95, 200, 0300, 0100);
        label3.setFont(font);

        

            this.add(label6);
            this.add(label2);
            this.add(label3);
            
            

            tf6= new JTextField();
            tf6.setBounds(400,120,60,30);
    
            tf2= new JTextField();
            tf2.setBounds(400,160,60,30);
    
            tf3= new JTextField();
            tf3.setBounds(400,210,60,30);
    
            

            this.add(tf6);
            this.add(tf2);
            this.add(tf3);
            

            //internal marks

             //message
             JLabel message1= new JLabel("Enter the Internal Assesment Marks(20)");
             message1.setBounds(100,301 , 1000, 50);
             message1.setFont(new Font("Arial", Font.CENTER_BASELINE, 35));

            JLabel labelI6= new JLabel(subNames2[6], null, 0);
            labelI6.setBounds(110, 360, 0450, 0100);
            labelI6.setFont(font);
    
            
    
            JLabel labelI2= new JLabel(subNames2[2], null, 0);
            labelI2.setBounds(90, 400, 0300, 0100);
            labelI2.setFont(font);
    
            JLabel labelI3= new JLabel(subNames2[3], null, 0);
            labelI3.setBounds(95, 440, 0300, 0100);
            labelI3.setFont(font);
    
            JLabel labelI4= new JLabel(subNames2[4], null, 0);
            labelI4.setBounds(90, 480, 0300, 0100);
            labelI4.setFont(font);

                this.add(message1);
                this.add(labelI6);
                this.add(labelI2);
                this.add(labelI3);
                this.add(labelI4);
                
    
                Itf6= new JTextField();
                Itf6.setBounds(400,370,60,30);
        
                Itf2= new JTextField();
                Itf2.setBounds(400,420,60,30);
        
                Itf3= new JTextField();
                Itf3.setBounds(400,460,60,30);
        
                Itf4= new JTextField();
                Itf4.setBounds(400,500,60,30);
    
                this.add(Itf6);
                this.add(Itf2);
                this.add(Itf3);
                this.add(Itf4);




        }

        //maths and economics
        if((Class7.count[0]==0 && Class7.count[1]==4) || (Class7.count[1]==0 && Class7.count[0]==4)  )
        {
            JLabel label0= new JLabel(subNames2[0], null, 0);
        label0.setBounds(110, 100, 0300, 0100);
        label0.setFont(font);

        JLabel label7= new JLabel(subNames2[7], null, 0);
        label7.setBounds(90, 150, 0300, 0100);
        label7.setFont(font);

        this.add(label0);
        this.add(label7);

            tf0= new JTextField();
            tf0.setBounds(400,120,60,30);
    
            tf7= new JTextField();
            tf7.setBounds(400,160,60,30);

            this.add(tf0);
            this.add(tf7);

            
             //message
             JLabel message1= new JLabel("Enter the Internal Assesment Marks(20)");
             message1.setBounds(100,301 , 1000, 50);
             message1.setFont(new Font("Arial", Font.CENTER_BASELINE, 35));

            JLabel labelI0= new JLabel(subNames2[0], null, 0);
            labelI0.setBounds(50, 360, 0450, 0100);
            labelI0.setFont(font);

            
            Itf0= new JTextField();
            Itf0.setBounds(400,370,60,30);
    
            Itf7= new JTextField();
            Itf7.setBounds(400,420,60,30);
    
            
    
            JLabel labelI7= new JLabel(subNames2[7], null, 0);
            labelI7.setBounds(90, 400, 0300, 0100);
            labelI7.setFont(font);

            this.add(message1);
            this.add(labelI0);
            this.add(labelI7);
            this.add(Itf0);
            this.add(Itf7);

        }

        //maths and commerce 
        if((Class7.count[0]==0 && Class7.count[1]==2) || (Class7.count[1]==5 && Class7.count[0]==2) )
        {
            JLabel label0= new JLabel(subNames2[0], null, 0);
        label0.setBounds(110, 100, 0300, 0100);
        label0.setFont(font);

        JLabel label5= new JLabel(subNames2[5], null, 0);
        label5.setBounds(90, 150, 0300, 0100);
        label5.setFont(font);

        this.add(label0);
        this.add(label5);

        tf0= new JTextField();
            tf0.setBounds(400,120,60,30);
    
            tf5= new JTextField();
            tf5.setBounds(400,160,60,30);

            this.add(tf0);
            this.add(tf5); 

                   //message
                   JLabel message1= new JLabel("Enter the Internal Assesment Marks(20)");
                   message1.setBounds(100,301 , 1000, 50);
                   message1.setFont(new Font("Arial", Font.CENTER_BASELINE, 35));
      
                  JLabel labelI0= new JLabel(subNames2[0], null, 0);
                  labelI0.setBounds(50, 360, 0450, 0100);
                  labelI0.setFont(font);
      
                  
                  Itf0= new JTextField();
                  Itf0.setBounds(400,370,60,30);
          
                  Itf5= new JTextField();
                  Itf5.setBounds(400,420,60,30);
          
                  
          
                  JLabel labelI5= new JLabel(subNames2[5], null, 0);
                  labelI5.setBounds(90, 400, 0300, 0100);
                  labelI5.setFont(font);
      
                  this.add(message1);
                  this.add(labelI0);
                  this.add(labelI5);
                  this.add(Itf0);
                  this.add(Itf5);

        }

        //economics and commerce
        if((Class7.count[0]==4 && Class7.count[1]==2) || (Class7.count[1]==5 && Class7.count[0]==2) )
        {
            JLabel label7= new JLabel(subNames2[7], null, 0);
        label7.setBounds(110, 100, 0300, 0100);
        label7.setFont(font);

        JLabel label5= new JLabel(subNames2[5], null, 0);
        label5.setBounds(110, 150, 0300, 0100);
        label5.setFont(font);

        this.add(label7);
        this.add(label5);

            tf7= new JTextField();
            tf7.setBounds(400,120,60,30);
    
            tf5= new JTextField();
            tf5.setBounds(400,160,60,30);

            this.add(tf7);
            this.add(tf5);

             //message
             JLabel message1= new JLabel("Enter the Internal Assesment Marks(20)");
             message1.setBounds(100,301 , 1000, 50);
             message1.setFont(new Font("Arial", Font.CENTER_BASELINE, 35));

            JLabel labelI7= new JLabel(subNames2[7], null, 0);
            labelI7.setBounds(50, 360, 0450, 0100);
            labelI7.setFont(font);

            
    
            JLabel labelI5= new JLabel(subNames2[5], null, 0);
            labelI5.setBounds(90, 400, 0300, 0100);
            labelI5.setFont(font);
            
            
            Itf7= new JTextField();
            Itf7.setBounds(400,370,60,30);
    
            Itf5= new JTextField();
            Itf5.setBounds(400,420,60,30);
    

            this.add(message1);
            this.add(labelI7);
            this.add(labelI5);
            this.add(Itf5);
            this.add(Itf7);

        }

        //EVS and commerce
        if((Class7.count[0]==2 && Class7.count[1]==3) || (Class7.count[1]==2 && Class7.count[0]==3) )
        {
            JLabel label6= new JLabel(subNames2[6], null, 0);
        label6.setBounds(110, 100, 0500, 0100);
        label6.setFont(font);

        JLabel label5= new JLabel(subNames2[5], null, 0);
        label5.setBounds(110, 150, 0300, 0100);
        label5.setFont(font);

        this.add(label6);
        this.add(label5);

            tf6= new JTextField();
            tf6.setBounds(400,120,60,30);
    
            tf5= new JTextField();
            tf5.setBounds(400,160,60,30);

            this.add(tf6);
            this.add(tf5);
                 //message
                 JLabel message1= new JLabel("Enter the Internal Assesment Marks(20)");
                 message1.setBounds(100,301 , 1000, 50);
                 message1.setFont(new Font("Arial", Font.CENTER_BASELINE, 35));
    
                JLabel labelI6= new JLabel(subNames2[6], null, 0);
                labelI6.setBounds(50, 360, 0450, 0100);
                labelI6.setFont(font);
    
                
        
                JLabel labelI5= new JLabel(subNames2[5], null, 0);
                labelI5.setBounds(90, 400, 0300, 0100);
                labelI5.setFont(font);
                
                
                Itf6= new JTextField();
                Itf6.setBounds(400,370,60,30);
        
                Itf5= new JTextField();
                Itf5.setBounds(400,420,60,30);
        
    
                this.add(message1);
                this.add(labelI6);
                this.add(labelI5);
                this.add(Itf5);
                this.add(Itf6);

              

        }

       
    }


    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
           if(e.getSource()==button1)
           {
            try
            {
            //science and maths
            if((Class7.count[0]==0 && Class7.count[1]==1) || (Class7.count[1]==0 && Class7.count[0]==1))
            {
                
                
                if((Integer.valueOf(tf0.getText())>=1&&Integer.valueOf(tf0.getText())<=80)&& (Integer.valueOf(tf2.getText())>=1&&Integer.valueOf(tf2.getText())<=80)&&(Integer.valueOf(tf3.getText())>=1&&Integer.valueOf(tf3.getText())<=80)&&(Integer.valueOf(Itf0.getText())>=1&&Integer.valueOf(Itf0.getText())<=20)&&(Integer.valueOf(Itf2.getText())>=1&&Integer.valueOf(Itf2.getText())<=20)&&(Integer.valueOf(Itf3.getText())>=1&&Integer.valueOf(Itf3.getText())<=20)&&(Integer.valueOf(Itf4.getText())>=1&&Integer.valueOf(Itf4.getText())<=20))
                //paper marks
                {
                pap_mark[0]=Integer.valueOf(tf0.getText());
                pap_mark[1]=Integer.valueOf(tf2.getText());
                 pap_mark[ 2]=Integer.valueOf(tf3.getText());

 

                //internal marks
                int_mark[0]=Integer.valueOf(Itf0.getText());
                int_mark[1]=Integer.valueOf(Itf2.getText());
                int_mark[2]=Integer.valueOf(Itf3.getText());
                int_mark[3]=Integer.valueOf(Itf4.getText());

                    
                }
                else
                {
                    /*JOptionPane.showMessageDialog(null, "Please enter valid marks",
                                                         "Warning", JOptionPane.WARNING_MESSAGE);*/

                                                         throw new InvalidInputException("Enter valid input");
                }



                

                System.out.println(int_mark[3]);
                vs=1;

            }
             //evs and science
             if((Class7.count[0]==3 && Class7.count[1]==1) || (Class7.count[1]==3 && Class7.count[0]==1))
             {
                if((Integer.valueOf(tf6.getText())>=1&&Integer.valueOf(tf6.getText())<=80)&& (Integer.valueOf(tf2.getText())>=1&&Integer.valueOf(tf2.getText())<=80)&&(Integer.valueOf(tf3.getText())>=1&&Integer.valueOf(tf3.getText())<=80)&&(Integer.valueOf(Itf6.getText())>=1&&Integer.valueOf(Itf6.getText())<=20)&&(Integer.valueOf(Itf2.getText())>=1&&Integer.valueOf(Itf2.getText())<=20)&&(Integer.valueOf(Itf3.getText())>=1&&Integer.valueOf(Itf3.getText())<=20)&&(Integer.valueOf(Itf4.getText())>=1&&Integer.valueOf(Itf4.getText())<=20))
                 //paper marks
                 {
                 pap_mark[0]=Integer.valueOf(tf6.getText());
                 pap_mark[1]=Integer.valueOf(tf2.getText());
                 pap_mark[2]=Integer.valueOf(tf3.getText());

 
                 //internal marks
                 int_mark[0]=Integer.valueOf(Itf6.getText());
                 int_mark[1]=Integer.valueOf(Itf2.getText());
                 int_mark[2]=Integer.valueOf(Itf3.getText());
                 int_mark[3]=Integer.valueOf(Itf4.getText());

                 vs=1;
                 }
                 else
                 {
                    /*JOptionPane.showMessageDialog(null, "Please enter valid marks",
                                                         "Warning", JOptionPane.WARNING_MESSAGE);*/
                                                          throw new InvalidInputException("Enter valid input");
                 }
 
             }
             if((Class7.count[0]==0 && Class7.count[1]==4) || (Class7.count[1]==0 && Class7.count[0]==4))
             {
                 //paper marks
                 if((Integer.valueOf(tf0.getText())>=1&&Integer.valueOf(tf0.getText())<=80)&& (Integer.valueOf(tf7.getText())>=1&&Integer.valueOf(tf7.getText())<=80)&&(Integer.valueOf(Itf0.getText())>=1&&Integer.valueOf(Itf0.getText())<=20)&&(Integer.valueOf(Itf7.getText())>=1&&Integer.valueOf(Itf7.getText())<=20))
                 {
                 pap_mark[0]=Integer.valueOf(tf0.getText());
                 pap_mark[1]=Integer.valueOf(tf7.getText());

                 //internal marks
                 int_mark[0]=Integer.valueOf(Itf0.getText());
                 int_mark[1]=Integer.valueOf(Itf7.getText());
                 }
                 else
                 {
                     /*JOptionPane.showMessageDialog(null, "Please enter valid marks",
                                                         "Warning", JOptionPane.WARNING_MESSAGE);*/
                                                          throw new InvalidInputException("Enter valid input");
                 }
             }
             if((Class7.count[0]==0 && Class7.count[1]==2) || (Class7.count[1]==2 && Class7.count[0]==0))
             {
                if((Integer.valueOf(tf0.getText())>=1&&Integer.valueOf(tf0.getText())<=80)&& (Integer.valueOf(tf5.getText())>=1&&Integer.valueOf(tf5.getText())<=80)&&(Integer.valueOf(Itf0.getText())>=1&&Integer.valueOf(Itf0.getText())<=20)&&(Integer.valueOf(Itf5.getText())>=1&&Integer.valueOf(Itf5.getText())<=20))
                    //paper marks
                    {
                    pap_mark[0]=Integer.valueOf(tf0.getText());
                    pap_mark[1]=Integer.valueOf(tf5.getText());
   
                    //internal marks
                    int_mark[0]=Integer.valueOf(Itf0.getText());
                    int_mark[1]=Integer.valueOf(Itf5.getText());
                    }
                    else
                    {
                        /*JOptionPane.showMessageDialog(null, "Please enter valid marks",
                                                            "Warning", JOptionPane.WARNING_MESSAGE);*/
                                                             throw new InvalidInputException("Enter valid input");
                    }
                }
                if((Class7.count[0]==4 && Class7.count[1]==2) || (Class7.count[1]==4 && Class7.count[0]==2))
                {
                    if((Integer.valueOf(tf5.getText())>=1&&Integer.valueOf(tf5.getText())<=80)&& (Integer.valueOf(tf7.getText())>=1&&Integer.valueOf(tf7.getText())<=80)&&(Integer.valueOf(Itf5.getText())>=1&&Integer.valueOf(Itf5.getText())<=20)&&(Integer.valueOf(Itf7.getText())>=1&&Integer.valueOf(Itf7.getText())<=20))
                    {
                    pap_mark[0]=Integer.valueOf(tf5.getText());
                    pap_mark[1]=Integer.valueOf(tf7.getText());
                    
   
                    //internal marks
                    int_mark[0]=Integer.valueOf(Itf5.getText());
                    int_mark[1]=Integer.valueOf(Itf7.getText());
                    }
                    else
                    {
                        /*JOptionPane.showMessageDialog(null, "Please enter valid marks",
                                                            "Warning", JOptionPane.WARNING_MESSAGE);*/
                    }
                }
                   if((Class7.count[0]==3 && Class7.count[1]==2) || (Class7.count[1]==3 && Class7.count[0]==2) )
                     {
                        if((Integer.valueOf(tf6.getText())>=1&&Integer.valueOf(tf6.getText())<=80)&& (Integer.valueOf(tf5.getText())>=1&&Integer.valueOf(tf5.getText())<=80)&&(Integer.valueOf(Itf6.getText())>=1&&Integer.valueOf(Itf6.getText())<=20)&&(Integer.valueOf(Itf6.getText())>=1&&Integer.valueOf(Itf6.getText())<=20))
                //paper marks
                            {
                                pap_mark[0]=Integer.valueOf(tf6.getText());
                                pap_mark[1]=Integer.valueOf(tf5.getText());
                            
                            
                                //internal marks
                                int_mark[0]=Integer.valueOf(Itf6.getText());
                                int_mark[1]=Integer.valueOf(Itf5.getText());
                                }
                            else
                            {
                               /*JOptionPane.showMessageDialog(null, "Please enter valid marks",
                                                                        "Warning", JOptionPane.WARNING_MESSAGE);*/
                                                                         throw new InvalidInputException("Enter valid input");
                            
                            }
                    }

         
           
          
           this.dispose();
            Class9 onjj=new Class9(); 
        
        }
        catch(Exception Ae)
        {
            
                    JOptionPane.showMessageDialog(null, "Please enter valid marks",
                                                            "Warning", JOptionPane.WARNING_MESSAGE);
        }

       
        
    }

    if(e.getSource()==backbutton)
    {
        this.dispose();
        Class7 obj2= new Class7();
    }
    

                 
         
          
    }   

           
 }
 

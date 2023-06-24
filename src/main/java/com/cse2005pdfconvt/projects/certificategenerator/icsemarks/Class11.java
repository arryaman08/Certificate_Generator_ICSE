package com.cse2005pdfconvt.projects.certificategenerator.icsemarks;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JTextField;
public class Class11 extends JFrame implements ActionListener
{
    static double  s;
    static int counter;
    double average;
    double average1;
    int bo3[]=new int[15];
   static double fm1;
   static double fm2;
   static double fm;

   JButton button;
    static double hin;
   static double Compmark;
  Class11()
  { 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setVisible(true);
    this.setSize(850, 900);

    button= new JButton("Click to Continue");
    button.setBounds(150,550,400,100);
    button.setFont(new Font("CONSOLAS", Font.BOLD,20));
    button.addActionListener(this);

    int c=0;
    for(int i=0;i<4;i++)
    {
    
     
      bo3[i] = Class6.avgm[i];
    
    }
    for(int i=4;i<8;i++)
    {
    
     
      bo3[i] = Class8.pap_mark[c];
      c=c+1;
    
    }
    int p=0;

    for(int j=0;j<7;j++)
      {
        for(int k=j+1;k<7;k++)
        {
          if(bo3[j]<bo3[k])
          {
            p=bo3[j];
            bo3[j]=bo3[k];
            bo3[k]=p;
          }
        }
			average=(bo3[0]+bo3[1]+bo3[2])/3.0;
            //average=75.0;
            average1=(average*100)/80.0;
      }

    
   
    


    double per=0.7*(average/80)*100+ 0.3*(Class6.intMarks[2]/20)*100;
    double fpm=Math.round(per*0.8);
    fm=Math.round(fpm+Class6.intMarks[2]);


    System.out.println("average is "+average);
      Compmark=Math.round((0.7*average1*1)+ (0.3*Class10.grp3_mark*1));
     fm2=Math.round((100+Compmark)/2);

    double per1=0.7*(average/80)*100+ 0.3*(Class8.int_mark[3]/20)*100;
    double fpm1=Math.round(per1*0.8);
     fm1=Math.round(fpm1+Class8.int_mark[3]);
    System.out.println("average1 is: "+average1);

    System.out.println("Geography= "+fm);
    System.out.println("Computer= "+Compmark);
    System.out.println("Biology= "+fm1);

    Font font= new Font("Calibiri", Font.PLAIN, 25);

   JLabel message= new JLabel("Cancelled Exams Marks:");
    message.setBounds(180, 10, 500, 200);
    message.setFont(new Font("Calibiri", Font.CENTER_BASELINE,35));

    JLabel label=new JLabel(Class10.subNames3[Class9.c]);
    label.setFont(font);
    label.setBounds(50, 80, 500, 200);

    JTextField tf1=new JTextField(Double.toString(fm2));
    tf1.setFont(font);
    tf1.setBounds(380, 160, 100, 50);
    tf1.setEditable(false);
    this.add(tf1);

    
    
    JLabel label1=new JLabel("GEOGRAPHY:" );
    label1.setFont(font);
    label1.setBounds(50, 180, 500, 200);

    JTextField tf2=new JTextField(Double.toString(fm));
    tf2.setFont(font);
    tf2.setBounds(380, 260, 100, 50);
    tf2.setEditable(false);
    this.add(tf2);
    


    if(Class7.count[0]==1 || Class7.count[1]==1)
    {
    JLabel label2=new JLabel("BIOLOGY:");
    label2.setFont(font);
    label2.setBounds(50, 280, 500, 200);
    this.add(label2);
    

    JTextField tf3=new JTextField(Double.toString(fm1));
    tf3.setFont(font);
    tf3.setBounds(380, 360, 100, 50);
    tf3.setEditable(false);
    this.add(tf3);

     //case for hindi if bio is selected
       if(Class5.flag==1){
       double pre=0.7*(average/80)*100+ 0.3*(Class6.intMarks[2]/20)*100;
       hin=Math.round(per*0.8);
        hin=Math.round(fpm+Class6.intMarks[3]);

             JLabel label5=new JLabel("HINDI:");
           label5.setFont(font);
           label5.setBounds(50, 360, 500, 200);
           this.add(label5);


           JTextField tf5=new JTextField(Double.toString(hin));
           tf5.setFont(font);
           tf5.setBounds(380, 440, 100, 50);
           tf5.setEditable(false);
           this.add(tf5);
           //this is the case if bio is not selected and hindi is
        }
        
    }else if(Class5.flag==1)
        {
           double pre=0.7*(average/80)*100+ 0.3*(Class6.intMarks[2]/20)*100;
            hin=Math.round(per*0.8);
            hin=Math.round(fpm+Class6.intMarks[3]);

             JLabel label5=new JLabel("HINDI:");
           label5.setFont(font);
           label5.setBounds(50, 280, 500, 200);
           this.add(label5);


           JTextField tf5=new JTextField(Double.toString(hin));
           tf5.setFont(font);
           tf5.setBounds(380, 360, 100, 50);
           tf5.setEditable(false);
           this.add(tf5);
        }

 
    


    this.add(message);
    this.add(label);
    this.add(label1);

    

    this.add(button);
     

  }
  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource()== button)
    {
      this.dispose();
       Class12 obj=new Class12();
    }
  }

    
}

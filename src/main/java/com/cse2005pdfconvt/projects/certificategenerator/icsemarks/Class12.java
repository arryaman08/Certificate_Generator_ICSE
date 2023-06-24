package com.cse2005pdfconvt.projects.certificategenerator.icsemarks;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.*;

import com.cse2005pdfconvt.projects.certificategenerator.CertificateGenerator;

import java.awt.Button;
import java.awt.Color;

//import com.cse2005pdfconvt.projects.certificategenerator.CertificateGenerator;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.cert.Certificate;
import java.text.CollationElementIterator;

public class Class12 extends JFrame implements ActionListener
{
    JButton button;
    int final_array1[]= new int[15];
    int final_array2[]= new int[15];

    double average_array[]= new double[15];
    static double percent;
    
    Class12()
    {
        for(int i=0;i<4;i++)
        {
            final_array1[i]=Class6.intMarks[i]+Class6.avgm[i];
        }

        if(Class8.vs==1)
        {
            for(int i=0;i<4;i++)
            {
                final_array2[i]=Class8.int_mark[i]+Class8.pap_mark[i];
            }
            //maths
        average_array[5]=final_array2[0];
            // average_array[2]=(final_array2[1]+final_array2[2]+Class11.fm1)/3;

             //for science
        average_array[2]=Math.round((final_array2[1]+final_array2[2]+Class11.fm1)/3);
        }
        else
        {
            for(int i=0;i<2;i++)
            {
                final_array2[i]=Class8.int_mark[i]+Class8.pap_mark[i];
            }
            //maths
        average_array[5]=final_array2[0];
             average_array[2]=final_array2[1];

        }
        System.out.println("English1= "+final_array1[0]);
        System.out.println("English2= "+final_array1[1]);
        System.out.println("Odia"+final_array1[3]);
        System.out.println("Physics= "+ final_array2[1]);;

        //for english
        average_array[0]=Math.ceil((final_array1[0]+final_array1[1])/2.0);

        //for language
        if(Class5.flag==-1)
        {
            average_array[1]= final_array1[2];
        }
        else{
            average_array[1]= Class11.hin;
        }
        

        //for computer
        average_array[3]=Class11.fm2;

        //for his and geo
        average_array[4]=Math.round(((Class6.avgm[3]+Class6.intMarks[2])+Class11.fm)/2);

        
        for(int i=0;i<5;i++)
        {
            System.out.println("The answer is:" + average_array[i]);
        }

        

        ArrayList<Double> a1= new ArrayList<Double>();
        for(int i=1;i<=5;i++)
        {
            a1.add(average_array[i]);
        }
        Collections.sort(a1);

         percent=(a1.get(1)+a1.get(2)+a1.get(3)+a1.get(4)+average_array[0])/5;



       
        System.out.println(a1);
        System.out.println("percentage is +"+percent);
        PrintMarks();

    }

    public void PrintMarks()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(650, 900);

        JLabel message= new JLabel("Final Subject Marks");
        message.setFont(new Font("Arial", Font.CENTER_BASELINE, 35));
        message.setBounds(100,20 , 1000, 50);

        this.add(message);

        Font font= new Font("Calibiri", Font.PLAIN, 25);

    JLabel label=new JLabel("ENGLISH:");
    label.setFont(font);
    label.setBounds(50, 80, 500, 200);

        //for english
    JTextField tf1=new JTextField(Double.toString(average_array[0]));
    tf1.setFont(font);
    tf1.setBounds(400, 160, 100, 50);
    tf1.setEditable(false);
    this.add(tf1);
    this.add(label);

    JLabel label1=new JLabel("History, Civics and Geography:");
    label1.setFont(font);
    label1.setBounds(50, 200, 500, 200);

        //for HISTORY CIVICS AND GEOGRAPHY
    JTextField tf2=new JTextField(Double.toString(average_array[4]));
    tf2.setFont(font);
    tf2.setBounds(400, 280, 100, 50);
    tf2.setEditable(false);
    
    this.add(tf2);
    this.add(label1);

    //language
    JLabel label2=new JLabel(Class6.subNames[Class5.c]);
    // JLabel label2=new JLabel("Odia");
    label2.setFont(font);
    label2.setBounds(50, 140, 500, 200);

    JTextField tf3=new JTextField(Double.toString(average_array[1]));
    tf3.setFont(font);
    tf3.setBounds(400, 220, 100, 50);
    tf3.setEditable(false);
    
    this.add(label2);
    this.add(tf3);

    //group 2 first subject
    JLabel label3=new JLabel(Class8.subNames4[Class7.count[0]]);
    // JLabel label3=new JLabel("MATHEMATICS");
    label3.setFont(font);
    label3.setBounds(50, 260, 500, 200);

    JTextField tf4=new JTextField(Double.toString(average_array[5]));
    tf4.setFont(font);
    tf4.setBounds(400, 340, 100, 50);
    tf4.setEditable(false);
    
    this.add(label3);
    this.add(tf4);

    //group 2 second subject
    JLabel label4=new JLabel(Class8.subNames4[Class7.count[1]]);
    // JLabel label4=new JLabel("SCIENCE");
    label4.setFont(font);
    label4.setBounds(50, 320, 500, 200);

    JTextField tf5=new JTextField(Double.toString(Math.round(average_array[2])));
    tf5.setFont(font);
    tf5.setBounds(400, 400, 100, 50);
    tf5.setEditable(false);
    
    this.add(label4);
    this.add(tf5);

    //group 3
    JLabel label5=new JLabel(Class10.subNames3[Class9.c]);
     //JLabel label5=new JLabel("COMPUTER APPLICATIONS");
    label5.setFont(font);
    label5.setBounds(50, 380, 500, 200);

    JTextField tf6=new JTextField(Double.toString(average_array[3]));
    tf6.setFont(font);
    tf6.setBounds(400, 460, 100, 50);
    tf6.setEditable(false);

     JLabel label6=new JLabel("Final Percentage:");
     
    label6.setFont(new Font("Arial", Font.BOLD, 35));
    label6.setBounds(50, 440, 500, 200);

    JTextField tf7=new JTextField(Double.toString(percent));
    tf7.setFont(new Font("Arial", Font.BOLD, 35));
    tf7.setBounds(400, 520, 100, 50);
    tf7.setEditable(false);


    
    button= new JButton("Click to Generate Certificate");
    button.setBounds(135, 650, 400, 50);
    button.setFont(font);
    button.addActionListener(this);

    this.add(label6);
    this.add(tf7);

    
    this.add(label5);
    this.add(tf6);
    this.add(button);

    
       
      

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button)
        {
            this.dispose();
              CertificateGenerator.main(null);
            
        }
    }
    

    
    
}

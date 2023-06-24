package com.cse2005pdfconvt.projects.certificategenerator.icsemarks;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class Class4 extends JFrame implements ActionListener
{
    JButton button;
    public Class4()
    {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new GridLayout(1,1));
    this.setVisible(true);
    this.setSize(800, 700);

    ImageIcon icon= new ImageIcon("logo.jpeg");
     button= new JButton("\nClick anywhere to continue");
     button.setIcon(icon);
    button.setFont(new Font("Calibiri", Font.ITALIC,20 ));
    button.setFocusable(false);

    button.setVerticalTextPosition(SwingConstants.BOTTOM);
    button.setHorizontalTextPosition(SwingConstants.CENTER);

    button.addActionListener(this);

    this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            Class5 obj= new Class5();
            this.dispose();
        }
    }
}

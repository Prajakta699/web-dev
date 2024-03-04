import java.awt.*;

import javax.swing.*;
public class java01 extends JFrame{

    Container c;
    JLabel L1,L2,L3;
    JTextField t1,t2;
    JTextArea t3;
    JButton Submit;
    JCheckBox c1,c2;

    java01()
    {
        c=getContentPane();
        c.setLayout(null);


        L1 = new JLabel("First Name");
        L1.setBounds(10,20,100,50);

        t1 = new JTextField();
        t1.setBounds(200,40,300,30);

        L2 = new JLabel("Last Name");
        L2.setBounds(10,60,100,50);

        t2 = new JTextField();
        t2.setBounds(200,80,300,30);

        L3 = new JLabel("Address");
        L3.setBounds(10,100,100,50);

        t3 = new JTextArea();
        t3.setBounds(200,120,300,30);

        c1 = new JCheckBox();
        c1.setBounds(10,140,300,30);


       add(L1);
       add(L2);
       add(L3);
       add(t1);
       add(t2);
       add(L3);
       add(t3);
       setVisible(true);
       setSize(500,500);





    }

    public static void main(String[] args) {
         
       java01 obj = new java01();
    }
}
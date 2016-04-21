//Adriana Luna
//hw3_al.java
//September 20, 2015
//ET 362
//Java Programming

import java.awt.*; 
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class hw3_al extends JFrame implements ActionListener
{
JTextField tf1=null;//global textfields
JTextField tf2=null;
JTextField tf3=null;

public static void main(String [] args)
{
hw3_al n=new hw3_al();
}
public hw3_al()
{
JPanel top=new JPanel();
JLabel b=new JLabel ("Calculator");
b.setFont(new Font("Helvetica",Font.BOLD,40));
top.setForeground(Color.BLUE);
top.add(b);

JPanel middle=new JPanel();
tf1=new JTextField(20);//length of textfield
tf2=new JTextField(20);
tf3=new JTextField(20);
tf1.setPreferredSize(new Dimension(300,38));//size of textfield
tf2.setPreferredSize(new Dimension(300,38));
tf3.setPreferredSize(new Dimension(300,38));
middle.add(tf1);
middle.add(tf2);
middle.add(tf3);

JPanel bottom=new JPanel();
JButton d= new JButton("+");
JButton e= new JButton("-");
JButton f= new JButton("*");
JButton g= new JButton("/");
JButton q= new JButton("quit");

bottom.add(d);
bottom.add(e);
bottom.add(f);
bottom.add(g);
bottom.add(q);

d.addActionListener(this);
e.addActionListener(this);
f.addActionListener(this);
g.addActionListener(this);
q.addActionListener(this);

add(top,BorderLayout.NORTH);
add(middle,BorderLayout.CENTER);
add(bottom,BorderLayout.SOUTH);
setTitle("Simple Calculator");
setSize(400,400);
setLocationRelativeTo(null);//location after size in order to work
setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
setDefaultCloseOperation(EXIT_ON_CLOSE);

double x=Double.parseDouble(tf1.getText());
double y=Double.parseDouble(tf2.getText());
double z=0.0;

String h=e.getActionCommand();
if(h.equals("quit")){System.exit(0);}
if(h.equals("+")){z=x+y;}
if(h.equals("-")){z=x-y;}
if(h.equals("*")){z=x*y;}
if(h.equals("/")){z=x/y;}

tf3.setText(String.format("%10.5f",z));//int value places resuslt to the left, the bigger the value the more to the right of the textfield is the result placed
}
}


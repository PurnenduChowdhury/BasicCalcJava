import javax.swing.*;
import java.lang.Math;
import java.awt.event.*;

class BasicCalc implements ActionListener
{
JFrame f; JTextField t;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,
bsub,badd,bdec,beq,bdel,bclr,sine,cosine,exp,log;
 
static double b=0,r=0,a=0; static int op=0;
 
BasicCalc()
{
f=new JFrame("BasicCalc"); t=new JTextField();
b1=new JButton("1"); b2=new JButton("2");
b3=new JButton("3"); b4=new JButton("4"); 
b5=new JButton("5"); b6=new JButton("6");
b7=new JButton("7"); b8=new JButton("8");
b9=new JButton("9"); b0=new JButton("0");
bdiv=new JButton("/"); bmul=new JButton("*");
bsub=new JButton("-"); sine=new JButton("sin()");
cosine=new JButton("cos()"); exp=new JButton("EXP");
log=new JButton("LOG"); badd=new JButton("+");
bdec=new JButton("."); beq=new JButton("=");
bdel=new JButton("DEL");
bclr=new JButton("CLEAR");
t.setBounds(30,40,415,30);
b7.setBounds(40,100,50,40);
b8.setBounds(110,100,50,40);
b9.setBounds(180,100,50,40);
bdiv.setBounds(250,170,50,40);
sine.setBounds(320,100,100,40);
cosine.setBounds(320,170,100,40);
exp.setBounds(320,240,100,40);
log.setBounds(320,310,100,40);
b4.setBounds(40,170,50,40);
b5.setBounds(110,170,50,40);
b6.setBounds(180,170,50,40);
bmul.setBounds(250,100,50,40);
b1.setBounds(40,240,50,40);
b2.setBounds(110,240,50,40);
b3.setBounds(180,240,50,40);
bsub.setBounds(250,310,50,40);
bdec.setBounds(40,310,50,40);
b0.setBounds(110,310,50,40);
beq.setBounds(180,310,50,40);
badd.setBounds(250,240,50,40);
bdel.setBounds(180,380,100,40);
bclr.setBounds(60,380,100,40);
f.add(t);
f.add(bdiv);
f.add(sine);
f.add(cosine);
f.add(log);
f.add(exp);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
f.add(b8);
f.add(b9);
f.add(bmul);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(bsub);
f.add(bdec);
f.add(badd);
f.add(bdel);
f.add(bclr);
f.add(b0);
f.add(beq);
f.setLayout(null);
f.setVisible(true);
f.setSize(550,500);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setResizable(false);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
badd.addActionListener(this);
bdiv.addActionListener(this);
sine.addActionListener(this);
cosine.addActionListener(this);
exp.addActionListener(this);
log.addActionListener(this);
bmul.addActionListener(this);
bsub.addActionListener(this);
bdec.addActionListener(this);
beq.addActionListener(this);
bdel.addActionListener(this);
bclr.addActionListener(this);
}
 
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
t.setText(t.getText().concat("1"));
if(e.getSource()==b2)
t.setText(t.getText().concat("2"));
if(e.getSource()==b3)
t.setText(t.getText().concat("3"));
if(e.getSource()==b4)
t.setText(t.getText().concat("4"));
if(e.getSource()==b5)
t.setText(t.getText().concat("5"));
if(e.getSource()==b6)
t.setText(t.getText().concat("6"));
if(e.getSource()==b7)
t.setText(t.getText().concat("7"));
if(e.getSource()==b8)
t.setText(t.getText().concat("8"));
if(e.getSource()==b9)
t.setText(t.getText().concat("9"));
if(e.getSource()==b0)
t.setText(t.getText().concat("0"));
if(e.getSource()==bdec)
t.setText(t.getText().concat("."));
if(e.getSource()==badd)
{
a=Double.parseDouble(t.getText());
op=1;
t.setText("");
}
if(e.getSource()==bsub)
{
a=Double.parseDouble(t.getText());
op=2;
t.setText("");
}
if(e.getSource()==bmul)
{
a=Double.parseDouble(t.getText());
op=3;
t.setText("");
}
if(e.getSource()==bdiv)
{
a=Double.parseDouble(t.getText());
op=4;
t.setText("");
}
if(e.getSource()==sine)
{
a=Math.sin(Double.parseDouble(t.getText()));
t.setText("");
t.setText(t.getText() + a);
}
if(e.getSource()==exp)
{
a=Math.exp(Double.parseDouble(t.getText()));
t.setText("");
t.setText(t.getText() + a);
}

if(e.getSource()==cosine)
{
a=Math.cos(Double.parseDouble(t.getText()));
t.setText("");
t.setText(t.getText() + a);
}

if(e.getSource()==log)
{
a=Math.log(Double.parseDouble(t.getText()));
t.setText("");
t.setText(t.getText() + a);
}

if(e.getSource()==beq)
{
b=Double.parseDouble(t.getText());
switch(op)
{
case 1: r=a+b;
break;
case 2: r=a-b;
break;
case 3: r=a*b;
break;
case 4: r=a/b;
break;
default: r=0;
}
t.setText(""+r);
}
if(e.getSource()==bclr)
t.setText("");
if(e.getSource()==bdel)
{
String s=t.getText(); t.setText("");
for(int i=0;i<s.length()-1;i++)
t.setText(t.getText()+s.charAt(i));
}
}

public static void main(String[] s)
{
new BasicCalc();
}
}
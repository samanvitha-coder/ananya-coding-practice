package in.samanvitha;

import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.lang.Math.*;
class J implements ActionListener//,ItemListener
{
    Frame f=new Frame("Calculator");
    TextField tf=new TextField("");
    TextField t1=new TextField("");
    TextField t2=new TextField("");
    int c=1,d=1;
    //float g=0.0;
    String s1="",s2="",s0="",y="",x="",s="";
    double te=0.0;
    Button b1=new Button("1");
    Button b2=new Button("2");
    Button b3=new Button("3");
    Button b4=new Button("4");
    Button b5=new Button("5");
    Button b6=new Button("6");
    Button b7=new Button("7");
    Button b8=new Button("8");
    Button b9=new Button("9");
    Button b10=new Button("0");
    Button b11=new Button("+");
    Button b12=new Button("-");
    Button b13=new Button("*");
    Button b14=new Button("/");
    Button b15=new Button("%");
    Button b16=new Button("=");
    Button b17=new Button(".");
    Button b18=new Button("C");
    Button b19=new Button("sin");
    Button b20=new Button("cos");
    Button b21=new Button("tan");
    Button b22=new Button("ln");
    Button b23=new Button("log");
    Button b24=new Button("1/x");
    Button b25=new Button("e^x");
    Button b26=new Button("x^2");
    Button b27=new Button("back");
    Button b28=new Button("|x|");
    Button b29=new Button("pi");
    Button b30=new Button("e");
    Button b31=new Button("sqrt");
    Button b32=new Button("cbrt");
    Button b33=new Button("Rad");
    Button b34=new Button("2^x");
    Button b35=new Button("x^3");
    Button b36=new Button("x!");
    Button b37=new Button("sin^-1");
    Button b38=new Button("cos^-1");
    Button b39=new Button("tan^-1");
    Button b40=new Button("sinh");
    Button b41=new Button("cosh");
    Button b42=new Button("tanh");
    Button b43=new Button("sinh^-1");
    Button b44=new Button("cosh^-1");
    Button b45=new Button("tanh^-1");
    J()
    {
        f.setSize(500,380);
        tf.setBounds(30,30,460,75);//y,x,b,h
        f.add(tf);
        b33.setBounds(25,130,45,45);//1st row
        f.add(b33);
        b34.setBounds(70,130,45,45);
        f.add(b34);
        b26.setBounds(115,130,45,45);
        f.add(b26);
        b35.setBounds(160,130,45,45);
        f.add(b35);
        b27.setBounds(205,130,45,45);
        f.add(b27);
        b31.setBounds(250,130,45,45);
        f.add(b31);
        b32.setBounds(295,130,45,45);
        f.add(b32);
        b14.setBounds(340,130,45,45);
        f.add(b14);
        b18.setBounds(385,130,100,45);
        f.add(b18);
        b28.setBounds(25,175,45,45);//2nd row
        f.add(b28);
        b29.setBounds(70,175,45,45);
        f.add(b29);
        b36.setBounds(115,175,45,45);
        f.add(b36);
        b25.setBounds(160,175,45,45);
        f.add(b25);
        b30.setBounds(205,175,45,45);
        f.add(b30);
        b7.setBounds(250,175,45,45);
        f.add(b7);
        b8.setBounds(295,175,45,45);
        f.add(b8);
        b9.setBounds(340,175,45,45);
        f.add(b9);
        b13.setBounds(385,175,100,45);
        f.add(b13);
        b24.setBounds(25,220,45,45);//3rd row
        f.add(b24);
        b22.setBounds(70,220,45,45);
        f.add(b22);
        b23.setBounds(115,220,45,45);
        f.add(b23);
        b19.setBounds(160,220,45,45);
        f.add(b19);
        b20.setBounds(205,220,45,45);
        f.add(b20);
        b4.setBounds(250,220,45,45);
        f.add(b4);
        b5.setBounds(295,220,45,45);
        f.add(b5);
        b6.setBounds(340,220,45,45);
        f.add(b6);
        b11.setBounds(385,220,100,45);
        f.add(b11);
        b21.setBounds(25,265,45,45);//4th row
        f.add(b21);
        b37.setBounds(70,265,45,45);
        f.add(b37);
        b38.setBounds(115,265,45,45);
        f.add(b38);
        b39.setBounds(160,265,45,45);
        f.add(b39);
        b40.setBounds(205,265,45,45);
        f.add(b40);
        b1.setBounds(250,265,45,45);
        f.add(b1);
        b2.setBounds(295,265,45,45);
        f.add(b2);
        b3.setBounds(340,265,45,45);
        f.add(b3);
        b12.setBounds(385,265,100,45);
        f.add(b12);
        b41.setBounds(25,310,45,45);//5th row
        f.add(b41);
        b42.setBounds(70,310,45,45);
        f.add(b42);
        b43.setBounds(115,310,45,45);
        f.add(b43);
        b44.setBounds(160,310,45,45);
        f.add(b44);
        b45.setBounds(205,310,45,45);
        f.add(b45);
        b10.setBounds(250,310,45,45);
        f.add(b10);
        b17.setBounds(295,310,45,45);
        f.add(b17);
        b15.setBounds(340,310,45,45);
        f.add(b15);
        b16.setBounds(385,310,100,45);
        f.add(b16);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b31.addActionListener(this);
        b32.addActionListener(this);
        b33.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b37.addActionListener(this);
        b38.addActionListener(this);
        b39.addActionListener(this);
        b40.addActionListener(this);
        b41.addActionListener(this);
        b42.addActionListener(this);
        b43.addActionListener(this);
        b44.addActionListener(this);
        b45.addActionListener(this);
        b34.addActionListener(this);
        b26.addActionListener(this);
        b35.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        b29.addActionListener(this);
        b36.addActionListener(this);
        b25.addActionListener(this);
        b30.addActionListener(this);
        f.setLayout(null);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)
    {
        s=((Button)ae.getSource()).getLabel();
		/*if(s.equals("back"))
		{
			//y=s;
			if(tf.getText().length()>1)
				tf.setText(tf.getText().substring(0,tf.getText().length()-1));
			else
				tf.setText("");
		}*/
        if(s.equals("pi"))
        {
            //y=s;
            te=Math.PI;
            tf.setText("PI="+te);
        }
        else if(s.equals("1/x"))
        {
            y=s;
            tf.setText("1/");
        }
        else if(s.equals("ln"))
        {
            y=s;
            tf.setText("ln(");
        }
        else if(s.equals("log"))
        {
            y=s;
            tf.setText("log(");
        }
        else if(s.equals("e"))
        {
            y=s;
            te=Math.exp(1.0);
            tf.setText("e="+te);
        }
        else if(s.equals("e^x"))
        {
            y=s;
            tf.setText("e(");
        }
        else if(s.equals("Rad"))
        {
            y=s;
            tf.setText("Rad");
            d=2;
        }
        else if(s.equals("sin"))
        {
            y=s;
            tf.setText("sin(");
        }
        else if(s.equals("cos"))
        {
            y=s;
            tf.setText("cos(");
        }
        else if(s.equals("tan"))
        {
            y=s;
            tf.setText("tan(");
        }
        else if(s.equals("sin^-1"))
        {
            y=s;
            tf.setText("sin^-1(");
        }
        else if(s.equals("cos^-1"))
        {
            y=s;
            tf.setText("cos^-1(");
        }
        else if(s.equals("tan^-1"))
        {
            y=s;
            tf.setText("tan^-1(");
        }
        else if(s.equals("sinh"))
        {
            y=s;
            tf.setText("sinh(");
        }
        else if(s.equals("cosh"))
        {
            y=s;
            tf.setText("cosh(");
        }
        else if(s.equals("tanh"))
        {
            y=s;
            tf.setText("tanh(");
        }
        else if(s.equals("sinh^-1"))
        {
            y=s;
            tf.setText("sinh^-1(");
        }
        else if(s.equals("cosh^-1"))
        {
            y=s;
            tf.setText("cosh^-1(");
        }
        else if(s.equals("tanh^-1"))
        {
            y=s;
            tf.setText("tanh^-1(");
        }
        else if(s.equals("x!"))
        {
            y=s;
            tf.setText("()!");
        }
        else if(s.equals("2^x"))
        {
            y=s;
            System.out.println(y);
            tf.setText("2^(");
        }
        else if(s.equals("x^2"))
        {
            y=s;
            tf.setText("( )^2");
        }
        else if(s.equals("x^3"))
        {
            y=s;
            tf.setText("( )^3");
        }
        else if(s.equals("sqrt"))
        {
            y=s;
            tf.setText("sqrt(");
        }
        else if(s.equals("cbrt"))
        {
            y=s;
            tf.setText("cbrt(");
        }
        else if(s.equals("|x|"))
        {
            y=s;
            tf.setText("abs(");
            c=2;
        }
        else if(s.charAt(0)>='0' && s.charAt(0)<='9'||s.charAt(0)=='.')
        {
            if(!s1.equals(""))
                s2=s2+s;
            else
                s0=s0+s;
            tf.setText(s0+s1+s2);
            x=tf.getText();
            System.out.println(x);
        }
        else if(ae.getSource()==b18)
        {
            s0=s1=s2="";
            tf.setText(s0+s1+s2);
        }

        else if(s.charAt(0)=='=')
        {

            if(s1.equals("+"))
            {
                te=(Double.parseDouble(s0)+Double.parseDouble(s2));
                tf.setText(s0+s1+s2+"="+te);
            }
            else if(s1.equals("-") && c<=1)
            {
                te=(Double.parseDouble(s0)-Double.parseDouble(s2));
                tf.setText(s0+s1+s2+"="+te);
            }
            else if(s1.equals("/"))
            {
                te=(Double.parseDouble(s0)/Double.parseDouble(s2));
                tf.setText(s0+s1+s2+"="+te);
            }
            else if(s1.equals("%"))
            {
                te=(Double.parseDouble(s0)%Double.parseDouble(s2));
                tf.setText(s0+s1+s2+"="+te);
            }
            else if(s1.equals("*"))
            {
                te=(Double.parseDouble(s0)*Double.parseDouble(s2));
                tf.setText(s0+s1+s2+"="+te);
            }
            else if(y.equals("2^x"))
            {
                te=Math.pow(2,Double.parseDouble(s0));
                tf.setText("2^("+s0+")="+te);
                y="";
            }
            else if(y.equals("x^2"))
            {
                te=Math.pow(Integer.parseInt(s0),2);
                //System.out.println(te);
                tf.setText("("+s0+") ^2 ="+te);
                y="";
            }
            else if(y.equals("x^3"))
            {
                te=Math.pow(Integer.parseInt(s0),3);
                //System.out.println(te);
                tf.setText("("+s0+") ^3 ="+te);
                y="";
            }
            else if(y.equals("sqrt"))
            {
                te=Math.sqrt(Integer.parseInt(s0));
                tf.setText("sqrt("+s0+") ="+te);
                y="";
            }
            else if(y.equals("cbrt"))
            {
                te=Math.cbrt(Integer.parseInt(s0));
                tf.setText("cbrt("+s0+") ="+te);
                y="";
            }
            else if(y.equals("|x|"))
            {
                //x=tf.getText();
                te=Double.parseDouble(x);
                System.out.println(te);
                te=Math.abs(te);
                System.out.println(te);
                tf.setText("abs("+x+") ="+te);
                y="";
            }
            else if(y.equals("x!"))
            {
                te=Double.parseDouble(s0);

                int er = 0;
                if (te < 0)
                {
                    er = 20;
                    te=0;
                }
                else{
                    double i, t = 1;
                    for (i = 2; i <= te; i += 1.0)
                        t *= i;
                    te= t;
                }
                tf.setText("("+s0+") ="+te);
                y="";
            }
            else if(y.equals("1/x"))
            {
                te=Double.parseDouble(s0);
                te=1/te;
                tf.setText("1/"+s0+"="+te);
                y="";
            }
            else if(y.equals("ln"))
            {
                te=Double.parseDouble(s0);
                te=Math.log(te);
                tf.setText("ln("+s0+")="+te);
                y="";
            }
            else if(y.equals("log"))
            {
                te=Double.parseDouble(s0);
                te=Math.log(te)/Math.log(10);
                tf.setText("log("+s0+")="+te);
                y="";
            }
            else if(y.equals("e^x"))
            {
                te=Double.parseDouble(s0);
                te=Math.exp(te);
                tf.setText("e("+s0+")="+te);
                y="";
            }
            else if(y.equals("sin"))
            {
                te=Double.parseDouble(s0);
                if(d==1)
                    te=Math.sin(te/57.2958);//deg
                else
                    te=Math.sin(te);//rad
                //te=Math.toRadians(te);}
                //te=Math.round(te*1000)/1000;
                //System.out.format("%.4f",te);
                tf.setText("sin("+s0+")="+te);
                y="";
                d=1;
            }
            else if(y.equals("cos"))
            {
                te=Double.parseDouble(s0);
                if(d==1)
                    te=Math.cos(te/57.2958);//deg
                else
                    te=Math.cos(te);//rad
                //te=Math.round(te*1000)/1000;
                tf.setText("cos("+s0+")="+te);
                y="";
                d=1;
            }
            else if(y.equals("tan"))
            {
                te=Double.parseDouble(s0);
                if(d==1)
                    te=Math.tan(te/57.2958);//deg
                else
                    te=Math.tan(te);//rad
                //te=Math.round(te*1000)/1000;
                tf.setText("tan("+s0+")="+te);
                y="";
                d=1;
            }
            else if(y.equals("sin^-1"))
            {
                te=Double.parseDouble(s0);
                if(d==1)
                    te=Math.asin(te/57.2958);//deg
                else
                    te=Math.asin(te);//rad
                //te=Math.toRadians(te);}
                //te=Math.round(te*1000)/1000;
                //System.out.format("%.4f",te);
                tf.setText("sin^-1("+s0+")="+te);
                y="";
                d=1;
            }
            else if(y.equals("cos^-1"))
            {
                te=Double.parseDouble(s0);
                if(d==1)
                    te=Math.acos(te/57.2958);//deg
                else
                    te=Math.acos(te);//rad
                //te=Math.round(te*1000)/1000;
                tf.setText("cos^-1("+s0+")="+te);
                y="";
                d=1;
            }
            else if(y.equals("tan^-1"))
            {
                te=Double.parseDouble(s0);
                if(d==1)
                    te=Math.atan(te/57.2958);//deg
                else
                    te=Math.atan(te);//rad
                //te=Math.round(te*1000)/1000;
                tf.setText("tan^-1("+s0+")="+te);
                y="";
                d=1;
            }
            else if(y.equals("sinh"))
            {
                te=Double.parseDouble(s0);
                if(d==1)
                    te=Math.sinh(te/57.2958);//deg
                else
                    te=Math.sinh(te);//rad
                //te=Math.toRadians(te);}
                //te=Math.round(te*1000)/1000;
                //System.out.format("%.4f",te);
                tf.setText("sinh("+s0+")="+te);
                y="";
                d=1;
            }
            else if(y.equals("cosh"))
            {
                te=Double.parseDouble(s0);
                if(d==1)
                    te=Math.cosh(te/57.2958);//deg
                else
                    te=Math.cosh(te);//rad
                //te=Math.round(te*1000)/1000;
                tf.setText("cosh("+s0+")="+te);
                y="";
                d=1;
            }
            else if(y.equals("tanh"))
            {
                te=Double.parseDouble(s0);
                if(d==1)
                    te=Math.tanh(te/57.2958);//deg
                else
                    te=Math.tanh(te);//rad
                //te=Math.round(te*1000)/1000;
                tf.setText("tanh("+s0+")="+te);
                y="";
                d=1;
            }
//            else if(y.equals("sinh^-1"))
//            {
//                te=Double.parseDouble(s0);
//                if(d==1)
//                    te=Math.asinh(te/57.2958);//deg
//                else
//                    te=Math.asinh(te);//rad
//                //te=Math.toRadians(te);}
//                //te=Math.round(te*1000)/1000;
//                //System.out.format("%.4f",te);
//                tf.setText("sinh^-1("+s0+")="+te);
//                y="";
//                d=1;
//            }
//            else if(y.equals("cosh^-1"))
//            {
//                te=Double.parseDouble(s0);
//                if(d==1)
//                    te=Math.acosh(te/57.2958);//deg
//                else
//                    te=Math.acosh(te);//rad
//                //te=Math.round(te*1000)/1000;
//                tf.setText("cosh^-1("+s0+")="+te);
//                y="";
//                d=1;
//            }
//            else
//            {
//                te=Double.parseDouble(s0);
//                if(d==1)
//                    te=Math.atanh(te/57.2958);//deg
//                else
//                    te=Math.atanh(te);//rad
//                //te=Math.round(te*1000)/1000;
//                tf.setText("tanh^-1("+s0+")="+te);
//                y="";
//                d=1;
//            }
            s0=Double.toString(te);
            s1=s2=" ";
        }
        else
        {
            if(s1.equals("")||s2.equals("")){
                s1=s;
                //System.out.println(s1);
            }
            else{
                if(s1.equals("+")) {
                    te=(Double.parseDouble(s0)+Double.parseDouble(s2));
                    s0=Double.toString(te);
                    s1=s;
                    s2="";
                    tf.setText(s0+s1+s2);
                }
                else if(s1.equals("-")&&c<=1) {
                    te=(Double.parseDouble(s0)-Double.parseDouble(s2));
                    s0=Double.toString(te);
                    s1=s;
                    s2="";
                    tf.setText(s0+s1+s2);
                }
                else if(s1.equals("/")) {
                    te=(Double.parseDouble(s0)/Double.parseDouble(s2));
                    s0=Double.toString(te);
                    s1=s;
                    s2="";
                    tf.setText(s0+s1+s2);
                }
                else if(s1.equals("%")) {
                    te=(Double.parseDouble(s0)%Double.parseDouble(s2));
                    s0=Double.toString(te);
                    s1=s;
                    s2="";
                    tf.setText(s0+s1+s2);
                }
                else
                {
                    te=(Double.parseDouble(s0)*Double.parseDouble(s2));
                    s0=Double.toString(te);
                    s1=s;
                    s2="";
                    tf.setText(s0+s1+s2);
                }


            }
        }
    }
    public static void main(String[] args)
    {

        J j=new J();
    }
}
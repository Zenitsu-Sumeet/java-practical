import java.awt.*;
import java.awt.event.*;

class string extends Frame implements ActionListener{
        TextField tf;
        Button b;
        Label n,l,r;
        string()
        {
            n = new Label("awt");
            l = new Label("ENTER THE STRING");
            r = new Label();
            tf = new TextField();
            b = new Button("reverse");
            n.setBounds(30, 40, 200, 20);
            l.setBounds(30, 70, 150, 20);
            r.setBounds(30, 170, 200, 20);  
            tf.setBounds(30, 90, 190, 30);
            b.setBounds(30, 130, 190, 30);
            add(n);
            add(l);
            add(r);
            add(tf);
            add(b);
            



        }
}
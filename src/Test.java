import java.awt.event.*;
import javax.swing.*;

class Test extends JFrame implements ActionListener
{
    JLabel l;
    JLabel l1;
    JRadioButton jb[]=new JRadioButton[5];
    JButton b1,b2;
    ButtonGroup bg;
    int count=0,current=0,x=1,y=1,now=0;
    int m[]=new int[10];
    Test(String s)
    {
        super(s);
        l=new JLabel();
        add(l);
        bg=new ButtonGroup();
        for(int i=0;i<5;i++)
        {
            jb[i]=new JRadioButton();
            add(jb[i]);
            bg.add(jb[i]);
        }
        b1=new JButton("Dalej");
        b2=new JButton("Bookmark");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);
        set();
        l.setBounds(30,40,450,20);
        jb[0].setBounds(50,80,400,20);
        jb[1].setBounds(50,110,400,20);
        jb[2].setBounds(50,140,400,20);
        jb[3].setBounds(50,170,400,20);
        b1.setBounds(100,240,100,30);
        b2.setBounds(270,240,100,30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
        setSize(640,480);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            if(check())
                count=count+1;
            current++;
            set();
            if(current==5)
            {
                add(b2);
                b1.setEnabled(false);
                b2.setText("Wynik");
            }
        }

        if(e.getActionCommand().equals("Wynik"))
        {
            if(check())
                count=count+1;
            current++;

            //System.out.println("correct ans="+count);
            JOptionPane.showMessageDialog(this,"Zdobyte punkty: "+count);
            if (count >= 3) {
                openWebPage("https://ae01.alicdn.com/kf/HTB1pjKlJpXXXXcDXFXXq6xXFXXX2/20-PC-12-Inch-Latex-Balloons-Globos-Party-Air-Balloons-Birthday-Decoration-Ballons-Pink-Purple-Party.jpg_640x640.jpg");
            }

            System.exit(0);
        }
    }
    void set()
    {
        jb[4].setSelected(true);
        if(current==0)
        {
            l.setText("Wybitny polski astronom to:");
            jb[0].setText("Robert Lewandowski");jb[1].setText("Mikołaj Kopernik");jb[2].setText("Kaczor Donald");jb[3].setText("Blowek");
        }
        if(current==1)
        {
            l.setText("Jak nazywa się galaktyka, w której znajduje się nasz układ słoneczny?");
            jb[0].setText("Morskie Oko");jb[1].setText("EGS-zs8-1");jb[2].setText("Droga Mleczna");jb[3].setText("Słoneczna Kraina");
        }
        if(current==2)
        {
            l.setText("Które z wymienionych ciał niebieskich jest gwiazdą?");
            jb[0].setText("Ziemia");jb[1].setText("Merkury");jb[2].setText("Mars");jb[3].setText("Słońce");
        }
        if(current==3)
        {
            l.setText("Jak nazywa się firma Elona Muska produkująca rakiety kosmiczne?");
            jb[0].setText("SpaceX");jb[1].setText("Apple");jb[2].setText("Tesla");jb[3].setText("Złomex");
        }
        if(current==4)
        {
            l.setText("Ile planet znajduje się w naszym Układzie Słonecznym?");
            jb[0].setText("9");jb[1].setText("11");jb[2].setText("8");jb[3].setText("2");
        }
        if(current==5)
        {
            l.setText("Na którą z wymienionych planet dotarli ludzie?");
            jb[0].setText("Jowisz");jb[1].setText("Mars");jb[2].setText("Na żadną :(");jb[3].setText("Saturn");
        }

        l.setBounds(30,40,550,20);
        for(int i=0,j=0;i<=90;i+=30,j++)
            jb[j].setBounds(50,80+i,500,20);
    }
    boolean check()
    {
        if(current==0)
            return(jb[1].isSelected());
        if(current==1)
            return(jb[2].isSelected());
        if(current==2)
            return(jb[3].isSelected());
        if(current==3)
            return(jb[0].isSelected());
        if(current==4)
            return(jb[2].isSelected());
        if(current==5)
            return(jb[2].isSelected());
        return false;
    }

    public void openWebPage(String url){
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }
        catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
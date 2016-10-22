/**
 * Created by rylan on 22/10/2016.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMovieFrame extends JFrame implements ActionListener
{
    JButton northButton = new JButton("North by Northwest");
    JButton southButton = new JButton("South Pacific");
    JButton eastButton = new JButton("East");
    JButton westButton = new JButton("West Side Story");
    JButton centerButton = new JButton("Journey to the Center of the Earth");
    JLabel northLabel = new JLabel("          1959, Cary Grant");
    JLabel southLabel = new JLabel("          1958, Mary Martin");
    JLabel eastLabel = new JLabel("2011, Nancy Boo Orchis-Evans   ");
    JLabel westLabel = new JLabel("1961, Natalie Wood   ");
    JLabel centerLabel = new JLabel("         1993, David Dundara");
    public JMovieFrame()
    {
        setTitle("JMovieFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(westButton,"West");
        add(centerButton,"Center");
        add(eastButton,"East");
        add(northButton,"North");
        add(southButton,"South");
        eastButton.addActionListener(this);
        centerButton.addActionListener(this);
        westButton.addActionListener(this);
        northButton.addActionListener(this);
        southButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if(source == northButton)
        {
            remove(northButton);
            add(northLabel, BorderLayout.NORTH);
        }
        else
        if(source == southButton)
        {
            remove(southButton);
            add(southLabel, BorderLayout.SOUTH);
        }
        else
        if(source == eastButton)
        {
            remove(eastButton);
            add(eastLabel, BorderLayout.EAST);
        }
        else
        if(source == westButton)
        {
            remove(westButton);
            add(westLabel, BorderLayout.WEST);
        }
        else
        {
            remove(centerButton);
            add(centerLabel, BorderLayout.CENTER);
        }
        invalidate();
        validate();
    }
    public static void main(String[] args)
    {
        JMovieFrame movieFrame = new JMovieFrame();
        movieFrame.setSize(650,300);
        movieFrame.setVisible(true);
    }
}
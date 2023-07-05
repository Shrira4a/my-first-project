package by.itstep.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Date;

public class Test
{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("My App");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1200,300);

        JButton button=new JButton();
        button.setText("Push me");
        button.setSize(120,20);

        frame.setLayout(null);
        frame.add(button);

        JLabel label=new JLabel("Name:");
        JTextField field=new JTextField();
        label.setBounds(40,65,120,20);
        field.setBounds(40,90,120,20);


        frame.add(label);
        frame.add(field);


        JLabel lab=new JLabel("Name:");
        JTextField fi=new JTextField();
        lab.setBounds(40,115,120,20);
        fi.setBounds(40,130,120,20);

        frame.add(lab);
        frame.add(fi);

        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println(new Date()+": click");
                String name=field.getText();
                System.out.println("Hello "+name);

                fi.setText("Hello"+name);

            }
        });
        frame.setVisible(true);

    }
}
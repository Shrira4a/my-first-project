package by.itstep.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Date;



public class GuessNumberJFrame extends JFrame {
    public String m;
    private int i = 3;

    public GuessNumberJFrame() {
        this.setTitle("Black Box");
        setLayout(null);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(800, 200, 500, 500);

        JLabel label = new JLabel("From:");
        JTextField field = new JTextField();
        label.setBounds(40, 65, 120, 20);
        field.setBounds(40, 90, 120, 20);

        JLabel lbl = new JLabel("To:");
        JTextField fi = new JTextField();
        lbl.setBounds(330, 65, 120, 20);
        fi.setBounds(330, 90, 120, 20);

        JLabel lbla = new JLabel("The number of tries: 3");
        lbla.setBounds(40, 10, 140, 20);


        JButton button = new JButton();
        button.setText("Generate");
        button.setBounds(180, 400, 120, 20);
        button.getColorModel();

        JButton buttons = new JButton();
        buttons.setText("Yes");
        buttons.setBounds(300, 350, 120, 20);
        buttons.getColorModel();
        buttons.setVisible(false);

        JButton buttonss = new JButton();
        buttonss.setText("No");
        buttonss.setBounds(50, 350, 120, 20);
        buttonss.getColorModel();
        buttonss.setVisible(false);

        add(buttons);
        add(buttonss);


        add(label);
        add(field);
        add(lbl);
        add(fi);
        add(lbla);
        add(button);


        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String one = field.getText();
                int o = Integer.parseInt(one);
                String two = fi.getText();
                int t = Integer.parseInt(two);
                int mat = (int) (Math.random() * t) + o;
                m = String.valueOf(mat);
                lbla.setText("The number of tries: " + i);
                i--;

                if (i == -1) {
                    lbla.setText("YOU LOSE >:^)");

                    button.setVisible(false);
                    buttons.setVisible(true);
                    buttonss.setVisible(true);

                }
            }

        });

        buttons.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setVisible(true);
                buttons.setVisible(false);
                buttonss.setVisible(false);
                i=3;
                String one = field.getText();
                int o = Integer.parseInt(one);
                String two = fi.getText();
                int t = Integer.parseInt(two);
                int mat = (int) (Math.random() * t) + o;
                m = String.valueOf(mat);
                lbla.setText("The number of tries: " + i);
                i--;

                if (i == -1) {
                    lbla.setText("YOU LOSE >:^)");

                    button.setVisible(true);
                    buttons.setVisible(false);
                    buttonss.setVisible(false);

                }
            }
        });

        buttonss.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setVisible(false);
                buttons.setVisible(false);
                buttonss.setVisible(false);
            }
        });


    }
}




class Player
{
    public static void main(String[] args) {
        GuessNumberJFrame game=new GuessNumberJFrame();
        JLabel lbl2=new JLabel("Your guess:");
        JTextField fi2=new JTextField();
        lbl2.setBounds(180,180,140,20);
        fi2.setBounds(180,200,140,20);


        JLabel lbl3=new JLabel("My Answer:");
        JTextField fi3=new JTextField();
        lbl3.setBounds(180,240,140,20);
        fi3.setBounds(180,260,140,20);

        JButton button1=new JButton();
        button1.setText("Guess");
        button1.setBounds(180,300,120,20);


            button1.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 0; i < 3; i++) {
                        if (fi2.getText().equals(game.m) && !fi2.getText().equals("") && i!=-1) {
                            fi3.setText("Hehe,right. You won");
                            button1.setVisible(false);
                        } else if (!(fi2.getText().equals(game.m)) && !fi2.getText().equals("")) {
                            fi3.setText("Wrong, it's " + game.m);
                        }
                    }
                }

            });


        game.add(lbl2);
        game.add(fi2);

        game.add(lbl3);
        game.add(fi3);

        game.add(button1);



        game.setVisible(true);



    }
}

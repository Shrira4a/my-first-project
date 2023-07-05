package by.itstep.swing.films;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Date;

public class FilmsApp extends JFrame
{
    private static Film[] db=new Film[128];

    private static int position=0;
    private static int filmsNumber=0;

    private JLabel uidLbl=new JLabel("ID:");
    private JLabel imdbRateLbl=new JLabel("Rate:");
    private JLabel nameLbl=new JLabel("Name:");
    private JLabel typeLbl=new JLabel("Type:");
    private JLabel dateLbl=new JLabel("Date:");
    private JLabel actorLbl=new JLabel("Actors:");
    private JLabel boxLbl=new JLabel("The box office: ");
    private JLabel cLbl=new JLabel("The country:");

    private JLabel statusLbl=new JLabel("The status:");

    private JTextField uidText=new JTextField();
    private JTextField imdbRateText=new JTextField();
    private JTextField nameText=new JTextField();
    private JTextField typeText=new JTextField();
    private JTextField dateText=new JTextField();
    private JTextField actorText=new JTextField();
    private JTextField boxText=new JTextField();
    private JTextField cText=new JTextField();

    static {
        Actor actor1 = new Actor(123, "Keanu Reeves");
        Actor actor2 = new Actor(324, "Laurence Fishburne");
        Actor actor3 = new Actor(451, "Carrie-Annie Moss");

        Actor[] actors = {actor1, actor2, actor3};
        Actor[] actors2 = {new Actor(133, ""), new Actor(334, ""), new Actor(461, "")};
        Actor[] actors3 = {new Actor(143, ""), new Actor(344, ""), new Actor(471, "")};

        Film film1 = new Film(321, 9.5, "Matrix", "Action", new Date(), actors, 900, "USA");
        Film film2 = new Film(432, 7.1, "Interception", "Action", new Date(), actors2, 400, "USA");
        Film film3 = new Film(654, 8.7, "Interstellar", "Sci-Fi", new Date(), actors3, 700, "USA");

        db[0] = film1;
        db[1] = film2;
        db[2] = film3;

        filmsNumber=3;


    }
    public FilmsApp (){

        setTitle("Cntrl Theatre");
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(600, 100, 800, 800);

        statusLbl.setBounds(20,10,300,20);
        uidLbl.setBounds(10,40,120,20);
        imdbRateLbl.setBounds(10,65,120,20);
        nameLbl.setBounds(10,85,120,20);
        typeLbl.setBounds(10,105,120,20);
        dateLbl.setBounds(10,125,120,20);
        actorLbl.setBounds(10,145,120,20);
        boxLbl.setBounds(10,165,120,20);
        cLbl.setBounds(10,185,120,20);


        uidText.setBounds(100,40,120,20);
        imdbRateText.setBounds(100,65,120,20);
        nameText.setBounds(100,85,120,20);
        typeText.setBounds(100,105,120,20);
        dateText.setBounds(100,125,120,20);
        actorText.setBounds(100,145,120,20);
        boxText.setBounds(100,165,120,20);
        cText.setBounds(100,185,120,20);


        //buttons: Back Next Remove Update

        JButton buttonNext = new JButton();
        buttonNext.setText("Next");
        buttonNext.setBounds(140 , 300 , 100 , 20);



        JButton buttonBack = new JButton();
        buttonBack.setText("Back");
        buttonBack.setBounds(20 , 300 , 100 , 20);



        JButton buttonAdd = new JButton();
        buttonAdd.setText("Add");
        buttonAdd.setBounds(370 , 300 , 100 , 20);

        JButton buttonSave = new JButton();
        buttonSave.setText("Save");
        buttonSave.setBounds(370 , 500 , 100 , 20);
        buttonSave.setVisible(false);


        JLabel searchLbl=new JLabel("Find:");
        searchLbl.setBounds(310,20,60,20);
        JTextField searchText=new JTextField();
        searchText.setBounds(340,20,100,20);
        JButton buttonGo = new JButton();
        buttonGo.setText("Go");
        buttonGo.setBounds(460 , 20 , 60, 20);



        JButton buttonRemove = new JButton();
        buttonRemove.setText("Remove");
        buttonRemove.setBounds(340 , 340 , 80, 30);



        JButton buttonUpdate = new JButton();
        buttonUpdate.setText("Update");
        buttonUpdate.setBounds(440 , 340 , 80, 30);

        loadFilm();
        buttonBack.setEnabled(false);

        boarding(buttonNext ,buttonBack ,buttonAdd ,buttonGo ,buttonRemove , buttonUpdate,searchLbl,searchText,buttonSave);
        boarding(uidLbl,imdbRateLbl,nameLbl,typeLbl,dateLbl,actorLbl,boxLbl,cLbl,statusLbl);
        boarding(uidText,imdbRateText,nameText,typeText,dateText,actorText,boxText,cText);

        uidText.setText(db[position].getUid()+"");
        imdbRateText.setText(db[position].getImdbRate()+"");
        nameText.setText(db[position].getName()+"");
        typeText.setText(db[position].getType()+"");
        dateText.setText(db[position].getReleaseDate()+"");
        actorText.setText(db[position].getActor()[position].toString()+"");
        boxText.setText(db[position].getBoxOffice()+"");
        cText.setText(db[position].getCountry()+"");


        //click actions

        buttonNext.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                position++;
                if(position<filmsNumber) {
                    loadFilm();
                }
                else
                {
                    buttonNext.setEnabled(false);

                }
                buttonBack.setEnabled(true);

                if(position==filmsNumber-1)
                {
                    buttonNext.setEnabled(false);
                }
            }

        });

        buttonBack.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                position--;
                if(position<filmsNumber && filmsNumber>0) {
                    loadFilm();
                    buttonNext.setEnabled(true);
                }
                else
                {
                    buttonBack.setEnabled(false);
                }
                 if(position==0)
                 {
                     buttonBack.setEnabled(false);
                 }


            }
        });

        buttonUpdate.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Film film=new Film();
                db[position]=getFilm();
                statusLbl.setText("Film with uid "+film.getUid()+" has been changed successfully");

            }
        });

        buttonAdd.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                uidText.setText("");
                imdbRateText.setText("");
                nameText.setText("");
                typeText.setText("");
                dateText.setText("");
                actorText.setText("");
                boxText.setText("");
                cText.setText("");
                buttonAdd.setVisible(false);
                buttonSave.setVisible(true);
                if(uidText==null)
                {
                    statusLbl.setText("Some fields are clear");
                }


            }
        });

        buttonSave.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Film film=new Film();
              db[filmsNumber++]=film;
              statusLbl.setText("Film with UID "+film.getUid()+"has been saved");

            }
        });
        setVisible(true);
    }
    private void boarding(Component... components)
    {
        for(Component c:components)
        {
            add(c);
        }
    }

    private void loadFilm()
    {
        uidText.setText(db[position].getUid()+"");
        imdbRateText.setText(db[position].getImdbRate()+"");
        nameText.setText(db[position].getName()+"");
        typeText.setText(db[position].getType()+"");
        dateText.setText(db[position].getReleaseDate()+"");
        actorText.setText(db[position].getActor()[position].toString()+"");
        boxText.setText(db[position].getBoxOffice()+"");
        cText.setText(db[position].getCountry()+"");
    }

    private Film getFilm()
    {
        Film film=new Film();
        film.setUid(Long.parseLong(uidText.getText()));
        film.setImdbRate(Double.parseDouble(imdbRateText.getText()));
        film.setName(nameText.getText());
        film.setType(typeText.getText());
        film.setReleaseDate(new Date());

        Actor[] actors=new Actor[1];
        Actor actor=new Actor(actorText.getText());
        actors[0]=actor;

        film.setActor(actors);
        return film;
    }

    public static void main(String[] args) {
        new FilmsApp();

    }


}

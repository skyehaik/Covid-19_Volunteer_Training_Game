// import statements for JFrame
import javax.swing.*;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;


public class ISPGame {
   // Global variables
  /* 
       
                   Variable List 
    Name               Type             Purpose  
                   |                 |
    --------------------------------------------------------------------------------------------
    pink           |   Color         |   Holds the value for the pink color
    lightPink      |   Color         |   Holds the value for the light pink color
    purple         |   Color         |   Holds the value for the purple color
    black          |   Color         |   Holds the value for the black color
    white          |   Color         |   Holds the value for the white color
    lightBlue      |   Color         |   Holds the value for the light blue color 
    green          |   Color         |   Holds the value for the green color
    yellow         |   Color         |   Holds the value for the yellow color
    grey           |   Color         |   Holds the value for the grey color  
    orange         |   Color         |   Holds the value for the orange color 
    red            |   Color         |   Holds the value for the red color
    darkBlue       |   Color         |   Holds the value for the dark blue color
    border         |   BufferedImage |   Holds the value for the border image
    title          |   Font          |   Holds the value for the title font
    subtitle       |   Font          |   Holds the value for the subtitle font 
    bodyText       |   Font          |   Holds the value for the body text font
    frame1         |   JFrame        |   Frame variable storing the first frame
    frame2         |   JFrame        |   Frame variable storing the second frame
    frame3         |   JFrame        |   Frame variable storing the third frame
    frame4         |   JFrame        |   Frame variable storing the fourth frame
    frame5         |   JFrame        |   Frame variable storing the fifth frame
    frame8         |   JFrame        |   Frame variable storing the eigth frame
    frame9         |   JFrame        |   Frame variable storing the ninth frame
    frame10        |   JFrame        |   Frame variable storing the tenth frame
    frame11        |   JFrame        |   Frame variable storing the eleventh frame
    frame6         |   MovingPerson2 |   Moving person 2 variable storing the sixth frame
    frame7         |   MovingPerson  |   Moving person variable storing the seventh frame
    b1             |   JButton       |   Button variable storing the first menu option button
    b2             |   JButton       |   Button variable storing the second menu option button
    b3             |   JButton       |   Button variable storing the third menu option button
    b4             |   JButton       |   Button variable storing the fourth menu option button
    yes            |   JButton       |   Button variable storing the yes quit option button
    no             |   JButton       |   Button variable storing the no quit option button
    people         |   JButton       |   Button variable storing the people learn level button
    couple         |   JButton       |   Button variable storing the couple learn level button
    fridge         |   JButton       |   Button variable storing the fridge learn level button
    shelf          |   JButton       |   Button variable storing the shelf learn level button
    back1          |   JButton       |   Button variable storing the back to menu instructions option button
    exit           |   JButton       |   Button variable storing the exit goodbye option button
    replay         |   JButton       |   Button variable storing the replay learn level option button
    continue1      |   JButton       |   Button variable storing the continuw to main menu learn level option button
    mainMenu1      |   JButton       |   Button variable storing the return to main menu congrats option button
    mainMenu2      |   JButton       |   Button variable storing the return to main menu game over option button
    masks          |   JButton       |   Button variable storing the mask test level button
    glove          |   JButton       |   Button variable storing the gloves test level button
    masks2         |   JButton       |   Button variable storing the mask learn level button
    glove2         |   JButton       |   Button variable storing the gloves learn level button
    yes2           |   JButton       |   Button variable storing the yes to quit test level option button
    no2            |   JButton       |   Button variable storing the no to quit test level option button
    nonfictionShelf|   JButton       |   Button variable storing the non fiction shelf in the test level button
    fictionShelf   |   JButton       |   Button variable storing the fiction shelf in the test level button
    bed1           |   JButton       |   Button variable storing the first bed in the test level button
    bed2           |   JButton       |   Button variable storing the second bed in the test level button
    window1        |   JButton       |   Button variable storing the first window in the test level button
    window2        |   JButton       |   Button variable storing the second window in the test level button
    elderlyCouple  |   JButton       |   Button variable storing the elderly couple in the test level button
    couchElderly   |   JButton       |   Button variable storing the couch elderly people in the test level button
    benchElderly   |   JButton       |   Button variable storing the bench elderly people in the test level button
    ok             |   JButton       |   Button variable storing the ok in the warning option button
    next           |   JButton       |   Button variable storing the next in the learn level option button
    y              |   int           |   Integer variable storing the y value for an image
    y2             |   int           |   Integer variable storing the y value for a second image
    x1             |   int           |   Integer variable storing the x value for an image
    x2             |   int           |   Integer variable storing the x value for a second image
    moveCount      |   int           |   Integer variable storing the number of moves the avatar has made in the learn level
    time           |   int           |   Integer variable storing the number of screens within the learn level
    maskCount      |   int           |   Integer variable storing the number of times the test level mask button has been pressed
    gloveCount     |   int           |   Integer variable storing the number of times the test level glove button has been pressed
    maskCount2     |   int           |   Integer variable storing the number of times the learn level mask button has been pressed
    gloveCount2    |   int           |   Integer variable storing the number of times the learn level glove button has been pressed
    obstacles      |   int           |   Integer variable storing the number of obstacles the player has completed
    inOut          |   int           |   Integer variable storing the number of times the couple button has been pressed in the learn level
    screenNum      |   int           |   Integer variable storing the screen version for the congrats method
    drawFood       |   boolean       |   Boolean variable storing whether or not food should be drawn in the learn level
    isClean        |   boolean       |   Boolean variable storing whether or not the shelf has been cleaned in the learn level
  */

    Color pink = new Color (250, 222, 244);
    Color lightPink = new Color (247, 208, 243);
    Color purple = new Color (210, 172, 227);
    Color black = new Color (0, 0, 0);
    Color white = new Color (255, 255, 255);
    Color lightBlue = new Color (166, 216, 255);
    Color green = new Color (125, 245, 141);
    Color yellow = new Color (255, 211, 51);
    Color grey = new Color (191, 191, 191);
    Color orange = new Color(255, 117, 48);
    Color red = new Color(250, 0, 0);
    Color darkBlue = new Color(61, 171, 255);
    BufferedImage border = null;
    Font title = new Font ("Serif", Font.  PLAIN, 80);
    Font subtitle = new Font ("Serif", Font.PLAIN, 40);
    Font bodyText = new Font ("Serif", Font.PLAIN, 20);
    JFrame frame1, frame2, frame3, frame4, frame5, frame8, frame9, frame10, frame11;
    MovingPerson frame7;
    MovingPerson2 frame6;
    int y=800;
    int y2 = 200;
    int x1=1210;
    int x2=-310;
    int moveCount = 1;
    int time = 0;
    JButton b1, b2, b3, b4, yes, no, people, couple, fridge, shelf, back1, exit, replay, continue1, mainMenu1, mainMenu2, masks, glove, masks2, glove2, yes2, no2, nonfictionShelf, fictionShelf, bed1, bed2, window1, window2, elderlyCouple, couchElderly, benchElderly, ok, next;
    int maskCount = 0;
    int gloveCount = 0;
    int maskCount2 = 0;
    int gloveCount2 = 0;
    int obstacles = 0;
    int inOut = 0;
    int screenNum = 0;
    boolean drawFood = false;
    boolean isClean = false;
 
    public ISPGame() {
        // creating objects of every class
        SplashScreen splashScreen = new SplashScreen();
        MainMenu mainMenu = new MainMenu();
        Instructions intro = new Instructions();
        Quit quit = new Quit();
        Goodbye goodbye = new Goodbye();
        LearnLevel learn = new LearnLevel();
        Congrats congrats = new Congrats();
        GameOver gameOver = new GameOver();
        ExitTestLevel exitTest = new ExitTestLevel();
        Warning warning = new Warning();
       
        // creating a frame for the SplashScreen class and calling its methods
        frame1 = new JFrame ("ISP Game");
        frame1.setSize (1200, 800);
        frame1.getContentPane().add(BorderLayout.CENTER, splashScreen);
        frame1.setVisible (true);
        moveGrass();
        moveElderly();
  
        // creating a frame for the MainMenu class and calling its methods
        frame2 = new JFrame ("Main Menu");
        frame2.setSize (1200, 800);
        frame2.getContentPane().add (BorderLayout.CENTER, mainMenu);
        b1 = new JButton("Instructions");
        b1.setBounds(425, 210, 350, 80);
        b2 =new JButton("Play Learn Level");
        b2.setBounds(425, 310, 350, 80);
        b3 =new JButton("Play Test Level");
        b3.setBounds(425, 410, 350, 80);
        b4 =new JButton("Quit");
        b4.setBounds(425, 510, 350, 80);
        mainMenu.setLayout(null);
        mainMenu.add(b1);
        mainMenu.add(b2);
        mainMenu.add(b3);
        mainMenu.add(b4);
        frame2.setVisible (true);
        frame1.dispose();
        mainMenu.mySetupFunction();
  
        // creating a frame for the Instructions class and calling its methods
        frame3 = new JFrame ("Instructions");
        frame3.setSize (1200, 800);
        frame3.getContentPane().add(BorderLayout.CENTER, intro);
        back1 = new JButton("Back to Main Menu");
        back1.setBounds(60, 560, 220, 60);
        intro.setLayout(null);
        intro.add(back1);
        intro.mySetupFunction();
  
        // creating a frame for the Quit class and calling its methods
        frame4 = new JFrame ("Quit");
        frame4.setSize (1200, 800);
        frame4.getContentPane().add(BorderLayout.CENTER, quit);
        yes = new JButton("Yes");
        yes.setBounds(300, 380, 250, 80);
        no = new JButton("No");
        no.setBounds(650, 380, 250, 80);
        quit.setLayout(null);
        quit.add(no);
        quit.add(yes);
        quit.mySetupFunction();
  
        // creating a frame for the Goodbye class and calling its methods
        frame5 = new JFrame ("Goodbye");
        frame5.setSize (1200, 800);
        frame5.getContentPane().add(BorderLayout.CENTER, goodbye);
        exit = new JButton("Press to Exit");
        exit.setBounds(880, 540, 220, 60);
        goodbye.setLayout(null);
        goodbye.add(exit);
        goodbye.mySetupFunction();
  
        // creating a frame for the LearnLevel class and calling its methods
        frame6 = new MovingPerson2();
        frame6.setResizable(false);
        frame6.setSize (1200, 800);
        frame6.setMinimumSize(new Dimension(1200, 800));
        frame6.getContentPane().add(BorderLayout.CENTER, frame6.draw2);
        frame6.pack();
       
        // creats the buttons
        continue1 = new JButton("Continue to Main Menu");
        continue1.setBounds(880, 540, 220, 60);
        continue1.setVisible(false);
        replay = new JButton("Replay");
        replay.setBounds(580, 540, 220, 60);
        replay.setVisible(false);
        next = new JButton("Press to Continue");
        next.setBounds(880, 400, 220, 60);
        masks2 = new JButton();
        masks2.setBounds(515,290,170,140);
        glove2 = new JButton();
        glove2.setBounds(315,290,170,140);
        fridge = new JButton();
        fridge.setBounds(415,241,150,210);
        people = new JButton();
        people.setBounds(500, 260, 210, 190);
        shelf = new JButton();
        shelf.setBounds(485, 250, 230, 210);
        couple = new JButton();
        couple.setBounds(500, 250, 200, 210);
      
        // imports the images for the icons
        try {
            Image image = ImageIO.read(new File("mask.png")).getScaledInstance(90, 60, Image.SCALE_DEFAULT);
            masks2.setIcon(new ImageIcon(image));
            Image image2 = ImageIO.read(new File("gloves.png")).getScaledInstance(90, 60, Image.SCALE_DEFAULT);
            glove2.setIcon(new ImageIcon(image2));
            Image image3 = ImageIO.read(new File("fridge.png")).getScaledInstance(100, 180, Image.SCALE_DEFAULT);
            fridge.setIcon(new ImageIcon(image3));
            Image image4 = ImageIO.read(new File("manOnBench.png")).getScaledInstance(250, 200, Image.SCALE_DEFAULT);
            people.setIcon(new ImageIcon(image4));
            Image image5 = ImageIO.read(new File("shelf.png")).getScaledInstance(250, 200, Image.SCALE_DEFAULT);
            shelf.setIcon(new ImageIcon(image5));
            Image image6 = ImageIO.read(new File("elderlyWalking2.png")).getScaledInstance(200, 210, Image.SCALE_DEFAULT);
            couple.setIcon(new ImageIcon(image6));
        }
        catch (Exception e) {
        }
  
        // draws the buttons
        masks2.setBackground(black);
        masks2.setOpaque(true);
        masks2.setBorderPainted(false);
        masks2.setVisible(false);
     
        fridge.setBackground(white);
        fridge.setOpaque(true);
        fridge.setBorderPainted(false);
        fridge.setVisible(false);
  
        glove2.setBackground(black);
        glove2.setOpaque(true);
        glove2.setBorderPainted(false);
        glove2.setVisible(false);
     
        people.setBackground(white);
        people.setOpaque(true);
        people.setBorderPainted(false);
        people.setVisible(false);
     
        shelf.setBackground(white);
        shelf.setOpaque(true);
        shelf.setBorderPainted(false);
        shelf.setVisible(false);
     
        couple.setBackground(white);
        couple.setOpaque(true);
        couple.setBorderPainted(false);
        couple.setVisible(false);
      
        // adds buttons to the learn level
        frame6.draw2.setLayout(null);
        frame6.draw2.add(continue1);
        frame6.draw2.add(replay);
        frame6.draw2.add(next);
        frame6.draw2.add(masks2);
        frame6.draw2.add(glove2);
        frame6.draw2.add(fridge);
        frame6.draw2.add(people);
        frame6.draw2.add(shelf);
        frame6.draw2.add(couple);
        frame6.mySetupFunction();
  
        // creating a frame for the TestLevel class and calling its methods
        frame7 =  new MovingPerson ();
        frame7.setResizable(false);
        frame7.setSize (1200, 800);
        frame7.setMinimumSize(new Dimension(1200, 800));
        frame7.getContentPane().add(BorderLayout.CENTER, frame7.draw);
        frame7.pack();
       
        // creates the new buttons
        masks = new JButton();
        masks.setBounds(150,15,100,70);
        glove = new JButton();
        glove.setBounds(20,15,100,70);
        nonfictionShelf = new JButton();
        nonfictionShelf.setBounds(1070, 360, 100, 180);
        fictionShelf = new JButton();
        fictionShelf.setBounds(935, 360, 100, 180);
        elderlyCouple = new JButton();
        elderlyCouple.setBounds(805, 150, 100, 160);
        bed1 = new JButton();
        bed1.setBounds(10, 150, 120, 140);
        bed2 = new JButton();
        bed2.setBounds(1070, 150, 120, 140);
        window1 = new JButton();
        window1.setBounds(920, 105, 140, 90);
        window2 = new JButton();
        window2.setBounds(150, 105, 140, 90);
        couchElderly = new JButton();
        couchElderly.setBounds(20, 390, 170, 150);
        benchElderly = new JButton();
        benchElderly.setBounds(920, 570, 250, 200);
        
        // imports the images for the icons
        try {
            Image image = ImageIO.read(new File("mask.png")).getScaledInstance(90, 60, Image.SCALE_DEFAULT);
            masks.setIcon(new ImageIcon(image));
            Image image2 = ImageIO.read(new File("gloves.png")).getScaledInstance(90, 60, Image.SCALE_DEFAULT);
            glove.setIcon(new ImageIcon(image2));
            Image image3 = ImageIO.read(new File("bookshelf.png")).getScaledInstance(100, 180, Image.SCALE_DEFAULT);
            nonfictionShelf.setIcon(new ImageIcon(image3));
            fictionShelf.setIcon(new ImageIcon(image3));
            Image image4 = ImageIO.read(new File("standingElderly.png")).getScaledInstance(150, 160, Image.SCALE_DEFAULT);
            elderlyCouple.setIcon(new ImageIcon(image4));
            Image image5 = ImageIO.read(new File("bed.png")).getScaledInstance(120, 210, Image.SCALE_DEFAULT);
            bed1.setIcon(new ImageIcon(image5));
            bed2.setIcon(new ImageIcon(image5));
            Image image6 = ImageIO.read(new File("window.png")).getScaledInstance(150, 100, Image.SCALE_DEFAULT);
            window1.setIcon(new ImageIcon(image6));
            window2.setIcon(new ImageIcon(image6));
            Image image7 = ImageIO.read(new File("couchElderly.png")).getScaledInstance(170, 150, Image.SCALE_DEFAULT);
            couchElderly.setIcon(new ImageIcon(image7));
            Image image8 = ImageIO.read(new File("manOnBench.png")).getScaledInstance(250, 200, Image.SCALE_DEFAULT);
            benchElderly.setIcon(new ImageIcon(image8));
        }
        catch (Exception e) {
        }
  
        // draws the buttons
        masks.setBackground(black);
        masks.setOpaque(true);
        masks.setBorderPainted(false);

        glove.setBackground(black);
        glove.setOpaque(true);
        glove.setBorderPainted(false);
  
        nonfictionShelf.setBackground(white);
        nonfictionShelf.setOpaque(true);
        nonfictionShelf.setBorderPainted(false);
  
        fictionShelf.setBackground(white);
        fictionShelf.setOpaque(true);
        fictionShelf.setBorderPainted(false);
  
        elderlyCouple.setBackground(lightBlue);
        elderlyCouple.setOpaque(true);
        elderlyCouple.setBorderPainted(false);
  
        bed1.setBackground(lightBlue);
        bed1.setOpaque(true);
        bed1.setBorderPainted(false);
        bed2.setBackground(lightBlue);
        bed2.setOpaque(true);
        bed2.setBorderPainted(false);
  
        window1.setBackground(lightBlue);
        window1.setOpaque(true);
        window1.setBorderPainted(false);
        window2.setBackground(lightBlue);
        window2.setOpaque(true);
        window2.setBorderPainted(false);
  
        benchElderly.setBackground(white);
        benchElderly.setOpaque(true);
        benchElderly.setBorderPainted(false);

        couchElderly.setBackground(white);
        couchElderly.setOpaque(true);
        couchElderly.setBorderPainted(false);
  
        // adds buttons to the test level
        frame7.draw.setLayout(null);
        frame7.draw.add(masks);
        frame7.draw.add(glove);
        frame7.draw.add(nonfictionShelf);
        frame7.draw.add(fictionShelf);
        frame7.draw.add(elderlyCouple);
        frame7.draw.add(bed1);
        frame7.draw.add(bed2);
        frame7.draw.add(window1);
        frame7.draw.add(window2);
        frame7.draw.add(couchElderly);
        frame7.draw.add(benchElderly);
        frame7.mySetupFunction();
      
        // creating a frame for the Congrats class and calling its methods
        frame8 = new JFrame ("Congrats");
        frame8.setSize (1200, 800);
        frame8.getContentPane().add(BorderLayout.CENTER, congrats);
        mainMenu1 = new JButton("Return to Main Menu");
        mainMenu1.setBounds(880, 540, 220, 60);
        congrats.setLayout(null);
        congrats.add(mainMenu1);
        congrats.mySetupFunction();
  
        // creating a frame for the GameOver class and calling its methods
        frame9 = new JFrame ("Game Over");
        frame9.setSize (1200, 800);
        frame9.getContentPane().add(BorderLayout.CENTER, gameOver);
        mainMenu2 = new JButton("Return to Main Menu");
        mainMenu2.setBounds(880, 540, 220, 60);
        gameOver.setLayout(null);
        gameOver.add(mainMenu2);
        gameOver.mySetupFunction();
  
        // creating a frame for exiting the test level
        frame10 = new JFrame ("Exit Test Level");
        frame10.setSize (800, 270);
        frame10.getContentPane().add(BorderLayout.CENTER, exitTest);
        yes2 = new JButton("Yes, I'm done.");
        yes2.setBounds(80, 120, 250, 80);
        no2 = new JButton("No, I want to continue.");
        no2.setBounds(460, 120, 250, 80);
        exitTest.setLayout(null);
        exitTest.add(no2);
        exitTest.add(yes2);
        exitTest.mySetupFunction();
  
        // creating a frame for a warning
        frame11 = new JFrame ("Warning!");
        frame11.setSize (750, 270);
        frame11.getContentPane().add(BorderLayout.CENTER, warning);
        ok = new JButton("Ok");
        ok.setBounds(220, 120, 250, 80);
        warning.setLayout(null);
        warning.add(ok);
        warning.mySetupFunction();
    }
 
 
    public static void main (String[] args)
    {
        new ISPGame ();
    }
 
    /*
   Name          |  Type                 |  Purpose
   ------------------------------------------------------------------------------------------  
   elderly1      |  BufferedImage        |  Holds the variable for the first elderly image
   elderly2      |  BufferedImage        |  Holds the variable for the second elderly image
   grass         |  BufferedImage        |  Holds the variable for the grass image
   lightBulb     |  BufferedImage        |  Holds the variable for the lightbulb image
   daisy         |  BufferedImage        |  Holds the variable for the daisy image
   **/
   
    /* The purpose of the splash screen class is to display an animated opening page on our app with
       relevant graphics and animations to grab the user’s attention. **/
    class SplashScreen extends JPanel {
        public void paintComponent(Graphics g) {
            BufferedImage elderly1 = null;
            BufferedImage elderly2 = null;
            BufferedImage grass = null;
            BufferedImage lightBulb = null;
            BufferedImage daisy = null;
            try
            {
                  grass = ImageIO.read (new File ("grass.PNG"));
                  elderly1 = ImageIO.read (new File ("elderlyWalking1.PNG"));
                  elderly2 = ImageIO.read (new File ("elderlyWalking2.PNG"));
                  daisy = ImageIO.read (new File ("daisy.PNG"));
                  lightBulb = ImageIO.read (new File ("light.PNG"));
                  grass = ImageIO.read (new File ("grass.PNG"));
            }
            catch (IOException e)
            {
                  e.printStackTrace ();
            }
            g.setColor (purple);
            g.fillRect (0, 0, 1200, 800);
            g.setColor (green);
            g.fillRect (0, 700, 1200, 800);
            g.setFont (title);
            g.setColor(Color.black);
            g.drawString ("Wildflower Developments", 200, 150);
            g.setColor(white);
            g.fillOval(445, 180, 350, 350);
            g.setColor(black);
            g.drawOval(445, 180, 350, 350);
            g.drawImage (daisy, 455, 190, 330, 330, null);
            g.drawImage (lightBulb, 585, 310, 70, 90, null);
            g.drawImage (elderly1, x1, 340, 300, 320, null);
            g.drawImage (elderly2, x2, 340, 300, 300, null);
            g.drawImage (grass, -5, y, null);
            g.drawImage (grass, -40, y+40, null);
            g.drawImage (grass, -20, y+80, null);
            g.drawImage (grass, 450 , y, null);
            g.drawImage (grass, 420 , y+40, null);
            g.drawImage (grass, 430 , y+80, null);
            g.drawImage (grass, 820, y, null);
            g.drawImage (grass, 790, y+40, null);
            g.drawImage (grass, 800, y+80, null);
            if(x1<80) {
                  g.setFont (subtitle);
                  g.drawString ("Wildflower Senior Home", 420, 570);
                  g.drawString ("Training Centre", 500, 610);
            }
        }
    }
 
    // the moveGrass method moves the grass picture up the screen until it is on the ground of the scenery
    private void moveGrass() {
        while(y>=600){
            y--;
            try
            {
                Thread.sleep(20);
            }
            catch (Exception exc)
            {}
            frame1.repaint();
        }
    }
 
    /* the moveElderly method moves the left couple of elderly people across the screen to the right
       and moves the right couple of elderly people across the screen to the left. **/
    private void moveElderly() {
        while(x2<=1500){
            x1--;
            x2++;
            try
            {
                Thread.sleep(5);
            }
            catch (Exception exc)
            {}
            frame1.repaint();
        }
    }
 
    /* The main menu class has four buttons, one to go to instructions, one to quit, and one to play
       the learn level, and one to play the test level. **/
    class MainMenu extends JPanel
    {
        public void paintComponent(Graphics g) {
  
            g.setColor (purple);
            g.fillRect (0, 0, 1200, 800);
            try
            {
                border = ImageIO.read (new File ("border.PNG"));
            }
            catch (IOException e)
            {
                e.printStackTrace ();
            }
            g.drawImage (border, 0, 0, this.getWidth(), this.getHeight(), null);
            g.setColor(black);
            g.setFont(title);
            g.drawString("Main Menu", 420, 150);
         }
 
         // enables our buttons to work
         public void mySetupFunction(){
            b1.addActionListener(new ActionListener() {
               // goes to the instructions
               public void actionPerformed(ActionEvent e)
               {
                  frame3.setVisible (true);
                  frame2.dispose();
               }
            });
            b2.addActionListener(new ActionListener() {
               // goes to the learn level
               public void actionPerformed(ActionEvent e)
               {
                  frame6.setVisible (true);
                  frame2.dispose();
                  moveCount = 1;
               }
            });
            b3.addActionListener(new ActionListener() {
               // goes to the test level
               public void actionPerformed(ActionEvent e)
               {
                  frame7.setVisible (true);
                  frame2.dispose();
               }
            });
            b4.addActionListener(new ActionListener() {
               // goes to the goodbye
               public void actionPerformed(ActionEvent e)
               {
                  frame4.setVisible (true);
                  frame2.dispose();
               }
            });

         }

    }

    /* The purpose of the instructions class is to explain the purpose of the app and how it
       works. The instructions class returns back to the main method **/
    class Instructions extends JPanel
    {
        public void paintComponent (Graphics g)
        {
            g.setColor (purple);
            g.fillRect (0, 0, 1200, 800);
            try
            {
                border = ImageIO.read (new File ("border.PNG"));
            }
            catch (IOException e)
            {
                e.printStackTrace ();
            }
            g.drawImage (border, 0, 0, this.getWidth(), this.getHeight(), null);
            g.setColor (lightPink);
            g.fillRoundRect (180, 180, 840, 350, 40, 40);
            g.setColor(black);
            g.drawRoundRect (180, 180, 840, 350, 40, 40);
            g.setFont(title);
            g.drawString("Instructions", 420, 150);
            g.setFont(bodyText);
            g.drawString("Welcome to Wildflower Senior Residence! Our development team has put together this app", 200, 230);
            g.drawString("to train you, our 16 year old high school student volunteers, how to properly and safely", 200, 260);
            g.drawString("interact with the senior citizens and complete your jobs and tasks! This app is separated", 200, 290);
            g.drawString("into two sections; the learn level and the test level. You shall first complete the learn", 200, 320);
            g.drawString("level which is essentially a three step tutorial on how the game works and how to solve", 200, 350);
            g.drawString("obstacles! Next you should attempt the test level where you will be able to navigate through", 200, 380);
            g.drawString("obstacles by yourself and attempt to assist 2 residents and clean 2 residential rooms. If you", 200, 410);
            g.drawString("fail, we recommend you replay the game until you’ve mastered the skills and are ready to", 200, 440);
            g.drawString("become a super volunteer! From main menu, you are able to navigate between the two levels, this", 200, 470);
            g.drawString("page for instructions or quit the app once you're finished! Good luck and thanks for participating!", 200, 500);
        }
       
        // enables the button to work
        public void mySetupFunction(){
            back1.addActionListener(new ActionListener() {
               // returns the user to the main menu
               public void actionPerformed(ActionEvent e)
               {
                  frame2.setVisible (true);
                  frame3.dispose();
               }
            });
        }
    }

      
    /* The LearnLevel class demonstrates different scenarios and teaches the player how to play the game in three steps:
       1. How to move around using the “d” key to go right, “w” to jump, and “a” to go left.
       2. How to read the bacteria meter and how to collect hand sanitizer.
       3. How to solve all the possible obstacles: click on the mask and gloves button at the top to wear them, click
          on the bookshelf to get a book, click on the water fountain to get a cup of water, click on the senior to give
          them the items, and click on the contaminated areas to clean them.
      
    Name          |   Type           |  Purpose 
    --------------------------------------------------------------------------------------------
    person2X      |   int            |   Controls the x-value of the image of the avatar
    bird1         |   BufferedImage  |   Holds the value for the bird image
    human2        |   BufferedImage  |   Holds the value for the human image
    grass         |   BufferedImage  |   Holds the value for the grass image
    speech        |   BufferedImage  |   Holds the value for the speech bubble image
    no            |   BufferedImage  |   Holds the value for the oh no image
    over          |   BufferedImage  |   Holds the value for the game over image
    maskGloves    |   BufferedImage  |   Holds the value for the off mask and gloves image
    maskGloves2   |   BufferedImage  |   Holds the value for the on mask and gloves image 
    sanitize      |   BufferedImage  |   Holds the value for the hand sanitizer image
    keys          |   BufferedImage  |   Holds the value for the arrow keys image
    win           |   BufferedImage  |   Holds the value for the winning screen image
    food          |   BufferedImage  |   Holds the value for the food image
    exit          |   BufferedImage  |   Holds the value for the exit screen image
    **/
   
    class LearnLevel extends JPanel //Learn Level Class
    {
        int person2X = -70;
        public void paintComponent(Graphics g) {
            BufferedImage bird1 = null;
            BufferedImage human2 = null;
            BufferedImage grass = null;
            BufferedImage speech = null;
            BufferedImage no = null;
            BufferedImage over = null;
            BufferedImage maskGloves = null;
            BufferedImage maskGloves2 = null;
            BufferedImage sanitize = null;
            BufferedImage keys = null;
            BufferedImage win = null;
            BufferedImage food = null;
            BufferedImage exit = null;
      
            g.setColor (lightBlue); //Draws the background
            g.fillRect (0, 0, 1200, 800);
            g.setColor(green);
            g.fillRect(0,500,1200,300);
            g.setColor(white);
      
            for(int i  = 0; i <= 800; i+=400){ //Draws the clouds
               g.fillOval(-10+i,70,100,70);
               g.fillOval(15+i,45,100,70);
               g.fillOval(40+i,70,100,70);
            }
            for(int i  = 200; i <= 600; i+=400){
               g.fillOval(-10+i,100,100,70);
               g.fillOval(15+i,75,100,70);
               g.fillOval(40+i,100,100,70);
            }
      
            g.setColor(yellow); //Draws the demo box
            g.fillOval(1020, 10, 160, 160);
            g.setColor(white);
            g.fillRect(250,200,500,270);
            g.setColor(purple);
            g.fillRect(250,200,500,30);
            g.setColor(black);
            g.drawRect(250,200,500,270);
            g.drawRect(250,200,500,30);
            g.setFont(bodyText);
            g.drawString("Demo Box", 455, 222);
         
            try //Loads all the images
            {
               bird1 = ImageIO.read (new File ("bird1.PNG"));
               human2 = ImageIO.read (new File ("human.PNG"));
               grass = ImageIO.read (new File ("grass.PNG"));
               speech = ImageIO.read (new File ("speechBubble.PNG"));
               no = ImageIO.read (new File ("OhNo.PNG"));
               over = ImageIO.read (new File ("GameOver.PNG"));
               maskGloves = ImageIO.read (new File ("MaskGlove.PNG"));
               maskGloves2 = ImageIO.read (new File ("MaskGlove2.PNG"));
               sanitize = ImageIO.read (new File ("handsanitizer.PNG"));
               keys = ImageIO.read (new File ("keys.PNG"));
               win = ImageIO.read (new File ("congrats.PNG"));
               food = ImageIO.read (new File ("food.PNG"));
               exit = ImageIO.read (new File ("exit.PNG"));
            }
            catch (IOException e) //Catches any errors with the images
            {
                  e.printStackTrace ();
            }
         
            g.drawImage (bird1, 1050, 250, 100, 125, null); //Loads the background images
            g.drawImage (human2, person2X, y2, 330, 320, null);
            g.drawImage (grass, 0, 600, this.getWidth(), 200, null);
            g.drawImage (speech, 780, 120, 300, 210, null);
         
            if(time == 0){ //Starting screen
               g.drawString("Welcome to the Wildflower", 805, 160); //Text bubble text
               g.drawString("Developments volunteer", 805, 190);
               g.drawString("training program tutorial!", 805, 220);
            }
            else if(time == 1){
               g.drawString("In this learning level, you", 805, 160); //Text bubble text
               g.drawString("will be taught everything", 805, 190);
               g.drawString("you need to know in order", 805, 220);
               g.drawString("to navigate the test level!", 805, 250);
            }
            else if(time == 2){
               g.drawString("On the far left of the screen", 805, 160); //Text bubble text
               g.drawString("is your avatar. This is the", 805, 190);
               g.drawString("player you will be controlling", 805, 220);
               g.drawString("during now and the test level.", 805, 250);
            }
            else if(time == 3){
               g.drawString("In the center is the demo", 805, 160); //Text bubble text
               g.drawString("box, pay attention to that", 805, 190);
               g.drawString("for visuals when I'm teaching", 805, 220);
               g.drawString("you a new concept!", 805, 250);
            }
            else if(time == 4){
               g.drawString("Ready to go? Great let's", 805, 160); //Text bubble text
               g.drawString("start off with the basics!", 805, 190);
            }
            else if(time == 5){
               g.drawImage (keys, 340, 250, 320, 200, null); //Arrow keys in the demo box
               g.drawString("During the game you will be", 805, 160); //Text bubble text
               g.drawString("able to navigate freely using", 805, 190);
               g.drawString("the arrow keys located on the", 805, 220);
               g.drawString("bottom right of the keyboard", 805, 250);
            }
            else if(time == 6){
               next.setVisible(false); //Takes away the continue button
               g.drawString("Try it out! Move right, then", 805, 160);  //Text bubble text
               g.drawString("left, then up, then down. When", 805, 190);
               g.drawString("you're done you'll be able", 805, 220);
               g.drawString("to continue.", 805, 250);
            }
            else if(time == 7){
               next.setVisible(true); //Displays the continue button
               g.setColor (pink); //Draws Elevator
               g.fillRect(425,250,150,175);
               g.setColor (black);
               g.drawRect(425,250,150,175);
               g.drawString("Elevator", 465, 340);
               g.drawString("Perfect! In the game, you'll", 805, 160); //Text bubble text
               g.drawString("be able to move freely left or", 805, 190);
               g.drawString("right but you must be in an", 805, 220);
               g.drawString("elevator to move up or down.", 805, 250);
            }
            else if(time == 8){
               g.setColor (pink); //Draws Elevator
               g.fillRect(425,250,150,175);
               g.setColor (black);
               g.drawRect(425,250,150,175);
               g.drawString("Elevator", 465, 340);
               g.drawString("The elevators are located in", 805, 160); //Text bubble text
               g.drawString("in the center of each level", 805, 190);
               g.drawString("and to use one, simply stand", 805, 220);
               g.drawString("inside and press up or down!", 805, 250);
            }
            else if(time == 9){
               g.setColor(red); //Draws the bacteria meter
               g.fillRect(299, 290, 402, 100);
               g.setColor(orange);
               g.fillRect(299, 290, 268, 100);
               g.setColor(yellow);
               g.fillRect(299, 290, 134, 100);    
               g.setColor(black);
               g.drawRect(299, 290, 402, 100);
               g.drawString("Now that we've learnt about", 805, 160); //Text bubble text
               g.drawString("navigation, let's continue!", 805, 190);
               g.drawString("Take a look at the demo box,", 805, 220);
               g.drawString("this is your bacteria meter.", 805, 250);
            }
            else if(time == 10){
               g.setColor(red); //Draws the bacteria meter
               g.fillRect(299, 290, 402, 100);
               g.setColor(orange);
               g.fillRect(299, 290, 268, 100);
               g.setColor(yellow);
               g.fillRect(299, 290, 134, 100);    
               g.setColor(black);
               g.drawRect(299, 290, 402, 100);
               g.drawString("During the test level, this", 805, 160); //Text bubble text
               g.drawString("will be displayed on the top", 805, 190);
               g.drawString("right of your screen throughout", 805, 220);
               g.drawString("the entire level.", 805, 250);
            }
            else if(time == 11){
               g.setColor(white); //Shows the yellow on the meter
               g.fillRect(299, 290, 402, 100);
               g.setColor(yellow);
               g.fillRect(299, 290, 134, 100);    
               g.setColor(black);
               g.drawRect(299, 290, 402, 100);
               g.drawString("Your bacteria meter has three", 805, 160); //Text bubble text
               g.drawString("levels of serverity. The first", 805, 190);
               g.drawString("level, yellow, is a warning", 805, 220);
               g.drawString("and means you're at low risk.", 805, 250);
            }
            else if(time == 12){
               g.setColor(white);
               g.fillRect(299, 290, 402, 100); //Shows the orange on the meter
               g.setColor(orange);
               g.fillRect(299, 290, 268, 100);
               g.setColor(yellow);
               g.fillRect(299, 290, 134, 100);    
               g.setColor(black);
               g.drawRect(299, 290, 402, 100);
               g.drawString("The second level, orange, is a", 805, 160); //Text bubble text
               g.drawString("hazard and means you're at a", 805, 190);
               g.drawString("higher risk. It means you should", 805, 220);
               g.drawString("be careful of your next moves.", 805, 250);
            }
            else if(time == 13){
               g.setColor(red); //Shows the red on the meter
               g.fillRect(299, 290, 402, 100);
               g.setColor(orange);
               g.fillRect(299, 290, 268, 100);
               g.setColor(yellow);
               g.fillRect(299, 290, 134, 100);    
               g.setColor(black);
               g.drawRect(299, 290, 402, 100);
               g.drawString("The final level, red, is danger", 805, 160); //Text bubble text
               g.drawString("and means you're at a very high", 805, 190);
               g.drawString("risk. It means you should need", 805, 220);
               g.drawString("to be extremely careful!!!", 805, 250);
            }
            else if(time == 14){
               g.setColor(red); //Draws bacteria meter
               g.fillRect(299, 290, 402, 100);
               g.setColor(orange);
               g.fillRect(299, 290, 268, 100);
               g.setColor(yellow);
               g.fillRect(299, 290, 134, 100);    
               g.setColor(black);
               g.drawRect(299, 290, 402, 100);
               g.drawString("Everytime you interact with", 805, 160); //Text bubble text
               g.drawString("someone or something without", 805, 190);
               g.drawString("the necessary precautions,", 805, 220);
               g.drawString("your meter will increase.", 805, 250);
            }
            else if(time == 15){
               g.drawImage (no, 299, 265, 402, 150, null); //Draws the oh no image on the demo box
               g.drawString("While that happens, you'll", 805, 160); //Text bubble text
               g.drawString("see this warning screen.", 805, 190);
            }
            else if(time == 16){
               g.drawImage (over, 380, 245, 232, 200, null); //Draws the game over screen on the demo box
               g.drawString("You need to be careful not to", 805, 160); //Text bubble text
               g.drawString("let it get too high because", 805, 190);
               g.drawString("once it fills up, it's game", 805, 220);
               g.drawString("over for you!", 805, 250);
            }
            else if(time == 17){
               g.drawString("So how do we prevent that?", 805, 160); //Text bubble text
               g.drawString("Firstly, let's talk about", 805, 190);
               g.drawString("taking precautions to avoid", 805, 220);
            g.drawString("infection and contamination.", 805, 250);
            }
            else if(time == 18){
               g.drawString("When interacting with", 805, 160); //Text bubble text
               g.drawString("objects, you'll need to make", 805, 190);
               g.drawString("sure you're always wearing", 805, 220);
               g.drawString("gloves.", 805, 250);
            }
            else if(time == 19){
               g.drawString("When interacting with", 805, 160); //Text bubble text
               g.drawString("people, you'll need to make", 805, 190);
               g.drawString("sure you're always wearing", 805, 220);
               g.drawString("a mask.", 805, 250);
            }
            else if(time == 20){
               g.drawString("To access your mask and", 805, 160); //Text bubble text
               g.drawString("gloves, it's as easy as", 805, 190);
               g.drawString("clicking a button to put", 805, 220);
               g.drawString("them on!", 805, 250);
            }
            else if(time == 21){
               g.drawImage(maskGloves,315, 290, 390, 140, null); //Displays the mask and gloves image
               g.drawString("Throughout the entire game,", 805, 160); //Text bubble text
               g.drawString("you'll see these two icons", 805, 190);
               g.drawString("in the top left corner", 805, 220);
               g.drawString("of your screen.", 805, 250);
            }
            else if(time == 22){
               g.drawImage(maskGloves,315, 290, 390, 140, null); //Displays the mask and gloves image
               g.drawString("In order to put your mask", 805, 160); //Text bubble text
               g.drawString("or gloves on simply press", 805, 190);
               g.drawString("the respective button.", 805, 220);
            }
            else if(time == 23){
               masks2.setVisible(true); //Shows the mask and gloves button
               glove2.setVisible(true);
               next.setVisible(false); //Takes away the continue next button
               g.drawString("You'll know they're on if", 805, 160); //Text bubble text
               g.drawString("the button is green. Now", 805, 190);
               g.drawString("you try it, put on both", 805, 220);
               g.drawString("your gloves and mask!", 805, 250);
            }
            else if(time == 24){
               masks2.setVisible(false);  //Takes away the mask and gloves buttons
               glove2.setVisible(false);
               next.setVisible(true); //Displays the continue next button
               g.drawImage(maskGloves2,315, 290, 390, 140, null); //Displays the mask and gloves on image
               g.drawString("Great job! You were able to", 805, 160);
               g.drawString("successfully put on both", 805, 190);
               g.drawString("your gloves and mask!", 805, 220);
            }
            else if(time == 25){
               masks2.setVisible(true); //Displays the mask and gloves buttons
               glove2.setVisible(true);
               next.setVisible(false); //Takes away the continue next button
               g.drawString("To take off your mask and", 805, 160); //Text bubble text
               g.drawString("gloves, you do the same as", 805, 190);
               g.drawString("putting them on. Try taking", 805, 220);
               g.drawString("off your gloves and mask!", 805, 250);
            }
            else if(time == 26){
               masks2.setVisible(false); //Takes away the mask and gloves buttons
               glove2.setVisible(false);
               next.setVisible(true); //Displays the continue next button
               g.drawImage(maskGloves,315, 290, 390, 140, null);  //Displays the mask and gloves on image
               g.drawString("Great job! Now you know how", 805, 160); //Text bubble text
               g.drawString("to prevent infection so", 805, 190);
               g.drawString("let's talk about lowering", 805, 220);
               g.drawString("your bacteria level!", 805, 250);
            }
            else if(time == 27){
               g.drawString("Hand sanitizer is a great", 805, 160); //Text bubble text
               g.drawString("way to kill a ton of the", 805, 190);
               g.drawString("bacteria on your hands.", 805, 220);
            }
            else if(time == 28){
               g.drawImage(sanitize,435, 270, 110, 160, null); //Displays the hand sanitizer in the demo box
               g.drawString("During the game, you wil see", 805, 160); //Text bubble text
               g.drawString("bottles of sanitizer like", 805, 190);
               g.drawString("this one throughout the", 805, 220);
               g.drawString("entire level.", 805, 250);
            }
            else if(time == 29){
               g.drawImage(sanitize,435, 270, 110, 160, null); //Displays the hand sanitizer in the demo box
               g.drawString("Using a bottle of sanitizer", 805, 160); //Text bubble text
               g.drawString("kills a portion of your", 805, 190);
               g.drawString("bacteria and will bring", 805, 220);
               g.drawString("down your bacteria level.", 805, 250);
            }
            else if(time == 30){
               g.drawImage(sanitize,435, 270, 110, 160, null); //Displays the hand sanitizer in the demo box
               g.drawString("To use the sanitizer, all", 805, 160); //Text bubble text
               g.drawString("you must do it walk over it", 805, 190);
               g.drawString("to collect it but be careful as", 805, 220);
               g.drawString("you can only use a bottle once.", 805, 250);
            }
            else if(time == 31){
               g.drawImage (win, 380, 245, 232, 200, null); //Displays the winning screen in the demo box
               g.drawString("Now that you understand the", 805, 160); //Text bubble text
               g.drawString("basic concept of the game,", 805, 190);
               g.drawString("let's talk about objectives", 805, 220);
               g.drawString("and how to win.", 805, 250);
            }
            else if(time == 32){
               g.drawString("The point of the game is", 805, 160); //Text bubble text
               g.drawString("to train future volunteers", 805, 190);
               g.drawString("like yourself and to ensure", 805, 220);
               g.drawString("you're prepared.", 805, 250);
            }
            else if(time == 33){
               g.drawString("Therefore throughout the game", 805, 160); //Text bubble text
               g.drawString("you'll have a couple different", 805, 190);
               g.drawString("sample tasks you need to", 805, 220);
               g.drawString("complete in order to win.", 805, 250);
            }
            else if(time == 34){
               g.setColor(red);
               g.drawString("Here is a sample",440,300);  //Displays the prompt on the demo box
               g.drawString("prompt.", 440, 320);
               g.drawOval(400,260,200,90);
               g.setColor(black);
               g.drawString("All tasks will be clarified", 805, 160); //Text bubble text
               g.drawString("using a red prompt such as the", 805, 190);
               g.drawString("sample one on the demo box", 805, 220);
               g.drawString("right now.", 805, 250);
            }
            else if(time == 35){
               g.setColor(red);
               g.drawString("Here is a sample",440,300); //Displays the prompt on the demo box
               g.drawString("prompt.", 440, 320);
               g.drawOval(400,260,200,90);
               g.setColor(black);
               g.drawString("Any task you're given will", 805, 160); //Text bubble text
               g.drawString("either be to assit residents", 805, 190);
               g.drawString("or clean areas, similar to", 805, 220);
               g.drawString("the work you'll do with us.", 805, 250);
            }
            else if(time == 36){
               g.drawString("Now let's learn about how", 805, 160); //Text bubble text
               g.drawString("to complete your given tasks.", 805, 190);
               g.drawString("Let's start with assiting", 805, 220);
               g.drawString("the residents.", 805, 250);
            }
            else if(time == 37){
               g.drawString("Sometimes a resident will ask", 805, 160); //Text bubble text
               g.drawString("you to retreive something for", 805, 190);
               g.drawString("them and you'll need to get the", 805, 220);
               g.drawString("object and bring it back to them.", 805, 250);
            }
            else if(time == 38){
               g.drawString("To retreive an object, click on", 805, 160); //Text bubble text
               g.drawString("where it's stored but make sure", 805, 190);
               g.drawString("you're close enough to it or else", 805, 220);
               g.drawString("you won't be able to grab it.", 805, 250);
            }
            else if(time == 39){
               next.setVisible(false); //Takes away the continue next button
               fridge.setVisible(true); //Displays the fridge button
               g.drawString("You'll know you have the item", 805, 160); //Text bubble text
               g.drawString("when it appears beside you.", 805, 190);
               g.drawString("Try it with this fridge, click", 805, 220);
               g.drawString("to grab some food for a resident.", 805, 250);
               if(drawFood == true){ //Checks for the value of drawFood
                  next.setVisible(true); //Displays the continue next button
                  g.drawImage(food, 155, 230, 80, 70, null); //Displays the food next to the avatar
               }
            }
            else if(time == 40){
               fridge.setVisible(false); //Takes away the fridge button
               g.drawImage(food, 155, 230, 80, 70, null); //Displays the food next to the avatar
               g.drawString("Great job now to complete the", 805, 160); //Text bubble text
               g.drawString("task, click on the resident to", 805, 190);
               g.drawString("give them the object. Don't", 805, 220);
               g.drawString("forget to stand close enough!", 805, 250);
            }
            else if(time == 41){
               next.setVisible(false); //Takes away the continue next button
               people.setVisible(true); //Displays the people button
               if(drawFood == true){ //Checks if drawFood is true
                  g.setColor(red);
                  g.drawString("Get me some food",310,300); //Draws the prompt
                  g.drawString("please.", 310, 320);
                  g.drawOval(280,260,200,90);
                  g.setColor(black);
                  g.drawImage(food, 155, 230, 80, 70, null); //Draws the food icon next to the avatar
               }
               g.drawString("You'll know it worked once", 805, 160); //Text bubble text
               g.drawString("your item and the prompt", 805, 190);
               g.drawString("disappear. Try it! Don't", 805, 220);
               g.drawString("forget to stand close enough!", 805, 250);
               if(drawFood == false){ //Checks if drawFood is false
                  next.setVisible(true); //Displays the continue next button
                  g.drawImage(food, 415, 250, 80, 70, null); //Draws the food icon next to the people
               }
            }
            else if(time == 42){
               people.setVisible(false); //Takes away the people button
               g.drawString("Fantasic! Remember to wear", 805, 160); //Text bubble text
               g.drawString("gloves when handling an item", 805, 190);
               g.drawString("and a mask when interacting", 805, 220);
               g.drawString("with residents.", 805, 250);
            }
            else if(time == 43){
               g.drawString("Also even with gloves, when", 805, 160); //Text bubble text
               g.drawString("handling an item, you're", 805, 190);
               g.drawString("bacteria levels will increase.", 805, 220);
            }
            else if(time == 44){
               g.drawString("Keep in mind you're not", 805, 160); //Text bubble text
               g.drawString("doing anything wrong when this", 805, 190);
               g.drawString("happens, just keep an eye on", 805, 220);
               g.drawString("your bacteria meter!", 805, 250);
            }
            else if(time == 45){
               g.drawString("Now that we've gone over", 805, 160); //Text bubble text
               g.drawString("interacting with objects,", 805, 190);
               g.drawString("let's talk about or other", 805, 220);
               g.drawString("task, cleaning rooms.", 805, 250);
            }
            else if(time == 46){
               g.drawString("During the game you'll", 805, 160); //Text bubble text
               g.drawString("see some of the residents", 805, 190);
               g.drawString("rooms. In order to complete", 805, 220);
               g.drawString("the game, you must clean them.", 805, 250);
            }
            else if(time == 47){
               g.drawString("To clean a room, you must", 805, 160); //Text bubble text
               g.drawString("clean all the items in it. To", 805, 190);
               g.drawString("clean an item, you just need", 805, 220);
               g.drawString("to click on it while near.", 805, 250);
            }
            else if(time == 48){
               next.setVisible(false);  //Takes away the continue next button
               shelf.setVisible(true); //Displays the shelf button
               if(isClean == true){  //Checks if isClean is true
                  g.drawString("Cleaned!", 280, 450); //Prompts the user that they did it
                  next.setVisible(true); //Displays the continue next button
               }
               else { //Checks if isClean is false
                  g.setColor(red); //Prompts the user
                  g.drawString("Clean the shelf",310,300);
                  g.drawString("please.", 310, 320);
                  g.drawOval(280,260,200,90);
                  g.setColor(black);
               }
               g.drawString("You'll know the object was", 805, 160); //Text bubble text
               g.drawString("cleaned when text appears", 805, 190);
               g.drawString("below to inform you. Try", 805, 220);
               g.drawString("it! Clean the shelf!", 805, 250);
            }
            else if(time == 49){
               shelf.setVisible(false); //Takes away the shelf button
               g.drawString("Perfect! Just one more thing", 805, 160); //Text bubble text
               g.drawString("we need to cover. Sometimes", 805, 190);
               g.drawString("residents may be in their", 805, 220);
               g.drawString("room which you need to clean.", 805, 250);
            }
            else if(time == 50){
               g.drawString("We need to keep a safe", 805, 160); //Text bubble text
               g.drawString("distance from others and so,", 805, 190);
               g.drawString("you must ask them to leave", 805, 220);
               g.drawString("the room while you clean.", 805, 250);
            }
            else if(time == 51){
               g.drawString("In order to ask residents", 805, 160); //Text bubble text
               g.drawString("to leave, you need to stand", 805, 190);
               g.drawString("near them and click on them.", 805, 220);
            } else if(time == 52){
               g.drawString("They will leave the room", 805, 160); //Text bubble text
               g.drawString("for you to clean but you", 805, 190);
               g.drawString("need to click them when", 805, 220);
               g.drawString("you're done to return them.", 805, 250);
            }
            else if(time == 53){
               next.setVisible(false); //Takes away the continue next button
               couple.setVisible(true); //Displays the couple button
               if(inOut == 1){ //Checks if inOut is 1
                  couple.setBounds(270, 250, 200, 210); //Changes the location of the couple button
               }
               else if(inOut >= 2){ //Checks if inOut is larger than 1
                  couple.setBounds(500, 250, 200, 210); //Changes the location of the couple button back
                  next.setVisible(true); //Displays the continue next button
               }
               g.fillRect(480, 240, 5, 220); //Wall
               g.drawString("Try it out! Ask the couple", 805, 160); //Text bubble text
               g.drawString("to leave their room and", 805, 190);
               g.drawString("then ask them to return by", 805, 220);
               g.drawString("clicking.", 805, 250);
            }
            else if(time == 54){
               couple.setVisible(false); //Takes away the couple button
               g.drawString("Amazing job! You're a natural!", 805, 160); //Text bubble text
               g.drawString("Now we've pretty much covered", 805, 190);
               g.drawString("everything, so let's go over", 805, 220);
               g.drawString("how to exit or finish.", 805, 250);
            }
            else if(time == 55){
               g.drawImage (over, 380, 245, 232, 200, null); //Draws the game over screen in the demo box
               g.drawString("Once you've completed all the", 805, 160); //Text bubble text
               g.drawString("prompted tasks, exit to finish.", 805, 190);
               g.drawString("If you exit before finishing,", 805, 220);
               g.drawString("it's game over.", 805, 250);
            }
            else if(time == 56){
               g.drawImage (exit, 380, 245, 232, 200, null); //Draws the exit screen in the demo box
               g.drawString("To exit the game, walk to the", 805, 160); //Text bubble text
               g.drawString("bottom left corner where the", 805, 190);
               g.drawString("exit sign is and continue to", 805, 220);
               g.drawString("walk until you get to exit.", 805, 250);
            }
            else if(time == 57){
               g.drawImage (maskGloves, 380, 245, 232, 200, null); //Draws the mask and gloves off in the demo box
               g.drawString("In order to exit, you must", 805, 160); //Text bubble text
               g.drawString("have your mask and gloves off.", 805, 190);
               g.drawString("Make sure you remove them before", 805, 220);
               g.drawString("leaving!", 805, 250);
            }
            else if(time == 58){
               next.setVisible(false); //Takes away the continue next button
               continue1.setVisible(true); //Displays the continue to main menu button
               replay.setVisible(true); //Displays the replay button
               g.drawString("That's the end of the learn", 805, 160); //Text bubble text
               g.drawString("level! Feel free to either", 805, 190);
               g.drawString("replay or return to main", 805, 220);
               g.drawString("menu with the buttons below.", 805, 250);
            }
        }
      
        public void moveRight() { //This method moves the avatar right
            if(time == 6 && moveCount == 1){
               person2X += 150;
               moveCount++;
               frame6.repaint();
            }
        }
      
        public void moveLeft() { //This method moves the avatar left
            if(time == 6 && moveCount == 2){
               person2X -= 150;
               moveCount++;
               frame6.repaint();
            }
        }
 
        public void moveUp() { //This method moves the avatar up
            if(time == 6 && moveCount == 3){
               y2 -= 150;
               moveCount++;
               frame6.repaint();
            }
        }
  
        public void moveDown() { //This method moves the avatar down
            if(time == 6 && moveCount == 4){
               y2 += 150;
               moveCount++;
               time++;
               frame6.repaint();
            }
        }
     
        public void nextText(){ //This method increases the time variable and repaints
            time++;
            frame6.repaint();
        }
    }
 
    public class MovingPerson2 extends JFrame implements KeyListener {
        LearnLevel draw2;
        public void keyPressed(KeyEvent e) {
            System.out.println("keyPressed");
        }
      
        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_RIGHT){
               draw2.moveRight();
            }
            if (e.getKeyCode() == KeyEvent.VK_UP){
               draw2.moveUp();
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN){
               draw2.moveDown();
            }
            if (e.getKeyCode() == KeyEvent.VK_LEFT){
               draw2.moveLeft();
            }
        }
      
        public void keyTyped(KeyEvent e) {
            System.out.println("keyTyped");
        }
 
        public MovingPerson2 () {
            this.draw2 = new LearnLevel();
            addKeyListener(this);
            setFocusable(true);
            setFocusTraversalKeysEnabled(false);
        }
      
        // enables the buttons to work
        public void mySetupFunction(){
            continue1.addActionListener(new ActionListener() {
               // goes to the congrats screen and closes the learn level screen
               public void actionPerformed(ActionEvent e)
               {
                  frame8.setVisible(true);
                  screenNum = 2;
                  time = 1;
                  gloveCount2 = 0;
                  maskCount2 = 0;
                  inOut = 0;
                  isClean = false;
                  drawFood = false;
                  moveCount = 1;
                  next.setVisible(false);
                  continue1.setVisible(false);
                  replay.setVisible(false);
                  frame6.dispose();
               }
            });
            replay.addActionListener(new ActionListener() {
               // replats the learn level screen
               public void actionPerformed(ActionEvent e)
               {
                  frame6.getContentPane().add(BorderLayout.CENTER, frame6.draw2);
                  frame6.pack();
                  time = 1;
                  gloveCount2 = 0;
                  maskCount2 = 0;
                  inOut = 0;
                  isClean = false;
                  drawFood = false;
                  moveCount = 1;
                  next.setVisible(true);
                  continue1.setVisible(false);
                  replay.setVisible(false);
                }
            });
            next.addActionListener(new ActionListener() {
               // goes to the next text bubble
               public void actionPerformed(ActionEvent e)
               {
                  draw2.nextText();
                  frame6.getContentPane().add(BorderLayout.CENTER, frame6.draw2);
                  frame6.pack();
               }
            });
            masks2.addActionListener(new ActionListener() {
               // turns on and off the mask
               public void actionPerformed(ActionEvent e)
               {
                   masks2.setEnabled(false);
                   maskCount2++;
                   if (maskCount2 == 1){
                        masks2.setBackground(green);
                   }
                   else {
                        masks2.setBackground(black);
                   }
                   if(maskCount2 == 1 && gloveCount2 == 1 || maskCount2 == 2 && gloveCount2 == 2){
                        glove2.setEnabled(true);
                        masks2.setEnabled(true);
                        time++;
                   }
                   frame6.repaint();
               }
            });
            glove2.addActionListener(new ActionListener() {
               // turns on an off the gloves
               public void actionPerformed(ActionEvent e)
               {
                   glove2.setEnabled(false);
                   gloveCount2++;            
                   if (gloveCount2 == 1){
                        glove2.setBackground(green);
                   }
                   else
                   {
                        glove2.setBackground(black);
                   }
                   if(maskCount2 == 1 && gloveCount2 == 1 || maskCount2 == 2 && gloveCount2 == 2){
                        glove2.setEnabled(true);
                        masks2.setEnabled(true);
                        time++;
                   }             
                   frame6.repaint();
               }
            });
            fridge.addActionListener(new ActionListener() {
               // takes the food out of the fridge
               public void actionPerformed(ActionEvent e)
               {
                  drawFood = true;
                  frame6.repaint();
               }
            });
            people.addActionListener(new ActionListener() {
               // gives food to the people
               public void actionPerformed(ActionEvent e)
               {
                  drawFood = false;
                  frame6.repaint();
              }
            });
            shelf.addActionListener(new ActionListener() {
               // cleans the shelf
               public void actionPerformed(ActionEvent e)
               {
                  isClean = true;
                  frame6.repaint();
               }
            });
            couple.addActionListener(new ActionListener() {
               // takes the couple in and out of the room
               public void actionPerformed(ActionEvent e)
               {
                  inOut++;
                  frame6.repaint();
               }
            });
        } 
   }

   /*
   Name          |  Type                 |  Purpose
   ------------------------------------------------------------------------------------------  
   sign          |  BufferedImage        |  Holds the variable for the exit sign image
   handsanitizer |  BufferedImage        |  Holds the variable for the handsanitizer image
   human         |  BufferedImage        |  Holds the variable for the human image
   nonfiction    |  BufferedImage        |  Holds the variable for the nonfiction image
   fiction       |  BufferedImage        |  Holds the variable for the fiction image
   personX       |  int                  |  Holds the x variable location for the human
   personY       |  int                  |  Holds the y variable location for the human
   elderlyCount  |  int                  |  Holds the location of the elderly couple
   nonfictionX   |  int                  |  Holds the x variable location for the nonfiction book
   nonfictionY   |  int                  |  Holds the y variable location for the nonfiction book
   fictionX      |  int                  |  Holds the x variable location for the fiction book
   fictionY      |  int                  |  Holds the y variable location for the fiction book
   meter         |  int                  |  Holds the x variable location for the meter
   meter2        |  int                  |  Holds the x variable location for the second meter
   book1         |  boolean              |  Holds weather or not the first book has been taken out of the shelve
   book2         |  boolean              |  Holds weather or not the second book has been taken out of the shelve
   giveBook1     |  boolean              |  Holds weather or not the first book has been given
   giveBook2     |  boolean              |  Holds weather or not the second book has been given
   sanitizer1    |  boolean              |  Holds weather or not the first sanitizer is visible
   sanitizer2    |  boolean              |  Holds weather or not the second sanitizer is visible
   sanitizer3    |  boolean              |  Holds weather or not the third sanitizer is visible
   sanitizer4    |  boolean              |  Holds weather or not the forth sanitizer is visible
   sanitizer5    |  boolean              |  Holds weather or not the fifth sanitizer is visible
   bedColour1    |  Color                |  Holds the colour of the text for the first bed
   bedColour2    |  Color                |  Holds the colour of the text for the second bed
   windowColour1 |  Color                |  Holds the colour of the text for the first window
   windowColour2 |  Color                |  Holds the colour of the text for the second window
   textBubble1   |  Color                |  Holds the colour of the text bubble
   textBubble2   |  Color                |  Holds the colour of the text bubble
   **/

   /* The TestLevel class allows the player to navigate through obstacles by themself and attempt to assist residents and clean two
      residential rooms. The player will have to clean 2 rooms and pass all of the obstacles taught to them in the learn level
      without letting their bacteria meter reach the max. The bacteria meter will go up steadily each time an obstacle is
      completed and will only be lowered when hand sanitizer is collected.**/
   class TestLevel extends JPanel
   {
        // local variable declaration
        BufferedImage sign = null;
        BufferedImage handsanitizer = null;
        BufferedImage human = null;
        BufferedImage nonfiction = null;
        BufferedImage fiction = null;
        int personX = -5;
        int personY = 615;
        int elderlyCount = 0;
        int nonfictionX = -50;
        int nonfictionY = 0;
        int fictionX = -50;
        int fictionY = 0;
        boolean book1 = false;
        boolean book2 = false;
        boolean giveBook1 = false;
        boolean giveBook2 = false;
        Color bedColour1 = lightBlue;
        Color bedColour2 = lightBlue;
        Color windowColour1 = lightBlue;
        Color windowColour2 = lightBlue;
        Color textBubble1 = red;
        Color textBubble2 = red;
        int meter=850;
        int meter2=294;
        boolean sanitizer1 = false;
        boolean sanitizer2 = false;
        boolean sanitizer3 = false;
        boolean sanitizer4 = false;
        boolean sanitizer5 = false;
  
        // This method draws the background for the test level
        public void paintComponent(Graphics g) {
            g.setColor (purple);
            g.fillRect (0, 0, 1200, 800);
            // top rectangle
            g.setColor (white);
            g.fillRect(0,100,1200,225);
            g.setColor (black);
            g.drawRect(0,100,1200,225);
            // title
            g.setFont(subtitle);
            g.drawString("Test Level", 510, 60);
            // middle rectangle
            g.setColor (white);
            g.fillRect(0,325,1200,225);
            g.setColor (black);
            g.drawRect(0,325,1200,225);
            // bottom rectangle
            g.setColor (white);
            g.fillRect(0,550,1200,250);
            g.setColor (black);
            g.drawRect(0,550,1200,250);
            // top left blue
            g.setColor (lightBlue);
            g.fillRect(0,100,400,225);
            g.setColor (black);
            g.drawRect(0,100,400,225);
            // top right blue
            g.setColor (lightBlue);
            g.fillRect(800,100,400,225);
            g.setColor (black);
            g.drawRect(800,100,400,225);
            // level 3 elevator
            g.setColor (pink);
            g.fillRect(525,150,150,175);
            g.setColor (black);
            g.drawRect(525,150,150,175);
            // level 2 elevator
            g.setColor (pink);
            g.fillRect(525,375,150,175);
            g.setColor (black);
            g.drawRect(525,375,150,175);
            // level 1 elevator
            g.setColor (pink);
            g.fillRect(525,600,150,200);
            g.setColor (black);
            g.drawRect(525,600,150,200);
            // exit door
            g.setColor (grey);
            g.fillRect(40,620,80,250);
            g.setColor (black);
            g.drawRect(40,620,80,250);
            // imports all of the images
            try
            {
                sign = ImageIO.read (new File ("exitSign.PNG"));
                handsanitizer = ImageIO.read (new File ("handsanitizer.PNG"));
                human = ImageIO.read (new File ("human.PNG"));
                nonfiction = ImageIO.read (new File ("nonfiction.PNG"));
                fiction = ImageIO.read (new File ("fiction.PNG"));
            }
            catch (IOException e)
            {
                e.printStackTrace ();
            }
            // text for cleaning the beds and windows
            g.setFont(bodyText);
            g.setColor(bedColour1);
            g.drawString("cleaned!", 35, 310);
            g.setColor(bedColour2);
            g.drawString("cleaned!", 1098, 310);
            g.setColor(windowColour1);
            g.drawString("cleaned!", 955, 210);
            g.setColor(windowColour2);
            g.drawString("cleaned!", 185, 210);
            g.setColor(black);
            g.drawString("Nonfiction", 1073, 350);
            g.drawString("Fiction", 953, 350);
            g.setColor(textBubble1);
            g.drawString("Can you get us",250,380);
            g.drawString("a fiction book?", 250, 400);
            g.drawOval(210,340,200,90);
            g.setColor(textBubble2);
            g.drawString("Can you get us a",730, 600);
            g.drawString("nonfiction book?",730, 620);
            g.drawOval(698,560,200,90);
            // draws all of the images
            if(sanitizer1==false){
               g.drawImage (handsanitizer, 200, 230, 60, 80, null);
            }
            if(sanitizer2==false){
               g.drawImage (handsanitizer, 850, 450, 60, 80, null);
            }
            if(sanitizer3==false){
               g.drawImage (handsanitizer, 700, 680, 60, 80, null);
            }
            if(sanitizer4==false){
               g.drawImage (handsanitizer, 300, 450, 60, 80, null);
            }
            if(sanitizer5==false){
               g.drawImage (handsanitizer, 950, 230, 60, 80, null);
            }
            g.drawImage (sign, 30, 560, 100, 40, null);
            g.drawImage (nonfiction, nonfictionX, nonfictionY, 50, 48, null);
            g.drawImage (fiction, fictionX, fictionY, 40, 45, null);
            g.drawImage (human, personX, personY, 170, 160, null);
            // the bacteria meter
            g.setColor(yellow);
            g.fillRect(850,15,98,70);
            g.setColor(orange);
            g.fillRect(948,15,98,70);
            g.setColor(red);
            g.fillRect(1046,15,98,70);
            g.setColor (white);
            g.fillRect(meter,15,meter2,70);
            g.setColor (black);
            g.drawRect(850,15,294,70);
        }
  
        // This method moves the books and character to the right
        public void moveRight() {
            if(personX < 1070){
               if(personX>750 && personY==615 && maskCount%2==0){
                  bacteriaFill();
               }
               else if(personX>650 && personX<660 && personY<350 && maskCount%2==0 && elderlyCount%2==0){
                  bacteriaFill();
               }
               else if((personX>680 && personX<750 && personY<350 && elderlyCount%2==0) || (personX>810 && personY==615) || (personX>930 && personY<350) || (personX>820 && personY == 385)){
               }
               else {
                  //move books
                  if(book1==true && giveBook1==false){
                     if(gloveCount%2==0){
                        bacteriaFill();
                     }
                     nonfictionX += 20;
                     bacteriaUp();
                  }
                  if(book2==true && giveBook2==false){
                     if(gloveCount%2==0){
                        bacteriaFill();
                     }
                     fictionX += 20;
                     bacteriaUp();
                  }
                  // handsanitizers
                  if(personX>=140 && personX<160 && personY<350 && sanitizer1==false && meter>850){
                     sanitizer1=true;
                     bacteriaDown();
                  }
                  else if(personX>=790 && personX<810 && personY==385 && sanitizer2==false && meter>850){
                     sanitizer2=true;
                     bacteriaDown();
                  }
                  else if(personX>=640 && personX<660 && personY>400 && sanitizer3==false && meter>850){
                     sanitizer3=true;
                     bacteriaDown();
                  }
                  else if(personX>=240 && personX<260 && personY==385 && sanitizer4==false && meter>850){
                     sanitizer4=true;
                     bacteriaDown();
                  }
                  else if(personX>=890 && personX<910 && personY<350 && sanitizer5==false && meter>850){
                     sanitizer5=true;
                     bacteriaDown();
                  }
                  // moves person
                  personX += 20;
                  frame7.repaint();
               }
            }
        }

        // This method moves the books and character to the left
        public void moveLeft() {
            if(personX <= -50 && personY == 615 && maskCount%2==0){
               frame10.setVisible(true);
            }
            else if(personX > -50){
               if(personX<180 && personY==385 && maskCount%2==0){
                  bacteriaFill();
               }
               else if(personX<500 && personY<350 && maskCount%2==0 && elderlyCount%2!=0){
                  bacteriaFill();
               }
               else if((personX<460 && personY<350 && elderlyCount%2!=0) || (personX<0 && personY<350) || (personX<140 && personY<350) || (personX<150 && personY==385)){
               }
               else
               {
                  // move books
                  if(book1==true && giveBook1==false){
                     if(gloveCount%2==0){
                        bacteriaFill();
                     }
                     nonfictionX -= 20;
                     bacteriaUp();
                  }
                  if(book2==true && giveBook2==false){
                     if(gloveCount%2==0){
                        bacteriaFill();
                     }
                     fictionX -= 20;
                     bacteriaUp();
                  }
            
                  // handsanitizers
                  if(personX>=150 && personX<170 && personY<350 && sanitizer1==false && meter>850){
                     sanitizer1=true;
                     bacteriaDown();
                  }
                  else if(personX>=800 && personX<820 && personY==385 && sanitizer2==false && meter>850){
                     sanitizer2=true;
                     bacteriaDown();
                  }
                  else if(personX>=650 && personX<670 && personY>400 && sanitizer3==false && meter>850){
                     sanitizer3=true;
                     bacteriaDown();
                  }
                  else if(personX>=250 && personX<270 && personY==385 && sanitizer4==false && meter>850){
                     sanitizer4=true;
                     bacteriaDown();
                  }
                  else if(personX>=900 && personX<920 && personY<350 && sanitizer5==false && meter>850){
                     sanitizer5=true;
                     bacteriaDown();
                  }
            
                  // move person
                  personX -= 20;
                  frame7.repaint();
               }
            }
        }
  
        // This method moves the books and character up
        public void moveUp() {
            if(personX >= 460 && personX <= 560 && personY >= 200){
               personY -= 230;
               if(book1==true && giveBook1==false){
                  if(gloveCount%2==0){
                     bacteriaFill();
                  }
                  nonfictionY -= 230;
                  bacteriaUp();
               }
               if(book2==true && giveBook2==false){
                  if(gloveCount%2==0){
                     bacteriaFill();
                  }
                  fictionY -= 230;
                  bacteriaUp();
               }
               frame7.repaint();
            }
        }
  
        // This method moves the books and character down
        public void moveDown() {
            if(personX >= 460 && personX <= 560 && personY <= 600){
               personY += 230;
               if(book1==true && giveBook1==false){
                  if(gloveCount%2==0){
                     bacteriaFill();
                  }
                  nonfictionY += 230;
                  bacteriaUp();
               }
               if(book2==true && giveBook2==false){
                  if(gloveCount%2==0){
                     bacteriaFill();
                  }
                  fictionY += 230;
                  bacteriaUp();
               }
               frame7.repaint();
            }
        }
  
        // This method moves the elderly in and out of their room
        public void moveElderly(){
            if(elderlyCount%2==0 && personY < 350 && personX>450){
               if(maskCount%2==0){
                  bacteriaFill();
               }
               else {
                  elderlyCouple.setBackground(white);
                  elderlyCouple.setBounds(410, 150, 100, 160);
                  bacteriaUp();
                  elderlyCount++;
                  frame7.repaint();
               }
            }
            else if(elderlyCount%2!=0 && personY < 350 && personX<700) {
               if(maskCount%2==0){
                  bacteriaFill();
               }
               else {
                  elderlyCouple.setBackground(lightBlue);
                  elderlyCouple.setBounds(805, 150, 100, 160);
                  bacteriaUp();
                  elderlyCount++;
                  frame7.repaint();
               }
            }
        }
  
        // This method cleans the first bed
        public void cleaningBed1(){
            if(personY == 155 && personX<=300){
               if(maskCount%2==0 || gloveCount%2==0){
                  bacteriaFill();
               }
               else {
                  bedColour1=black;
                  obstacles++;
                  bacteriaUp();
                  frame7.repaint();
               }
            }
        }
      
        // This method cleans the second bed
        public void cleaningBed2(){
            if(personY == 155 && personX>=710){
               if(maskCount%2==0 || gloveCount%2==0){
                  bacteriaFill();
               }
               else {
                  bedColour2=black;
                  obstacles++;
                  bacteriaUp();
                  frame7.repaint();
               }
            }
        }
  
        // This method cleans the first window
        public void cleaningWindow1(){
            if(personY == 155 && personX>=710){
               if(maskCount%2==0 || gloveCount%2==0){
                  bacteriaFill();
               }
               else {
                  windowColour1=black;
                  obstacles++;
                  bacteriaUp();
                  frame7.repaint();
               }
            }
        }
  
        // This method cleans the second window
        public void cleaningWindow2(){
            if(personY == 155 && personX<=300){
               if(maskCount%2==0 || gloveCount%2==0){
                  bacteriaFill();
               }
               else {
                  windowColour2=black;
                  obstacles++;
                  bacteriaUp();
                  frame7.repaint();
               }
            }
        }
  
        // This method moves the nonfiction book
        public void moveNonfiction(){
            if(book1==false && personY == 385 && personX>=710){
               if(gloveCount%2==0){
                  bacteriaFill();
               }
               else {
                  book1 = true;
                  nonfictionX=personX+10;
                  nonfictionY=personY+10;
                  bacteriaUp();
                  frame7.repaint();
               }
            }
        }
  
        // This method moves the fiction book
        public void moveFiction(){
            if(book2==false && personY == 385 && personX>=710){
               if(gloveCount%2==0){
                  bacteriaFill();
               }
               else {
                  book2 = true;
                  fictionX=personX+120;
                  fictionY=personY+10;
                  bacteriaUp();
                  frame7.repaint();
               }
            }
        }
  
        // This method gives the nonfiction book to the elderly
        public void giveNonfiction(){
            if(book1 && personY == 615 && personX>=650){
               if(maskCount%2==0 || gloveCount%2==0){
                  bacteriaFill();         
               }
               else {
                  giveBook1 = true;
                  nonfictionX=870;
                  nonfictionY=600;
                  obstacles++;
                  bacteriaUp();
                  textBubble2=white;
                  frame7.repaint();
               }
            }
        }

        // This method gives the fiction book to the elderly
        public void giveFiction(){
            if(book2 && personY == 385 && personX<=300){
               if(maskCount%2==0 || gloveCount%2==0){
                  bacteriaFill();
               }
               else {
                  giveBook2 = true;
                  fictionX=200;
                  fictionY=370;
                  obstacles++;
                  bacteriaUp();
                  textBubble1=white;
                  frame7.repaint();
               }
            }
        }
  
        // This method sets the variables to their default values
        public void setDefault(){
            sign = null;
            handsanitizer = null;
            human = null;
            nonfiction = null;
            fiction = null;
            personX = -5;
            personY = 615;
            elderlyCount = 0;
            nonfictionX = -50;
            nonfictionY = 0;
            fictionX = -50;
            fictionY = 0;
            book1 = false;
            book2 = false;
            giveBook1 = false;
            giveBook2 = false;
            bedColour1 = lightBlue;
            bedColour2 = lightBlue;
            windowColour1 = lightBlue;
            windowColour2 = lightBlue;
            textBubble1 = red;
            textBubble2 = red;
            meter=850;
            meter2=294;
            sanitizer1 = false;
            sanitizer2 = false;
            sanitizer3 = false;
            sanitizer4 = false;
            sanitizer5 = false;
        }
  
       // This method increases the bacteria meter
        public void bacteriaUp(){
            if(meter2<=0){
               frame9.setVisible(true);
               frame7.dispose();
            }
            else {
               meter+=3;
               meter2-=3;
               frame7.repaint();
            }
        }
  
        // This method decreases the bacteria meter
        public void bacteriaDown(){
            if(meter>=870){
               meter-=20;
               meter2+=20;
            }
            else if(meter>=850){
               meter2+=(meter-850);
               meter-=(meter-850);
            }
            frame7.repaint();
        }
  
        // This method increases the bacteria meter by 20
        public void bacteriaFill(){
            if(meter2<=0){
               setDefault();
               frame9.setVisible(true);
               frame7.dispose();
            }
            else
            {
               meter+=50;
               meter2-=50;
               frame7.repaint();
               frame11.setVisible(true);
            }
        }
   }
 
   /*
   Name          |  Type             |  Purpose
   ------------------------------------------------------------------------------------------  
   draw          |  TestLevel        |  It instantiates an object of the TestLevel class
   **/
   
   /* This class moves the person up the elevator if the up arrow key is pressed, to the right if the right arrow key is pressed,
      and to the left if the left arrow key is pressed. It also calls methods from the TestLevel class once any of the icon buttons
      are pressed.**/
   public class MovingPerson extends JFrame implements KeyListener {
        TestLevel draw;
      
        // prints out keyPressed to indicate that a key has been pressed by the user
        public void keyPressed(KeyEvent e) {
            System.out.println("keyPressed");
        }

        // calls the four different methods of the TestLevel class once the right, left, up, or down arrows are pressed
        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                  draw.moveRight();
            }
            else if (e.getKeyCode() == KeyEvent.VK_LEFT){
                  draw.moveLeft();
            }
            else if (e.getKeyCode() == KeyEvent.VK_UP){
                  draw.moveUp();
            }
            else if (e.getKeyCode() == KeyEvent.VK_DOWN){
                  draw.moveDown();
            }
        }
  
        // prints out keyTyped to indicate that a key has been typed by the user
        public void keyTyped(KeyEvent e) {
            System.out.println("keyTyped");
        }

        // creates the object of the TestLevel and adds key listener
        public MovingPerson () {
            this.draw = new TestLevel();
            addKeyListener(this);
            setFocusable(true);
            setFocusTraversalKeysEnabled(false);
        }
 
        // enables the buttons and adds action listener
        public void mySetupFunction(){
            masks.addActionListener(new ActionListener() {
               // makes the mask turn green or black
               public void actionPerformed(ActionEvent e)
               {
                   if (maskCount%2==0){
                     masks.setBackground(green);
                   }
                   else {
                     masks.setBackground(black);
                   }
                   maskCount++;
                   frame7.getContentPane().add(BorderLayout.CENTER, frame7.draw);
                   frame7.pack();
               }
            });
            glove.addActionListener(new ActionListener() {
               // makes the gloves turn green or black
               public void actionPerformed(ActionEvent e)
               {
                   if (gloveCount%2==0){
                     glove.setBackground(green);
                   }
                   else {
                     glove.setBackground(black);
                   }
                   gloveCount++;
                   frame7.getContentPane().add(BorderLayout.CENTER, frame7.draw);
                   frame7.pack();
               }
            });
            nonfictionShelf.addActionListener(new ActionListener() {
               // makes the non fiction shelf give the player a non fiction book
               public void actionPerformed(ActionEvent e)
               {        
                   frame7.getContentPane().add(BorderLayout.CENTER, frame7.draw);
                   draw.moveNonfiction();
                   frame7.pack();
               }
            });
            fictionShelf.addActionListener(new ActionListener() {
               // makes the fiction shelf give the player a fiction book
               public void actionPerformed(ActionEvent e)
               {
                   frame7.getContentPane().add(BorderLayout.CENTER, frame7.draw);
                   draw.moveFiction();
                   frame7.pack();
               }
            });
            elderlyCouple.addActionListener(new ActionListener() {
              // makes the elderly couple move
               public void actionPerformed(ActionEvent e)
               {
                   frame7.getContentPane().add(BorderLayout.CENTER, frame7.draw);
                   draw.moveElderly();
                   frame7.pack();
               }
            });
            bed1.addActionListener(new ActionListener() {
               // makes the first bed cleaned
               public void actionPerformed(ActionEvent e)
               {
                   frame7.getContentPane().add(BorderLayout.CENTER, frame7.draw);
                   draw.cleaningBed1();
                   frame7.pack();
               }
            });
            bed2.addActionListener(new ActionListener() {
               // makes the second bed cleaned
               public void actionPerformed(ActionEvent e)
               {
                   frame7.getContentPane().add(BorderLayout.CENTER, frame7.draw);
                   draw.cleaningBed2();
                   frame7.pack();
               }
            });
            window1.addActionListener(new ActionListener() {
               // makes the first window cleaned
               public void actionPerformed(ActionEvent e)
               {
                   frame7.getContentPane().add(BorderLayout.CENTER, frame7.draw);
                   draw.cleaningWindow1();
                   frame7.pack();
               }
            });
            window2.addActionListener(new ActionListener() {
               // makes the second window cleaned
               public void actionPerformed(ActionEvent e)
               {
                   frame7.getContentPane().add(BorderLayout.CENTER, frame7.draw);
                   draw.cleaningWindow2();
                   frame7.pack();
               }
            });
            couchElderly.addActionListener(new ActionListener() {
               // gives the book to the couch elderly
               public void actionPerformed(ActionEvent e)
               {
                   frame7.getContentPane().add(BorderLayout.CENTER, frame7.draw);
                   draw.giveFiction();
                   frame7.pack();
               }
            });
            benchElderly.addActionListener(new ActionListener() {
               // gives the book to the bench elderly
               public void actionPerformed(ActionEvent e)
               {
                   frame7.getContentPane().add(BorderLayout.CENTER, frame7.draw);
                   draw.giveNonfiction();
                   frame7.pack();
               }
            });
       }
   }
 
   /* This class asks the user if they are sure that they want to quit. If the user selects yes, then they will be sent to the congrats screne if they have
      completed all the tasks, or sent to the game over screne if they have not completed all the tasks. if the user selects no, they continue playing.**/
   class ExitTestLevel extends JPanel
   {
        public void paintComponent (Graphics g)
        {
            g.setColor (white);
            g.fillRect(0,0,800, 270);
            g.setColor (lightBlue);
            g.fillRoundRect (10, 10, 780, 230, 40, 40);
            g.setColor (black);
            g.setFont(subtitle);
            g.drawString("Are you sure you want to quit?", 150, 80);
        }
      
        // enables the buttons to work
        public void mySetupFunction(){
            yes2.addActionListener(new ActionListener() {
               // exists the test level
               public void actionPerformed(ActionEvent e)
               {
                  screenNum = 1;
                  frame7.draw.setDefault();
                  if(obstacles>=6){
                     frame8.setVisible(true);
                     frame10.dispose();
                     frame7.dispose();
                  }
                  else {
                     frame9.setVisible(true);
                     frame10.dispose();
                     frame7.dispose();
                  }
               }
            });
            no2.addActionListener(new ActionListener() {
               // stays at the test level
               public void actionPerformed(ActionEvent e)
               {
                  frame10.dispose();
               }
            });
         }
    }
 
    /* This class warns the user that they are exposed to the virus**/
    class Warning extends JPanel
    {
        public void paintComponent (Graphics g)
        {
            g.setColor (white);
            g.fillRect(0,0,750, 270);
            g.setColor (lightBlue);
            g.fillRoundRect (10, 10, 730, 230, 40, 40);
            g.setColor (black);
            g.setFont(subtitle);
            g.drawString("Oh no, you're at high risk!", 150, 80);
        }
      
        // enables the buttons to work
        public void mySetupFunction(){
            ok.addActionListener(new ActionListener() {
               // closes the warning
               public void actionPerformed(ActionEvent e)
               {
                  frame11.dispose();
               }
            });
         }
    }


   /* The congrats class appears if the player was able to successfully complete the learn or the test level.
      The congrats class displays a congratulations message and prompts the user to return to the main menu. **/
   class Congrats extends JPanel
   {
        public void paintComponent (Graphics g)
        {
            maskCount = 0;
            gloveCount = 0;
            obstacles = 0;
            g.setColor (purple);
            g.fillRect (0, 0, 1200, 800);
            try
            {
                border = ImageIO.read (new File ("border.PNG"));
            }
            catch (IOException e)
            {
                e.printStackTrace ();
            }
            g.drawImage (border, 0, 0, this.getWidth(), this.getHeight(), null);
            g.setColor (lightPink);
            g.fillRoundRect (200, 250, 800, 250, 40, 40);
            g.setColor(black);
            g.drawRoundRect (200, 250, 800, 250, 40, 40);
            g.setFont(title);
            g.drawString("Congrats!", 450, 150);
            g.setFont(bodyText);
            if(screenNum  == 1){
            g.drawString("Good job! You have cleaned every dirty spot properly and taken proper precaution", 270, 330);
            g.drawString("when completing tasks for the seniors without getting infected! You’re a volunteer", 270, 360);
            g.drawString("superstar and are officially ready to start your volunteering experience at", 300, 390);
            } else if(screenNum == 2){
            g.drawString("Good job! You have completed the tutorial and learn level and you're now ready", 275, 330);
            g.drawString("to try out the test level to test your knowledge. Feel free to replay again if", 290, 360);
            g.drawString("you don't feel ready but otherwise try out what you learned on the test level!", 285, 390);         
            }
            g.drawString("Wildflower Senior Residence!", 470, 420);
        }
      
        // enables the buttons to work
        public void mySetupFunction(){
            mainMenu1.addActionListener(new ActionListener() {
               // returns to the main menu
               public void actionPerformed(ActionEvent e)
               {
                  frame2.setVisible (true);
                  frame8.dispose();
               }
            });
        }
    }

    /* The GameOver class appears if the player was unable to successfully complete the test level.
       The GameOver class displays an encouraging message so that the user chooses to replay the game from the main menu. **/
    class GameOver extends JPanel
    {
        public void paintComponent (Graphics g)
        {
            maskCount = 0;
            gloveCount = 0;
            obstacles = 0;
            g.setColor (purple);
            g.fillRect (0, 0, 1200, 800);
            try
            {
                border = ImageIO.read (new File ("border.PNG"));
            }
            catch (IOException e)
            {
                e.printStackTrace ();
            }
            g.drawImage (border, 0, 0, this.getWidth(), this.getHeight(), null);
            g.setColor (lightPink);
            g.fillRoundRect (200, 250, 800, 250, 40, 40);
            g.setColor(black);
            g.drawRoundRect (200, 250, 800, 250, 40, 40);
            g.setFont(title);
            g.drawString("Game Over", 420, 150);
            g.setFont(bodyText);
            g.drawString("Unfortunately, you lost the game either because the bacteria meter filled completely", 260, 330);
            g.drawString("or you failed an obstacle and could not clean all the dorty parts of the 2 residential", 266, 360);
            g.drawString("rooms. Don't worry, you are able to go back to the main menu and play the game", 273, 390);
            g.drawString("again until you master all the necessary skills needed at WildFlower Senior Residence!", 255, 420);
        }
      
        // enables the buttons to work
        public void mySetupFunction(){
            mainMenu2.addActionListener(new ActionListener() {
               // returns to the main menu
               public void actionPerformed(ActionEvent e)
               {
                  frame2.setVisible (true);
                  frame9.dispose();
               }
            });
        }
    }

   /* The quit class is used to display a message on the main menu page. The class will ask for confirmation if the
      user wants to quit or if they want to return to the main menu. The class will display two buttons, yes or no. **/
   class Quit extends JPanel
   {
        public void paintComponent (Graphics g)
        {
            g.setColor (purple);
            g.fillRect (0, 0, 1200, 800);
            try
            {
                border = ImageIO.read (new File ("border.PNG"));
            }
            catch (IOException e)
            {
                e.printStackTrace ();
            }
            g.drawImage (border, 0, 0, this.getWidth(), this.getHeight(), null);
            g.setColor (white);
            g.fillRoundRect (200, 250, 800, 250, 40, 40);
            g.setColor (lightBlue);
            g.fillRoundRect (210, 260, 780, 230, 40, 40);
            g.setColor (black);
            g.setFont(title);
            g.drawString("Main Menu", 410, 150);
            g.setFont(subtitle);
            g.drawString("Are you sure you want to quit?", 350, 330);
        }
      
        // enables the buttons to work
        public void mySetupFunction(){
            yes.addActionListener(new ActionListener() {
               // goes to the goodbye class
               public void actionPerformed(ActionEvent e)
               {
                  frame5.setVisible (true);
                  frame4.dispose();
               }
            });
            no.addActionListener(new ActionListener() {
               // returns to the main menu
               public void actionPerformed(ActionEvent e)
               {
                  frame2.setVisible (true);
                  frame4.dispose();
               }
            });
         }
    }
 
    /* The purpose of the goodbye class is to display a final message and graphics before the user completely exits the app.
       This class only appears after the yes button is selected in the quit method. From the goodbye screen, the only place
       for the user to go is to close the app. **/
    class Goodbye extends JPanel
    {
        public void paintComponent (Graphics g)
        {
            g.setColor (purple);
            g.fillRect (0, 0, 1200, 800);
            try
            {
                border = ImageIO.read (new File ("border.PNG"));
            }
            catch (IOException e)
            {
                e.printStackTrace ();
            }
            g.drawImage (border, 0, 0, this.getWidth(), this.getHeight(), null);
            g.setColor (lightPink);
            g.fillRoundRect (200, 250, 800, 250, 40, 40);
            g.setColor(black);
            g.drawRoundRect (200, 250, 800, 250, 40, 40);
            g.setFont(title);
            g.drawString("Goodbye", 450, 150);
            g.setFont(bodyText);
            g.drawString("Thank you for completing the Wildflower Senior Residence Training Course!", 270, 330);
            g.drawString("You now know how to navigate through different obstacles within the residential", 260, 360);
            g.drawString("homes by yourself, assist residents, and clean residential rooms! We hope to see", 262, 390);
            g.drawString("you on our volunteer team in the near future! Have a great day!", 330, 420);
        }
      
        // enables the buttons to work
        public void mySetupFunction(){
            // exists the entire program
            exit.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e)
               {
                  frame5.dispose();
               }
            });
        }
    }
}

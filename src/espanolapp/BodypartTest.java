package espanolapp;



import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * this class is the frame for when the take the test button is pressed in the
 * body part frame, it stores the buttons and components of the frame
 *
 * @author Jazmin Vagha 16941106
 */
public class BodypartTest extends javax.swing.JFrame {

    private int question;
    private int score;
    private boolean answered;
    private boolean testStarted;
    private SpanishDB db;

    /**
     * this method is the constructor for the class which calls the method to
     * initialize the components
     *
     * @param datab - an object of the main database, accesses the table in the
     * database
     */
    public BodypartTest(SpanishDB datab) {
        initComponents();
        db = datab;
        question = 0;
        score = 0;
        answered = false;
        testStarted = false;
        nextLabel.setVisible(false);

        endGame.setVisible(false);
        testAgain.setVisible(false);
        optionA.setVisible(false);
        optionB.setVisible(false);
        optionC.setVisible(false);
        optionD.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helpDialog = new javax.swing.JDialog();
        helpPanel = new javax.swing.JPanel();
        ok = new javax.swing.JButton();
        helpLabel = new javax.swing.JLabel();
        helpTitle = new javax.swing.JLabel();
        helpButton = new javax.swing.JButton();
        testPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        optionB = new javax.swing.JButton();
        optionA = new javax.swing.JButton();
        optionC = new javax.swing.JButton();
        optionD = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        startLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        endGame = new javax.swing.JLabel();
        testAgain = new javax.swing.JButton();
        scoreTxt = new javax.swing.JLabel();
        helpDisable = new javax.swing.JLabel();
        nextLabel = new javax.swing.JLabel();

        helpDialog.setTitle("                                                    HELP MENU");
        helpDialog.setBackground(new java.awt.Color(255, 255, 255));
        helpDialog.setFocusable(false);
        helpDialog.setResizable(false);
        helpDialog.setSize(new java.awt.Dimension(490, 310));
        helpDialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                helpDialogWindowActivated(evt);
            }
        });
        helpDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        helpPanel.setBackground(new java.awt.Color(255, 196, 4));
        helpPanel.setFocusable(false);
        helpPanel.setPreferredSize(new java.awt.Dimension(490, 310));
        helpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        helpPanel.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 70, 40));

        helpLabel.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        helpLabel.setText("Use the home button to go back home");
        helpPanel.add(helpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        helpTitle.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 32)); // NOI18N
        helpTitle.setText("HELP MENU");
        helpPanel.add(helpTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        helpDialog.getContentPane().add(helpPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 310));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(656, 404));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        helpButton.setBackground(new java.awt.Color(255, 255, 255));
        helpButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        helpButton.setForeground(new java.awt.Color(0, 0, 222));
        helpButton.setText("HELP");
        helpButton.setBorder(null);
        helpButton.setBorderPainted(false);
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(helpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 34));

        testPanel.setBackground(new java.awt.Color(255, 196, 4));
        testPanel.setPreferredSize(new java.awt.Dimension(656, 404));
        testPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        homeButton.setForeground(new java.awt.Color(0, 0, 255));
        homeButton.setText("HOME");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        testPanel.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 34));

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitButton.setForeground(new java.awt.Color(250, 0, 0));
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        testPanel.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 70, 34));

        title.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 32)); // NOI18N
        title.setText("BODY PART TEST");
        testPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        questionLabel.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        questionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(206, 0, 0), 4));
        testPanel.add(questionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 430, 60));

        optionB.setBackground(java.awt.Color.pink);
        optionB.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        optionB.setBorder(null);
        optionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionBActionPerformed(evt);
            }
        });
        testPanel.add(optionB, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 130, 70));

        optionA.setBackground(new java.awt.Color(237, 0, 0));
        optionA.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        optionA.setBorder(null);
        optionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionAActionPerformed(evt);
            }
        });
        testPanel.add(optionA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 130, 70));

        optionC.setBackground(java.awt.Color.pink);
        optionC.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        optionC.setBorder(null);
        optionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionCActionPerformed(evt);
            }
        });
        testPanel.add(optionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 130, 70));

        optionD.setBackground(java.awt.Color.pink);
        optionD.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        optionD.setBorder(null);
        optionD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionDActionPerformed(evt);
            }
        });
        testPanel.add(optionD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 130, 70));

        nextButton.setBackground(new java.awt.Color(51, 153, 255));
        nextButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        nextButton.setForeground(new java.awt.Color(255, 255, 255));
        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        testPanel.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 90, 40));

        startLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        startLabel.setText("Press the start button to begin");
        testPanel.add(startLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 145, -1, -1));

        startButton.setBackground(new java.awt.Color(255, 255, 255));
        startButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        startButton.setForeground(new java.awt.Color(206, 0, 0));
        startButton.setText("START");
        startButton.setBorder(null);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        testPanel.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 150, 80));

        endGame.setBackground(new java.awt.Color(255, 186, 216));
        endGame.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        endGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        testPanel.add(endGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 430, 220));

        testAgain.setBackground(new java.awt.Color(255, 255, 255));
        testAgain.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        testAgain.setText("TEST AGAIN?");
        testAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testAgainActionPerformed(evt);
            }
        });
        testPanel.add(testAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, 40));

        scoreTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        scoreTxt.setText("Score: 0");
        testPanel.add(scoreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 110, 30));

        helpDisable.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        helpDisable.setText("Note: once you press the start button, help button will be disabled");
        testPanel.add(helpDisable, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 165, -1, -1));

        nextLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        testPanel.add(nextLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 145, -1, -1));

        getContentPane().add(testPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 656, 404));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * this method takes you to the back to the start frame when it is pressed
     *
     * @param evt - has the action event as a parameter for when the home button
     * pressed
     */
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        new EspanolApp(db).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButtonActionPerformed

    /**
     * this method exits the program when the exit button is pressed
     *
     * @param evt - has the action event as a parameter for when the exit button
     * pressed
     */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
     * this method is the actions that occur when the option b is pressed when
     * the user answers the question with option b. if answer b is the correct
     * answer for the question then the background will turn green, otherwise if
     * the option b is incorrect for the question then the background will turn
     * red when option b is pressed, the other buttons will disappear to prevent
     * the user pressing other buttons for the same question
     *
     * @param evt - has the action event as a parameter for when option B button
     * pressed
     */
    private void optionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionBActionPerformed
        if (question == 3 || question == 7) //correct questions
        {
            optionB.setBackground(Color.decode("#27d827"));
            score += 10;
            scoreTxt.setText("Score: " + score);

        } else {
            optionB.setBackground(Color.decode("#ff1313"));
        }
        if (optionB.hasFocus()) //makes the other buttons disappear once a button has been pressed so user cant press another button for one question
        {
            optionA.setVisible(false);
            optionC.setVisible(false);
            optionD.setVisible(false);
        }
        isAnswered();

    }//GEN-LAST:event_optionBActionPerformed
    /**
     * this method is the actions that occur when the option a is pressed when
     * the user answers the question with option a. if answer a is the correct
     * answer for the question then the background will turn green, otherwise if
     * the option a is incorrect for the question then the background will turn
     * red when option a is pressed, the other buttons will disappear to prevent
     * the user pressing other buttons for the same question
     *
     * @param evt - has the action event as a parameter for when option a button
     * pressed
     */
    private void optionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionAActionPerformed
        if (question == 2 || question == 5 || question == 9) {
            optionA.setBackground(Color.decode("#27d827"));
            score += 10;
            scoreTxt.setText("Score: " + score);

        } else {
            optionA.setBackground(Color.decode("#ff1313"));
        }

        if (optionA.hasFocus()) {
            optionB.setVisible(false);
            optionC.setVisible(false);
            optionD.setVisible(false);
        }

        isAnswered();


    }//GEN-LAST:event_optionAActionPerformed
    /**
     * this method is the actions that occur when the option c is pressed when
     * the user answers the question with option c. if answer c is the correct
     * answer for the question then the background will turn green, otherwise if
     * the option c is incorrect for the question then the background will turn
     * red when option c is pressed, the other buttons will disappear to prevent
     * the user pressing other buttons for the same question
     *
     * @param evt - has the action event as a parameter for when option c button
     * pressed
     */
    private void optionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionCActionPerformed
        if (question == 4 || question == 6 || question == 10) {
            optionC.setBackground(Color.decode("#27d827"));
            score += 10;
            scoreTxt.setText("Score: " + score);

        } else {
            optionC.setBackground(Color.decode("#ff1313"));
        }

        if (optionC.hasFocus()) {
            optionA.setVisible(false);
            optionB.setVisible(false);
            optionD.setVisible(false);

        }
        isAnswered();

    }//GEN-LAST:event_optionCActionPerformed
    /**
     * this method is the actions that occur when the option d is pressed when
     * the user answers the question with option d. if answer d is the correct
     * answer for the question then the background will turn green, otherwise if
     * the option d is incorrect for the question then the background will turn
     * red when option d is pressed, the other buttons will disappear to prevent
     * the user pressing other buttons for the same question
     *
     * @param evt - has the action event as a parameter for when option d button
     * pressed
     */
    private void optionDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionDActionPerformed
        if (question == 1 || question == 8) {
            optionD.setBackground(Color.decode("#27d827"));
            score += 10;
            scoreTxt.setText("Score: " + score);

        } else {
            optionD.setBackground(Color.decode("#ff1313"));
        }

        if (optionD.hasFocus()) {
            optionA.setVisible(false);
            optionC.setVisible(false);
            optionB.setVisible(false);

        }
        isAnswered();


    }//GEN-LAST:event_optionDActionPerformed

    /**
     * this method is the actions that occurs when the next button is pressed
     * after the user has answered the question
     *
     * @param evt - has the action event as a parameter for when next button
     * pressed
     */
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        nextLabel.setText("<html>Choose an answer and press next to continue<br>Each question is worth 10 points </html>");
        nextLabel.setVisible(true);
        optionA.setVisible(true);
        optionB.setVisible(true);
        optionC.setVisible(true);
        optionD.setVisible(true);
        optionA.setBackground(Color.white);
        optionB.setBackground(Color.white);
        optionC.setBackground(Color.white);
        optionD.setBackground(Color.white);

        try {
            questionAns();
        } catch (SQLException ex) {
            Logger.getLogger(BodypartTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        answered = false;
        nextButton.setEnabled(answered);


    }//GEN-LAST:event_nextButtonActionPerformed
    /**
     * this method is the actions that occurs when the start button is pressed
     * when the front page of the test page is displayed
     *
     * @param evt - has the action event as a parameter for when start button
     * pressed
     */
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        nextButton.setVisible(true);
        startButton.setVisible(false);
        helpDisable.setVisible(false);
        nextButtonActionPerformed(evt);
        nextButton.setEnabled(answered);
        helpButton.setEnabled(testStarted);


    }//GEN-LAST:event_startButtonActionPerformed
    /**
     * this method opens the start frame of the test when the test again button
     * is pressed at the end of a test
     *
     * @param evt - has the action event as a parameter for when the test again
     * button pressed
     */
    private void testAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testAgainActionPerformed
        new BodypartTest(db).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_testAgainActionPerformed

    /**
     * this method has the initial values of two components when the window is
     * first opened
     *
     * @param evt - has the window event as a parameter for when the body part
     * test frame is activated
     */
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        questionLabel.setText("Ready?");
        nextButton.setVisible(false);
    }//GEN-LAST:event_formWindowActivated
    /**
     * this method is the actions that occur when the help button is pressed, a
     * dialog pops up with general help on the program
     *
     * @param evt - has the action event as a parameter for when help button
     * pressed
     */
    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        helpDialog.setVisible(true);
    }//GEN-LAST:event_helpButtonActionPerformed
    /**
     * this method is the actions that occur when the ok button in the help
     * dialog is pressed and the dialog disappears
     *
     * @param evt - has the action event as a parameter for when ok button
     * pressed
     */
    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        helpDialog.dispose();
    }//GEN-LAST:event_okActionPerformed
    /**
     * this method activates the help dialog when the program when the help
     * button is pressed and the text of the dialog
     *
     * @param evt - has the window event as a parameter for when the help dialog
     * activated
     */
    private void helpDialogWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_helpDialogWindowActivated
        helpLabel.setText("<html>+ Each category has buttons where you can <br>&nbsp view the translations<br> + You can test yourself in the test mode"
                + "<br>+ Your score will be saved after a test<br> + Use the home button to go back home <br> + Use the exit button to leave the game at any time </html>");
    }//GEN-LAST:event_helpDialogWindowActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel endGame;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JDialog helpDialog;
    private javax.swing.JLabel helpDisable;
    private javax.swing.JLabel helpLabel;
    private javax.swing.JPanel helpPanel;
    private javax.swing.JLabel helpTitle;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel nextLabel;
    private javax.swing.JButton ok;
    private javax.swing.JButton optionA;
    private javax.swing.JButton optionB;
    private javax.swing.JButton optionC;
    private javax.swing.JButton optionD;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JLabel scoreTxt;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel startLabel;
    private javax.swing.JButton testAgain;
    private javax.swing.JPanel testPanel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    /**
     * this method holds all the questions and the possible answer options and
     * has text at the end once the test is finished
     *
     * @throws SQLException
     */
    public void questionAns() throws SQLException {
        question = question + 1;

        if (question == 1) {
            questionLabel.setText("1. What is the body part mouth?");
            optionA.setText("OREJAS");
            optionB.setText("BRAZO");
            optionC.setText("PIERNAS");
            optionD.setText("BOCA"); //CORRECT

        }
        if (question == 2) {
            questionLabel.setText("2. What is the body part piernas?");
            optionA.setText("LEGS"); //CORRECT
            optionB.setText("NOSE");
            optionC.setText("ARMS");
            optionD.setText("NECK");
        }
        if (question == 3) {
            questionLabel.setText("3. What is the body part eyes?");
            optionA.setText("NARIZ");
            optionB.setText("OJOS"); //CORRECT
            optionC.setText("ESPALDA");
            optionD.setText("MANOS");
        }
        if (question == 4) {
            questionLabel.setText("4. What is the body part espalda?");
            optionA.setText("EARS");
            optionB.setText("HANDS");
            optionC.setText("BACK"); //CORRECT
            optionD.setText("NECK");
        }
        if (question == 5) {
            questionLabel.setText("5. What is the body part arm?");
            optionA.setText("BRAZO"); //CORRECT
            optionB.setText("CUELLO");
            optionC.setText("PIES");
            optionD.setText("OREJAS");
        }
        if (question == 6) {
            questionLabel.setText("6. What is the body part orejas?");
            optionA.setText("BACK");
            optionB.setText("MOUTH");
            optionC.setText("EARS"); //CORRECT
            optionD.setText("EYES");
        }
        if (question == 7) {
            questionLabel.setText("7. What is the body part neck?");
            optionA.setText("PIES");
            optionB.setText("CUELLO"); //CORRECT
            optionC.setText("NARIZ");
            optionD.setText("BOCA");
        }
        if (question == 8) {
            questionLabel.setText("8. What is the body part nariz?");
            optionA.setText("EYES");
            optionB.setText("FEET");
            optionC.setText("MOUTH");
            optionD.setText("NOSE"); //CORRECT
        }
        if (question == 9) {
            questionLabel.setText("9. What is the body part hands?");
            optionA.setText("MANOS"); //CORRECT
            optionB.setText("ESPALDA");
            optionC.setText("PIERNAS");
            optionD.setText("OJOS");
        }
        if (question == 10) {
            questionLabel.setText("10. What is the body part pies?");
            optionA.setText("LEGS");
            optionB.setText("HANDS");
            optionC.setText("FEET"); //CORRECT
            optionD.setText("ARMS");
            nextButton.setText("FINISH");
        }

        if (question == 11) {
            endGame.setVisible(true);
            testAgain.setVisible(true);
            questionLabel.setVisible(false);
            nextLabel.setVisible(false);

            startLabel.setVisible(false);
            optionA.setVisible(false);
            optionB.setVisible(false);
            optionC.setVisible(false);
            optionD.setVisible(false);
            nextButton.setVisible(false);
            db.add(score);
            db.checkScore();

            if (score >= 50) {
                endGame.setText("<html>Well done! You completed the test!<BR>You have a score of " + score + " points!<br><BR>+ You can go back to the home page"
                        + "<BR>+ You can test yourself again<BR>+ You can exit the game</html>");
                if (score == 100) {
                    endGame.setText("<html>Perfect score!<br> You completed the test!<BR>You have a score of " + score + " points!<br><BR>+ You can go back to the home page"
                            + "<BR>+ You can test yourself again<BR>+ You can exit the game</html>");
                }
            } else if (score < 50) {
                endGame.setText("<html>Try harder next time!<br> You completed the test!<BR>You have a score of " + score + " points!<br><BR>+ You can go back to the home page"
                        + "<BR>+ You can test yourself again<BR>+ You can exit the game</html>");
            }

            testStarted();

        }
    }

    /**
     * this method allows the next button to be pressed only after the user has
     * pressed a button to answer the question
     */
    public void isAnswered() {
        answered = true;
        nextButton.setEnabled(answered);
    }

    /**
     * this method allows the help to be avaliable before and after a test but
     * not during a test
     */
    public void testStarted() {
        testStarted = true;
        helpButton.setEnabled(testStarted);
    }

    /**
     * this method sets the local variable question to the parameter question
     *
     * @param question - parameter to initialize the local variable
     */
    public void setQuestion(int question) {
        this.question = question;
    }

    /**
     * this method gets the local variable question and returns it
     *
     * @return int - returns the question variable
     */
    public int getQuestion() {
        return this.question;
    }

    /**
     * this method sets the local variable score to the parameter score
     *
     * @param score - parameter to initialize the local variable
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * this method gets the local variable score and returns it
     *
     * @return int - returns the score variable
     */
    public int getScore() {
        return this.question;
    }

    /**
     * this method sets the local variable answered to the parameter answered
     *
     * @param answered - parameter to initialize the local variable
     */
    public void setAnswered(boolean answered) {
        this.answered = answered;
    }

    /**
     * this method gets the local variable answered and returns it
     *
     * @return boolean - returns the answered variable
     */
    public boolean getAnswered() {
        return this.answered;
    }

    /**
     * this method sets the local variable testStarted to the parameter test
     *
     * @param test - parameter to initialize the local variable
     */
    public void setTestStarted(boolean test) {
        this.testStarted = test;
    }

    /**
     * this method gets the local variable testStarted and returns it
     *
     * @return boolean - returns the testStarted variable
     */
    public boolean getTestStarted() {
        return this.testStarted;
    }

    /**
     * this method sets the parameter database with the local variable database
     *
     * @param db - this takes in the spanish database variable
     */
    public void setDatabase(SpanishDB db) {
        this.db = db;
    }

    /**
     * this method returns the spanish database
     *
     * @return SpanishDB - this returns the database
     */
    public SpanishDB getDatabase() {
        return this.db;
    }
}

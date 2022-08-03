
import java.awt.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class TICTACTOE extends javax.swing.JFrame {

    /**
     * Creates new form TICTACTOE
     */
    public TICTACTOE() {
        initComponents();
    }
    private String startGame="X";
    private int XCount=0;
    private int OCount=0;
    private void gameScore()
    {
        jLabel4.setText(String.valueOf(XCount));
        jLabel5.setText(String.valueOf(OCount));
    }
    private void choosePlayer()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame="O";
        }
        else
        {
            startGame="X";
        }
    }
    private void winningGame()
    {
        String b1=button1.getText();
        String b2=button2.getText();
        String b3=button3.getText();
        String b4=button4.getText();
        String b5=button5.getText();
        String b6=button6.getText();
        String b7=button7.getText();
        String b8=button8.getText();
        String b9=button9.getText();
        if(b1=="X"&&b2=="X"&&b3=="X")
        {
             
            JOptionPane.showConfirmDialog(this,"Player X Win the Game");
           
            button1.setBackground(Color.red);
            button2.setBackground(Color.red);
            button3.setBackground(Color.red);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            XCount++;
            gameScore();                    
        }
        if(b4=="X"&&b5=="X"&&b6=="X")
        {
             
            JOptionPane.showConfirmDialog(this,"Player X Win the Game");
           
            button4.setBackground(Color.red);
            button5.setBackground(Color.red);
            button6.setBackground(Color.red);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            XCount++;
            gameScore();                    
        }
        if(b7=="X"&&b8=="X"&&b9=="X")
        {
             
            JOptionPane.showConfirmDialog(this,"Player X Win the Game");
           
            button7.setBackground(Color.red);
            button8.setBackground(Color.red);
            button9.setBackground(Color.red);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            XCount++;
            gameScore();                    
        }
        if(b1=="X"&&b4=="X"&&b7=="X")
        {
             
            JOptionPane.showConfirmDialog(this,"Player X Win the Game");
           
            button1.setBackground(Color.red);
            button4.setBackground(Color.red);
            button7.setBackground(Color.red);
            button8.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button9.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            XCount++;
            gameScore();                    
        }
        if(b2=="X"&&b5=="X"&&b8=="X")
        {
             
            JOptionPane.showConfirmDialog(this,"Player X Win the Game");
           
            button2.setBackground(Color.red);
            button5.setBackground(Color.red);
            button8.setBackground(Color.red);
            button1.setEnabled(false);
            button4.setEnabled(false);
            button3.setEnabled(false);
            button9.setEnabled(false);
            button7.setEnabled(false);
            button6.setEnabled(false);
            XCount++;
            gameScore();                    
        }
         if(b3=="X"&&b6=="X"&&b9=="X")
        {
             
            JOptionPane.showConfirmDialog(this,"Player X Win the Game");
           
            button3.setBackground(Color.red);
            button6.setBackground(Color.red);
            button9.setBackground(Color.red);
            button1.setEnabled(false);
            button4.setEnabled(false);
            button2.setEnabled(false);
            button5.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            XCount++;
            gameScore();                    
        }
          if(b1=="X"&&b5=="X"&&b9=="X")
        {
             
            JOptionPane.showConfirmDialog(this,"Player X Win the Game");
           
            button1.setBackground(Color.red);
            button5.setBackground(Color.red);
            button9.setBackground(Color.red);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button2.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            XCount++;
            gameScore();                    
        }
          if(b3=="X"&&b5=="X"&&b7=="X")
        {
             
            JOptionPane.showConfirmDialog(this,"Player X Win the Game");
           
            button3.setBackground(Color.red);
            button5.setBackground(Color.red);
            button7.setBackground(Color.red);
            button1.setEnabled(false);
            button4.setEnabled(false);
            button2.setEnabled(false);
            button6.setEnabled(false);
            button9.setEnabled(false);
            button8.setEnabled(false);
            XCount++;
            gameScore();                    
        }
          
          //O winning condition
          if(b1=="O"&&b2=="O"&&b3=="O")
        {
             
            JOptionPane.showConfirmDialog(this,"Player O Win the Game");
           
            button1.setBackground(Color.red);
            button2.setBackground(Color.red);
            button3.setBackground(Color.red);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            OCount++;
            gameScore();                    
        }
        if(b4=="O"&&b5=="O"&&b6=="O")
        {
             
            JOptionPane.showConfirmDialog(this,"Player O Win the Game");
           
            button4.setBackground(Color.red);
            button5.setBackground(Color.red);
            button6.setBackground(Color.red);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            OCount++;
            gameScore();                    
        }
        if(b7=="O"&&b8=="O"&&b9=="O")
        {
             
            JOptionPane.showConfirmDialog(this,"Player O Win the Game");
           
            button7.setBackground(Color.red);
            button8.setBackground(Color.red);
            button9.setBackground(Color.red);
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            OCount++;
            gameScore();                    
        }
        if(b1=="O"&&b4=="O"&&b7=="O")
        {
             
            JOptionPane.showConfirmDialog(this,"Player O Win the Game");
           
            button1.setBackground(Color.red);
            button4.setBackground(Color.red);
            button7.setBackground(Color.red);
            button8.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button9.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            OCount++;
            gameScore();                    
        }
        if(b2=="O"&&b5=="O"&&b8=="O")
        {
             
            JOptionPane.showConfirmDialog(this,"Player O Win the Game");
           
            button2.setBackground(Color.red);
            button5.setBackground(Color.red);
            button8.setBackground(Color.red);
            button1.setEnabled(false);
            button4.setEnabled(false);
            button3.setEnabled(false);
            button9.setEnabled(false);
            button7.setEnabled(false);
            button6.setEnabled(false);
            OCount++;
            gameScore();                    
        }
         if(b3=="O"&&b6=="O"&&b9=="O")
        {
             
            JOptionPane.showConfirmDialog(this,"Player O Win the Game");
           
            button3.setBackground(Color.red);
            button6.setBackground(Color.red);
            button9.setBackground(Color.red);
            button1.setEnabled(false);
            button4.setEnabled(false);
            button2.setEnabled(false);
            button5.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            OCount++;
            gameScore();                    
        }
          if(b1=="O"&&b5=="O"&&b9=="O")
        {
             
            JOptionPane.showConfirmDialog(this,"Player O Win the Game");
           
            button1.setBackground(Color.red);
            button5.setBackground(Color.red);
            button9.setBackground(Color.red);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button2.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            OCount++;
            gameScore();                    
        }
          if(b3=="O"&&b5=="O"&&b7=="O")
        {
             
            JOptionPane.showConfirmDialog(this,"Player O Win the Game");
           
            button3.setBackground(Color.red);
            button5.setBackground(Color.red);
            button7.setBackground(Color.red);
            button1.setEnabled(false);
            button4.setEnabled(false);
            button2.setEnabled(false);
            button6.setEnabled(false);
            button9.setEnabled(false);
            button8.setEnabled(false);
            OCount++;
            gameScore();                    
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setBackground(new java.awt.Color(102, 255, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("TIC TAC TOE GAME");

        button1.setBackground(new java.awt.Color(255, 255, 51));
        button1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button1.setForeground(new java.awt.Color(0, 0, 255));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(255, 255, 51));
        button2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button2.setForeground(new java.awt.Color(0, 0, 255));
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(255, 255, 51));
        button3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button3.setForeground(new java.awt.Color(0, 0, 255));
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(255, 255, 51));
        button4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button4.setForeground(new java.awt.Color(0, 0, 255));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setBackground(new java.awt.Color(255, 255, 51));
        button5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button5.setForeground(new java.awt.Color(0, 0, 255));
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(255, 255, 51));
        button6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button6.setForeground(new java.awt.Color(0, 0, 255));
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setBackground(new java.awt.Color(255, 255, 51));
        button7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button7.setForeground(new java.awt.Color(0, 0, 255));
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setBackground(new java.awt.Color(255, 255, 51));
        button8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button8.setForeground(new java.awt.Color(0, 0, 255));
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setBackground(new java.awt.Color(255, 255, 51));
        button9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button9.setForeground(new java.awt.Color(0, 0, 255));
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 255, 51));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 255));
        jButton10.setText("New Game");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 255, 51));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 255));
        jButton11.setText("Reset");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 255, 51));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 255));
        jButton12.setText("Exit");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Player 0:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Player X:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 102));
        jLabel4.setText("0");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 102));
        jLabel5.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 54, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton12)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        button1.setText(startGame);
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        button2.setText(startGame);
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        button3.setText(startGame);
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        button4.setText(startGame);
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
        button5.setText(startGame);
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
        button6.setText(startGame);
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        // TODO add your handling code here:
        button7.setText(startGame);
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
        button8.setText(startGame);
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
        button9.setText(startGame);
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_button9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        button1.setText(null);
        button2.setText(null);
        button3.setText(null);
        button4.setText(null);
        button5.setText(null);
        button6.setText(null);
        button7.setText(null);
        button8.setText(null);
        button9.setText(null);
        button1.setBackground(Color.yellow);
        button2.setBackground(Color.yellow);
        button3.setBackground(Color.yellow);
        button4.setBackground(Color.yellow);
        button5.setBackground(Color.yellow);
        button6.setBackground(Color.yellow);
        button7.setBackground(Color.yellow);
        button8.setBackground(Color.yellow);
        button9.setBackground(Color.yellow);   
                  
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        button1.setText(null);
        button2.setText(null);
        button3.setText(null);
        button4.setText(null);
        button5.setText(null);
        button6.setText(null);
        button7.setText(null);
        button8.setText(null);
        button9.setText(null);
        jLabel4.setText("0");
        jLabel5.setText("0");
        XCount=0;
        OCount=0;
        button1.setBackground(Color.yellow);
        button2.setBackground(Color.yellow);
        button3.setBackground(Color.yellow);
        button4.setBackground(Color.yellow);
        button5.setBackground(Color.yellow);
        button6.setBackground(Color.yellow);
        button7.setBackground(Color.yellow);
        button8.setBackground(Color.yellow);
        button9.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TICTACTOE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}

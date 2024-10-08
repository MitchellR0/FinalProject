/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author mitch
 */
public class BattleScreen extends javax.swing.JFrame {
    //Bring in players team from team select
    private ArrayList<Pokemon> team = TeamSelectGUI.getFinalTeam();
    private Pokemon currentPokemon;
    //Enemy Chamption Team
    private ArrayList<Pokemon> championTeam = TeamSelectGUI.getChampionTeam();
    private Pokemon enemyCurrentPokemon;
    //Turn bools
    private boolean playerTurn = true;
    
    private int heals = 3;
    private final Random random = new Random();
    
    private static int winner = 0;
    //Getter function
    public static int getWinner(){
        return winner;
    }
    
    private final TypeHashMapHelper typeHelper = new TypeHashMapHelper();
    
    /**
     * Creates new form battleScreen
     */
    public BattleScreen() {
        initComponents();
        btnHeal.setText("Heal: " + heals + "/3");
        //Set the first players pokemon up in the GUI
        Pokemon first = team.get(0);
        currentPokemon = first;
        updatePlayerGUI(first);

        //Set the enemys first pokemon in the GUI
        Pokemon enemyFirst = championTeam.get(0);
        enemyCurrentPokemon = enemyFirst;
        updateEnemyGUI(enemyFirst);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAttack1 = new javax.swing.JButton();
        btnAttack2 = new javax.swing.JButton();
        btnHeal = new javax.swing.JButton();
        btnSwitch = new javax.swing.JButton();
        imgPlayerPokemon = new javax.swing.JLabel();
        imgEnemyPokemon = new javax.swing.JLabel();
        lblPlayerPokeName = new javax.swing.JLabel();
        lblEnemyName = new javax.swing.JLabel();
        lblPlayerPokeHealth = new javax.swing.JLabel();
        lblEnemyHealth = new javax.swing.JLabel();
        lblPlayerPokeAtk1 = new javax.swing.JLabel();
        lblPlayerPokeAtk2 = new javax.swing.JLabel();
        lblRemainingHeals = new javax.swing.JLabel();
        lblPlayerAP = new javax.swing.JLabel();
        lblEnemyAP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDialog = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnAttack1.setText("Attack 1");
        btnAttack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttack1ActionPerformed(evt);
            }
        });

        btnAttack2.setText("Attack 2");
        btnAttack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttack2ActionPerformed(evt);
            }
        });

        btnHeal.setText("Heal: 3/3");
        btnHeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHealActionPerformed(evt);
            }
        });

        btnSwitch.setText("Switch");
        btnSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwitchActionPerformed(evt);
            }
        });

        imgPlayerPokemon.setText("jLabel1");

        imgEnemyPokemon.setText("jLabel2");

        lblPlayerPokeName.setText("name");

        lblEnemyName.setText("name");

        lblPlayerPokeHealth.setText("health");

        lblEnemyHealth.setText("health");

        lblPlayerPokeAtk1.setText("type");

        lblPlayerPokeAtk2.setText("type");

        lblPlayerAP.setText("attack power");

        lblEnemyAP.setText("attack power");

        jtaDialog.setColumns(20);
        jtaDialog.setRows(5);
        jtaDialog.setText("Player's turn");
        jScrollPane1.setViewportView(jtaDialog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPlayerAP)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPlayerPokeName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEnemyName))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imgPlayerPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPlayerPokeHealth))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEnemyHealth)
                                    .addComponent(imgEnemyPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEnemyAP))))
                        .addGap(42, 42, 42))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAttack1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblPlayerPokeAtk1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAttack2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlayerPokeAtk2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHeal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRemainingHeals))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayerPokeName)
                    .addComponent(lblEnemyName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imgPlayerPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgEnemyPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayerPokeHealth)
                    .addComponent(lblEnemyHealth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayerAP)
                    .addComponent(lblEnemyAP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlayerPokeAtk1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPlayerPokeAtk2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAttack1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHeal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAttack2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblRemainingHeals)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAttack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttack1ActionPerformed
        //type 1 attack
        if (playerTurn == true){
            playerTurn = false;
            attackSequence(currentPokemon, enemyCurrentPokemon, 0);
            //update enemy health
            lblEnemyHealth.setText("Health: " + enemyCurrentPokemon.getCurrentHealth() + "/" + enemyCurrentPokemon.getMaxHealth());
            enemyAttack();
        }
    }//GEN-LAST:event_btnAttack1ActionPerformed

    private void btnAttack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttack2ActionPerformed
        //type 2 attack
        if (playerTurn == true){
            playerTurn = false;
            attackSequence(currentPokemon, enemyCurrentPokemon, 0);
            //update enemy health
            lblEnemyHealth.setText("Health: " + enemyCurrentPokemon.getCurrentHealth() + "/" + enemyCurrentPokemon.getMaxHealth());
            enemyAttack();
        }
    }//GEN-LAST:event_btnAttack2ActionPerformed

    private void btnHealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHealActionPerformed
        if (playerTurn == true){
            playerTurn = false;
            //check if player has any heals left
            if (heals > 0){
                heals--;
                //update GUI
                currentPokemon.setCurrentHealth();
                btnHeal.setText("Heal: " + heals + "/3");
                lblPlayerPokeHealth.setText("Health: " + currentPokemon.getCurrentHealth() + "/" + currentPokemon.getMaxHealth());
            }
            if (heals == 0){
                btnHeal.setEnabled(false);
            }
            enemyAttack();
        }
    }//GEN-LAST:event_btnHealActionPerformed

    private void btnSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwitchActionPerformed
        if (playerTurn == true){
            playerTurn = false;
            //Make arraylist of options that are only names and corresponding list for pokemon
            ArrayList<String> optionsAL = new ArrayList<>();
            ArrayList<Pokemon> optionsNP = new ArrayList<>();
            for (int i = 0; i < team.size(); i++){
                if (team.get(i).getIsAlive() == true){
                    optionsAL.add(team.get(i).getName());
                    optionsNP.add(team.get(i));
                }
            }

            boolean loop = true;
            while (loop == true){
                //get choice from user
                int choice = JOptionPane.showOptionDialog(null, "Choose pokemon to switch to: ", "Switch",
                         JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                         null, optionsAL.toArray(), optionsAL.get(0));
                //make sure its a valid choice
                if (choice != -1){
                    if (optionsNP.get(choice) == currentPokemon){
                        playerTurn = true;
                        return;
                    }
                    //update the current pokemon
                    Pokemon switchedPokemon = optionsNP.get(choice);
                    currentPokemon = switchedPokemon;
                    updatePlayerGUI(switchedPokemon); 
                    loop = false;
                }
                //if choice is not valid it loops back and continues to ask until it gets a proper response
            }
            enemyAttack();
        }
    }//GEN-LAST:event_btnSwitchActionPerformed

    //Enemy Attack 
    private void enemyAttack(){
        //check to see if enemy pokemon is dead
        if (enemyCurrentPokemon.getIsAlive() == false){
            //update Dialog
            jtaDialog.append("\n" + enemyCurrentPokemon.getName() + " fainted.");
            //make an array list for the rest of the pokemon that the enemy has alive
            ArrayList<Pokemon> enemyListAlive = new ArrayList<>();
            for (int i = 0; i < championTeam.size(); i++){
                if (championTeam.get(i).getIsAlive() == true){
                    enemyListAlive.add(championTeam.get(i));
                }
            }
            //if the list is not empty, switch to a different pokemon
            if (!enemyListAlive.isEmpty()) {
                //get an index for the pokemon to switch to
                int switchTo = random.nextInt(enemyListAlive.size());
                Pokemon tmp = enemyListAlive.get(switchTo);
                //update GUI with new enemy current pokemon
                enemyCurrentPokemon = tmp;
                updateEnemyGUI(tmp);
                playerTurn = true;
            } else {   //if there are no pokemon left, player wins
                jtaDialog.append("\nPlayer WINS");
                winner = 1;
                new PostBattleScreen().setVisible(true);
                BattleScreen.this.setVisible(false);
            }
            return;
        }
        //AI randomly picks a choice 0 through 4, being attack1, attack2, heal, and switch respectivly
        //The fact that the AI does not have a limit on heals is a decision I made, because the player
        //has the advantage of always going first.
        int choice = random.nextInt(4);
        //If its 0 or if its 1 and the pokemon only has one type then attack 1
        if ((choice == 0) || ((choice == 1) && (enemyCurrentPokemon.getTypes().length == 1))){
            attackSequence(enemyCurrentPokemon, currentPokemon, 0);
            lblPlayerPokeHealth.setText("Health: " + currentPokemon.getCurrentHealth() + "/" + currentPokemon.getMaxHealth());
            
        } else if (choice == 1){ //If choice is 1 then second attack
            attackSequence(enemyCurrentPokemon, currentPokemon, 1);
            lblPlayerPokeHealth.setText("Health: " + currentPokemon.getCurrentHealth() + "/" + currentPokemon.getMaxHealth());
            
        } else if (choice == 2){ //If choice is 2 then heal
            enemyCurrentPokemon.setCurrentHealth();
            lblEnemyHealth.setText("Health: " + enemyCurrentPokemon.getCurrentHealth() + "/" + enemyCurrentPokemon.getMaxHealth());
            jtaDialog.append("\n" + enemyCurrentPokemon.getName() +" Healed");
        } else { //If choice is 3 then switch
            //make an ArrayList for the enemies that are alive
            ArrayList<Pokemon> enemyListAlive = new ArrayList<>();
            for (int i = 0; i < championTeam.size(); i++){
                if (championTeam.get(i).getIsAlive() == true){
                    enemyListAlive.add(championTeam.get(i));
                }
            }
            //Switch to a random number in that list
            int switchTo = random.nextInt(enemyListAlive.size());
            Pokemon tmp = enemyListAlive.get(switchTo);
            //update GUI with new enemy current pokemon
            enemyCurrentPokemon = tmp;
            updateEnemyGUI(tmp);
            jtaDialog.append("\nEnemy switched to " + enemyCurrentPokemon.getName());
        }
        
        //check to see if player pokemon is dead, if so force user to switch unless there is none left, in which the enemy wins
        if  (currentPokemon.getIsAlive() == false){
            ArrayList<String> optionsAL = new ArrayList<>();
            ArrayList<Pokemon> optionsNP = new ArrayList<>();
            for (int i = 0; i < team.size(); i++){
                if (team.get(i).getIsAlive() == true){
                    optionsAL.add(team.get(i).getName());
                    optionsNP.add(team.get(i));
                }
            }
            //if the options aren't empty, prompt the user to switch
            if (!optionsNP.isEmpty()){
                int playerChoice = JOptionPane.showOptionDialog(null, "Choose pokemon to switch to: ", "Switch",
                         JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                         null, optionsAL.toArray(), optionsAL.get(0));

                //make sure its a valid choice
                if (playerChoice != -1){
                    //update the current pokemon
                    Pokemon switchedPokemon = optionsNP.get(playerChoice);
                    currentPokemon = switchedPokemon;
                    updatePlayerGUI(switchedPokemon);  
                }
            } else { //enemy wins if list is empty
                jtaDialog.append("\nEnemy WINS");
                winner = 0;
                new PostBattleScreen().setVisible(true);
                BattleScreen.this.setVisible(false);
            }
        }
        //end of enemy turn, reset player turn back to true
        playerTurn = true;
    }
    
    public void updateEnemyGUI(Pokemon p){
        //updates the enemy side of the GUI
        try {
            URL enemyImgURL = new URL(p.getSprites().getImg());
            ImageIcon enemyFinalImage = new ImageIcon(enemyImgURL);
            imgEnemyPokemon.setIcon(enemyFinalImage);
            
            lblEnemyName.setText(p.getName());
            lblEnemyAP.setText("Attack Power: " + p.getAttackPower() + "");
            
            lblEnemyHealth.setText("Health: " + p.getCurrentHealth() + "/" + p.getMaxHealth());
        } catch (MalformedURLException ex) {
            Logger.getLogger(BattleScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void updatePlayerGUI(Pokemon p){
        //updates the player side of the GUI
        try {
            URL imgURL = new URL(p.getSprites().getImg());
            ImageIcon finalImage = new ImageIcon(imgURL);
            imgPlayerPokemon.setIcon(finalImage);
            
            lblPlayerPokeName.setText(p.getName());
            
            lblPlayerPokeHealth.setText("Health: " + p.getCurrentHealth() + "/" + p.getMaxHealth());
            lblPlayerAP.setText("Attack Power: " + p.getAttackPower());
            
            if (p.getTypes().length == 1){
                lblPlayerPokeAtk1.setText(p.getTypes()[0].type.name);
                btnAttack2.setEnabled(false);
                lblPlayerPokeAtk2.setText("");
            } else {
                lblPlayerPokeAtk1.setText(p.getTypes()[0].type.name);
                lblPlayerPokeAtk2.setText(p.getTypes()[1].type.name);
                btnAttack2.setEnabled(true);
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(BattleScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void attackSequence(Pokemon attacker, Pokemon defender, int moveNum){
        //this function takes an attacker, defender, and move num (either 1 or 2)
        //and computes the attack as well as the dialog for it
        double multiplier;
        //compute attack damage
        if (defender.getTypes().length == 1){ //enemy is one type
            //gets the multiplier of attackers type against enemies type
            multiplier = typeHelper.getTypeMatchup(attacker.getTypes()[moveNum].type.name, 
                    defender.getTypes()[0].type.name);
            defender.attacked(attacker.getAttackPower() * multiplier);
        } else { //enemy is double typed
            //gets both multipliers of attackers type against both defenders types
            double multiplier1 = typeHelper.getTypeMatchup(attacker.getTypes()[moveNum].type.name, 
                    defender.getTypes()[0].type.name);
            double multiplier2 = typeHelper.getTypeMatchup(attacker.getTypes()[moveNum].type.name, 
                    defender.getTypes()[1].type.name);
            //final multiplier
            multiplier = multiplier1 * multiplier2;
            defender.attacked(attacker.getAttackPower() * multiplier);
        }

        //dialog options based on the multiplier
        if ((multiplier == 2.0) || (multiplier == 4.0)){
            jtaDialog.append("\n" + attacker.getName() + " attacked " + defender.getName() + " for " + 
                    attacker.getAttackPower() * multiplier + " damage. It was super effective!");
        } else if (multiplier == 0.5){
            jtaDialog.append("\n" + attacker.getName() + " attacked " + defender.getName() + " for " + 
                    attacker.getAttackPower() * multiplier + " damage. It was not very effective.");
        } else if (multiplier == 0.0){
            jtaDialog.append("\n" + attacker.getName() + " attacked " + defender.getName() + " for " + 
                    attacker.getAttackPower() * multiplier + " damage. It had no effect.");
        } else {
            jtaDialog.append("\n" + attacker.getName() + " attacked " + defender.getName() + " for " + 
                    attacker.getAttackPower() * multiplier + " damage.");
        }
    }
    
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
            java.util.logging.Logger.getLogger(BattleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BattleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BattleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BattleScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BattleScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttack1;
    private javax.swing.JButton btnAttack2;
    private javax.swing.JButton btnHeal;
    private javax.swing.JButton btnSwitch;
    private javax.swing.JLabel imgEnemyPokemon;
    private javax.swing.JLabel imgPlayerPokemon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaDialog;
    private javax.swing.JLabel lblEnemyAP;
    private javax.swing.JLabel lblEnemyHealth;
    private javax.swing.JLabel lblEnemyName;
    private javax.swing.JLabel lblPlayerAP;
    private javax.swing.JLabel lblPlayerPokeAtk1;
    private javax.swing.JLabel lblPlayerPokeAtk2;
    private javax.swing.JLabel lblPlayerPokeHealth;
    private javax.swing.JLabel lblPlayerPokeName;
    private javax.swing.JLabel lblRemainingHeals;
    // End of variables declaration//GEN-END:variables
}

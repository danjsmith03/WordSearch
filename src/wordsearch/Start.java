/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

import javax.swing.JOptionPane;

/**
 * @author Daniel Smith
 * This Class is the start screen for the word search GUI
 */
public class Start extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    public Start() {
        initComponents();
    }
    
    private void displayRules() {
        StringBuilder rulesmsg = new StringBuilder();
        rulesmsg.append("Rules:\n\n");
        rulesmsg.append("The classic Word Search game involves a 20x20 grid.\n"
                + "There will be 16 words at the bottom of the screen that you will\n"
                + "need to find.  Click the left mouse button and drag on the screen\n"
                + "to select a word.  When you find a word it will turn the border\n"
                + "of the letter green so that you know it was found.  Once all 16\n"
                + "words are found you have completed the word search.  You can click\n"
                + "the New Word Search button to start a new game or Exit to quit.");
        
        JOptionPane.showMessageDialog(null,
                                      rulesmsg,
                                      "Word Search",
                                      JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wordsearchlabel = new javax.swing.JLabel();
        startbutton = new javax.swing.JButton();
        rulesbutton = new javax.swing.JButton();
        wordsearchimage = new javax.swing.JLabel();
        createdbylabel = new javax.swing.JLabel();
        dedicatedlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wordsearchlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        wordsearchlabel.setText("Word Search");
        wordsearchlabel.setToolTipText("");

        startbutton.setText("Start");
        startbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startbuttonActionPerformed(evt);
            }
        });

        rulesbutton.setText("Rules");
        rulesbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rulesbuttonActionPerformed(evt);
            }
        });

        wordsearchimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wordsearch/wordsearch.jpg"))); // NOI18N

        createdbylabel.setText("Created By: Dan Smith");

        dedicatedlabel.setText("Dedicated to: Ariel Smith");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(wordsearchlabel)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startbutton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rulesbutton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(60, 60, 60)
                        .addComponent(wordsearchimage)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dedicatedlabel)
                            .addComponent(createdbylabel))
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wordsearchlabel)
                        .addGap(61, 61, 61)
                        .addComponent(startbutton)
                        .addGap(37, 37, 37)
                        .addComponent(rulesbutton))
                    .addComponent(wordsearchimage))
                .addGap(18, 18, 18)
                .addComponent(createdbylabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dedicatedlabel)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startbuttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
        Input input = new Input();
        input.addMouseListener(new MoreMouseEvents());
        input.addMouseMotionListener(new MouseMotionEvent());
        input.pack();
        input.setLocationRelativeTo(null);
        input.setTitle("Word Search");
        input.setVisible(true);
    }//GEN-LAST:event_startbuttonActionPerformed

    private void rulesbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rulesbuttonActionPerformed
        // TODO add your handling code here:
        displayRules();
    }//GEN-LAST:event_rulesbuttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createdbylabel;
    private javax.swing.JLabel dedicatedlabel;
    private javax.swing.JButton rulesbutton;
    private javax.swing.JButton startbutton;
    private javax.swing.JLabel wordsearchimage;
    private javax.swing.JLabel wordsearchlabel;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * @author Daniel Smith
 * This Class is the input screen for the word search GUI
 */
public class Input extends javax.swing.JFrame {
    
    private WordSearch ws;
    
    /**
     * Creates new form Input
     */
    public Input() {       
        generateNewPuzzle();
    }
    
    public static JLabel getWord1() {
        return word1;
    }
    
    public static JLabel getWord2() {
        return word2;
    }
    
    public static JLabel getWord3() {
        return word3;
    }
    
    public static JLabel getWord4() {
        return word4;
    }
    
    public static JLabel getWord5() {
        return word5;
    }
    
    public static JLabel getWord6() {
        return word6;
    }
    
    public static JLabel getWord7() {
        return word7;
    }
    
    public static JLabel getWord8() {
        return word8;
    }
    
    public static JLabel getWord9() {
        return word9;
    }
    
    public static JLabel getWord10() {
        return word10;
    }
    
    public static JLabel getWord11() {
        return word11;
    }
    
    public static JLabel getWord12() {
        return word12;
    }
    
    public static JLabel getWord13() {
        return word13;
    }
    
    public static JLabel getWord14() {
        return word14;
    }
    
    public static JLabel getWord15() {
        return word15;
    }
    
    public static JLabel getWord16() {
        return word16;
    }
    
    private static void clearSelections() {
        JTextField txt[] = setJTextFieldArray();
        
        for(int i = 1; i <= txt.length; i++)
        {
            Border border = BorderFactory.createLineBorder(Color.BLACK, 0);
            txt[i-1].setBorder(border);
        }
        
        WordSearch.found_array = new boolean[WordSearch.getTotalWords()];
        
        word1.setForeground(Color.BLACK);
        word2.setForeground(Color.BLACK);
        word3.setForeground(Color.BLACK);
        word4.setForeground(Color.BLACK);
        word5.setForeground(Color.BLACK);
        word6.setForeground(Color.BLACK);
        word7.setForeground(Color.BLACK);
        word8.setForeground(Color.BLACK);
        word9.setForeground(Color.BLACK);
        word10.setForeground(Color.BLACK);
        word11.setForeground(Color.BLACK);
        word12.setForeground(Color.BLACK);
        word13.setForeground(Color.BLACK);
        word14.setForeground(Color.BLACK);
        word15.setForeground(Color.BLACK);
        word16.setForeground(Color.BLACK);
        
        WordSearch.setWordsFound(0);
    }
    
    public static JTextField[] setJTextFieldArray() {
        JTextField txt[] = {jTextField0000, jTextField0001, jTextField0002, jTextField0003, jTextField0004, jTextField0005, jTextField0006, jTextField0007, jTextField0008, jTextField0009,
                            jTextField0010, jTextField0011, jTextField0012, jTextField0013, jTextField0014, jTextField0015, jTextField0016, jTextField0017, jTextField0018, jTextField0019,
                            jTextField0100, jTextField0101, jTextField0102, jTextField0103, jTextField0104, jTextField0105, jTextField0106, jTextField0107, jTextField0108, jTextField0109,
                            jTextField0110, jTextField0111, jTextField0112, jTextField0113, jTextField0114, jTextField0115, jTextField0116, jTextField0117, jTextField0118, jTextField0119};
        
        return txt;
    }

    public static void findJTextFields(MouseEvent e) {
        
        //Obtain mouse drag location
        Point pointe = e.getLocationOnScreen();
        
        JTextField txt[] = setJTextFieldArray();
        
        for(int i = 1; i <= txt.length; i++)
        {   
            //Obtain textfield location
            Point textfield = txt[i-1].getLocationOnScreen();
            int startx = textfield.x;
            int endx = textfield.x + txt[i-1].getWidth();
        
            int starty = textfield.y;
            int endy = textfield.y + txt[i-1].getHeight();

            //Set border if mouse dragged over a textfield
            if (pointe.x >= startx && pointe.x <= endx &&
                pointe.y >= starty && pointe.y <= endy) {
                Border border = BorderFactory.createLineBorder(Color.RED, 1);
                    
                txt[i-1].setBorder(border);
                
                WordSearch.setFoundWordsBorder();
            }
        }
    }
    
    /**
     * This function exits the game when the button is pressed
     */
    private void exitWordSearch() {
        System.exit(0);
    }
    
    /**
     * This function generates a new word search puzzle
     */
    private void generateNewPuzzle() {
        ws = new WordSearch();
        
        ws.nextBoard();
        
        initComponents();
        
        clearSelections();
        
        word1.setText(WordSearch.array_list.get(0));
        word2.setText(WordSearch.array_list.get(1));
        word3.setText(WordSearch.array_list.get(2));
        word4.setText(WordSearch.array_list.get(3));
        word5.setText(WordSearch.array_list.get(4));
        word6.setText(WordSearch.array_list.get(5));
        word7.setText(WordSearch.array_list.get(6));
        word8.setText(WordSearch.array_list.get(7));
        word9.setText(WordSearch.array_list.get(8));
        word10.setText(WordSearch.array_list.get(9));
        word11.setText(WordSearch.array_list.get(10));
        word12.setText(WordSearch.array_list.get(11));
        word13.setText(WordSearch.array_list.get(12));
        word14.setText(WordSearch.array_list.get(13));
        word15.setText(WordSearch.array_list.get(14));
        word16.setText(WordSearch.array_list.get(15));
        
        JTextField txt[] = setJTextFieldArray();
        
        int counter1 = 0, counter2 = 0;
        
        for(int i = 1; i <= txt.length; i++)
        {        
            txt[i-1].setText(String.valueOf(WordSearch.word_search[counter2][counter1]));
            txt[i-1].setEditable(false);
            
            counter1 += 1;
            
            if (counter1 == WordSearch.getNumColumns()) {
                counter1 = 0;
                counter2 += 1;
            }
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

        wordsearchlabel = new javax.swing.JLabel();
        word1 = new javax.swing.JLabel();
        word3 = new javax.swing.JLabel();
        word2 = new javax.swing.JLabel();
        word4 = new javax.swing.JLabel();
        word5 = new javax.swing.JLabel();
        word6 = new javax.swing.JLabel();
        word7 = new javax.swing.JLabel();
        word8 = new javax.swing.JLabel();
        word15 = new javax.swing.JLabel();
        word16 = new javax.swing.JLabel();
        word11 = new javax.swing.JLabel();
        word10 = new javax.swing.JLabel();
        word9 = new javax.swing.JLabel();
        word14 = new javax.swing.JLabel();
        word12 = new javax.swing.JLabel();
        word13 = new javax.swing.JLabel();
        jTextField0000 = new javax.swing.JTextField();
        jTextField0001 = new javax.swing.JTextField();
        jTextField0002 = new javax.swing.JTextField();
        jTextField0003 = new javax.swing.JTextField();
        jTextField0004 = new javax.swing.JTextField();
        jTextField0005 = new javax.swing.JTextField();
        jTextField0006 = new javax.swing.JTextField();
        jTextField0007 = new javax.swing.JTextField();
        jTextField0008 = new javax.swing.JTextField();
        jTextField0009 = new javax.swing.JTextField();
        jTextField0010 = new javax.swing.JTextField();
        jTextField0011 = new javax.swing.JTextField();
        jTextField0012 = new javax.swing.JTextField();
        jTextField0013 = new javax.swing.JTextField();
        jTextField0014 = new javax.swing.JTextField();
        jTextField0015 = new javax.swing.JTextField();
        jTextField0016 = new javax.swing.JTextField();
        jTextField0017 = new javax.swing.JTextField();
        jTextField0018 = new javax.swing.JTextField();
        jTextField0019 = new javax.swing.JTextField();
        jTextField0103 = new javax.swing.JTextField();
        jTextField0104 = new javax.swing.JTextField();
        jTextField0101 = new javax.swing.JTextField();
        jTextField0102 = new javax.swing.JTextField();
        jTextField0109 = new javax.swing.JTextField();
        jTextField0108 = new javax.swing.JTextField();
        jTextField0107 = new javax.swing.JTextField();
        jTextField0106 = new javax.swing.JTextField();
        jTextField0105 = new javax.swing.JTextField();
        jTextField0100 = new javax.swing.JTextField();
        jTextField0110 = new javax.swing.JTextField();
        jTextField0112 = new javax.swing.JTextField();
        jTextField0111 = new javax.swing.JTextField();
        jTextField0114 = new javax.swing.JTextField();
        jTextField0113 = new javax.swing.JTextField();
        jTextField0115 = new javax.swing.JTextField();
        jTextField0116 = new javax.swing.JTextField();
        jTextField0117 = new javax.swing.JTextField();
        jTextField0118 = new javax.swing.JTextField();
        jTextField0119 = new javax.swing.JTextField();
        newwordsearchbutton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        clearselectionsbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wordsearchlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        wordsearchlabel.setText("Word Search");

        word1.setText("1");
        word1.setOpaque(true);

        word3.setText("3");

        word2.setText("2");

        word4.setText("4");

        word5.setText("5");

        word6.setText("6");

        word7.setText("7");

        word8.setText("8");

        word15.setText("15");

        word16.setText("16");

        word11.setText("11");

        word10.setText("10");

        word9.setText("9");

        word14.setText("14");

        word12.setText("12");

        word13.setText("13");

        jTextField0000.setOpaque(false);
        jTextField0000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0000ActionPerformed(evt);
            }
        });

        jTextField0006.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0006ActionPerformed(evt);
            }
        });

        jTextField0106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0106ActionPerformed(evt);
            }
        });

        jTextField0100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0100ActionPerformed(evt);
            }
        });

        newwordsearchbutton.setText("New Word Search");
        newwordsearchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newwordsearchbuttonActionPerformed(evt);
            }
        });

        exitbutton.setText("Exit");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        clearselectionsbutton.setText("Clear Selection(s)");
        clearselectionsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearselectionsbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(word11)
                            .addComponent(word10)
                            .addComponent(word9)
                            .addComponent(word12)))
                    .addComponent(wordsearchlabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(word15)
                            .addComponent(word16)
                            .addComponent(word14)
                            .addComponent(word13)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(word6)
                            .addComponent(word5)
                            .addComponent(word7)
                            .addComponent(word8)))
                    .addComponent(word3)
                    .addComponent(word2)
                    .addComponent(word1)
                    .addComponent(word4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField0100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField0000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0002, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0003, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0004, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField0105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField0005, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField0106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField0006, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0007, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0008, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0009, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField0010, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField0110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField0111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField0011, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0012, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0013, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0014, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField0015, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField0115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField0016, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0017, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0018, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0019, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField0116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField0119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newwordsearchbutton)
                        .addGap(18, 18, 18)
                        .addComponent(clearselectionsbutton)
                        .addGap(18, 18, 18)
                        .addComponent(exitbutton)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(wordsearchlabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField0000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0002, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0003, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0004, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0005, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0006, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0007, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0008, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0009, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0010, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0011, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0012, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0013, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0014, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0015, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0016, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0017, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0018, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0019, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField0100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 386, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(word1)
                    .addComponent(word5)
                    .addComponent(word9)
                    .addComponent(word13))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(word2)
                    .addComponent(word6)
                    .addComponent(word10)
                    .addComponent(word14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(word3)
                    .addComponent(word7)
                    .addComponent(word15)
                    .addComponent(word11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(word4)
                    .addComponent(word8)
                    .addComponent(word16)
                    .addComponent(word12))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newwordsearchbutton)
                    .addComponent(exitbutton)
                    .addComponent(clearselectionsbutton))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField0000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0000ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0000ActionPerformed

    private void jTextField0006ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0006ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0006ActionPerformed

    private void jTextField0106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0106ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0106ActionPerformed

    private void jTextField0100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0100ActionPerformed

    private void newwordsearchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newwordsearchbuttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
        Input input = new Input();
        input.addMouseMotionListener(new MouseMotionEvent());
        input.pack();
        input.setLocationRelativeTo(null);
        input.setTitle("Word Search");
        input.setVisible(true);
    }//GEN-LAST:event_newwordsearchbuttonActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        // TODO add your handling code here:
        exitWordSearch();
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void clearselectionsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearselectionsbuttonActionPerformed
        // TODO add your handling code here:
        clearSelections();
    }//GEN-LAST:event_clearselectionsbuttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearselectionsbutton;
    private javax.swing.JButton exitbutton;
    private static javax.swing.JTextField jTextField0000;
    private static javax.swing.JTextField jTextField0001;
    private static javax.swing.JTextField jTextField0002;
    private static javax.swing.JTextField jTextField0003;
    private static javax.swing.JTextField jTextField0004;
    private static javax.swing.JTextField jTextField0005;
    private static javax.swing.JTextField jTextField0006;
    private static javax.swing.JTextField jTextField0007;
    private static javax.swing.JTextField jTextField0008;
    private static javax.swing.JTextField jTextField0009;
    private static javax.swing.JTextField jTextField0010;
    private static javax.swing.JTextField jTextField0011;
    private static javax.swing.JTextField jTextField0012;
    private static javax.swing.JTextField jTextField0013;
    private static javax.swing.JTextField jTextField0014;
    private static javax.swing.JTextField jTextField0015;
    private static javax.swing.JTextField jTextField0016;
    private static javax.swing.JTextField jTextField0017;
    private static javax.swing.JTextField jTextField0018;
    private static javax.swing.JTextField jTextField0019;
    private static javax.swing.JTextField jTextField0100;
    private static javax.swing.JTextField jTextField0101;
    private static javax.swing.JTextField jTextField0102;
    private static javax.swing.JTextField jTextField0103;
    private static javax.swing.JTextField jTextField0104;
    private static javax.swing.JTextField jTextField0105;
    private static javax.swing.JTextField jTextField0106;
    private static javax.swing.JTextField jTextField0107;
    private static javax.swing.JTextField jTextField0108;
    private static javax.swing.JTextField jTextField0109;
    private static javax.swing.JTextField jTextField0110;
    private static javax.swing.JTextField jTextField0111;
    private static javax.swing.JTextField jTextField0112;
    private static javax.swing.JTextField jTextField0113;
    private static javax.swing.JTextField jTextField0114;
    private static javax.swing.JTextField jTextField0115;
    private static javax.swing.JTextField jTextField0116;
    private static javax.swing.JTextField jTextField0117;
    private static javax.swing.JTextField jTextField0118;
    private static javax.swing.JTextField jTextField0119;
    private javax.swing.JButton newwordsearchbutton;
    private static javax.swing.JLabel word1;
    private static javax.swing.JLabel word10;
    private static javax.swing.JLabel word11;
    private static javax.swing.JLabel word12;
    private static javax.swing.JLabel word13;
    private static javax.swing.JLabel word14;
    private static javax.swing.JLabel word15;
    private static javax.swing.JLabel word16;
    private static javax.swing.JLabel word2;
    private static javax.swing.JLabel word3;
    private static javax.swing.JLabel word4;
    private static javax.swing.JLabel word5;
    private static javax.swing.JLabel word6;
    private static javax.swing.JLabel word7;
    private static javax.swing.JLabel word8;
    private static javax.swing.JLabel word9;
    private javax.swing.JLabel wordsearchlabel;
    // End of variables declaration//GEN-END:variables
}

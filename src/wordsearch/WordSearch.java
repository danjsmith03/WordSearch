/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author Daniel Smith
 * This Class is the main class for a word search game.
 */
public class WordSearch {
    
    private static final int TOTAL_WORDS = 16;  // Total # of word search words
    private static final int TOTAL_OPTIONS = 4; // Total # of options (Horizontal (Reverse), Horizontal (Forward), Vertical (Bottom to Top), Vertical (Top to Bottom))
    private static final int NUM_ROWS = 20;     // Total # of rows in the word search
    private static final int NUM_COLUMNS = 20;  // Total # of columns in the word search
    private static final int EACH_OPTION = TOTAL_WORDS/TOTAL_OPTIONS;
    private static int WORDS_FOUND = 0;         // Total # of words found
    
    public static char[][] word_search;
    public static ArrayList<String> array_list;
    public static Point[][] array_of_points;
    public static boolean[] found_array;
    
    private static int[] option_count;
    private static List<Integer> solution;
    
    /**
     *Constructor.  Resets board to zeros
     */
    public WordSearch() {
        array_list = new ArrayList<>();
        solution = new ArrayList<>();
        option_count = new int[TOTAL_OPTIONS];
        word_search = new char[NUM_ROWS][NUM_COLUMNS];
        array_of_points = new Point[TOTAL_WORDS][];
        found_array = new boolean[TOTAL_WORDS];
    }
    
    public static void setWordsFound(int words_found) {
        WORDS_FOUND = words_found;
    }
    
    public static int getTotalWords() {
        return TOTAL_WORDS;
    }
    
    public static int getNumColumns() {
        return NUM_COLUMNS;
    }
    
    /**
     * This function will display the contents of the array_of_points Points array
     */
    private static void displayPointsArray() {
        for (int i = 0; i < TOTAL_WORDS; i++){
            System.out.println("Word: " + array_list.get(solution.get(i)));
            for (int j = 0; j < array_of_points[i].length; j++) {
                System.out.println(array_of_points[i][j]);
            }
        }
    }
    
    /**
     * This function will set the border of the words found to green
     */
    public static void setFoundWordsBorder() {
        JTextField txt[] = Input.setJTextFieldArray();
        
        for (int i = 0; i < TOTAL_WORDS; i++){
            int len = array_list.get(solution.get(i)).length();
            int lettersfound = 0;

            for (int j = 0; j < array_of_points[i].length; j++) {
                int row = array_of_points[i][j].x;
                int col = array_of_points[i][j].y;
                
                int txtvalue = (row*NUM_COLUMNS) + col;
                
                if (((LineBorder) txt[txtvalue].getBorder()).getLineColor() == Color.RED) {
                    lettersfound++;

                    if (len == lettersfound && found_array[i] == false) {
                        //Set Border of jTextField to green signifying that the word is found
                         for (int k = 0; k < array_of_points[i].length; k++) {
                            int row_set = array_of_points[i][k].x;
                            int col_set = array_of_points[i][k].y;
                            
                            int txtvalue_set = (row_set*NUM_COLUMNS) + col_set;
                            
                            Border border = BorderFactory.createLineBorder(Color.GREEN, 1);
                    
                            txt[txtvalue_set].setBorder(border);
                         }
                        
                        //Set text of words to green once found
                        switch (solution.get(i)) {
                            case 0:
                                Input.getWord1().setForeground(Color.GREEN);
                                break;
                            case 1:
                                Input.getWord2().setForeground(Color.GREEN);
                                break;
                            case 2:
                                Input.getWord3().setForeground(Color.GREEN);
                                break;
                            case 3:
                                Input.getWord4().setForeground(Color.GREEN);
                                break;
                            case 4:
                                Input.getWord5().setForeground(Color.GREEN);
                                break;
                            case 5:
                                Input.getWord6().setForeground(Color.GREEN);
                                break;
                            case 6:
                                Input.getWord7().setForeground(Color.GREEN);
                                break;
                            case 7:
                                Input.getWord8().setForeground(Color.GREEN);
                                break;
                            case 8:
                                Input.getWord9().setForeground(Color.GREEN);
                                break;
                            case 9:
                                Input.getWord10().setForeground(Color.GREEN);
                                break;
                            case 10:
                                Input.getWord11().setForeground(Color.GREEN);
                                break;
                            case 11:
                                Input.getWord12().setForeground(Color.GREEN);
                                break;
                            case 12:
                                Input.getWord13().setForeground(Color.GREEN);
                                break;
                            case 13:
                                Input.getWord14().setForeground(Color.GREEN);
                                break;
                            case 14:
                                Input.getWord15().setForeground(Color.GREEN);
                                break;
                            case 15:
                                Input.getWord16().setForeground(Color.GREEN);
                                break;
                        }
                        
                        //Pop up box telling user which word they found
                        String infoMessage = "You found: " + array_list.get(solution.get(i)) + "!";
                        JOptionPane.showMessageDialog(null, infoMessage, "Word Search", JOptionPane.INFORMATION_MESSAGE);
                        
                        found_array[i] = true;
                        
                        WORDS_FOUND++;
                        
                        if (WORDS_FOUND == TOTAL_WORDS) {
                            //Pop up box telling user they have found all words!
                            String msg = "You've found all words in this word search!\nStart a new game or press Exit!";
                            JOptionPane.showMessageDialog(null, msg, "Word Search", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
        }
    }
    
    /**
     * This function will fill the blank spaces with random characters
     */
    private static void fillRestOfGrid() {
        for (int i = 0; i < NUM_ROWS; i++){
            for (int j = 0; j < NUM_COLUMNS; j++){
                if (word_search[i][j] == '\u0000') {
                    word_search[i][j] = randomCharacter();
                }
            }
        }
    }
    
    /**
     * This function will display the contents of the word_search 2D array
     */
    private static void displayWordSearch() {
        for (int i = 0; i < NUM_ROWS; i++){
            for (int j = 0; j < NUM_COLUMNS; j++){
                System.out.print(word_search[i][j]);
            }
            System.out.println("");
        }
    }
    
    /**
     * This function will find the order in which to set the words
     */
    private static void findWordOrder() {
        for (int i = 0; i < TOTAL_WORDS; i++) {
            solution.add(i);
        }
        Collections.shuffle(solution);
    }

    /**
     * This function will find and set the next word
     */
    private static void findNextWord(int s) {
        int random_number = solution.get(s);
        
        String word_match = array_list.get(random_number);
        
        int len = word_match.length();
        
        boolean set = false;
        
        while (set == false)
        {
            int row = randomNumber(NUM_ROWS-1);
            int col = randomNumber(NUM_COLUMNS-1);
            Point[] pointArray = new Point[len];
            array_of_points[s] = new Point[len];
        
            if (col >= len && option_count[0] < EACH_OPTION){
                //Check to see if spaces are blank or characters are the same
                int temp_col = col;
                boolean valid = true;
                for (int i = 0; i < len; i++){
                    if (word_search[row][temp_col] == '\u0000' || word_search[row][temp_col] == word_match.charAt(i)) {
                    } else {
                        valid = false;
                        break;
                    }
                    temp_col--;
                }
                
                if (valid == true) {
                    //Horizontal (Reverse)
                    temp_col = col;
                    for (int i = 0; i < len; i++){
                        word_search[row][temp_col] = word_match.charAt(i);
                        Point point = new Point(row, temp_col);
                        pointArray[i] = point;
                        array_of_points[s][i] = pointArray[i];
                        temp_col--;
                    }
                    
                    option_count[0]++;
                        
                    set = true;
                }
            } else if (NUM_COLUMNS - col >= len && option_count[1] < EACH_OPTION) {
                //Check to see if spaces are blank or characters are the same
                int temp_col = col;
                boolean valid = true;
                for (int i = 0; i < len; i++){
                    if (word_search[row][temp_col] == '\u0000' || word_search[row][temp_col] == word_match.charAt(i)) {
                    } else {
                        valid = false;
                        break;
                    }
                    temp_col++;
                }
                
                if (valid == true) {
                    //Horizontal (Forward)
                    temp_col = col;
                    for (int i = 0; i < len; i++){
                        word_search[row][temp_col] = word_match.charAt(i);
                        Point point = new Point(row, temp_col);
                        pointArray[i] = point;
                        array_of_points[s][i] = pointArray[i];
                        temp_col++;
                    }
                    
                    option_count[1]++;
                        
                    set = true;
                }
            } else if (row >= len && option_count[2] < EACH_OPTION) {
                //Check to see if spaces are blank or characters are the same
                int temp_row = row;
                boolean valid = true;
                for (int i = 0; i < len; i++){
                    if (word_search[temp_row][col] == '\u0000' || word_search[temp_row][col] == word_match.charAt(i)) {
                    } else {
                        valid = false;
                        break;
                    }
                    temp_row--;
                }
                
                if (valid == true) {
                    //Vertical (Bottom to Top)
                    temp_row = row;
                    for (int i = 0; i < len; i++){
                        word_search[temp_row][col] = word_match.charAt(i);
                        Point point = new Point(temp_row, col);
                        pointArray[i] = point;
                        array_of_points[s][i] = pointArray[i];
                        temp_row--;
                    }
                    
                    option_count[2]++;
                        
                    set = true;
                }
            } else if (NUM_ROWS - row >= len && option_count[3] < EACH_OPTION) {
                //Check to see if spaces are blank or characters are the same
                int temp_row = row;
                boolean valid = true;
                for (int i = 0; i < len; i++){
                    if (word_search[temp_row][col] == '\u0000' || word_search[temp_row][col] == word_match.charAt(i)) {
                    } else {
                        valid = false;
                        break;
                    }
                    temp_row++;
                }
                
                if (valid == true) {
                    //Vertical (Top to Bottom)
                    temp_row = row;
                    for (int i = 0; i < len; i++){
                        word_search[temp_row][col] = word_match.charAt(i);
                        Point point = new Point(temp_row, col);
                        pointArray[i] = point;
                        array_of_points[s][i] = pointArray[i];
                        temp_row++;
                    }
                    
                    option_count[3]++;
                        
                    set = true;
                }
            }
        }
    }
    
    /**
     * This function will return a random number.
     */
    private static int randomNumber(int num) {
        Random rand_num = new Random();
        int answer = rand_num.nextInt(num + 1);

        return answer;
    }
    
    /**
     * This function will generate random words.
     */
    private static void randomWords() {
        array_list.add("APPLE");
        array_list.add("ORANGE");
        array_list.add("GRAPE");
        array_list.add("STRAWBERRY");
        array_list.add("BANANA");
        array_list.add("WATERMELON");
        array_list.add("KIWI");
        array_list.add("CANTALOUPE");
        array_list.add("HONEYDEW");
        array_list.add("BLACKBERRY");
        array_list.add("PEACH");
        array_list.add("AVOCADO");
        array_list.add("PEAR");
        array_list.add("APRICOT");
        array_list.add("PLUM");
        array_list.add("CHERRY");
        
        //Sort Array List
        Collections.sort(array_list);
    }
    
     /**
     * This function will return a random character to fill the grid after words have been filled.
     */
    private static char randomCharacter() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int len = alphabet.length();

        Random rand_char = new Random();

        return alphabet.charAt(rand_char.nextInt(len));
    }
    
    /**
     *Driver method for nextBoard.
     */
    public void nextBoard()
    {
        randomWords();
        
        findWordOrder();
        
        for (int s = 0; s < TOTAL_WORDS; s++) {
            findNextWord(s);
        }
        
        fillRestOfGrid();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                Start start = new Start();
                start.pack();
                start.setLocationRelativeTo(null);
                start.setTitle("Word Search");
                start.setVisible(true);
            }
        });
    }
}
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
import javax.swing.border.LineBorder;

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
                            jTextField0110, jTextField0111, jTextField0112, jTextField0113, jTextField0114, jTextField0115, jTextField0116, jTextField0117, jTextField0118, jTextField0119,
                            jTextField0200, jTextField0201, jTextField0202, jTextField0203, jTextField0204, jTextField0205, jTextField0206, jTextField0207, jTextField0208, jTextField0209,
                            jTextField0210, jTextField0211, jTextField0212, jTextField0213, jTextField0214, jTextField0215, jTextField0216, jTextField0217, jTextField0218, jTextField0219,
                            jTextField0300, jTextField0301, jTextField0302, jTextField0303, jTextField0304, jTextField0305, jTextField0306, jTextField0307, jTextField0308, jTextField0309,
                            jTextField0310, jTextField0311, jTextField0312, jTextField0313, jTextField0314, jTextField0315, jTextField0316, jTextField0317, jTextField0318, jTextField0319,
                            jTextField0400, jTextField0401, jTextField0402, jTextField0403, jTextField0404, jTextField0405, jTextField0406, jTextField0407, jTextField0408, jTextField0409,
                            jTextField0410, jTextField0411, jTextField0412, jTextField0413, jTextField0414, jTextField0415, jTextField0416, jTextField0417, jTextField0418, jTextField0419,
                            jTextField0500, jTextField0501, jTextField0502, jTextField0503, jTextField0504, jTextField0505, jTextField0506, jTextField0507, jTextField0508, jTextField0509,
                            jTextField0510, jTextField0511, jTextField0512, jTextField0513, jTextField0514, jTextField0515, jTextField0516, jTextField0517, jTextField0518, jTextField0519,
                            jTextField0600, jTextField0601, jTextField0602, jTextField0603, jTextField0604, jTextField0605, jTextField0606, jTextField0607, jTextField0608, jTextField0609,
                            jTextField0610, jTextField0611, jTextField0612, jTextField0613, jTextField0614, jTextField0615, jTextField0616, jTextField0617, jTextField0618, jTextField0619,
                            jTextField0700, jTextField0701, jTextField0702, jTextField0703, jTextField0704, jTextField0705, jTextField0706, jTextField0707, jTextField0708, jTextField0709,
                            jTextField0710, jTextField0711, jTextField0712, jTextField0713, jTextField0714, jTextField0715, jTextField0716, jTextField0717, jTextField0718, jTextField0719,
                            jTextField0800, jTextField0801, jTextField0802, jTextField0803, jTextField0804, jTextField0805, jTextField0806, jTextField0807, jTextField0808, jTextField0809,
                            jTextField0810, jTextField0811, jTextField0812, jTextField0813, jTextField0814, jTextField0815, jTextField0816, jTextField0817, jTextField0818, jTextField0819,
                            jTextField0900, jTextField0901, jTextField0902, jTextField0903, jTextField0904, jTextField0905, jTextField0906, jTextField0907, jTextField0908, jTextField0909,
                            jTextField0910, jTextField0911, jTextField0912, jTextField0913, jTextField0914, jTextField0915, jTextField0916, jTextField0917, jTextField0918, jTextField0919,
                            jTextField1000, jTextField1001, jTextField1002, jTextField1003, jTextField1004, jTextField1005, jTextField1006, jTextField1007, jTextField1008, jTextField1009,
                            jTextField1010, jTextField1011, jTextField1012, jTextField1013, jTextField1014, jTextField1015, jTextField1016, jTextField1017, jTextField1018, jTextField1019,
                            jTextField1100, jTextField1101, jTextField1102, jTextField1103, jTextField1104, jTextField1105, jTextField1106, jTextField1107, jTextField1108, jTextField1109,
                            jTextField1110, jTextField1111, jTextField1112, jTextField1113, jTextField1114, jTextField1115, jTextField1116, jTextField1117, jTextField1118, jTextField1119,
                            jTextField1200, jTextField1201, jTextField1202, jTextField1203, jTextField1204, jTextField1205, jTextField1206, jTextField1207, jTextField1208, jTextField1209,
                            jTextField1210, jTextField1211, jTextField1212, jTextField1213, jTextField1214, jTextField1215, jTextField1216, jTextField1217, jTextField1218, jTextField1219,
                            jTextField1300, jTextField1301, jTextField1302, jTextField1303, jTextField1304, jTextField1305, jTextField1306, jTextField1307, jTextField1308, jTextField1309,
                            jTextField1310, jTextField1311, jTextField1312, jTextField1313, jTextField1314, jTextField1315, jTextField1316, jTextField1317, jTextField1318, jTextField1319,
                            jTextField1400, jTextField1401, jTextField1402, jTextField1403, jTextField1404, jTextField1405, jTextField1406, jTextField1407, jTextField1408, jTextField1409,
                            jTextField1410, jTextField1411, jTextField1412, jTextField1413, jTextField1414, jTextField1415, jTextField1416, jTextField1417, jTextField1418, jTextField1419,
                            jTextField1500, jTextField1501, jTextField1502, jTextField1503, jTextField1504, jTextField1505, jTextField1506, jTextField1507, jTextField1508, jTextField1509,
                            jTextField1510, jTextField1511, jTextField1512, jTextField1513, jTextField1514, jTextField1515, jTextField1516, jTextField1517, jTextField1518, jTextField1519,
                            jTextField1600, jTextField1601, jTextField1602, jTextField1603, jTextField1604, jTextField1605, jTextField1606, jTextField1607, jTextField1608, jTextField1609,
                            jTextField1610, jTextField1611, jTextField1612, jTextField1613, jTextField1614, jTextField1615, jTextField1616, jTextField1617, jTextField1618, jTextField1619,
                            jTextField1700, jTextField1701, jTextField1702, jTextField1703, jTextField1704, jTextField1705, jTextField1706, jTextField1707, jTextField1708, jTextField1709,
                            jTextField1710, jTextField1711, jTextField1712, jTextField1713, jTextField1714, jTextField1715, jTextField1716, jTextField1717, jTextField1718, jTextField1719,
                            jTextField1800, jTextField1801, jTextField1802, jTextField1803, jTextField1804, jTextField1805, jTextField1806, jTextField1807, jTextField1808, jTextField1809,
                            jTextField1810, jTextField1811, jTextField1812, jTextField1813, jTextField1814, jTextField1815, jTextField1816, jTextField1817, jTextField1818, jTextField1819,
                            jTextField1900, jTextField1901, jTextField1902, jTextField1903, jTextField1904, jTextField1905, jTextField1906, jTextField1907, jTextField1908, jTextField1909,
                            jTextField1910, jTextField1911, jTextField1912, jTextField1913, jTextField1914, jTextField1915, jTextField1916, jTextField1917, jTextField1918, jTextField1919};
        
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
                pointe.y >= starty && pointe.y <= endy &&
                ((LineBorder) txt[i-1].getBorder()).getLineColor() != Color.GREEN) {
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
        
        themelabel.setText(WordSearch.getTheme());
        
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
        jTextField0203 = new javax.swing.JTextField();
        jTextField0209 = new javax.swing.JTextField();
        jTextField0202 = new javax.swing.JTextField();
        jTextField0201 = new javax.swing.JTextField();
        jTextField0204 = new javax.swing.JTextField();
        jTextField0219 = new javax.swing.JTextField();
        jTextField0218 = new javax.swing.JTextField();
        jTextField0217 = new javax.swing.JTextField();
        jTextField0216 = new javax.swing.JTextField();
        jTextField0210 = new javax.swing.JTextField();
        jTextField0200 = new javax.swing.JTextField();
        jTextField0207 = new javax.swing.JTextField();
        jTextField0208 = new javax.swing.JTextField();
        jTextField0205 = new javax.swing.JTextField();
        jTextField0206 = new javax.swing.JTextField();
        jTextField0211 = new javax.swing.JTextField();
        jTextField0214 = new javax.swing.JTextField();
        jTextField0213 = new javax.swing.JTextField();
        jTextField0215 = new javax.swing.JTextField();
        jTextField0212 = new javax.swing.JTextField();
        jTextField0313 = new javax.swing.JTextField();
        jTextField0314 = new javax.swing.JTextField();
        jTextField0311 = new javax.swing.JTextField();
        jTextField0315 = new javax.swing.JTextField();
        jTextField0312 = new javax.swing.JTextField();
        jTextField0319 = new javax.swing.JTextField();
        jTextField0304 = new javax.swing.JTextField();
        jTextField0317 = new javax.swing.JTextField();
        jTextField0318 = new javax.swing.JTextField();
        jTextField0316 = new javax.swing.JTextField();
        jTextField0310 = new javax.swing.JTextField();
        jTextField0300 = new javax.swing.JTextField();
        jTextField0307 = new javax.swing.JTextField();
        jTextField0308 = new javax.swing.JTextField();
        jTextField0305 = new javax.swing.JTextField();
        jTextField0306 = new javax.swing.JTextField();
        jTextField0302 = new javax.swing.JTextField();
        jTextField0301 = new javax.swing.JTextField();
        jTextField0303 = new javax.swing.JTextField();
        jTextField0309 = new javax.swing.JTextField();
        jTextField0401 = new javax.swing.JTextField();
        jTextField0409 = new javax.swing.JTextField();
        jTextField0403 = new javax.swing.JTextField();
        jTextField0402 = new javax.swing.JTextField();
        jTextField0406 = new javax.swing.JTextField();
        jTextField0405 = new javax.swing.JTextField();
        jTextField0408 = new javax.swing.JTextField();
        jTextField0407 = new javax.swing.JTextField();
        jTextField0400 = new javax.swing.JTextField();
        jTextField0410 = new javax.swing.JTextField();
        jTextField0416 = new javax.swing.JTextField();
        jTextField0418 = new javax.swing.JTextField();
        jTextField0404 = new javax.swing.JTextField();
        jTextField0417 = new javax.swing.JTextField();
        jTextField0413 = new javax.swing.JTextField();
        jTextField0414 = new javax.swing.JTextField();
        jTextField0412 = new javax.swing.JTextField();
        jTextField0419 = new javax.swing.JTextField();
        jTextField0411 = new javax.swing.JTextField();
        jTextField0415 = new javax.swing.JTextField();
        jTextField0507 = new javax.swing.JTextField();
        jTextField0508 = new javax.swing.JTextField();
        jTextField0505 = new javax.swing.JTextField();
        jTextField0506 = new javax.swing.JTextField();
        jTextField0502 = new javax.swing.JTextField();
        jTextField0503 = new javax.swing.JTextField();
        jTextField0509 = new javax.swing.JTextField();
        jTextField0501 = new javax.swing.JTextField();
        jTextField0513 = new javax.swing.JTextField();
        jTextField0514 = new javax.swing.JTextField();
        jTextField0504 = new javax.swing.JTextField();
        jTextField0517 = new javax.swing.JTextField();
        jTextField0516 = new javax.swing.JTextField();
        jTextField0518 = new javax.swing.JTextField();
        jTextField0500 = new javax.swing.JTextField();
        jTextField0510 = new javax.swing.JTextField();
        jTextField0512 = new javax.swing.JTextField();
        jTextField0519 = new javax.swing.JTextField();
        jTextField0515 = new javax.swing.JTextField();
        jTextField0511 = new javax.swing.JTextField();
        jTextField0606 = new javax.swing.JTextField();
        jTextField0602 = new javax.swing.JTextField();
        jTextField0603 = new javax.swing.JTextField();
        jTextField0609 = new javax.swing.JTextField();
        jTextField0607 = new javax.swing.JTextField();
        jTextField0608 = new javax.swing.JTextField();
        jTextField0605 = new javax.swing.JTextField();
        jTextField0601 = new javax.swing.JTextField();
        jTextField0616 = new javax.swing.JTextField();
        jTextField0618 = new javax.swing.JTextField();
        jTextField0604 = new javax.swing.JTextField();
        jTextField0617 = new javax.swing.JTextField();
        jTextField0612 = new javax.swing.JTextField();
        jTextField0619 = new javax.swing.JTextField();
        jTextField0600 = new javax.swing.JTextField();
        jTextField0610 = new javax.swing.JTextField();
        jTextField0614 = new javax.swing.JTextField();
        jTextField0613 = new javax.swing.JTextField();
        jTextField0615 = new javax.swing.JTextField();
        jTextField0611 = new javax.swing.JTextField();
        jTextField0713 = new javax.swing.JTextField();
        jTextField0714 = new javax.swing.JTextField();
        jTextField0710 = new javax.swing.JTextField();
        jTextField0700 = new javax.swing.JTextField();
        jTextField0719 = new javax.swing.JTextField();
        jTextField0712 = new javax.swing.JTextField();
        jTextField0704 = new javax.swing.JTextField();
        jTextField0717 = new javax.swing.JTextField();
        jTextField0716 = new javax.swing.JTextField();
        jTextField0718 = new javax.swing.JTextField();
        jTextField0711 = new javax.swing.JTextField();
        jTextField0715 = new javax.swing.JTextField();
        jTextField0702 = new javax.swing.JTextField();
        jTextField0703 = new javax.swing.JTextField();
        jTextField0709 = new javax.swing.JTextField();
        jTextField0707 = new javax.swing.JTextField();
        jTextField0708 = new javax.swing.JTextField();
        jTextField0705 = new javax.swing.JTextField();
        jTextField0701 = new javax.swing.JTextField();
        jTextField0706 = new javax.swing.JTextField();
        jTextField0817 = new javax.swing.JTextField();
        jTextField0819 = new javax.swing.JTextField();
        jTextField0800 = new javax.swing.JTextField();
        jTextField0804 = new javax.swing.JTextField();
        jTextField0812 = new javax.swing.JTextField();
        jTextField0813 = new javax.swing.JTextField();
        jTextField0814 = new javax.swing.JTextField();
        jTextField0810 = new javax.swing.JTextField();
        jTextField0805 = new javax.swing.JTextField();
        jTextField0808 = new javax.swing.JTextField();
        jTextField0807 = new javax.swing.JTextField();
        jTextField0809 = new javax.swing.JTextField();
        jTextField0816 = new javax.swing.JTextField();
        jTextField0818 = new javax.swing.JTextField();
        jTextField0802 = new javax.swing.JTextField();
        jTextField0803 = new javax.swing.JTextField();
        jTextField0811 = new javax.swing.JTextField();
        jTextField0815 = new javax.swing.JTextField();
        jTextField0801 = new javax.swing.JTextField();
        jTextField0806 = new javax.swing.JTextField();
        jTextField0901 = new javax.swing.JTextField();
        jTextField0906 = new javax.swing.JTextField();
        jTextField0914 = new javax.swing.JTextField();
        jTextField0913 = new javax.swing.JTextField();
        jTextField0910 = new javax.swing.JTextField();
        jTextField0917 = new javax.swing.JTextField();
        jTextField0919 = new javax.swing.JTextField();
        jTextField0900 = new javax.swing.JTextField();
        jTextField0904 = new javax.swing.JTextField();
        jTextField0912 = new javax.swing.JTextField();
        jTextField0918 = new javax.swing.JTextField();
        jTextField0916 = new javax.swing.JTextField();
        jTextField0903 = new javax.swing.JTextField();
        jTextField0902 = new javax.swing.JTextField();
        jTextField0908 = new javax.swing.JTextField();
        jTextField0905 = new javax.swing.JTextField();
        jTextField0909 = new javax.swing.JTextField();
        jTextField0907 = new javax.swing.JTextField();
        jTextField0911 = new javax.swing.JTextField();
        jTextField0915 = new javax.swing.JTextField();
        jTextField1001 = new javax.swing.JTextField();
        jTextField1006 = new javax.swing.JTextField();
        jTextField1014 = new javax.swing.JTextField();
        jTextField1013 = new javax.swing.JTextField();
        jTextField1010 = new javax.swing.JTextField();
        jTextField1017 = new javax.swing.JTextField();
        jTextField1019 = new javax.swing.JTextField();
        jTextField1000 = new javax.swing.JTextField();
        jTextField1012 = new javax.swing.JTextField();
        jTextField1018 = new javax.swing.JTextField();
        jTextField1004 = new javax.swing.JTextField();
        jTextField1002 = new javax.swing.JTextField();
        jTextField1008 = new javax.swing.JTextField();
        jTextField1016 = new javax.swing.JTextField();
        jTextField1003 = new javax.swing.JTextField();
        jTextField1007 = new javax.swing.JTextField();
        jTextField1005 = new javax.swing.JTextField();
        jTextField1009 = new javax.swing.JTextField();
        jTextField1011 = new javax.swing.JTextField();
        jTextField1015 = new javax.swing.JTextField();
        jTextField1116 = new javax.swing.JTextField();
        jTextField1113 = new javax.swing.JTextField();
        jTextField1101 = new javax.swing.JTextField();
        jTextField1119 = new javax.swing.JTextField();
        jTextField1103 = new javax.swing.JTextField();
        jTextField1104 = new javax.swing.JTextField();
        jTextField1106 = new javax.swing.JTextField();
        jTextField1109 = new javax.swing.JTextField();
        jTextField1108 = new javax.swing.JTextField();
        jTextField1115 = new javax.swing.JTextField();
        jTextField1112 = new javax.swing.JTextField();
        jTextField1110 = new javax.swing.JTextField();
        jTextField1100 = new javax.swing.JTextField();
        jTextField1111 = new javax.swing.JTextField();
        jTextField1118 = new javax.swing.JTextField();
        jTextField1114 = new javax.swing.JTextField();
        jTextField1107 = new javax.swing.JTextField();
        jTextField1102 = new javax.swing.JTextField();
        jTextField1117 = new javax.swing.JTextField();
        jTextField1105 = new javax.swing.JTextField();
        jTextField1201 = new javax.swing.JTextField();
        jTextField1212 = new javax.swing.JTextField();
        jTextField1217 = new javax.swing.JTextField();
        jTextField1218 = new javax.swing.JTextField();
        jTextField1216 = new javax.swing.JTextField();
        jTextField1200 = new javax.swing.JTextField();
        jTextField1211 = new javax.swing.JTextField();
        jTextField1213 = new javax.swing.JTextField();
        jTextField1206 = new javax.swing.JTextField();
        jTextField1215 = new javax.swing.JTextField();
        jTextField1208 = new javax.swing.JTextField();
        jTextField1202 = new javax.swing.JTextField();
        jTextField1214 = new javax.swing.JTextField();
        jTextField1210 = new javax.swing.JTextField();
        jTextField1205 = new javax.swing.JTextField();
        jTextField1203 = new javax.swing.JTextField();
        jTextField1204 = new javax.swing.JTextField();
        jTextField1219 = new javax.swing.JTextField();
        jTextField1209 = new javax.swing.JTextField();
        jTextField1207 = new javax.swing.JTextField();
        jTextField1314 = new javax.swing.JTextField();
        jTextField1304 = new javax.swing.JTextField();
        jTextField1300 = new javax.swing.JTextField();
        jTextField1316 = new javax.swing.JTextField();
        jTextField1309 = new javax.swing.JTextField();
        jTextField1318 = new javax.swing.JTextField();
        jTextField1301 = new javax.swing.JTextField();
        jTextField1312 = new javax.swing.JTextField();
        jTextField1319 = new javax.swing.JTextField();
        jTextField1306 = new javax.swing.JTextField();
        jTextField1310 = new javax.swing.JTextField();
        jTextField1303 = new javax.swing.JTextField();
        jTextField1311 = new javax.swing.JTextField();
        jTextField1302 = new javax.swing.JTextField();
        jTextField1313 = new javax.swing.JTextField();
        jTextField1305 = new javax.swing.JTextField();
        jTextField1315 = new javax.swing.JTextField();
        jTextField1308 = new javax.swing.JTextField();
        jTextField1307 = new javax.swing.JTextField();
        jTextField1317 = new javax.swing.JTextField();
        jTextField1406 = new javax.swing.JTextField();
        jTextField1416 = new javax.swing.JTextField();
        jTextField1417 = new javax.swing.JTextField();
        jTextField1407 = new javax.swing.JTextField();
        jTextField1415 = new javax.swing.JTextField();
        jTextField1401 = new javax.swing.JTextField();
        jTextField1403 = new javax.swing.JTextField();
        jTextField1404 = new javax.swing.JTextField();
        jTextField1418 = new javax.swing.JTextField();
        jTextField1400 = new javax.swing.JTextField();
        jTextField1413 = new javax.swing.JTextField();
        jTextField1408 = new javax.swing.JTextField();
        jTextField1409 = new javax.swing.JTextField();
        jTextField1412 = new javax.swing.JTextField();
        jTextField1419 = new javax.swing.JTextField();
        jTextField1405 = new javax.swing.JTextField();
        jTextField1402 = new javax.swing.JTextField();
        jTextField1414 = new javax.swing.JTextField();
        jTextField1410 = new javax.swing.JTextField();
        jTextField1411 = new javax.swing.JTextField();
        jTextField1514 = new javax.swing.JTextField();
        jTextField1506 = new javax.swing.JTextField();
        jTextField1519 = new javax.swing.JTextField();
        jTextField1503 = new javax.swing.JTextField();
        jTextField1511 = new javax.swing.JTextField();
        jTextField1508 = new javax.swing.JTextField();
        jTextField1513 = new javax.swing.JTextField();
        jTextField1500 = new javax.swing.JTextField();
        jTextField1509 = new javax.swing.JTextField();
        jTextField1501 = new javax.swing.JTextField();
        jTextField1510 = new javax.swing.JTextField();
        jTextField1505 = new javax.swing.JTextField();
        jTextField1516 = new javax.swing.JTextField();
        jTextField1507 = new javax.swing.JTextField();
        jTextField1512 = new javax.swing.JTextField();
        jTextField1515 = new javax.swing.JTextField();
        jTextField1502 = new javax.swing.JTextField();
        jTextField1517 = new javax.swing.JTextField();
        jTextField1518 = new javax.swing.JTextField();
        jTextField1504 = new javax.swing.JTextField();
        jTextField1617 = new javax.swing.JTextField();
        jTextField1612 = new javax.swing.JTextField();
        jTextField1616 = new javax.swing.JTextField();
        jTextField1605 = new javax.swing.JTextField();
        jTextField1615 = new javax.swing.JTextField();
        jTextField1618 = new javax.swing.JTextField();
        jTextField1607 = new javax.swing.JTextField();
        jTextField1600 = new javax.swing.JTextField();
        jTextField1601 = new javax.swing.JTextField();
        jTextField1619 = new javax.swing.JTextField();
        jTextField1603 = new javax.swing.JTextField();
        jTextField1613 = new javax.swing.JTextField();
        jTextField1606 = new javax.swing.JTextField();
        jTextField1609 = new javax.swing.JTextField();
        jTextField1602 = new javax.swing.JTextField();
        jTextField1614 = new javax.swing.JTextField();
        jTextField1604 = new javax.swing.JTextField();
        jTextField1610 = new javax.swing.JTextField();
        jTextField1611 = new javax.swing.JTextField();
        jTextField1608 = new javax.swing.JTextField();
        jTextField1712 = new javax.swing.JTextField();
        jTextField1700 = new javax.swing.JTextField();
        jTextField1701 = new javax.swing.JTextField();
        jTextField1711 = new javax.swing.JTextField();
        jTextField1706 = new javax.swing.JTextField();
        jTextField1709 = new javax.swing.JTextField();
        jTextField1707 = new javax.swing.JTextField();
        jTextField1714 = new javax.swing.JTextField();
        jTextField1705 = new javax.swing.JTextField();
        jTextField1703 = new javax.swing.JTextField();
        jTextField1710 = new javax.swing.JTextField();
        jTextField1716 = new javax.swing.JTextField();
        jTextField1708 = new javax.swing.JTextField();
        jTextField1719 = new javax.swing.JTextField();
        jTextField1704 = new javax.swing.JTextField();
        jTextField1702 = new javax.swing.JTextField();
        jTextField1713 = new javax.swing.JTextField();
        jTextField1717 = new javax.swing.JTextField();
        jTextField1718 = new javax.swing.JTextField();
        jTextField1715 = new javax.swing.JTextField();
        jTextField1811 = new javax.swing.JTextField();
        jTextField1806 = new javax.swing.JTextField();
        jTextField1805 = new javax.swing.JTextField();
        jTextField1816 = new javax.swing.JTextField();
        jTextField1818 = new javax.swing.JTextField();
        jTextField1801 = new javax.swing.JTextField();
        jTextField1803 = new javax.swing.JTextField();
        jTextField1804 = new javax.swing.JTextField();
        jTextField1817 = new javax.swing.JTextField();
        jTextField1814 = new javax.swing.JTextField();
        jTextField1808 = new javax.swing.JTextField();
        jTextField1807 = new javax.swing.JTextField();
        jTextField1810 = new javax.swing.JTextField();
        jTextField1813 = new javax.swing.JTextField();
        jTextField1819 = new javax.swing.JTextField();
        jTextField1812 = new javax.swing.JTextField();
        jTextField1802 = new javax.swing.JTextField();
        jTextField1809 = new javax.swing.JTextField();
        jTextField1800 = new javax.swing.JTextField();
        jTextField1815 = new javax.swing.JTextField();
        jTextField1915 = new javax.swing.JTextField();
        jTextField1900 = new javax.swing.JTextField();
        jTextField1911 = new javax.swing.JTextField();
        jTextField1906 = new javax.swing.JTextField();
        jTextField1905 = new javax.swing.JTextField();
        jTextField1916 = new javax.swing.JTextField();
        jTextField1918 = new javax.swing.JTextField();
        jTextField1901 = new javax.swing.JTextField();
        jTextField1903 = new javax.swing.JTextField();
        jTextField1904 = new javax.swing.JTextField();
        jTextField1913 = new javax.swing.JTextField();
        jTextField1910 = new javax.swing.JTextField();
        jTextField1912 = new javax.swing.JTextField();
        jTextField1919 = new javax.swing.JTextField();
        jTextField1909 = new javax.swing.JTextField();
        jTextField1902 = new javax.swing.JTextField();
        jTextField1917 = new javax.swing.JTextField();
        jTextField1914 = new javax.swing.JTextField();
        jTextField1908 = new javax.swing.JTextField();
        jTextField1907 = new javax.swing.JTextField();
        themelabel = new javax.swing.JLabel();

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

        jTextField0000.setEditable(false);
        jTextField0000.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField0000.setEnabled(false);
        jTextField0000.setHighlighter(null);
        jTextField0000.setOpaque(false);
        jTextField0000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0000ActionPerformed(evt);
            }
        });

        jTextField0001.setEditable(false);
        jTextField0001.setDisabledTextColor(java.awt.Color.black);
        jTextField0001.setEnabled(false);
        jTextField0001.setHighlighter(null);

        jTextField0002.setEditable(false);
        jTextField0002.setDisabledTextColor(java.awt.Color.black);
        jTextField0002.setEnabled(false);
        jTextField0002.setHighlighter(null);

        jTextField0003.setEditable(false);
        jTextField0003.setDisabledTextColor(java.awt.Color.black);
        jTextField0003.setEnabled(false);
        jTextField0003.setHighlighter(null);

        jTextField0004.setEditable(false);
        jTextField0004.setDisabledTextColor(java.awt.Color.black);
        jTextField0004.setEnabled(false);
        jTextField0004.setHighlighter(null);

        jTextField0005.setEditable(false);
        jTextField0005.setDisabledTextColor(java.awt.Color.black);
        jTextField0005.setEnabled(false);
        jTextField0005.setHighlighter(null);

        jTextField0006.setEditable(false);
        jTextField0006.setDisabledTextColor(java.awt.Color.black);
        jTextField0006.setEnabled(false);
        jTextField0006.setHighlighter(null);
        jTextField0006.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0006ActionPerformed(evt);
            }
        });

        jTextField0007.setEditable(false);
        jTextField0007.setDisabledTextColor(java.awt.Color.black);
        jTextField0007.setEnabled(false);
        jTextField0007.setHighlighter(null);

        jTextField0008.setEditable(false);
        jTextField0008.setDisabledTextColor(java.awt.Color.black);
        jTextField0008.setEnabled(false);
        jTextField0008.setHighlighter(null);

        jTextField0009.setEditable(false);
        jTextField0009.setDisabledTextColor(java.awt.Color.black);
        jTextField0009.setEnabled(false);
        jTextField0009.setHighlighter(null);

        jTextField0010.setEditable(false);
        jTextField0010.setDisabledTextColor(java.awt.Color.black);
        jTextField0010.setEnabled(false);
        jTextField0010.setHighlighter(null);

        jTextField0011.setEditable(false);
        jTextField0011.setDisabledTextColor(java.awt.Color.black);
        jTextField0011.setEnabled(false);
        jTextField0011.setHighlighter(null);

        jTextField0012.setEditable(false);
        jTextField0012.setDisabledTextColor(java.awt.Color.black);
        jTextField0012.setEnabled(false);
        jTextField0012.setHighlighter(null);

        jTextField0013.setEditable(false);
        jTextField0013.setDisabledTextColor(java.awt.Color.black);
        jTextField0013.setEnabled(false);
        jTextField0013.setHighlighter(null);

        jTextField0014.setEditable(false);
        jTextField0014.setDisabledTextColor(java.awt.Color.black);
        jTextField0014.setEnabled(false);
        jTextField0014.setHighlighter(null);

        jTextField0015.setEditable(false);
        jTextField0015.setDisabledTextColor(java.awt.Color.black);
        jTextField0015.setEnabled(false);
        jTextField0015.setHighlighter(null);

        jTextField0016.setEditable(false);
        jTextField0016.setDisabledTextColor(java.awt.Color.black);
        jTextField0016.setEnabled(false);
        jTextField0016.setHighlighter(null);

        jTextField0017.setEditable(false);
        jTextField0017.setDisabledTextColor(java.awt.Color.black);
        jTextField0017.setEnabled(false);
        jTextField0017.setHighlighter(null);

        jTextField0018.setEditable(false);
        jTextField0018.setDisabledTextColor(java.awt.Color.black);
        jTextField0018.setEnabled(false);
        jTextField0018.setHighlighter(null);

        jTextField0019.setEditable(false);
        jTextField0019.setDisabledTextColor(java.awt.Color.black);
        jTextField0019.setEnabled(false);
        jTextField0019.setHighlighter(null);

        jTextField0103.setEditable(false);
        jTextField0103.setDisabledTextColor(java.awt.Color.black);
        jTextField0103.setEnabled(false);
        jTextField0103.setHighlighter(null);

        jTextField0104.setEditable(false);
        jTextField0104.setDisabledTextColor(java.awt.Color.black);
        jTextField0104.setEnabled(false);
        jTextField0104.setHighlighter(null);

        jTextField0101.setEditable(false);
        jTextField0101.setDisabledTextColor(java.awt.Color.black);
        jTextField0101.setEnabled(false);
        jTextField0101.setHighlighter(null);

        jTextField0102.setEditable(false);
        jTextField0102.setDisabledTextColor(java.awt.Color.black);
        jTextField0102.setEnabled(false);
        jTextField0102.setHighlighter(null);

        jTextField0109.setEditable(false);
        jTextField0109.setDisabledTextColor(java.awt.Color.black);
        jTextField0109.setEnabled(false);
        jTextField0109.setHighlighter(null);

        jTextField0108.setEditable(false);
        jTextField0108.setDisabledTextColor(java.awt.Color.black);
        jTextField0108.setEnabled(false);
        jTextField0108.setHighlighter(null);

        jTextField0107.setEditable(false);
        jTextField0107.setDisabledTextColor(java.awt.Color.black);
        jTextField0107.setEnabled(false);
        jTextField0107.setHighlighter(null);

        jTextField0106.setEditable(false);
        jTextField0106.setDisabledTextColor(java.awt.Color.black);
        jTextField0106.setEnabled(false);
        jTextField0106.setHighlighter(null);
        jTextField0106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0106ActionPerformed(evt);
            }
        });

        jTextField0105.setEditable(false);
        jTextField0105.setDisabledTextColor(java.awt.Color.black);
        jTextField0105.setEnabled(false);
        jTextField0105.setHighlighter(null);

        jTextField0100.setEditable(false);
        jTextField0100.setDisabledTextColor(java.awt.Color.black);
        jTextField0100.setEnabled(false);
        jTextField0100.setHighlighter(null);
        jTextField0100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0100ActionPerformed(evt);
            }
        });

        jTextField0110.setEditable(false);
        jTextField0110.setDisabledTextColor(java.awt.Color.black);
        jTextField0110.setEnabled(false);
        jTextField0110.setHighlighter(null);

        jTextField0112.setEditable(false);
        jTextField0112.setDisabledTextColor(java.awt.Color.black);
        jTextField0112.setEnabled(false);
        jTextField0112.setHighlighter(null);

        jTextField0111.setEditable(false);
        jTextField0111.setDisabledTextColor(java.awt.Color.black);
        jTextField0111.setEnabled(false);
        jTextField0111.setHighlighter(null);

        jTextField0114.setEditable(false);
        jTextField0114.setDisabledTextColor(java.awt.Color.black);
        jTextField0114.setEnabled(false);
        jTextField0114.setHighlighter(null);

        jTextField0113.setEditable(false);
        jTextField0113.setDisabledTextColor(java.awt.Color.black);
        jTextField0113.setEnabled(false);
        jTextField0113.setHighlighter(null);

        jTextField0115.setEditable(false);
        jTextField0115.setDisabledTextColor(java.awt.Color.black);
        jTextField0115.setEnabled(false);
        jTextField0115.setHighlighter(null);

        jTextField0116.setEditable(false);
        jTextField0116.setDisabledTextColor(java.awt.Color.black);
        jTextField0116.setEnabled(false);
        jTextField0116.setHighlighter(null);

        jTextField0117.setEditable(false);
        jTextField0117.setDisabledTextColor(java.awt.Color.black);
        jTextField0117.setEnabled(false);
        jTextField0117.setHighlighter(null);

        jTextField0118.setEditable(false);
        jTextField0118.setDisabledTextColor(java.awt.Color.black);
        jTextField0118.setEnabled(false);
        jTextField0118.setHighlighter(null);

        jTextField0119.setEditable(false);
        jTextField0119.setDisabledTextColor(java.awt.Color.black);
        jTextField0119.setEnabled(false);
        jTextField0119.setHighlighter(null);

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

        jTextField0203.setEditable(false);
        jTextField0203.setDisabledTextColor(java.awt.Color.black);
        jTextField0203.setEnabled(false);
        jTextField0203.setHighlighter(null);

        jTextField0209.setEditable(false);
        jTextField0209.setDisabledTextColor(java.awt.Color.black);
        jTextField0209.setEnabled(false);
        jTextField0209.setHighlighter(null);

        jTextField0202.setEditable(false);
        jTextField0202.setDisabledTextColor(java.awt.Color.black);
        jTextField0202.setEnabled(false);
        jTextField0202.setHighlighter(null);

        jTextField0201.setEditable(false);
        jTextField0201.setDisabledTextColor(java.awt.Color.black);
        jTextField0201.setEnabled(false);
        jTextField0201.setHighlighter(null);

        jTextField0204.setEditable(false);
        jTextField0204.setDisabledTextColor(java.awt.Color.black);
        jTextField0204.setEnabled(false);
        jTextField0204.setHighlighter(null);

        jTextField0219.setEditable(false);
        jTextField0219.setDisabledTextColor(java.awt.Color.black);
        jTextField0219.setEnabled(false);
        jTextField0219.setHighlighter(null);

        jTextField0218.setEditable(false);
        jTextField0218.setDisabledTextColor(java.awt.Color.black);
        jTextField0218.setEnabled(false);
        jTextField0218.setHighlighter(null);

        jTextField0217.setEditable(false);
        jTextField0217.setDisabledTextColor(java.awt.Color.black);
        jTextField0217.setEnabled(false);
        jTextField0217.setHighlighter(null);

        jTextField0216.setEditable(false);
        jTextField0216.setDisabledTextColor(java.awt.Color.black);
        jTextField0216.setEnabled(false);
        jTextField0216.setHighlighter(null);

        jTextField0210.setEditable(false);
        jTextField0210.setDisabledTextColor(java.awt.Color.black);
        jTextField0210.setEnabled(false);
        jTextField0210.setHighlighter(null);

        jTextField0200.setEditable(false);
        jTextField0200.setDisabledTextColor(java.awt.Color.black);
        jTextField0200.setEnabled(false);
        jTextField0200.setHighlighter(null);
        jTextField0200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0200ActionPerformed(evt);
            }
        });

        jTextField0207.setEditable(false);
        jTextField0207.setDisabledTextColor(java.awt.Color.black);
        jTextField0207.setEnabled(false);
        jTextField0207.setHighlighter(null);

        jTextField0208.setEditable(false);
        jTextField0208.setDisabledTextColor(java.awt.Color.black);
        jTextField0208.setEnabled(false);
        jTextField0208.setHighlighter(null);

        jTextField0205.setEditable(false);
        jTextField0205.setDisabledTextColor(java.awt.Color.black);
        jTextField0205.setEnabled(false);
        jTextField0205.setHighlighter(null);

        jTextField0206.setEditable(false);
        jTextField0206.setDisabledTextColor(java.awt.Color.black);
        jTextField0206.setEnabled(false);
        jTextField0206.setHighlighter(null);
        jTextField0206.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0206ActionPerformed(evt);
            }
        });

        jTextField0211.setEditable(false);
        jTextField0211.setDisabledTextColor(java.awt.Color.black);
        jTextField0211.setEnabled(false);
        jTextField0211.setHighlighter(null);

        jTextField0214.setEditable(false);
        jTextField0214.setDisabledTextColor(java.awt.Color.black);
        jTextField0214.setEnabled(false);
        jTextField0214.setHighlighter(null);

        jTextField0213.setEditable(false);
        jTextField0213.setDisabledTextColor(java.awt.Color.black);
        jTextField0213.setEnabled(false);
        jTextField0213.setHighlighter(null);

        jTextField0215.setEditable(false);
        jTextField0215.setDisabledTextColor(java.awt.Color.black);
        jTextField0215.setEnabled(false);
        jTextField0215.setHighlighter(null);

        jTextField0212.setEditable(false);
        jTextField0212.setDisabledTextColor(java.awt.Color.black);
        jTextField0212.setEnabled(false);
        jTextField0212.setHighlighter(null);

        jTextField0313.setEditable(false);
        jTextField0313.setDisabledTextColor(java.awt.Color.black);
        jTextField0313.setEnabled(false);
        jTextField0313.setHighlighter(null);

        jTextField0314.setEditable(false);
        jTextField0314.setDisabledTextColor(java.awt.Color.black);
        jTextField0314.setEnabled(false);
        jTextField0314.setHighlighter(null);

        jTextField0311.setEditable(false);
        jTextField0311.setDisabledTextColor(java.awt.Color.black);
        jTextField0311.setEnabled(false);
        jTextField0311.setHighlighter(null);

        jTextField0315.setEditable(false);
        jTextField0315.setDisabledTextColor(java.awt.Color.black);
        jTextField0315.setEnabled(false);
        jTextField0315.setHighlighter(null);

        jTextField0312.setEditable(false);
        jTextField0312.setDisabledTextColor(java.awt.Color.black);
        jTextField0312.setEnabled(false);
        jTextField0312.setHighlighter(null);

        jTextField0319.setEditable(false);
        jTextField0319.setDisabledTextColor(java.awt.Color.black);
        jTextField0319.setEnabled(false);
        jTextField0319.setHighlighter(null);

        jTextField0304.setEditable(false);
        jTextField0304.setDisabledTextColor(java.awt.Color.black);
        jTextField0304.setEnabled(false);
        jTextField0304.setHighlighter(null);

        jTextField0317.setEditable(false);
        jTextField0317.setDisabledTextColor(java.awt.Color.black);
        jTextField0317.setEnabled(false);
        jTextField0317.setHighlighter(null);

        jTextField0318.setEditable(false);
        jTextField0318.setDisabledTextColor(java.awt.Color.black);
        jTextField0318.setEnabled(false);
        jTextField0318.setHighlighter(null);

        jTextField0316.setEditable(false);
        jTextField0316.setDisabledTextColor(java.awt.Color.black);
        jTextField0316.setEnabled(false);
        jTextField0316.setHighlighter(null);

        jTextField0310.setEditable(false);
        jTextField0310.setDisabledTextColor(java.awt.Color.black);
        jTextField0310.setEnabled(false);
        jTextField0310.setHighlighter(null);

        jTextField0300.setEditable(false);
        jTextField0300.setDisabledTextColor(java.awt.Color.black);
        jTextField0300.setEnabled(false);
        jTextField0300.setHighlighter(null);
        jTextField0300.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0300ActionPerformed(evt);
            }
        });

        jTextField0307.setEditable(false);
        jTextField0307.setDisabledTextColor(java.awt.Color.black);
        jTextField0307.setEnabled(false);
        jTextField0307.setHighlighter(null);

        jTextField0308.setEditable(false);
        jTextField0308.setDisabledTextColor(java.awt.Color.black);
        jTextField0308.setEnabled(false);
        jTextField0308.setHighlighter(null);

        jTextField0305.setEditable(false);
        jTextField0305.setDisabledTextColor(java.awt.Color.black);
        jTextField0305.setEnabled(false);
        jTextField0305.setHighlighter(null);

        jTextField0306.setEditable(false);
        jTextField0306.setDisabledTextColor(java.awt.Color.black);
        jTextField0306.setEnabled(false);
        jTextField0306.setHighlighter(null);
        jTextField0306.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0306ActionPerformed(evt);
            }
        });

        jTextField0302.setEditable(false);
        jTextField0302.setDisabledTextColor(java.awt.Color.black);
        jTextField0302.setEnabled(false);
        jTextField0302.setHighlighter(null);

        jTextField0301.setEditable(false);
        jTextField0301.setDisabledTextColor(java.awt.Color.black);
        jTextField0301.setEnabled(false);
        jTextField0301.setHighlighter(null);

        jTextField0303.setEditable(false);
        jTextField0303.setDisabledTextColor(java.awt.Color.black);
        jTextField0303.setEnabled(false);
        jTextField0303.setHighlighter(null);

        jTextField0309.setEditable(false);
        jTextField0309.setDisabledTextColor(java.awt.Color.black);
        jTextField0309.setEnabled(false);
        jTextField0309.setHighlighter(null);

        jTextField0401.setEditable(false);
        jTextField0401.setDisabledTextColor(java.awt.Color.black);
        jTextField0401.setEnabled(false);
        jTextField0401.setHighlighter(null);

        jTextField0409.setEditable(false);
        jTextField0409.setDisabledTextColor(java.awt.Color.black);
        jTextField0409.setEnabled(false);
        jTextField0409.setHighlighter(null);

        jTextField0403.setEditable(false);
        jTextField0403.setDisabledTextColor(java.awt.Color.black);
        jTextField0403.setEnabled(false);
        jTextField0403.setHighlighter(null);

        jTextField0402.setEditable(false);
        jTextField0402.setDisabledTextColor(java.awt.Color.black);
        jTextField0402.setEnabled(false);
        jTextField0402.setHighlighter(null);

        jTextField0406.setEditable(false);
        jTextField0406.setDisabledTextColor(java.awt.Color.black);
        jTextField0406.setEnabled(false);
        jTextField0406.setHighlighter(null);
        jTextField0406.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0406ActionPerformed(evt);
            }
        });

        jTextField0405.setEditable(false);
        jTextField0405.setDisabledTextColor(java.awt.Color.black);
        jTextField0405.setEnabled(false);
        jTextField0405.setHighlighter(null);

        jTextField0408.setEditable(false);
        jTextField0408.setDisabledTextColor(java.awt.Color.black);
        jTextField0408.setEnabled(false);
        jTextField0408.setHighlighter(null);

        jTextField0407.setEditable(false);
        jTextField0407.setDisabledTextColor(java.awt.Color.black);
        jTextField0407.setEnabled(false);
        jTextField0407.setHighlighter(null);

        jTextField0400.setEditable(false);
        jTextField0400.setDisabledTextColor(java.awt.Color.black);
        jTextField0400.setEnabled(false);
        jTextField0400.setHighlighter(null);
        jTextField0400.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0400ActionPerformed(evt);
            }
        });

        jTextField0410.setEditable(false);
        jTextField0410.setDisabledTextColor(java.awt.Color.black);
        jTextField0410.setEnabled(false);
        jTextField0410.setHighlighter(null);

        jTextField0416.setEditable(false);
        jTextField0416.setDisabledTextColor(java.awt.Color.black);
        jTextField0416.setEnabled(false);
        jTextField0416.setHighlighter(null);

        jTextField0418.setEditable(false);
        jTextField0418.setDisabledTextColor(java.awt.Color.black);
        jTextField0418.setEnabled(false);
        jTextField0418.setHighlighter(null);

        jTextField0404.setEditable(false);
        jTextField0404.setDisabledTextColor(java.awt.Color.black);
        jTextField0404.setEnabled(false);
        jTextField0404.setHighlighter(null);

        jTextField0417.setEditable(false);
        jTextField0417.setDisabledTextColor(java.awt.Color.black);
        jTextField0417.setEnabled(false);
        jTextField0417.setHighlighter(null);

        jTextField0413.setEditable(false);
        jTextField0413.setDisabledTextColor(java.awt.Color.black);
        jTextField0413.setEnabled(false);
        jTextField0413.setHighlighter(null);

        jTextField0414.setEditable(false);
        jTextField0414.setDisabledTextColor(java.awt.Color.black);
        jTextField0414.setEnabled(false);
        jTextField0414.setHighlighter(null);

        jTextField0412.setEditable(false);
        jTextField0412.setDisabledTextColor(java.awt.Color.black);
        jTextField0412.setEnabled(false);
        jTextField0412.setHighlighter(null);

        jTextField0419.setEditable(false);
        jTextField0419.setDisabledTextColor(java.awt.Color.black);
        jTextField0419.setEnabled(false);
        jTextField0419.setHighlighter(null);

        jTextField0411.setEditable(false);
        jTextField0411.setDisabledTextColor(java.awt.Color.black);
        jTextField0411.setEnabled(false);
        jTextField0411.setHighlighter(null);

        jTextField0415.setEditable(false);
        jTextField0415.setDisabledTextColor(java.awt.Color.black);
        jTextField0415.setEnabled(false);
        jTextField0415.setHighlighter(null);

        jTextField0507.setEditable(false);
        jTextField0507.setDisabledTextColor(java.awt.Color.black);
        jTextField0507.setEnabled(false);
        jTextField0507.setHighlighter(null);

        jTextField0508.setEditable(false);
        jTextField0508.setDisabledTextColor(java.awt.Color.black);
        jTextField0508.setEnabled(false);
        jTextField0508.setHighlighter(null);

        jTextField0505.setEditable(false);
        jTextField0505.setDisabledTextColor(java.awt.Color.black);
        jTextField0505.setEnabled(false);
        jTextField0505.setHighlighter(null);

        jTextField0506.setEditable(false);
        jTextField0506.setDisabledTextColor(java.awt.Color.black);
        jTextField0506.setEnabled(false);
        jTextField0506.setHighlighter(null);
        jTextField0506.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0506ActionPerformed(evt);
            }
        });

        jTextField0502.setEditable(false);
        jTextField0502.setDisabledTextColor(java.awt.Color.black);
        jTextField0502.setEnabled(false);
        jTextField0502.setHighlighter(null);

        jTextField0503.setEditable(false);
        jTextField0503.setDisabledTextColor(java.awt.Color.black);
        jTextField0503.setEnabled(false);
        jTextField0503.setHighlighter(null);

        jTextField0509.setEditable(false);
        jTextField0509.setDisabledTextColor(java.awt.Color.black);
        jTextField0509.setEnabled(false);
        jTextField0509.setHighlighter(null);

        jTextField0501.setEditable(false);
        jTextField0501.setDisabledTextColor(java.awt.Color.black);
        jTextField0501.setEnabled(false);
        jTextField0501.setHighlighter(null);

        jTextField0513.setEditable(false);
        jTextField0513.setDisabledTextColor(java.awt.Color.black);
        jTextField0513.setEnabled(false);
        jTextField0513.setHighlighter(null);

        jTextField0514.setEditable(false);
        jTextField0514.setDisabledTextColor(java.awt.Color.black);
        jTextField0514.setEnabled(false);
        jTextField0514.setHighlighter(null);

        jTextField0504.setEditable(false);
        jTextField0504.setDisabledTextColor(java.awt.Color.black);
        jTextField0504.setEnabled(false);
        jTextField0504.setHighlighter(null);

        jTextField0517.setEditable(false);
        jTextField0517.setDisabledTextColor(java.awt.Color.black);
        jTextField0517.setEnabled(false);
        jTextField0517.setHighlighter(null);

        jTextField0516.setEditable(false);
        jTextField0516.setDisabledTextColor(java.awt.Color.black);
        jTextField0516.setEnabled(false);
        jTextField0516.setHighlighter(null);

        jTextField0518.setEditable(false);
        jTextField0518.setDisabledTextColor(java.awt.Color.black);
        jTextField0518.setEnabled(false);
        jTextField0518.setHighlighter(null);

        jTextField0500.setEditable(false);
        jTextField0500.setDisabledTextColor(java.awt.Color.black);
        jTextField0500.setEnabled(false);
        jTextField0500.setHighlighter(null);
        jTextField0500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0500ActionPerformed(evt);
            }
        });

        jTextField0510.setEditable(false);
        jTextField0510.setDisabledTextColor(java.awt.Color.black);
        jTextField0510.setEnabled(false);
        jTextField0510.setHighlighter(null);

        jTextField0512.setEditable(false);
        jTextField0512.setDisabledTextColor(java.awt.Color.black);
        jTextField0512.setEnabled(false);
        jTextField0512.setHighlighter(null);

        jTextField0519.setEditable(false);
        jTextField0519.setDisabledTextColor(java.awt.Color.black);
        jTextField0519.setEnabled(false);
        jTextField0519.setHighlighter(null);

        jTextField0515.setEditable(false);
        jTextField0515.setDisabledTextColor(java.awt.Color.black);
        jTextField0515.setEnabled(false);
        jTextField0515.setHighlighter(null);

        jTextField0511.setEditable(false);
        jTextField0511.setDisabledTextColor(java.awt.Color.black);
        jTextField0511.setEnabled(false);
        jTextField0511.setHighlighter(null);

        jTextField0606.setEditable(false);
        jTextField0606.setDisabledTextColor(java.awt.Color.black);
        jTextField0606.setEnabled(false);
        jTextField0606.setHighlighter(null);
        jTextField0606.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0606ActionPerformed(evt);
            }
        });

        jTextField0602.setEditable(false);
        jTextField0602.setDisabledTextColor(java.awt.Color.black);
        jTextField0602.setEnabled(false);
        jTextField0602.setHighlighter(null);

        jTextField0603.setEditable(false);
        jTextField0603.setDisabledTextColor(java.awt.Color.black);
        jTextField0603.setEnabled(false);
        jTextField0603.setHighlighter(null);

        jTextField0609.setEditable(false);
        jTextField0609.setDisabledTextColor(java.awt.Color.black);
        jTextField0609.setEnabled(false);
        jTextField0609.setHighlighter(null);

        jTextField0607.setEditable(false);
        jTextField0607.setDisabledTextColor(java.awt.Color.black);
        jTextField0607.setEnabled(false);
        jTextField0607.setHighlighter(null);

        jTextField0608.setEditable(false);
        jTextField0608.setDisabledTextColor(java.awt.Color.black);
        jTextField0608.setEnabled(false);
        jTextField0608.setHighlighter(null);

        jTextField0605.setEditable(false);
        jTextField0605.setDisabledTextColor(java.awt.Color.black);
        jTextField0605.setEnabled(false);
        jTextField0605.setHighlighter(null);

        jTextField0601.setEditable(false);
        jTextField0601.setDisabledTextColor(java.awt.Color.black);
        jTextField0601.setEnabled(false);
        jTextField0601.setHighlighter(null);

        jTextField0616.setEditable(false);
        jTextField0616.setDisabledTextColor(java.awt.Color.black);
        jTextField0616.setEnabled(false);
        jTextField0616.setHighlighter(null);

        jTextField0618.setEditable(false);
        jTextField0618.setDisabledTextColor(java.awt.Color.black);
        jTextField0618.setEnabled(false);
        jTextField0618.setHighlighter(null);

        jTextField0604.setEditable(false);
        jTextField0604.setDisabledTextColor(java.awt.Color.black);
        jTextField0604.setEnabled(false);
        jTextField0604.setHighlighter(null);

        jTextField0617.setEditable(false);
        jTextField0617.setDisabledTextColor(java.awt.Color.black);
        jTextField0617.setEnabled(false);
        jTextField0617.setHighlighter(null);

        jTextField0612.setEditable(false);
        jTextField0612.setDisabledTextColor(java.awt.Color.black);
        jTextField0612.setEnabled(false);
        jTextField0612.setHighlighter(null);

        jTextField0619.setEditable(false);
        jTextField0619.setDisabledTextColor(java.awt.Color.black);
        jTextField0619.setEnabled(false);
        jTextField0619.setHighlighter(null);

        jTextField0600.setEditable(false);
        jTextField0600.setDisabledTextColor(java.awt.Color.black);
        jTextField0600.setEnabled(false);
        jTextField0600.setHighlighter(null);
        jTextField0600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0600ActionPerformed(evt);
            }
        });

        jTextField0610.setEditable(false);
        jTextField0610.setDisabledTextColor(java.awt.Color.black);
        jTextField0610.setEnabled(false);
        jTextField0610.setHighlighter(null);

        jTextField0614.setEditable(false);
        jTextField0614.setDisabledTextColor(java.awt.Color.black);
        jTextField0614.setEnabled(false);
        jTextField0614.setHighlighter(null);

        jTextField0613.setEditable(false);
        jTextField0613.setDisabledTextColor(java.awt.Color.black);
        jTextField0613.setEnabled(false);
        jTextField0613.setHighlighter(null);

        jTextField0615.setEditable(false);
        jTextField0615.setDisabledTextColor(java.awt.Color.black);
        jTextField0615.setEnabled(false);
        jTextField0615.setHighlighter(null);

        jTextField0611.setEditable(false);
        jTextField0611.setDisabledTextColor(java.awt.Color.black);
        jTextField0611.setEnabled(false);
        jTextField0611.setHighlighter(null);

        jTextField0713.setEditable(false);
        jTextField0713.setDisabledTextColor(java.awt.Color.black);
        jTextField0713.setEnabled(false);
        jTextField0713.setHighlighter(null);

        jTextField0714.setEditable(false);
        jTextField0714.setDisabledTextColor(java.awt.Color.black);
        jTextField0714.setEnabled(false);
        jTextField0714.setHighlighter(null);

        jTextField0710.setEditable(false);
        jTextField0710.setDisabledTextColor(java.awt.Color.black);
        jTextField0710.setEnabled(false);
        jTextField0710.setHighlighter(null);

        jTextField0700.setEditable(false);
        jTextField0700.setDisabledTextColor(java.awt.Color.black);
        jTextField0700.setEnabled(false);
        jTextField0700.setHighlighter(null);
        jTextField0700.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0700ActionPerformed(evt);
            }
        });

        jTextField0719.setEditable(false);
        jTextField0719.setDisabledTextColor(java.awt.Color.black);
        jTextField0719.setEnabled(false);
        jTextField0719.setHighlighter(null);

        jTextField0712.setEditable(false);
        jTextField0712.setDisabledTextColor(java.awt.Color.black);
        jTextField0712.setEnabled(false);
        jTextField0712.setHighlighter(null);

        jTextField0704.setEditable(false);
        jTextField0704.setDisabledTextColor(java.awt.Color.black);
        jTextField0704.setEnabled(false);
        jTextField0704.setHighlighter(null);

        jTextField0717.setEditable(false);
        jTextField0717.setDisabledTextColor(java.awt.Color.black);
        jTextField0717.setEnabled(false);
        jTextField0717.setHighlighter(null);

        jTextField0716.setEditable(false);
        jTextField0716.setDisabledTextColor(java.awt.Color.black);
        jTextField0716.setEnabled(false);
        jTextField0716.setHighlighter(null);

        jTextField0718.setEditable(false);
        jTextField0718.setDisabledTextColor(java.awt.Color.black);
        jTextField0718.setEnabled(false);
        jTextField0718.setHighlighter(null);

        jTextField0711.setEditable(false);
        jTextField0711.setDisabledTextColor(java.awt.Color.black);
        jTextField0711.setEnabled(false);
        jTextField0711.setHighlighter(null);

        jTextField0715.setEditable(false);
        jTextField0715.setDisabledTextColor(java.awt.Color.black);
        jTextField0715.setEnabled(false);
        jTextField0715.setHighlighter(null);

        jTextField0702.setEditable(false);
        jTextField0702.setDisabledTextColor(java.awt.Color.black);
        jTextField0702.setEnabled(false);
        jTextField0702.setHighlighter(null);

        jTextField0703.setEditable(false);
        jTextField0703.setDisabledTextColor(java.awt.Color.black);
        jTextField0703.setEnabled(false);
        jTextField0703.setHighlighter(null);

        jTextField0709.setEditable(false);
        jTextField0709.setDisabledTextColor(java.awt.Color.black);
        jTextField0709.setEnabled(false);
        jTextField0709.setHighlighter(null);

        jTextField0707.setEditable(false);
        jTextField0707.setDisabledTextColor(java.awt.Color.black);
        jTextField0707.setEnabled(false);
        jTextField0707.setHighlighter(null);

        jTextField0708.setEditable(false);
        jTextField0708.setDisabledTextColor(java.awt.Color.black);
        jTextField0708.setEnabled(false);
        jTextField0708.setHighlighter(null);

        jTextField0705.setEditable(false);
        jTextField0705.setDisabledTextColor(java.awt.Color.black);
        jTextField0705.setEnabled(false);
        jTextField0705.setHighlighter(null);

        jTextField0701.setEditable(false);
        jTextField0701.setDisabledTextColor(java.awt.Color.black);
        jTextField0701.setEnabled(false);
        jTextField0701.setHighlighter(null);

        jTextField0706.setEditable(false);
        jTextField0706.setDisabledTextColor(java.awt.Color.black);
        jTextField0706.setEnabled(false);
        jTextField0706.setHighlighter(null);
        jTextField0706.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0706ActionPerformed(evt);
            }
        });

        jTextField0817.setEditable(false);
        jTextField0817.setDisabledTextColor(java.awt.Color.black);
        jTextField0817.setEnabled(false);
        jTextField0817.setHighlighter(null);

        jTextField0819.setEditable(false);
        jTextField0819.setDisabledTextColor(java.awt.Color.black);
        jTextField0819.setEnabled(false);
        jTextField0819.setHighlighter(null);

        jTextField0800.setEditable(false);
        jTextField0800.setDisabledTextColor(java.awt.Color.black);
        jTextField0800.setEnabled(false);
        jTextField0800.setHighlighter(null);
        jTextField0800.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0800ActionPerformed(evt);
            }
        });

        jTextField0804.setEditable(false);
        jTextField0804.setDisabledTextColor(java.awt.Color.black);
        jTextField0804.setEnabled(false);
        jTextField0804.setHighlighter(null);

        jTextField0812.setEditable(false);
        jTextField0812.setDisabledTextColor(java.awt.Color.black);
        jTextField0812.setEnabled(false);
        jTextField0812.setHighlighter(null);

        jTextField0813.setEditable(false);
        jTextField0813.setDisabledTextColor(java.awt.Color.black);
        jTextField0813.setEnabled(false);
        jTextField0813.setHighlighter(null);

        jTextField0814.setEditable(false);
        jTextField0814.setDisabledTextColor(java.awt.Color.black);
        jTextField0814.setEnabled(false);
        jTextField0814.setHighlighter(null);

        jTextField0810.setEditable(false);
        jTextField0810.setDisabledTextColor(java.awt.Color.black);
        jTextField0810.setEnabled(false);
        jTextField0810.setHighlighter(null);

        jTextField0805.setEditable(false);
        jTextField0805.setDisabledTextColor(java.awt.Color.black);
        jTextField0805.setEnabled(false);
        jTextField0805.setHighlighter(null);

        jTextField0808.setEditable(false);
        jTextField0808.setDisabledTextColor(java.awt.Color.black);
        jTextField0808.setEnabled(false);
        jTextField0808.setHighlighter(null);

        jTextField0807.setEditable(false);
        jTextField0807.setDisabledTextColor(java.awt.Color.black);
        jTextField0807.setEnabled(false);
        jTextField0807.setHighlighter(null);

        jTextField0809.setEditable(false);
        jTextField0809.setDisabledTextColor(java.awt.Color.black);
        jTextField0809.setEnabled(false);
        jTextField0809.setHighlighter(null);

        jTextField0816.setEditable(false);
        jTextField0816.setDisabledTextColor(java.awt.Color.black);
        jTextField0816.setEnabled(false);
        jTextField0816.setHighlighter(null);

        jTextField0818.setEditable(false);
        jTextField0818.setDisabledTextColor(java.awt.Color.black);
        jTextField0818.setEnabled(false);
        jTextField0818.setHighlighter(null);

        jTextField0802.setEditable(false);
        jTextField0802.setDisabledTextColor(java.awt.Color.black);
        jTextField0802.setEnabled(false);
        jTextField0802.setHighlighter(null);

        jTextField0803.setEditable(false);
        jTextField0803.setDisabledTextColor(java.awt.Color.black);
        jTextField0803.setEnabled(false);
        jTextField0803.setHighlighter(null);

        jTextField0811.setEditable(false);
        jTextField0811.setDisabledTextColor(java.awt.Color.black);
        jTextField0811.setEnabled(false);
        jTextField0811.setHighlighter(null);

        jTextField0815.setEditable(false);
        jTextField0815.setDisabledTextColor(java.awt.Color.black);
        jTextField0815.setEnabled(false);
        jTextField0815.setHighlighter(null);

        jTextField0801.setEditable(false);
        jTextField0801.setDisabledTextColor(java.awt.Color.black);
        jTextField0801.setEnabled(false);
        jTextField0801.setHighlighter(null);

        jTextField0806.setEditable(false);
        jTextField0806.setDisabledTextColor(java.awt.Color.black);
        jTextField0806.setEnabled(false);
        jTextField0806.setHighlighter(null);
        jTextField0806.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0806ActionPerformed(evt);
            }
        });

        jTextField0901.setEditable(false);
        jTextField0901.setDisabledTextColor(java.awt.Color.black);
        jTextField0901.setEnabled(false);
        jTextField0901.setHighlighter(null);

        jTextField0906.setEditable(false);
        jTextField0906.setDisabledTextColor(java.awt.Color.black);
        jTextField0906.setEnabled(false);
        jTextField0906.setHighlighter(null);
        jTextField0906.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0906ActionPerformed(evt);
            }
        });

        jTextField0914.setEditable(false);
        jTextField0914.setDisabledTextColor(java.awt.Color.black);
        jTextField0914.setEnabled(false);
        jTextField0914.setHighlighter(null);

        jTextField0913.setEditable(false);
        jTextField0913.setDisabledTextColor(java.awt.Color.black);
        jTextField0913.setEnabled(false);
        jTextField0913.setHighlighter(null);

        jTextField0910.setEditable(false);
        jTextField0910.setDisabledTextColor(java.awt.Color.black);
        jTextField0910.setEnabled(false);
        jTextField0910.setHighlighter(null);

        jTextField0917.setEditable(false);
        jTextField0917.setDisabledTextColor(java.awt.Color.black);
        jTextField0917.setEnabled(false);
        jTextField0917.setHighlighter(null);

        jTextField0919.setEditable(false);
        jTextField0919.setDisabledTextColor(java.awt.Color.black);
        jTextField0919.setEnabled(false);
        jTextField0919.setHighlighter(null);

        jTextField0900.setEditable(false);
        jTextField0900.setDisabledTextColor(java.awt.Color.black);
        jTextField0900.setEnabled(false);
        jTextField0900.setHighlighter(null);
        jTextField0900.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0900ActionPerformed(evt);
            }
        });

        jTextField0904.setEditable(false);
        jTextField0904.setDisabledTextColor(java.awt.Color.black);
        jTextField0904.setEnabled(false);
        jTextField0904.setHighlighter(null);

        jTextField0912.setEditable(false);
        jTextField0912.setDisabledTextColor(java.awt.Color.black);
        jTextField0912.setEnabled(false);
        jTextField0912.setHighlighter(null);

        jTextField0918.setEditable(false);
        jTextField0918.setDisabledTextColor(java.awt.Color.black);
        jTextField0918.setEnabled(false);
        jTextField0918.setHighlighter(null);

        jTextField0916.setEditable(false);
        jTextField0916.setDisabledTextColor(java.awt.Color.black);
        jTextField0916.setEnabled(false);
        jTextField0916.setHighlighter(null);

        jTextField0903.setEditable(false);
        jTextField0903.setDisabledTextColor(java.awt.Color.black);
        jTextField0903.setEnabled(false);
        jTextField0903.setHighlighter(null);

        jTextField0902.setEditable(false);
        jTextField0902.setDisabledTextColor(java.awt.Color.black);
        jTextField0902.setEnabled(false);
        jTextField0902.setHighlighter(null);

        jTextField0908.setEditable(false);
        jTextField0908.setDisabledTextColor(java.awt.Color.black);
        jTextField0908.setEnabled(false);
        jTextField0908.setHighlighter(null);

        jTextField0905.setEditable(false);
        jTextField0905.setDisabledTextColor(java.awt.Color.black);
        jTextField0905.setEnabled(false);
        jTextField0905.setHighlighter(null);

        jTextField0909.setEditable(false);
        jTextField0909.setDisabledTextColor(java.awt.Color.black);
        jTextField0909.setEnabled(false);
        jTextField0909.setHighlighter(null);

        jTextField0907.setEditable(false);
        jTextField0907.setDisabledTextColor(java.awt.Color.black);
        jTextField0907.setEnabled(false);
        jTextField0907.setHighlighter(null);

        jTextField0911.setEditable(false);
        jTextField0911.setDisabledTextColor(java.awt.Color.black);
        jTextField0911.setEnabled(false);
        jTextField0911.setHighlighter(null);

        jTextField0915.setEditable(false);
        jTextField0915.setDisabledTextColor(java.awt.Color.black);
        jTextField0915.setEnabled(false);
        jTextField0915.setHighlighter(null);

        jTextField1001.setEditable(false);
        jTextField1001.setDisabledTextColor(java.awt.Color.black);
        jTextField1001.setEnabled(false);
        jTextField1001.setHighlighter(null);

        jTextField1006.setEditable(false);
        jTextField1006.setDisabledTextColor(java.awt.Color.black);
        jTextField1006.setEnabled(false);
        jTextField1006.setHighlighter(null);
        jTextField1006.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1006ActionPerformed(evt);
            }
        });

        jTextField1014.setEditable(false);
        jTextField1014.setDisabledTextColor(java.awt.Color.black);
        jTextField1014.setEnabled(false);
        jTextField1014.setHighlighter(null);

        jTextField1013.setEditable(false);
        jTextField1013.setDisabledTextColor(java.awt.Color.black);
        jTextField1013.setEnabled(false);
        jTextField1013.setHighlighter(null);

        jTextField1010.setEditable(false);
        jTextField1010.setDisabledTextColor(java.awt.Color.black);
        jTextField1010.setEnabled(false);
        jTextField1010.setHighlighter(null);

        jTextField1017.setEditable(false);
        jTextField1017.setDisabledTextColor(java.awt.Color.black);
        jTextField1017.setEnabled(false);
        jTextField1017.setHighlighter(null);

        jTextField1019.setEditable(false);
        jTextField1019.setDisabledTextColor(java.awt.Color.black);
        jTextField1019.setEnabled(false);
        jTextField1019.setHighlighter(null);

        jTextField1000.setEditable(false);
        jTextField1000.setDisabledTextColor(java.awt.Color.black);
        jTextField1000.setEnabled(false);
        jTextField1000.setHighlighter(null);
        jTextField1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1000ActionPerformed(evt);
            }
        });

        jTextField1012.setEditable(false);
        jTextField1012.setDisabledTextColor(java.awt.Color.black);
        jTextField1012.setEnabled(false);
        jTextField1012.setHighlighter(null);

        jTextField1018.setEditable(false);
        jTextField1018.setDisabledTextColor(java.awt.Color.black);
        jTextField1018.setEnabled(false);
        jTextField1018.setHighlighter(null);

        jTextField1004.setEditable(false);
        jTextField1004.setDisabledTextColor(java.awt.Color.black);
        jTextField1004.setEnabled(false);
        jTextField1004.setHighlighter(null);

        jTextField1002.setEditable(false);
        jTextField1002.setDisabledTextColor(java.awt.Color.black);
        jTextField1002.setEnabled(false);
        jTextField1002.setHighlighter(null);

        jTextField1008.setEditable(false);
        jTextField1008.setDisabledTextColor(java.awt.Color.black);
        jTextField1008.setEnabled(false);
        jTextField1008.setHighlighter(null);

        jTextField1016.setEditable(false);
        jTextField1016.setDisabledTextColor(java.awt.Color.black);
        jTextField1016.setEnabled(false);
        jTextField1016.setHighlighter(null);

        jTextField1003.setEditable(false);
        jTextField1003.setDisabledTextColor(java.awt.Color.black);
        jTextField1003.setEnabled(false);
        jTextField1003.setHighlighter(null);

        jTextField1007.setEditable(false);
        jTextField1007.setDisabledTextColor(java.awt.Color.black);
        jTextField1007.setEnabled(false);
        jTextField1007.setHighlighter(null);

        jTextField1005.setEditable(false);
        jTextField1005.setDisabledTextColor(java.awt.Color.black);
        jTextField1005.setEnabled(false);
        jTextField1005.setHighlighter(null);

        jTextField1009.setEditable(false);
        jTextField1009.setDisabledTextColor(java.awt.Color.black);
        jTextField1009.setEnabled(false);
        jTextField1009.setHighlighter(null);

        jTextField1011.setEditable(false);
        jTextField1011.setDisabledTextColor(java.awt.Color.black);
        jTextField1011.setEnabled(false);
        jTextField1011.setHighlighter(null);

        jTextField1015.setEditable(false);
        jTextField1015.setDisabledTextColor(java.awt.Color.black);
        jTextField1015.setEnabled(false);
        jTextField1015.setHighlighter(null);

        jTextField1116.setEditable(false);
        jTextField1116.setDisabledTextColor(java.awt.Color.black);
        jTextField1116.setEnabled(false);
        jTextField1116.setHighlighter(null);

        jTextField1113.setEditable(false);
        jTextField1113.setDisabledTextColor(java.awt.Color.black);
        jTextField1113.setEnabled(false);
        jTextField1113.setHighlighter(null);

        jTextField1101.setEditable(false);
        jTextField1101.setDisabledTextColor(java.awt.Color.black);
        jTextField1101.setEnabled(false);
        jTextField1101.setHighlighter(null);

        jTextField1119.setEditable(false);
        jTextField1119.setDisabledTextColor(java.awt.Color.black);
        jTextField1119.setEnabled(false);
        jTextField1119.setHighlighter(null);

        jTextField1103.setEditable(false);
        jTextField1103.setDisabledTextColor(java.awt.Color.black);
        jTextField1103.setEnabled(false);
        jTextField1103.setHighlighter(null);

        jTextField1104.setEditable(false);
        jTextField1104.setDisabledTextColor(java.awt.Color.black);
        jTextField1104.setEnabled(false);
        jTextField1104.setHighlighter(null);

        jTextField1106.setEditable(false);
        jTextField1106.setDisabledTextColor(java.awt.Color.black);
        jTextField1106.setEnabled(false);
        jTextField1106.setHighlighter(null);
        jTextField1106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1106ActionPerformed(evt);
            }
        });

        jTextField1109.setEditable(false);
        jTextField1109.setDisabledTextColor(java.awt.Color.black);
        jTextField1109.setEnabled(false);
        jTextField1109.setHighlighter(null);

        jTextField1108.setEditable(false);
        jTextField1108.setDisabledTextColor(java.awt.Color.black);
        jTextField1108.setEnabled(false);
        jTextField1108.setHighlighter(null);

        jTextField1115.setEditable(false);
        jTextField1115.setDisabledTextColor(java.awt.Color.black);
        jTextField1115.setEnabled(false);
        jTextField1115.setHighlighter(null);

        jTextField1112.setEditable(false);
        jTextField1112.setDisabledTextColor(java.awt.Color.black);
        jTextField1112.setEnabled(false);
        jTextField1112.setHighlighter(null);

        jTextField1110.setEditable(false);
        jTextField1110.setDisabledTextColor(java.awt.Color.black);
        jTextField1110.setEnabled(false);
        jTextField1110.setHighlighter(null);

        jTextField1100.setEditable(false);
        jTextField1100.setDisabledTextColor(java.awt.Color.black);
        jTextField1100.setEnabled(false);
        jTextField1100.setHighlighter(null);
        jTextField1100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1100ActionPerformed(evt);
            }
        });

        jTextField1111.setEditable(false);
        jTextField1111.setDisabledTextColor(java.awt.Color.black);
        jTextField1111.setEnabled(false);
        jTextField1111.setHighlighter(null);

        jTextField1118.setEditable(false);
        jTextField1118.setDisabledTextColor(java.awt.Color.black);
        jTextField1118.setEnabled(false);
        jTextField1118.setHighlighter(null);

        jTextField1114.setEditable(false);
        jTextField1114.setDisabledTextColor(java.awt.Color.black);
        jTextField1114.setEnabled(false);
        jTextField1114.setHighlighter(null);

        jTextField1107.setEditable(false);
        jTextField1107.setDisabledTextColor(java.awt.Color.black);
        jTextField1107.setEnabled(false);
        jTextField1107.setHighlighter(null);

        jTextField1102.setEditable(false);
        jTextField1102.setDisabledTextColor(java.awt.Color.black);
        jTextField1102.setEnabled(false);
        jTextField1102.setHighlighter(null);

        jTextField1117.setEditable(false);
        jTextField1117.setDisabledTextColor(java.awt.Color.black);
        jTextField1117.setEnabled(false);
        jTextField1117.setHighlighter(null);

        jTextField1105.setEditable(false);
        jTextField1105.setDisabledTextColor(java.awt.Color.black);
        jTextField1105.setEnabled(false);
        jTextField1105.setHighlighter(null);

        jTextField1201.setEditable(false);
        jTextField1201.setDisabledTextColor(java.awt.Color.black);
        jTextField1201.setEnabled(false);
        jTextField1201.setHighlighter(null);

        jTextField1212.setEditable(false);
        jTextField1212.setDisabledTextColor(java.awt.Color.black);
        jTextField1212.setEnabled(false);
        jTextField1212.setHighlighter(null);

        jTextField1217.setEditable(false);
        jTextField1217.setDisabledTextColor(java.awt.Color.black);
        jTextField1217.setEnabled(false);
        jTextField1217.setHighlighter(null);

        jTextField1218.setEditable(false);
        jTextField1218.setDisabledTextColor(java.awt.Color.black);
        jTextField1218.setEnabled(false);
        jTextField1218.setHighlighter(null);

        jTextField1216.setEditable(false);
        jTextField1216.setDisabledTextColor(java.awt.Color.black);
        jTextField1216.setEnabled(false);
        jTextField1216.setHighlighter(null);

        jTextField1200.setEditable(false);
        jTextField1200.setDisabledTextColor(java.awt.Color.black);
        jTextField1200.setEnabled(false);
        jTextField1200.setHighlighter(null);
        jTextField1200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1200ActionPerformed(evt);
            }
        });

        jTextField1211.setEditable(false);
        jTextField1211.setDisabledTextColor(java.awt.Color.black);
        jTextField1211.setEnabled(false);
        jTextField1211.setHighlighter(null);

        jTextField1213.setEditable(false);
        jTextField1213.setDisabledTextColor(java.awt.Color.black);
        jTextField1213.setEnabled(false);
        jTextField1213.setHighlighter(null);

        jTextField1206.setEditable(false);
        jTextField1206.setDisabledTextColor(java.awt.Color.black);
        jTextField1206.setEnabled(false);
        jTextField1206.setHighlighter(null);
        jTextField1206.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1206ActionPerformed(evt);
            }
        });

        jTextField1215.setEditable(false);
        jTextField1215.setDisabledTextColor(java.awt.Color.black);
        jTextField1215.setEnabled(false);
        jTextField1215.setHighlighter(null);

        jTextField1208.setEditable(false);
        jTextField1208.setDisabledTextColor(java.awt.Color.black);
        jTextField1208.setEnabled(false);
        jTextField1208.setHighlighter(null);

        jTextField1202.setEditable(false);
        jTextField1202.setDisabledTextColor(java.awt.Color.black);
        jTextField1202.setEnabled(false);
        jTextField1202.setHighlighter(null);

        jTextField1214.setEditable(false);
        jTextField1214.setDisabledTextColor(java.awt.Color.black);
        jTextField1214.setEnabled(false);
        jTextField1214.setHighlighter(null);

        jTextField1210.setEditable(false);
        jTextField1210.setDisabledTextColor(java.awt.Color.black);
        jTextField1210.setEnabled(false);
        jTextField1210.setHighlighter(null);

        jTextField1205.setEditable(false);
        jTextField1205.setDisabledTextColor(java.awt.Color.black);
        jTextField1205.setEnabled(false);
        jTextField1205.setHighlighter(null);

        jTextField1203.setEditable(false);
        jTextField1203.setDisabledTextColor(java.awt.Color.black);
        jTextField1203.setEnabled(false);
        jTextField1203.setHighlighter(null);

        jTextField1204.setEditable(false);
        jTextField1204.setDisabledTextColor(java.awt.Color.black);
        jTextField1204.setEnabled(false);
        jTextField1204.setHighlighter(null);

        jTextField1219.setEditable(false);
        jTextField1219.setDisabledTextColor(java.awt.Color.black);
        jTextField1219.setEnabled(false);
        jTextField1219.setHighlighter(null);

        jTextField1209.setEditable(false);
        jTextField1209.setDisabledTextColor(java.awt.Color.black);
        jTextField1209.setEnabled(false);
        jTextField1209.setHighlighter(null);

        jTextField1207.setEditable(false);
        jTextField1207.setDisabledTextColor(java.awt.Color.black);
        jTextField1207.setEnabled(false);
        jTextField1207.setHighlighter(null);

        jTextField1314.setEditable(false);
        jTextField1314.setDisabledTextColor(java.awt.Color.black);
        jTextField1314.setEnabled(false);
        jTextField1314.setHighlighter(null);

        jTextField1304.setEditable(false);
        jTextField1304.setDisabledTextColor(java.awt.Color.black);
        jTextField1304.setEnabled(false);
        jTextField1304.setHighlighter(null);

        jTextField1300.setEditable(false);
        jTextField1300.setDisabledTextColor(java.awt.Color.black);
        jTextField1300.setEnabled(false);
        jTextField1300.setHighlighter(null);
        jTextField1300.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1300ActionPerformed(evt);
            }
        });

        jTextField1316.setEditable(false);
        jTextField1316.setDisabledTextColor(java.awt.Color.black);
        jTextField1316.setEnabled(false);
        jTextField1316.setHighlighter(null);

        jTextField1309.setEditable(false);
        jTextField1309.setDisabledTextColor(java.awt.Color.black);
        jTextField1309.setEnabled(false);
        jTextField1309.setHighlighter(null);

        jTextField1318.setEditable(false);
        jTextField1318.setDisabledTextColor(java.awt.Color.black);
        jTextField1318.setEnabled(false);
        jTextField1318.setHighlighter(null);

        jTextField1301.setEditable(false);
        jTextField1301.setDisabledTextColor(java.awt.Color.black);
        jTextField1301.setEnabled(false);
        jTextField1301.setHighlighter(null);

        jTextField1312.setEditable(false);
        jTextField1312.setDisabledTextColor(java.awt.Color.black);
        jTextField1312.setEnabled(false);
        jTextField1312.setHighlighter(null);

        jTextField1319.setEditable(false);
        jTextField1319.setDisabledTextColor(java.awt.Color.black);
        jTextField1319.setEnabled(false);
        jTextField1319.setHighlighter(null);

        jTextField1306.setEditable(false);
        jTextField1306.setDisabledTextColor(java.awt.Color.black);
        jTextField1306.setEnabled(false);
        jTextField1306.setHighlighter(null);
        jTextField1306.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1306ActionPerformed(evt);
            }
        });

        jTextField1310.setEditable(false);
        jTextField1310.setDisabledTextColor(java.awt.Color.black);
        jTextField1310.setEnabled(false);
        jTextField1310.setHighlighter(null);

        jTextField1303.setEditable(false);
        jTextField1303.setDisabledTextColor(java.awt.Color.black);
        jTextField1303.setEnabled(false);
        jTextField1303.setHighlighter(null);

        jTextField1311.setEditable(false);
        jTextField1311.setDisabledTextColor(java.awt.Color.black);
        jTextField1311.setEnabled(false);
        jTextField1311.setHighlighter(null);

        jTextField1302.setEditable(false);
        jTextField1302.setDisabledTextColor(java.awt.Color.black);
        jTextField1302.setEnabled(false);
        jTextField1302.setHighlighter(null);

        jTextField1313.setEditable(false);
        jTextField1313.setDisabledTextColor(java.awt.Color.black);
        jTextField1313.setEnabled(false);
        jTextField1313.setHighlighter(null);

        jTextField1305.setEditable(false);
        jTextField1305.setDisabledTextColor(java.awt.Color.black);
        jTextField1305.setEnabled(false);
        jTextField1305.setHighlighter(null);

        jTextField1315.setEditable(false);
        jTextField1315.setDisabledTextColor(java.awt.Color.black);
        jTextField1315.setEnabled(false);
        jTextField1315.setHighlighter(null);

        jTextField1308.setEditable(false);
        jTextField1308.setDisabledTextColor(java.awt.Color.black);
        jTextField1308.setEnabled(false);
        jTextField1308.setHighlighter(null);

        jTextField1307.setEditable(false);
        jTextField1307.setDisabledTextColor(java.awt.Color.black);
        jTextField1307.setEnabled(false);
        jTextField1307.setHighlighter(null);

        jTextField1317.setEditable(false);
        jTextField1317.setDisabledTextColor(java.awt.Color.black);
        jTextField1317.setEnabled(false);
        jTextField1317.setHighlighter(null);

        jTextField1406.setEditable(false);
        jTextField1406.setDisabledTextColor(java.awt.Color.black);
        jTextField1406.setEnabled(false);
        jTextField1406.setHighlighter(null);
        jTextField1406.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1406ActionPerformed(evt);
            }
        });

        jTextField1416.setEditable(false);
        jTextField1416.setDisabledTextColor(java.awt.Color.black);
        jTextField1416.setEnabled(false);
        jTextField1416.setHighlighter(null);

        jTextField1417.setEditable(false);
        jTextField1417.setDisabledTextColor(java.awt.Color.black);
        jTextField1417.setEnabled(false);
        jTextField1417.setHighlighter(null);

        jTextField1407.setEditable(false);
        jTextField1407.setDisabledTextColor(java.awt.Color.black);
        jTextField1407.setEnabled(false);
        jTextField1407.setHighlighter(null);

        jTextField1415.setEditable(false);
        jTextField1415.setDisabledTextColor(java.awt.Color.black);
        jTextField1415.setEnabled(false);
        jTextField1415.setHighlighter(null);

        jTextField1401.setEditable(false);
        jTextField1401.setDisabledTextColor(java.awt.Color.black);
        jTextField1401.setEnabled(false);
        jTextField1401.setHighlighter(null);

        jTextField1403.setEditable(false);
        jTextField1403.setDisabledTextColor(java.awt.Color.black);
        jTextField1403.setEnabled(false);
        jTextField1403.setHighlighter(null);

        jTextField1404.setEditable(false);
        jTextField1404.setDisabledTextColor(java.awt.Color.black);
        jTextField1404.setEnabled(false);
        jTextField1404.setHighlighter(null);

        jTextField1418.setEditable(false);
        jTextField1418.setDisabledTextColor(java.awt.Color.black);
        jTextField1418.setEnabled(false);
        jTextField1418.setHighlighter(null);

        jTextField1400.setEditable(false);
        jTextField1400.setDisabledTextColor(java.awt.Color.black);
        jTextField1400.setEnabled(false);
        jTextField1400.setHighlighter(null);
        jTextField1400.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1400ActionPerformed(evt);
            }
        });

        jTextField1413.setEditable(false);
        jTextField1413.setDisabledTextColor(java.awt.Color.black);
        jTextField1413.setEnabled(false);
        jTextField1413.setHighlighter(null);

        jTextField1408.setEditable(false);
        jTextField1408.setDisabledTextColor(java.awt.Color.black);
        jTextField1408.setEnabled(false);
        jTextField1408.setHighlighter(null);

        jTextField1409.setEditable(false);
        jTextField1409.setDisabledTextColor(java.awt.Color.black);
        jTextField1409.setEnabled(false);
        jTextField1409.setHighlighter(null);

        jTextField1412.setEditable(false);
        jTextField1412.setDisabledTextColor(java.awt.Color.black);
        jTextField1412.setEnabled(false);
        jTextField1412.setHighlighter(null);

        jTextField1419.setEditable(false);
        jTextField1419.setDisabledTextColor(java.awt.Color.black);
        jTextField1419.setEnabled(false);
        jTextField1419.setHighlighter(null);

        jTextField1405.setEditable(false);
        jTextField1405.setDisabledTextColor(java.awt.Color.black);
        jTextField1405.setEnabled(false);
        jTextField1405.setHighlighter(null);

        jTextField1402.setEditable(false);
        jTextField1402.setDisabledTextColor(java.awt.Color.black);
        jTextField1402.setEnabled(false);
        jTextField1402.setHighlighter(null);

        jTextField1414.setEditable(false);
        jTextField1414.setDisabledTextColor(java.awt.Color.black);
        jTextField1414.setEnabled(false);
        jTextField1414.setHighlighter(null);

        jTextField1410.setEditable(false);
        jTextField1410.setDisabledTextColor(java.awt.Color.black);
        jTextField1410.setEnabled(false);
        jTextField1410.setHighlighter(null);

        jTextField1411.setEditable(false);
        jTextField1411.setDisabledTextColor(java.awt.Color.black);
        jTextField1411.setEnabled(false);
        jTextField1411.setHighlighter(null);

        jTextField1514.setEditable(false);
        jTextField1514.setDisabledTextColor(java.awt.Color.black);
        jTextField1514.setEnabled(false);
        jTextField1514.setHighlighter(null);

        jTextField1506.setEditable(false);
        jTextField1506.setDisabledTextColor(java.awt.Color.black);
        jTextField1506.setEnabled(false);
        jTextField1506.setHighlighter(null);
        jTextField1506.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1506ActionPerformed(evt);
            }
        });

        jTextField1519.setEditable(false);
        jTextField1519.setDisabledTextColor(java.awt.Color.black);
        jTextField1519.setEnabled(false);
        jTextField1519.setHighlighter(null);

        jTextField1503.setEditable(false);
        jTextField1503.setDisabledTextColor(java.awt.Color.black);
        jTextField1503.setEnabled(false);
        jTextField1503.setHighlighter(null);

        jTextField1511.setEditable(false);
        jTextField1511.setDisabledTextColor(java.awt.Color.black);
        jTextField1511.setEnabled(false);
        jTextField1511.setHighlighter(null);

        jTextField1508.setEditable(false);
        jTextField1508.setDisabledTextColor(java.awt.Color.black);
        jTextField1508.setEnabled(false);
        jTextField1508.setHighlighter(null);

        jTextField1513.setEditable(false);
        jTextField1513.setDisabledTextColor(java.awt.Color.black);
        jTextField1513.setEnabled(false);
        jTextField1513.setHighlighter(null);

        jTextField1500.setEditable(false);
        jTextField1500.setDisabledTextColor(java.awt.Color.black);
        jTextField1500.setEnabled(false);
        jTextField1500.setHighlighter(null);
        jTextField1500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1500ActionPerformed(evt);
            }
        });

        jTextField1509.setEditable(false);
        jTextField1509.setDisabledTextColor(java.awt.Color.black);
        jTextField1509.setEnabled(false);
        jTextField1509.setHighlighter(null);

        jTextField1501.setEditable(false);
        jTextField1501.setDisabledTextColor(java.awt.Color.black);
        jTextField1501.setEnabled(false);
        jTextField1501.setHighlighter(null);

        jTextField1510.setEditable(false);
        jTextField1510.setDisabledTextColor(java.awt.Color.black);
        jTextField1510.setEnabled(false);
        jTextField1510.setHighlighter(null);

        jTextField1505.setEditable(false);
        jTextField1505.setDisabledTextColor(java.awt.Color.black);
        jTextField1505.setEnabled(false);
        jTextField1505.setHighlighter(null);

        jTextField1516.setEditable(false);
        jTextField1516.setDisabledTextColor(java.awt.Color.black);
        jTextField1516.setEnabled(false);
        jTextField1516.setHighlighter(null);

        jTextField1507.setEditable(false);
        jTextField1507.setDisabledTextColor(java.awt.Color.black);
        jTextField1507.setEnabled(false);
        jTextField1507.setHighlighter(null);

        jTextField1512.setEditable(false);
        jTextField1512.setDisabledTextColor(java.awt.Color.black);
        jTextField1512.setEnabled(false);
        jTextField1512.setHighlighter(null);

        jTextField1515.setEditable(false);
        jTextField1515.setDisabledTextColor(java.awt.Color.black);
        jTextField1515.setEnabled(false);
        jTextField1515.setHighlighter(null);

        jTextField1502.setEditable(false);
        jTextField1502.setDisabledTextColor(java.awt.Color.black);
        jTextField1502.setEnabled(false);
        jTextField1502.setHighlighter(null);

        jTextField1517.setEditable(false);
        jTextField1517.setDisabledTextColor(java.awt.Color.black);
        jTextField1517.setEnabled(false);
        jTextField1517.setHighlighter(null);

        jTextField1518.setEditable(false);
        jTextField1518.setDisabledTextColor(java.awt.Color.black);
        jTextField1518.setEnabled(false);
        jTextField1518.setHighlighter(null);

        jTextField1504.setEditable(false);
        jTextField1504.setDisabledTextColor(java.awt.Color.black);
        jTextField1504.setEnabled(false);
        jTextField1504.setHighlighter(null);

        jTextField1617.setEditable(false);
        jTextField1617.setDisabledTextColor(java.awt.Color.black);
        jTextField1617.setEnabled(false);
        jTextField1617.setHighlighter(null);

        jTextField1612.setEditable(false);
        jTextField1612.setDisabledTextColor(java.awt.Color.black);
        jTextField1612.setEnabled(false);
        jTextField1612.setHighlighter(null);

        jTextField1616.setEditable(false);
        jTextField1616.setDisabledTextColor(java.awt.Color.black);
        jTextField1616.setEnabled(false);
        jTextField1616.setHighlighter(null);

        jTextField1605.setEditable(false);
        jTextField1605.setDisabledTextColor(java.awt.Color.black);
        jTextField1605.setEnabled(false);
        jTextField1605.setHighlighter(null);

        jTextField1615.setEditable(false);
        jTextField1615.setDisabledTextColor(java.awt.Color.black);
        jTextField1615.setEnabled(false);
        jTextField1615.setHighlighter(null);

        jTextField1618.setEditable(false);
        jTextField1618.setDisabledTextColor(java.awt.Color.black);
        jTextField1618.setEnabled(false);
        jTextField1618.setHighlighter(null);

        jTextField1607.setEditable(false);
        jTextField1607.setDisabledTextColor(java.awt.Color.black);
        jTextField1607.setEnabled(false);
        jTextField1607.setHighlighter(null);

        jTextField1600.setEditable(false);
        jTextField1600.setDisabledTextColor(java.awt.Color.black);
        jTextField1600.setEnabled(false);
        jTextField1600.setHighlighter(null);
        jTextField1600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1600ActionPerformed(evt);
            }
        });

        jTextField1601.setEditable(false);
        jTextField1601.setDisabledTextColor(java.awt.Color.black);
        jTextField1601.setEnabled(false);
        jTextField1601.setHighlighter(null);

        jTextField1619.setEditable(false);
        jTextField1619.setDisabledTextColor(java.awt.Color.black);
        jTextField1619.setEnabled(false);
        jTextField1619.setHighlighter(null);

        jTextField1603.setEditable(false);
        jTextField1603.setDisabledTextColor(java.awt.Color.black);
        jTextField1603.setEnabled(false);
        jTextField1603.setHighlighter(null);

        jTextField1613.setEditable(false);
        jTextField1613.setDisabledTextColor(java.awt.Color.black);
        jTextField1613.setEnabled(false);
        jTextField1613.setHighlighter(null);

        jTextField1606.setEditable(false);
        jTextField1606.setDisabledTextColor(java.awt.Color.black);
        jTextField1606.setEnabled(false);
        jTextField1606.setHighlighter(null);
        jTextField1606.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1606ActionPerformed(evt);
            }
        });

        jTextField1609.setEditable(false);
        jTextField1609.setDisabledTextColor(java.awt.Color.black);
        jTextField1609.setEnabled(false);
        jTextField1609.setHighlighter(null);

        jTextField1602.setEditable(false);
        jTextField1602.setDisabledTextColor(java.awt.Color.black);
        jTextField1602.setEnabled(false);
        jTextField1602.setHighlighter(null);

        jTextField1614.setEditable(false);
        jTextField1614.setDisabledTextColor(java.awt.Color.black);
        jTextField1614.setEnabled(false);
        jTextField1614.setHighlighter(null);

        jTextField1604.setEditable(false);
        jTextField1604.setDisabledTextColor(java.awt.Color.black);
        jTextField1604.setEnabled(false);
        jTextField1604.setHighlighter(null);

        jTextField1610.setEditable(false);
        jTextField1610.setDisabledTextColor(java.awt.Color.black);
        jTextField1610.setEnabled(false);
        jTextField1610.setHighlighter(null);

        jTextField1611.setEditable(false);
        jTextField1611.setDisabledTextColor(java.awt.Color.black);
        jTextField1611.setEnabled(false);
        jTextField1611.setHighlighter(null);

        jTextField1608.setEditable(false);
        jTextField1608.setDisabledTextColor(java.awt.Color.black);
        jTextField1608.setEnabled(false);
        jTextField1608.setHighlighter(null);

        jTextField1712.setEditable(false);
        jTextField1712.setDisabledTextColor(java.awt.Color.black);
        jTextField1712.setEnabled(false);
        jTextField1712.setHighlighter(null);

        jTextField1700.setEditable(false);
        jTextField1700.setDisabledTextColor(java.awt.Color.black);
        jTextField1700.setEnabled(false);
        jTextField1700.setHighlighter(null);
        jTextField1700.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1700ActionPerformed(evt);
            }
        });

        jTextField1701.setEditable(false);
        jTextField1701.setDisabledTextColor(java.awt.Color.black);
        jTextField1701.setEnabled(false);
        jTextField1701.setHighlighter(null);

        jTextField1711.setEditable(false);
        jTextField1711.setDisabledTextColor(java.awt.Color.black);
        jTextField1711.setEnabled(false);
        jTextField1711.setHighlighter(null);

        jTextField1706.setEditable(false);
        jTextField1706.setDisabledTextColor(java.awt.Color.black);
        jTextField1706.setEnabled(false);
        jTextField1706.setHighlighter(null);
        jTextField1706.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1706ActionPerformed(evt);
            }
        });

        jTextField1709.setEditable(false);
        jTextField1709.setDisabledTextColor(java.awt.Color.black);
        jTextField1709.setEnabled(false);
        jTextField1709.setHighlighter(null);

        jTextField1707.setEditable(false);
        jTextField1707.setDisabledTextColor(java.awt.Color.black);
        jTextField1707.setEnabled(false);
        jTextField1707.setHighlighter(null);

        jTextField1714.setEditable(false);
        jTextField1714.setDisabledTextColor(java.awt.Color.black);
        jTextField1714.setEnabled(false);
        jTextField1714.setHighlighter(null);

        jTextField1705.setEditable(false);
        jTextField1705.setDisabledTextColor(java.awt.Color.black);
        jTextField1705.setEnabled(false);
        jTextField1705.setHighlighter(null);

        jTextField1703.setEditable(false);
        jTextField1703.setDisabledTextColor(java.awt.Color.black);
        jTextField1703.setEnabled(false);
        jTextField1703.setHighlighter(null);

        jTextField1710.setEditable(false);
        jTextField1710.setDisabledTextColor(java.awt.Color.black);
        jTextField1710.setEnabled(false);
        jTextField1710.setHighlighter(null);

        jTextField1716.setEditable(false);
        jTextField1716.setDisabledTextColor(java.awt.Color.black);
        jTextField1716.setEnabled(false);
        jTextField1716.setHighlighter(null);

        jTextField1708.setEditable(false);
        jTextField1708.setDisabledTextColor(java.awt.Color.black);
        jTextField1708.setEnabled(false);
        jTextField1708.setHighlighter(null);

        jTextField1719.setEditable(false);
        jTextField1719.setDisabledTextColor(java.awt.Color.black);
        jTextField1719.setEnabled(false);
        jTextField1719.setHighlighter(null);

        jTextField1704.setEditable(false);
        jTextField1704.setDisabledTextColor(java.awt.Color.black);
        jTextField1704.setEnabled(false);
        jTextField1704.setHighlighter(null);

        jTextField1702.setEditable(false);
        jTextField1702.setDisabledTextColor(java.awt.Color.black);
        jTextField1702.setEnabled(false);
        jTextField1702.setHighlighter(null);

        jTextField1713.setEditable(false);
        jTextField1713.setDisabledTextColor(java.awt.Color.black);
        jTextField1713.setEnabled(false);
        jTextField1713.setHighlighter(null);

        jTextField1717.setEditable(false);
        jTextField1717.setDisabledTextColor(java.awt.Color.black);
        jTextField1717.setEnabled(false);
        jTextField1717.setHighlighter(null);

        jTextField1718.setEditable(false);
        jTextField1718.setDisabledTextColor(java.awt.Color.black);
        jTextField1718.setEnabled(false);
        jTextField1718.setHighlighter(null);

        jTextField1715.setEditable(false);
        jTextField1715.setDisabledTextColor(java.awt.Color.black);
        jTextField1715.setEnabled(false);
        jTextField1715.setHighlighter(null);

        jTextField1811.setEditable(false);
        jTextField1811.setDisabledTextColor(java.awt.Color.black);
        jTextField1811.setEnabled(false);
        jTextField1811.setHighlighter(null);

        jTextField1806.setEditable(false);
        jTextField1806.setDisabledTextColor(java.awt.Color.black);
        jTextField1806.setEnabled(false);
        jTextField1806.setHighlighter(null);
        jTextField1806.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1806ActionPerformed(evt);
            }
        });

        jTextField1805.setEditable(false);
        jTextField1805.setDisabledTextColor(java.awt.Color.black);
        jTextField1805.setEnabled(false);
        jTextField1805.setHighlighter(null);

        jTextField1816.setEditable(false);
        jTextField1816.setDisabledTextColor(java.awt.Color.black);
        jTextField1816.setEnabled(false);
        jTextField1816.setHighlighter(null);

        jTextField1818.setEditable(false);
        jTextField1818.setDisabledTextColor(java.awt.Color.black);
        jTextField1818.setEnabled(false);
        jTextField1818.setHighlighter(null);

        jTextField1801.setEditable(false);
        jTextField1801.setDisabledTextColor(java.awt.Color.black);
        jTextField1801.setEnabled(false);
        jTextField1801.setHighlighter(null);

        jTextField1803.setEditable(false);
        jTextField1803.setDisabledTextColor(java.awt.Color.black);
        jTextField1803.setEnabled(false);
        jTextField1803.setHighlighter(null);

        jTextField1804.setEditable(false);
        jTextField1804.setDisabledTextColor(java.awt.Color.black);
        jTextField1804.setEnabled(false);
        jTextField1804.setHighlighter(null);

        jTextField1817.setEditable(false);
        jTextField1817.setDisabledTextColor(java.awt.Color.black);
        jTextField1817.setEnabled(false);
        jTextField1817.setHighlighter(null);

        jTextField1814.setEditable(false);
        jTextField1814.setDisabledTextColor(java.awt.Color.black);
        jTextField1814.setEnabled(false);
        jTextField1814.setHighlighter(null);

        jTextField1808.setEditable(false);
        jTextField1808.setDisabledTextColor(java.awt.Color.black);
        jTextField1808.setEnabled(false);
        jTextField1808.setHighlighter(null);

        jTextField1807.setEditable(false);
        jTextField1807.setDisabledTextColor(java.awt.Color.black);
        jTextField1807.setEnabled(false);
        jTextField1807.setHighlighter(null);

        jTextField1810.setEditable(false);
        jTextField1810.setDisabledTextColor(java.awt.Color.black);
        jTextField1810.setEnabled(false);
        jTextField1810.setHighlighter(null);

        jTextField1813.setEditable(false);
        jTextField1813.setDisabledTextColor(java.awt.Color.black);
        jTextField1813.setEnabled(false);
        jTextField1813.setHighlighter(null);

        jTextField1819.setEditable(false);
        jTextField1819.setDisabledTextColor(java.awt.Color.black);
        jTextField1819.setEnabled(false);
        jTextField1819.setHighlighter(null);

        jTextField1812.setEditable(false);
        jTextField1812.setDisabledTextColor(java.awt.Color.black);
        jTextField1812.setEnabled(false);
        jTextField1812.setHighlighter(null);

        jTextField1802.setEditable(false);
        jTextField1802.setDisabledTextColor(java.awt.Color.black);
        jTextField1802.setEnabled(false);
        jTextField1802.setHighlighter(null);

        jTextField1809.setEditable(false);
        jTextField1809.setDisabledTextColor(java.awt.Color.black);
        jTextField1809.setEnabled(false);
        jTextField1809.setHighlighter(null);

        jTextField1800.setEditable(false);
        jTextField1800.setDisabledTextColor(java.awt.Color.black);
        jTextField1800.setEnabled(false);
        jTextField1800.setHighlighter(null);
        jTextField1800.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1800ActionPerformed(evt);
            }
        });

        jTextField1815.setEditable(false);
        jTextField1815.setDisabledTextColor(java.awt.Color.black);
        jTextField1815.setEnabled(false);
        jTextField1815.setHighlighter(null);

        jTextField1915.setEditable(false);
        jTextField1915.setDisabledTextColor(java.awt.Color.black);
        jTextField1915.setEnabled(false);
        jTextField1915.setHighlighter(null);

        jTextField1900.setEditable(false);
        jTextField1900.setDisabledTextColor(java.awt.Color.black);
        jTextField1900.setEnabled(false);
        jTextField1900.setHighlighter(null);
        jTextField1900.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1900ActionPerformed(evt);
            }
        });

        jTextField1911.setEditable(false);
        jTextField1911.setDisabledTextColor(java.awt.Color.black);
        jTextField1911.setEnabled(false);
        jTextField1911.setHighlighter(null);

        jTextField1906.setEditable(false);
        jTextField1906.setDisabledTextColor(java.awt.Color.black);
        jTextField1906.setEnabled(false);
        jTextField1906.setHighlighter(null);
        jTextField1906.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1906ActionPerformed(evt);
            }
        });

        jTextField1905.setEditable(false);
        jTextField1905.setDisabledTextColor(java.awt.Color.black);
        jTextField1905.setEnabled(false);
        jTextField1905.setHighlighter(null);

        jTextField1916.setEditable(false);
        jTextField1916.setDisabledTextColor(java.awt.Color.black);
        jTextField1916.setEnabled(false);
        jTextField1916.setHighlighter(null);

        jTextField1918.setEditable(false);
        jTextField1918.setDisabledTextColor(java.awt.Color.black);
        jTextField1918.setEnabled(false);
        jTextField1918.setHighlighter(null);

        jTextField1901.setEditable(false);
        jTextField1901.setDisabledTextColor(java.awt.Color.black);
        jTextField1901.setEnabled(false);
        jTextField1901.setHighlighter(null);

        jTextField1903.setEditable(false);
        jTextField1903.setDisabledTextColor(java.awt.Color.black);
        jTextField1903.setEnabled(false);
        jTextField1903.setHighlighter(null);

        jTextField1904.setEditable(false);
        jTextField1904.setDisabledTextColor(java.awt.Color.black);
        jTextField1904.setEnabled(false);
        jTextField1904.setHighlighter(null);

        jTextField1913.setEditable(false);
        jTextField1913.setDisabledTextColor(java.awt.Color.black);
        jTextField1913.setEnabled(false);
        jTextField1913.setHighlighter(null);

        jTextField1910.setEditable(false);
        jTextField1910.setDisabledTextColor(java.awt.Color.black);
        jTextField1910.setEnabled(false);
        jTextField1910.setHighlighter(null);

        jTextField1912.setEditable(false);
        jTextField1912.setDisabledTextColor(java.awt.Color.black);
        jTextField1912.setEnabled(false);
        jTextField1912.setHighlighter(null);

        jTextField1919.setEditable(false);
        jTextField1919.setDisabledTextColor(java.awt.Color.black);
        jTextField1919.setEnabled(false);
        jTextField1919.setHighlighter(null);

        jTextField1909.setEditable(false);
        jTextField1909.setDisabledTextColor(java.awt.Color.black);
        jTextField1909.setEnabled(false);
        jTextField1909.setHighlighter(null);

        jTextField1902.setEditable(false);
        jTextField1902.setDisabledTextColor(java.awt.Color.black);
        jTextField1902.setEnabled(false);
        jTextField1902.setHighlighter(null);

        jTextField1917.setEditable(false);
        jTextField1917.setDisabledTextColor(java.awt.Color.black);
        jTextField1917.setEnabled(false);
        jTextField1917.setHighlighter(null);

        jTextField1914.setEditable(false);
        jTextField1914.setDisabledTextColor(java.awt.Color.black);
        jTextField1914.setEnabled(false);
        jTextField1914.setHighlighter(null);

        jTextField1908.setEditable(false);
        jTextField1908.setDisabledTextColor(java.awt.Color.black);
        jTextField1908.setEnabled(false);
        jTextField1908.setHighlighter(null);

        jTextField1907.setEditable(false);
        jTextField1907.setDisabledTextColor(java.awt.Color.black);
        jTextField1907.setEnabled(false);
        jTextField1907.setHighlighter(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(newwordsearchbutton)
                        .addGap(18, 18, 18)
                        .addComponent(clearselectionsbutton)
                        .addGap(18, 18, 18)
                        .addComponent(exitbutton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(word4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(word1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(word2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(word3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(word6)
                            .addComponent(word5)
                            .addComponent(word7)
                            .addComponent(word8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(word15)
                            .addComponent(word16)
                            .addComponent(word14)
                            .addComponent(word13)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(word11)
                            .addComponent(word10)
                            .addComponent(word9)
                            .addComponent(word12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField0600, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1800, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1900, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0700, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0900, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1600, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1400, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0800, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0400, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1700, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1300, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0300, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1901, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0901, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0801, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0701, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1801, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1601, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0601, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1201, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1701, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1401, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0201, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1301, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0401, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0301, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1502, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0902, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0702, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1402, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1902, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1002, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1702, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0502, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1602, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0602, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0802, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0002, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0202, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1202, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0402, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0302, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1802, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1302, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField0903, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0703, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1903, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1503, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1703, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1003, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0503, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1803, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1603, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0603, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0803, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1403, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0003, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0203, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1203, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0403, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0303, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1303, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField0604, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0704, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1504, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0904, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0804, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1904, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0404, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1004, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1704, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1804, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0504, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1604, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1404, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0004, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0204, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1304, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1204, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0304, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1505, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1905, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1605, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0705, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0905, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1405, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1705, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1005, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0505, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1805, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0605, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0805, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0005, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0205, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1205, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0405, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0305, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1305, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1906, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0906, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0806, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0706, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1506, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1006, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0506, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1806, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1606, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1706, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0606, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1406, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0006, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0206, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1206, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0406, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0306, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1306, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1507, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1607, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0907, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0707, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1907, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1007, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0507, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0607, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1707, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0807, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1407, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1307, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0007, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0207, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1207, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0407, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0307, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1807, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField0908, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0708, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1408, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1908, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1508, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1008, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1708, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0508, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0608, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1608, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0808, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0008, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0208, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1208, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0408, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0308, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1308, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1808, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1509, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0909, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0709, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1409, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1909, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1009, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0509, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1609, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0609, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1709, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0809, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0009, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0209, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1309, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1209, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0409, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0309, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1809, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField0610, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1510, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0910, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0710, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0810, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1010, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1410, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1910, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0410, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1710, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0510, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1610, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0010, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0210, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1210, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1810, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0310, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1310, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1911, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0611, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0711, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0911, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1411, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1511, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1811, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1011, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0411, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1611, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1211, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1711, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0511, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0811, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0011, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0211, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0311, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1311, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField0612, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1512, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0712, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1612, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0912, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1412, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0812, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1912, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0412, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1012, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0512, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1712, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0012, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0312, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1312, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1812, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField0613, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0913, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0713, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1413, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0813, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1913, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1513, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1013, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0413, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1713, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1613, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0513, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1213, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0013, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0213, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0313, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1813, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1313, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField0614, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0914, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0714, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1414, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0814, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1514, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1914, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1014, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0414, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1614, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0514, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1714, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0014, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0214, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0314, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1314, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1214, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1814, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1815, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1515, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1915, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1615, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0615, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0715, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0915, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0415, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1715, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1015, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0515, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0815, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1415, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0015, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0215, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0315, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1215, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1315, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField0616, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1516, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1916, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1616, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0916, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0716, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0416, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1016, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1716, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1816, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0516, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1216, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0816, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1416, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0016, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0216, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1316, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0316, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField0617, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1517, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0717, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0917, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1617, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1017, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0817, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1917, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0417, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1717, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0517, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1217, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1417, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1317, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0017, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0217, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1817, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0317, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField0618, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1918, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1518, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1618, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0918, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0718, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1418, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0418, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1018, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1718, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1818, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0518, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1218, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0818, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0018, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0218, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1318, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0318, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField0619, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0719, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0919, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1419, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1519, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1019, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0819, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1919, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0419, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1719, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0519, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1619, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0019, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0319, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0219, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField0119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1819, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1319, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1219, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(wordsearchlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(themelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wordsearchlabel)
                    .addComponent(themelabel))
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField0200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0201, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0202, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0203, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0204, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0205, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0206, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0207, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0208, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0209, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0210, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0211, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0213, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0214, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0215, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0216, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0217, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0218, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0219, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField0300, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0301, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0302, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0303, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0304, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0305, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0306, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0307, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0308, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0309, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0310, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0311, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0312, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0313, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0314, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0315, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0316, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0317, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0318, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0319, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField0400, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0401, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0402, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0403, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0404, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0405, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0406, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0407, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0408, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0409, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0410, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0411, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0412, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0413, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0414, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0415, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0416, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0417, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0418, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0419, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField0500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0502, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0503, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0504, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0505, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0506, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0507, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0508, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0509, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0510, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0511, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0512, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0513, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0514, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0515, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0516, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0517, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0518, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0519, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField0600, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0601, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0602, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0603, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0604, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0605, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0606, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0607, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0608, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0609, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0610, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0611, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0612, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0613, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0614, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0615, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0616, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0617, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0618, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0619, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField0700, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0701, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0702, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0703, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0704, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0705, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0706, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0707, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0708, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0709, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0710, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0711, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0712, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0713, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0714, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0715, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0716, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0717, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0718, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0719, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField0800, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0801, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0802, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0803, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0804, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0805, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0806, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0807, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0808, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0809, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0810, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0811, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0812, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0813, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0814, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0815, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0816, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0817, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0818, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0819, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField0900, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0901, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0902, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0903, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0904, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0905, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0906, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0907, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0908, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0909, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0910, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0911, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0912, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0913, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0914, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0915, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0916, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0917, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0918, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField0919, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1002, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1003, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1004, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1005, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1006, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1007, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1008, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1009, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1010, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1011, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1012, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1013, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1014, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1015, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1016, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1017, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1018, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1019, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1201, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1202, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1203, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1204, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1205, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1206, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1207, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1208, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1209, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1210, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1211, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1213, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1214, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1215, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1216, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1217, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1218, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1219, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1300, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1301, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1302, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1303, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1304, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1305, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1306, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1307, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1308, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1309, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1310, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1311, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1312, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1313, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1314, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1315, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1316, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1317, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1318, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1319, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1400, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1401, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1402, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1403, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1404, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1405, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1406, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1407, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1408, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1409, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1410, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1411, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1412, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1413, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1414, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1415, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1416, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1417, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1418, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1419, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1502, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1503, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1504, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1505, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1506, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1507, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1508, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1509, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1510, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1511, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1512, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1513, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1514, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1515, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1516, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1517, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1518, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1519, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1600, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1601, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1602, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1603, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1604, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1605, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1606, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1607, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1608, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1609, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1610, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1611, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1612, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1613, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1614, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1615, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1616, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1617, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1618, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1619, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1700, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1701, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1702, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1703, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1704, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1705, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1706, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1707, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1708, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1709, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1710, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1711, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1712, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1713, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1714, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1715, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1716, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1717, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1718, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1719, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1800, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1801, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1802, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1803, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1804, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1805, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1806, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1807, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1808, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1809, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1810, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1811, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1812, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1813, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1814, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1815, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1816, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1817, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1818, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1819, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1900, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1901, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1902, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1903, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1904, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1905, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1906, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1907, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1908, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1909, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1910, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1911, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1912, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1913, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1914, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1915, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1916, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1917, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1918, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1919, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newwordsearchbutton)
                    .addComponent(exitbutton)
                    .addComponent(clearselectionsbutton))
                .addGap(24, 24, 24))
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
        input.addMouseListener(new MoreMouseEvents());
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

    private void jTextField0200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0200ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0200ActionPerformed

    private void jTextField0206ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0206ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0206ActionPerformed

    private void jTextField0300ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0300ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0300ActionPerformed

    private void jTextField0306ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0306ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0306ActionPerformed

    private void jTextField0406ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0406ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0406ActionPerformed

    private void jTextField0400ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0400ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0400ActionPerformed

    private void jTextField0506ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0506ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0506ActionPerformed

    private void jTextField0500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0500ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0500ActionPerformed

    private void jTextField0606ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0606ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0606ActionPerformed

    private void jTextField0600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0600ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0600ActionPerformed

    private void jTextField0700ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0700ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0700ActionPerformed

    private void jTextField0706ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0706ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0706ActionPerformed

    private void jTextField0800ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0800ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0800ActionPerformed

    private void jTextField0806ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0806ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0806ActionPerformed

    private void jTextField0906ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0906ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0906ActionPerformed

    private void jTextField0900ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0900ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField0900ActionPerformed

    private void jTextField1006ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1006ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1006ActionPerformed

    private void jTextField1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1000ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1000ActionPerformed

    private void jTextField1106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1106ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1106ActionPerformed

    private void jTextField1100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1100ActionPerformed

    private void jTextField1200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1200ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1200ActionPerformed

    private void jTextField1206ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1206ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1206ActionPerformed

    private void jTextField1300ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1300ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1300ActionPerformed

    private void jTextField1306ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1306ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1306ActionPerformed

    private void jTextField1406ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1406ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1406ActionPerformed

    private void jTextField1400ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1400ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1400ActionPerformed

    private void jTextField1506ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1506ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1506ActionPerformed

    private void jTextField1500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1500ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1500ActionPerformed

    private void jTextField1600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1600ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1600ActionPerformed

    private void jTextField1606ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1606ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1606ActionPerformed

    private void jTextField1700ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1700ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1700ActionPerformed

    private void jTextField1706ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1706ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1706ActionPerformed

    private void jTextField1806ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1806ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1806ActionPerformed

    private void jTextField1800ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1800ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1800ActionPerformed

    private void jTextField1900ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1900ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1900ActionPerformed

    private void jTextField1906ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1906ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1906ActionPerformed

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
    private static javax.swing.JTextField jTextField0200;
    private static javax.swing.JTextField jTextField0201;
    private static javax.swing.JTextField jTextField0202;
    private static javax.swing.JTextField jTextField0203;
    private static javax.swing.JTextField jTextField0204;
    private static javax.swing.JTextField jTextField0205;
    private static javax.swing.JTextField jTextField0206;
    private static javax.swing.JTextField jTextField0207;
    private static javax.swing.JTextField jTextField0208;
    private static javax.swing.JTextField jTextField0209;
    private static javax.swing.JTextField jTextField0210;
    private static javax.swing.JTextField jTextField0211;
    private static javax.swing.JTextField jTextField0212;
    private static javax.swing.JTextField jTextField0213;
    private static javax.swing.JTextField jTextField0214;
    private static javax.swing.JTextField jTextField0215;
    private static javax.swing.JTextField jTextField0216;
    private static javax.swing.JTextField jTextField0217;
    private static javax.swing.JTextField jTextField0218;
    private static javax.swing.JTextField jTextField0219;
    private static javax.swing.JTextField jTextField0300;
    private static javax.swing.JTextField jTextField0301;
    private static javax.swing.JTextField jTextField0302;
    private static javax.swing.JTextField jTextField0303;
    private static javax.swing.JTextField jTextField0304;
    private static javax.swing.JTextField jTextField0305;
    private static javax.swing.JTextField jTextField0306;
    private static javax.swing.JTextField jTextField0307;
    private static javax.swing.JTextField jTextField0308;
    private static javax.swing.JTextField jTextField0309;
    private static javax.swing.JTextField jTextField0310;
    private static javax.swing.JTextField jTextField0311;
    private static javax.swing.JTextField jTextField0312;
    private static javax.swing.JTextField jTextField0313;
    private static javax.swing.JTextField jTextField0314;
    private static javax.swing.JTextField jTextField0315;
    private static javax.swing.JTextField jTextField0316;
    private static javax.swing.JTextField jTextField0317;
    private static javax.swing.JTextField jTextField0318;
    private static javax.swing.JTextField jTextField0319;
    private static javax.swing.JTextField jTextField0400;
    private static javax.swing.JTextField jTextField0401;
    private static javax.swing.JTextField jTextField0402;
    private static javax.swing.JTextField jTextField0403;
    private static javax.swing.JTextField jTextField0404;
    private static javax.swing.JTextField jTextField0405;
    private static javax.swing.JTextField jTextField0406;
    private static javax.swing.JTextField jTextField0407;
    private static javax.swing.JTextField jTextField0408;
    private static javax.swing.JTextField jTextField0409;
    private static javax.swing.JTextField jTextField0410;
    private static javax.swing.JTextField jTextField0411;
    private static javax.swing.JTextField jTextField0412;
    private static javax.swing.JTextField jTextField0413;
    private static javax.swing.JTextField jTextField0414;
    private static javax.swing.JTextField jTextField0415;
    private static javax.swing.JTextField jTextField0416;
    private static javax.swing.JTextField jTextField0417;
    private static javax.swing.JTextField jTextField0418;
    private static javax.swing.JTextField jTextField0419;
    private static javax.swing.JTextField jTextField0500;
    private static javax.swing.JTextField jTextField0501;
    private static javax.swing.JTextField jTextField0502;
    private static javax.swing.JTextField jTextField0503;
    private static javax.swing.JTextField jTextField0504;
    private static javax.swing.JTextField jTextField0505;
    private static javax.swing.JTextField jTextField0506;
    private static javax.swing.JTextField jTextField0507;
    private static javax.swing.JTextField jTextField0508;
    private static javax.swing.JTextField jTextField0509;
    private static javax.swing.JTextField jTextField0510;
    private static javax.swing.JTextField jTextField0511;
    private static javax.swing.JTextField jTextField0512;
    private static javax.swing.JTextField jTextField0513;
    private static javax.swing.JTextField jTextField0514;
    private static javax.swing.JTextField jTextField0515;
    private static javax.swing.JTextField jTextField0516;
    private static javax.swing.JTextField jTextField0517;
    private static javax.swing.JTextField jTextField0518;
    private static javax.swing.JTextField jTextField0519;
    private static javax.swing.JTextField jTextField0600;
    private static javax.swing.JTextField jTextField0601;
    private static javax.swing.JTextField jTextField0602;
    private static javax.swing.JTextField jTextField0603;
    private static javax.swing.JTextField jTextField0604;
    private static javax.swing.JTextField jTextField0605;
    private static javax.swing.JTextField jTextField0606;
    private static javax.swing.JTextField jTextField0607;
    private static javax.swing.JTextField jTextField0608;
    private static javax.swing.JTextField jTextField0609;
    private static javax.swing.JTextField jTextField0610;
    private static javax.swing.JTextField jTextField0611;
    private static javax.swing.JTextField jTextField0612;
    private static javax.swing.JTextField jTextField0613;
    private static javax.swing.JTextField jTextField0614;
    private static javax.swing.JTextField jTextField0615;
    private static javax.swing.JTextField jTextField0616;
    private static javax.swing.JTextField jTextField0617;
    private static javax.swing.JTextField jTextField0618;
    private static javax.swing.JTextField jTextField0619;
    private static javax.swing.JTextField jTextField0700;
    private static javax.swing.JTextField jTextField0701;
    private static javax.swing.JTextField jTextField0702;
    private static javax.swing.JTextField jTextField0703;
    private static javax.swing.JTextField jTextField0704;
    private static javax.swing.JTextField jTextField0705;
    private static javax.swing.JTextField jTextField0706;
    private static javax.swing.JTextField jTextField0707;
    private static javax.swing.JTextField jTextField0708;
    private static javax.swing.JTextField jTextField0709;
    private static javax.swing.JTextField jTextField0710;
    private static javax.swing.JTextField jTextField0711;
    private static javax.swing.JTextField jTextField0712;
    private static javax.swing.JTextField jTextField0713;
    private static javax.swing.JTextField jTextField0714;
    private static javax.swing.JTextField jTextField0715;
    private static javax.swing.JTextField jTextField0716;
    private static javax.swing.JTextField jTextField0717;
    private static javax.swing.JTextField jTextField0718;
    private static javax.swing.JTextField jTextField0719;
    private static javax.swing.JTextField jTextField0800;
    private static javax.swing.JTextField jTextField0801;
    private static javax.swing.JTextField jTextField0802;
    private static javax.swing.JTextField jTextField0803;
    private static javax.swing.JTextField jTextField0804;
    private static javax.swing.JTextField jTextField0805;
    private static javax.swing.JTextField jTextField0806;
    private static javax.swing.JTextField jTextField0807;
    private static javax.swing.JTextField jTextField0808;
    private static javax.swing.JTextField jTextField0809;
    private static javax.swing.JTextField jTextField0810;
    private static javax.swing.JTextField jTextField0811;
    private static javax.swing.JTextField jTextField0812;
    private static javax.swing.JTextField jTextField0813;
    private static javax.swing.JTextField jTextField0814;
    private static javax.swing.JTextField jTextField0815;
    private static javax.swing.JTextField jTextField0816;
    private static javax.swing.JTextField jTextField0817;
    private static javax.swing.JTextField jTextField0818;
    private static javax.swing.JTextField jTextField0819;
    private static javax.swing.JTextField jTextField0900;
    private static javax.swing.JTextField jTextField0901;
    private static javax.swing.JTextField jTextField0902;
    private static javax.swing.JTextField jTextField0903;
    private static javax.swing.JTextField jTextField0904;
    private static javax.swing.JTextField jTextField0905;
    private static javax.swing.JTextField jTextField0906;
    private static javax.swing.JTextField jTextField0907;
    private static javax.swing.JTextField jTextField0908;
    private static javax.swing.JTextField jTextField0909;
    private static javax.swing.JTextField jTextField0910;
    private static javax.swing.JTextField jTextField0911;
    private static javax.swing.JTextField jTextField0912;
    private static javax.swing.JTextField jTextField0913;
    private static javax.swing.JTextField jTextField0914;
    private static javax.swing.JTextField jTextField0915;
    private static javax.swing.JTextField jTextField0916;
    private static javax.swing.JTextField jTextField0917;
    private static javax.swing.JTextField jTextField0918;
    private static javax.swing.JTextField jTextField0919;
    private static javax.swing.JTextField jTextField1000;
    private static javax.swing.JTextField jTextField1001;
    private static javax.swing.JTextField jTextField1002;
    private static javax.swing.JTextField jTextField1003;
    private static javax.swing.JTextField jTextField1004;
    private static javax.swing.JTextField jTextField1005;
    private static javax.swing.JTextField jTextField1006;
    private static javax.swing.JTextField jTextField1007;
    private static javax.swing.JTextField jTextField1008;
    private static javax.swing.JTextField jTextField1009;
    private static javax.swing.JTextField jTextField1010;
    private static javax.swing.JTextField jTextField1011;
    private static javax.swing.JTextField jTextField1012;
    private static javax.swing.JTextField jTextField1013;
    private static javax.swing.JTextField jTextField1014;
    private static javax.swing.JTextField jTextField1015;
    private static javax.swing.JTextField jTextField1016;
    private static javax.swing.JTextField jTextField1017;
    private static javax.swing.JTextField jTextField1018;
    private static javax.swing.JTextField jTextField1019;
    private static javax.swing.JTextField jTextField1100;
    private static javax.swing.JTextField jTextField1101;
    private static javax.swing.JTextField jTextField1102;
    private static javax.swing.JTextField jTextField1103;
    private static javax.swing.JTextField jTextField1104;
    private static javax.swing.JTextField jTextField1105;
    private static javax.swing.JTextField jTextField1106;
    private static javax.swing.JTextField jTextField1107;
    private static javax.swing.JTextField jTextField1108;
    private static javax.swing.JTextField jTextField1109;
    private static javax.swing.JTextField jTextField1110;
    private static javax.swing.JTextField jTextField1111;
    private static javax.swing.JTextField jTextField1112;
    private static javax.swing.JTextField jTextField1113;
    private static javax.swing.JTextField jTextField1114;
    private static javax.swing.JTextField jTextField1115;
    private static javax.swing.JTextField jTextField1116;
    private static javax.swing.JTextField jTextField1117;
    private static javax.swing.JTextField jTextField1118;
    private static javax.swing.JTextField jTextField1119;
    private static javax.swing.JTextField jTextField1200;
    private static javax.swing.JTextField jTextField1201;
    private static javax.swing.JTextField jTextField1202;
    private static javax.swing.JTextField jTextField1203;
    private static javax.swing.JTextField jTextField1204;
    private static javax.swing.JTextField jTextField1205;
    private static javax.swing.JTextField jTextField1206;
    private static javax.swing.JTextField jTextField1207;
    private static javax.swing.JTextField jTextField1208;
    private static javax.swing.JTextField jTextField1209;
    private static javax.swing.JTextField jTextField1210;
    private static javax.swing.JTextField jTextField1211;
    private static javax.swing.JTextField jTextField1212;
    private static javax.swing.JTextField jTextField1213;
    private static javax.swing.JTextField jTextField1214;
    private static javax.swing.JTextField jTextField1215;
    private static javax.swing.JTextField jTextField1216;
    private static javax.swing.JTextField jTextField1217;
    private static javax.swing.JTextField jTextField1218;
    private static javax.swing.JTextField jTextField1219;
    private static javax.swing.JTextField jTextField1300;
    private static javax.swing.JTextField jTextField1301;
    private static javax.swing.JTextField jTextField1302;
    private static javax.swing.JTextField jTextField1303;
    private static javax.swing.JTextField jTextField1304;
    private static javax.swing.JTextField jTextField1305;
    private static javax.swing.JTextField jTextField1306;
    private static javax.swing.JTextField jTextField1307;
    private static javax.swing.JTextField jTextField1308;
    private static javax.swing.JTextField jTextField1309;
    private static javax.swing.JTextField jTextField1310;
    private static javax.swing.JTextField jTextField1311;
    private static javax.swing.JTextField jTextField1312;
    private static javax.swing.JTextField jTextField1313;
    private static javax.swing.JTextField jTextField1314;
    private static javax.swing.JTextField jTextField1315;
    private static javax.swing.JTextField jTextField1316;
    private static javax.swing.JTextField jTextField1317;
    private static javax.swing.JTextField jTextField1318;
    private static javax.swing.JTextField jTextField1319;
    private static javax.swing.JTextField jTextField1400;
    private static javax.swing.JTextField jTextField1401;
    private static javax.swing.JTextField jTextField1402;
    private static javax.swing.JTextField jTextField1403;
    private static javax.swing.JTextField jTextField1404;
    private static javax.swing.JTextField jTextField1405;
    private static javax.swing.JTextField jTextField1406;
    private static javax.swing.JTextField jTextField1407;
    private static javax.swing.JTextField jTextField1408;
    private static javax.swing.JTextField jTextField1409;
    private static javax.swing.JTextField jTextField1410;
    private static javax.swing.JTextField jTextField1411;
    private static javax.swing.JTextField jTextField1412;
    private static javax.swing.JTextField jTextField1413;
    private static javax.swing.JTextField jTextField1414;
    private static javax.swing.JTextField jTextField1415;
    private static javax.swing.JTextField jTextField1416;
    private static javax.swing.JTextField jTextField1417;
    private static javax.swing.JTextField jTextField1418;
    private static javax.swing.JTextField jTextField1419;
    private static javax.swing.JTextField jTextField1500;
    private static javax.swing.JTextField jTextField1501;
    private static javax.swing.JTextField jTextField1502;
    private static javax.swing.JTextField jTextField1503;
    private static javax.swing.JTextField jTextField1504;
    private static javax.swing.JTextField jTextField1505;
    private static javax.swing.JTextField jTextField1506;
    private static javax.swing.JTextField jTextField1507;
    private static javax.swing.JTextField jTextField1508;
    private static javax.swing.JTextField jTextField1509;
    private static javax.swing.JTextField jTextField1510;
    private static javax.swing.JTextField jTextField1511;
    private static javax.swing.JTextField jTextField1512;
    private static javax.swing.JTextField jTextField1513;
    private static javax.swing.JTextField jTextField1514;
    private static javax.swing.JTextField jTextField1515;
    private static javax.swing.JTextField jTextField1516;
    private static javax.swing.JTextField jTextField1517;
    private static javax.swing.JTextField jTextField1518;
    private static javax.swing.JTextField jTextField1519;
    private static javax.swing.JTextField jTextField1600;
    private static javax.swing.JTextField jTextField1601;
    private static javax.swing.JTextField jTextField1602;
    private static javax.swing.JTextField jTextField1603;
    private static javax.swing.JTextField jTextField1604;
    private static javax.swing.JTextField jTextField1605;
    private static javax.swing.JTextField jTextField1606;
    private static javax.swing.JTextField jTextField1607;
    private static javax.swing.JTextField jTextField1608;
    private static javax.swing.JTextField jTextField1609;
    private static javax.swing.JTextField jTextField1610;
    private static javax.swing.JTextField jTextField1611;
    private static javax.swing.JTextField jTextField1612;
    private static javax.swing.JTextField jTextField1613;
    private static javax.swing.JTextField jTextField1614;
    private static javax.swing.JTextField jTextField1615;
    private static javax.swing.JTextField jTextField1616;
    private static javax.swing.JTextField jTextField1617;
    private static javax.swing.JTextField jTextField1618;
    private static javax.swing.JTextField jTextField1619;
    private static javax.swing.JTextField jTextField1700;
    private static javax.swing.JTextField jTextField1701;
    private static javax.swing.JTextField jTextField1702;
    private static javax.swing.JTextField jTextField1703;
    private static javax.swing.JTextField jTextField1704;
    private static javax.swing.JTextField jTextField1705;
    private static javax.swing.JTextField jTextField1706;
    private static javax.swing.JTextField jTextField1707;
    private static javax.swing.JTextField jTextField1708;
    private static javax.swing.JTextField jTextField1709;
    private static javax.swing.JTextField jTextField1710;
    private static javax.swing.JTextField jTextField1711;
    private static javax.swing.JTextField jTextField1712;
    private static javax.swing.JTextField jTextField1713;
    private static javax.swing.JTextField jTextField1714;
    private static javax.swing.JTextField jTextField1715;
    private static javax.swing.JTextField jTextField1716;
    private static javax.swing.JTextField jTextField1717;
    private static javax.swing.JTextField jTextField1718;
    private static javax.swing.JTextField jTextField1719;
    private static javax.swing.JTextField jTextField1800;
    private static javax.swing.JTextField jTextField1801;
    private static javax.swing.JTextField jTextField1802;
    private static javax.swing.JTextField jTextField1803;
    private static javax.swing.JTextField jTextField1804;
    private static javax.swing.JTextField jTextField1805;
    private static javax.swing.JTextField jTextField1806;
    private static javax.swing.JTextField jTextField1807;
    private static javax.swing.JTextField jTextField1808;
    private static javax.swing.JTextField jTextField1809;
    private static javax.swing.JTextField jTextField1810;
    private static javax.swing.JTextField jTextField1811;
    private static javax.swing.JTextField jTextField1812;
    private static javax.swing.JTextField jTextField1813;
    private static javax.swing.JTextField jTextField1814;
    private static javax.swing.JTextField jTextField1815;
    private static javax.swing.JTextField jTextField1816;
    private static javax.swing.JTextField jTextField1817;
    private static javax.swing.JTextField jTextField1818;
    private static javax.swing.JTextField jTextField1819;
    private static javax.swing.JTextField jTextField1900;
    private static javax.swing.JTextField jTextField1901;
    private static javax.swing.JTextField jTextField1902;
    private static javax.swing.JTextField jTextField1903;
    private static javax.swing.JTextField jTextField1904;
    private static javax.swing.JTextField jTextField1905;
    private static javax.swing.JTextField jTextField1906;
    private static javax.swing.JTextField jTextField1907;
    private static javax.swing.JTextField jTextField1908;
    private static javax.swing.JTextField jTextField1909;
    private static javax.swing.JTextField jTextField1910;
    private static javax.swing.JTextField jTextField1911;
    private static javax.swing.JTextField jTextField1912;
    private static javax.swing.JTextField jTextField1913;
    private static javax.swing.JTextField jTextField1914;
    private static javax.swing.JTextField jTextField1915;
    private static javax.swing.JTextField jTextField1916;
    private static javax.swing.JTextField jTextField1917;
    private static javax.swing.JTextField jTextField1918;
    private static javax.swing.JTextField jTextField1919;
    private javax.swing.JButton newwordsearchbutton;
    private javax.swing.JLabel themelabel;
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

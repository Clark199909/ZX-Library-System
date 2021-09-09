
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import project.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zhengkai Xie
 */
public class userBorrow extends javax.swing.JFrame {

    /**
     * Creates new form userBorrow
     */
    String myName;
    int bookId;
    public userBorrow(String name) {
        initComponents();
        setComponentNames();
        myName=name;
        idData.setEditable(false);
        titleData.setEditable(false);
        authorData.setEditable(false);
        genreData.setEditable(false);
        publishYearData.setEditable(false);
        editionData.setEditable(false);
        locationData.setEditable(false);
        descriptionData.setEditable(false);
        titleSearchInput.setEditable(false);
        authorSearchInput.setEditable(false);
        genreSearchInput.setEnabled(false);
        yearSearchInput.setEnabled(false);
        borrowButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutButton = new javax.swing.JButton();
        titleText = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        logoutButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        searchTitleText = new javax.swing.JLabel();
        titleSearchInput = new javax.swing.JTextField();
        genreText = new javax.swing.JLabel();
        genreSearchInput = new javax.swing.JComboBox<>();
        titleOptionInput = new javax.swing.JCheckBox();
        authorOptionInput = new javax.swing.JCheckBox();
        searchText = new javax.swing.JLabel();
        genreOptionInput = new javax.swing.JCheckBox();
        yearOptionInput = new javax.swing.JCheckBox();
        yearText = new javax.swing.JLabel();
        yearSearchInput = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        idDescText = new javax.swing.JLabel();
        idData = new javax.swing.JTextField();
        titleDescText = new javax.swing.JLabel();
        authorDescText = new javax.swing.JLabel();
        genreDescText = new javax.swing.JLabel();
        yearDescText = new javax.swing.JLabel();
        editionDescText = new javax.swing.JLabel();
        locationDescText = new javax.swing.JLabel();
        descriptionText = new javax.swing.JLabel();
        titleData = new javax.swing.JTextField();
        authorData = new javax.swing.JTextField();
        genreData = new javax.swing.JTextField();
        publishYearData = new javax.swing.JTextField();
        editionData = new javax.swing.JTextField();
        locationData = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionData = new javax.swing.JTextArea();
        borrowButton = new javax.swing.JButton();
        authorSearchText = new javax.swing.JLabel();
        authorSearchInput = new javax.swing.JTextField();
        statusText = new javax.swing.JLabel();
        statusData = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        logoutButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        logoutButton.setText("Log out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleText.setFont(new java.awt.Font("Bernard MT Condensed", 1, 36)); // NOI18N
        titleText.setText("ZX Library System");
        titleText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titleTextMouseClicked(evt);
            }
        });
        getContentPane().add(titleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close-button.png"))); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 30, 30));

        logoutButton1.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        logoutButton1.setText("Log out");
        logoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 30, -1, -1));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        searchTitleText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchTitleText.setText("Title");
        getContentPane().add(searchTitleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        titleSearchInput.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(titleSearchInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 358, -1));

        genreText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        genreText.setText("Genre");
        getContentPane().add(genreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, -1, -1));

        genreSearchInput.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        genreSearchInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adventure", "Biography", "Classics", "Comic", "Cookbook", "Crime", "Detective and Mystery", "Essays", "Fantasy", "Historical Fiction", "History", "Horror", "Literary Fiction", "Memoir", "Poetry", "Romance", "Science Fiction", "Thriller" }));
        getContentPane().add(genreSearchInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 160, 100, -1));

        titleOptionInput.setBackground(new java.awt.Color(255, 255, 255));
        titleOptionInput.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        titleOptionInput.setText("Title");
        titleOptionInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleOptionInputActionPerformed(evt);
            }
        });
        getContentPane().add(titleOptionInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        authorOptionInput.setBackground(new java.awt.Color(255, 255, 255));
        authorOptionInput.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        authorOptionInput.setText("Author");
        authorOptionInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorOptionInputActionPerformed(evt);
            }
        });
        getContentPane().add(authorOptionInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        searchText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchText.setText("Search:");
        getContentPane().add(searchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        genreOptionInput.setBackground(new java.awt.Color(255, 255, 255));
        genreOptionInput.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        genreOptionInput.setText("Genre");
        genreOptionInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreOptionInputActionPerformed(evt);
            }
        });
        getContentPane().add(genreOptionInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

        yearOptionInput.setBackground(new java.awt.Color(255, 255, 255));
        yearOptionInput.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        yearOptionInput.setText("Year");
        yearOptionInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearOptionInputActionPerformed(evt);
            }
        });
        getContentPane().add(yearOptionInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 60, -1));

        yearText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        yearText.setText("Year");
        getContentPane().add(yearText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 160, -1, -1));

        yearSearchInput.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        yearSearchInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900", "1899", "1898", "1897", "1896", "1895", "1894", "1893", "1892", "1891", "1890", "1889", "1888", "1887", "1886", "1885", "1884", "1883", "1882", "1881", "1880", "1879", "1878", "1877", "1876", "1875", "1874", "1873", "1872", "1871", "1870", "1869", "1868", "1867", "1866", "1865", "1864", "1863", "1862", "1861", "1860", "1859", "1858", "1857", "1856", "1855", "1854", "1853", "1852", "1851", "1850", "1849", "1848", "1847", "1846", "1845", "1844", "1843", "1842", "1841", "1840", "1839", "1838", "1837", "1836", "1835", "1834", "1833", "1832", "1831", "1830", "1829", "1828", "1827", "1826", "1825", "1824", "1823", "1822", "1821", "1820", "1819", "1818", "1817", "1816", "1815", "1814", "1813", "1812", "1811", "1810", "1809", "1808", "1807", "1806", "1805", "1804", "1803", "1802", "1801", "1800" }));
        getContentPane().add(yearSearchInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 160, 100, -1));

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 200, 200, -1));

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Author", "Genre", "Year", "Edition", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 240, 800, 460));

        idDescText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idDescText.setText("ID:");
        getContentPane().add(idDescText, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 242, -1, -1));
        getContentPane().add(idData, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 240, 240, -1));

        titleDescText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        titleDescText.setText("Title:");
        getContentPane().add(titleDescText, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 280, 34, -1));

        authorDescText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        authorDescText.setText("Author:");
        getContentPane().add(authorDescText, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 318, -1, -1));

        genreDescText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        genreDescText.setText("Genre:");
        getContentPane().add(genreDescText, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 354, -1, -1));

        yearDescText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        yearDescText.setText("Publish Year:");
        getContentPane().add(yearDescText, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 394, -1, -1));

        editionDescText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editionDescText.setText("Edition:");
        getContentPane().add(editionDescText, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 432, -1, -1));

        locationDescText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        locationDescText.setText("Location:");
        getContentPane().add(locationDescText, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 470, -1, -1));

        descriptionText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        descriptionText.setText("Description:");
        getContentPane().add(descriptionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 506, -1, -1));
        getContentPane().add(titleData, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 278, 240, -1));
        getContentPane().add(authorData, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 316, 240, -1));
        getContentPane().add(genreData, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 354, 240, -1));
        getContentPane().add(publishYearData, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 392, 240, -1));
        getContentPane().add(editionData, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 430, 240, -1));
        getContentPane().add(locationData, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 468, 240, -1));

        descriptionData.setColumns(20);
        descriptionData.setLineWrap(true);
        descriptionData.setRows(5);
        jScrollPane2.setViewportView(descriptionData);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 506, 240, 110));

        borrowButton.setBackground(new java.awt.Color(255, 255, 255));
        borrowButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        borrowButton.setText("Borrow");
        borrowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowButtonActionPerformed(evt);
            }
        });
        getContentPane().add(borrowButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 664, -1, -1));

        authorSearchText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        authorSearchText.setText("Author");
        getContentPane().add(authorSearchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));
        getContentPane().add(authorSearchInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 180, -1));

        statusText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        statusText.setText("Status");
        getContentPane().add(statusText, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 630, -1, -1));
        getContentPane().add(statusData, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 630, 240, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userBackground.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleTextMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new home(true, myName).setVisible(true);
    }//GEN-LAST:event_titleTextMouseClicked

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "Do you want to exit the application?", "Select", JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_closeButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "Do you really want to log out?", "Select", JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void logoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton1ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "Do you really want to log out?", "Select", JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_logoutButton1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new userHome(myName).setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        boolean searchByTitle = titleOptionInput.isSelected();
        boolean searchByAuthor = authorOptionInput.isSelected();
        boolean searchByGenre = genreOptionInput.isSelected();
        boolean searchByYear = yearOptionInput.isSelected();
        StringBuilder Query = new StringBuilder("select *from books where ");
        
        if(!searchByTitle && !searchByAuthor && !searchByGenre && !searchByYear){
            JOptionPane.showMessageDialog(null, "Need to select at least one way to search.");
            return;
        }
        if(searchByTitle){
            StringBuilder titleSb = new StringBuilder(titleSearchInput.getText());
            String title = UpdateData.dealSpcialSymbols(titleSb);
            if(!title.equals("")){
                Query.append("title like '%"+title+"%' and ");
            }else{
                JOptionPane.showMessageDialog(null, "Need to type something in title search bar!");
            }
        }
        if(searchByAuthor){
            StringBuilder authorSb = new StringBuilder(authorSearchInput.getText());
            String author = UpdateData.dealSpcialSymbols(authorSb);
            if(!author.equals("")){
                Query.append("author like '%"+author+"%' and ");
            }else{
                JOptionPane.showMessageDialog(null, "Need to type something in author search bar!");
            }
        }
        if(searchByGenre){
            String genre = (String)genreSearchInput.getSelectedItem();
            Query.append("genre='"+genre+"' and ");
        }
        if(searchByYear){
            String year = (String)yearSearchInput.getSelectedItem();
            Query.append("year='"+year+"' and ");
        }
        Query.delete(Query.length()-5, Query.length());
        ResultSet rs = Select.getData(Query.toString());
        DefaultTableModel model=(DefaultTableModel)bookTable.getModel();
        model.setRowCount(0);
        try{
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(9)});
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void titleOptionInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleOptionInputActionPerformed
        // TODO add your handling code here:
        if(titleOptionInput.isSelected()){
            titleSearchInput.setEditable(true);
        }else{
            titleSearchInput.setEditable(false);
        }
    }//GEN-LAST:event_titleOptionInputActionPerformed

    private void authorOptionInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorOptionInputActionPerformed
        // TODO add your handling code here:
        if(authorOptionInput.isSelected()){
            authorSearchInput.setEditable(true);
        }else{
            authorSearchInput.setEditable(false);
        }
    }//GEN-LAST:event_authorOptionInputActionPerformed

    private void genreOptionInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreOptionInputActionPerformed
        if(genreOptionInput.isSelected()){
            genreSearchInput.setEnabled(true);
        }else{
            genreSearchInput.setEnabled(false);
        }
        
    }//GEN-LAST:event_genreOptionInputActionPerformed

    private void yearOptionInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearOptionInputActionPerformed
        if(yearOptionInput.isSelected()){
            yearSearchInput.setEnabled(true);
        }else{
            yearSearchInput.setEnabled(false);
        }
    }//GEN-LAST:event_yearOptionInputActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ResultSet rs=Select.getData("select *from books");
        DefaultTableModel model=(DefaultTableModel)bookTable.getModel();
        model.setRowCount(0);
        try{
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(9)});
            }
            rs.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        System.out.println(evt.getID());
        System.out.println(evt.getWhen());
        System.out.println(System.currentTimeMillis());
        System.out.println(evt.getModifiersEx());
        System.out.println(evt.getX());
        System.out.println(evt.getY());
        System.out.println(evt.getClickCount());
        System.out.println(evt.getButton());
        System.out.println(evt.getClickCount());
        borrowButton.setEnabled(false);
        int index=bookTable.getSelectedRow();
        TableModel model=bookTable.getModel();
        String stringId=model.getValueAt(index, 0).toString();
        bookId=Integer.parseInt(stringId);  
        ResultSet rs=Select.getData("select *from books where id='"+bookId+"'");
        try{
            if(rs.next()){
                idData.setText(stringId);
                titleData.setText(rs.getString(2));
                authorData.setText(rs.getString(3));
                genreData.setText(rs.getString(4));
                publishYearData.setText(rs.getString(5));
                editionData.setText(rs.getString(6));
                locationData.setText(rs.getString(7));
                descriptionData.setText(rs.getString(8));
                statusData.setText(rs.getString(9));
                if(rs.getString(9).equals("Available")){
                    statusData.setForeground(Color.GREEN);
                    borrowButton.setEnabled(true);
                }else if(rs.getString(9).equals("Unavailable")){
                    statusData.setForeground(Color.RED);
                }else{
                    statusData.setForeground(Color.orange);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bookTableMouseClicked

    private void borrowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowButtonActionPerformed
        StringBuilder translatedMyNameSb = new StringBuilder(myName);
        String translatedMyName = UpdateData.dealSpcialSymbols(translatedMyNameSb);
        int id=1;
        try{
            ResultSet rs = Select.getData("Select *from orders where userName='"+translatedMyName+"' and (status='Incomplete' or status='Return Unverified' or status='Borrow Unverified')");
            int count = 0;
            while(rs.next()){
                count += 1;
            }
            if(count < 4){
                UpdateData.setData("update books set status='Pending' where id='"+bookId+"'", "");
                SimpleDateFormat myFormat=new SimpleDateFormat("yyyy/MM/dd");
                Calendar cal=Calendar.getInstance();
                Date borrowDate = cal.getTime();
                String borrowDateString = myFormat.format(borrowDate);
                cal.add(Calendar.DATE, 60);
                Date deadline = cal.getTime();
                String deadlineString = myFormat.format(deadline);
                rs = Select.getData("select max(id) from orders");
                while(rs.next()){
                    id = rs.getInt(1);
                }
                id = id + 1;
                UpdateData.setData("insert into orders values('"+id+"', '"+translatedMyName+"', '"+bookId+"', '"+borrowDateString+"', '"+deadlineString+"', 'None', 'Borrow Unverified')", "You have made the borrow request!");           
                
            }else{
                JOptionPane.showMessageDialog(null, "Number of borrowed books exceeds limit.");
            }
            setVisible(false);
            new userBorrow(myName).setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_borrowButtonActionPerformed

    private void setComponentNames() {
        titleSearchInput.setName("titleSearchInput");
        authorSearchInput.setName("authorSearchInput");
        genreSearchInput.setName("genreSearchInput");
        yearSearchInput.setName("yearSearchInput");
        searchButton.setName("searchButton");
        titleOptionInput.setName("titleOptionInput");
        authorOptionInput.setName("authorOptionInput");
        genreOptionInput.setName("genreOptionInput");
        yearOptionInput.setName("yearOptionInput");
        bookTable.setName("bookTable");
        borrowButton.setName("borrowButton");
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
            java.util.logging.Logger.getLogger(userBorrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userBorrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userBorrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userBorrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userBorrow("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField authorData;
    private javax.swing.JLabel authorDescText;
    private javax.swing.JCheckBox authorOptionInput;
    private javax.swing.JTextField authorSearchInput;
    private javax.swing.JLabel authorSearchText;
    private javax.swing.JButton backButton;
    private javax.swing.JTable bookTable;
    private javax.swing.JButton borrowButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextArea descriptionData;
    private javax.swing.JLabel descriptionText;
    private javax.swing.JTextField editionData;
    private javax.swing.JLabel editionDescText;
    private javax.swing.JTextField genreData;
    private javax.swing.JLabel genreDescText;
    private javax.swing.JCheckBox genreOptionInput;
    private javax.swing.JComboBox<String> genreSearchInput;
    private javax.swing.JLabel genreText;
    private javax.swing.JTextField idData;
    private javax.swing.JLabel idDescText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField locationData;
    private javax.swing.JLabel locationDescText;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton logoutButton1;
    private javax.swing.JTextField publishYearData;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchText;
    private javax.swing.JLabel searchTitleText;
    private javax.swing.JTextField statusData;
    private javax.swing.JLabel statusText;
    private javax.swing.JTextField titleData;
    private javax.swing.JLabel titleDescText;
    private javax.swing.JCheckBox titleOptionInput;
    private javax.swing.JTextField titleSearchInput;
    private javax.swing.JLabel titleText;
    private javax.swing.JLabel yearDescText;
    private javax.swing.JCheckBox yearOptionInput;
    private javax.swing.JComboBox<String> yearSearchInput;
    private javax.swing.JLabel yearText;
    // End of variables declaration//GEN-END:variables
}
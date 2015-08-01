import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class UserInput extends javax.swing.JFrame {
    public int count;
    public long numOfWords;
    
    public UserInput() {
        initComponents();
        //  LoadTextContent.setEditable(false); //Prevents editing from JTextPane
        fc = new JFileChooser();
        fc.setMultiSelectionEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        JavaSearchEngineLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchBar = new javax.swing.JTextPane();
        searchBtn = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        LoadText = new java.awt.TextArea();
        matchFound = new java.awt.TextField();
        label1 = new java.awt.Label();
        resetBtn = new java.awt.Button();
        label2 = new java.awt.Label();
        totalwordCount = new java.awt.TextField();
        removeDocumentButton = new java.awt.Button();
        addDocumentButton = new java.awt.Button();
        jMenuBar1 = new javax.swing.JMenuBar();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JavaSearchEngineLabel.setFont(new java.awt.Font("MS Gothic", 1, 36)); // NOI18N
        JavaSearchEngineLabel.setForeground(new java.awt.Color(255, 102, 5));
        JavaSearchEngineLabel.setText("Java Search Engine");

        jScrollPane1.setViewportView(searchBar);

        searchBtn.setLabel("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Document", "tf-idf"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectDocument(evt);
            }
        });
        jScrollPane2.setViewportView(jTable);

        matchFound.setName(""); // NOI18N
        matchFound.setText("0");
        matchFound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchFoundActionPerformed(evt);
            }
        });

        label1.setText("Match Found:");

        resetBtn.setLabel("Reset");

        label2.setText("Total Word Count:");

        totalwordCount.setText("0");

        removeDocumentButton.setLabel("-");
        removeDocumentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDocumentButtonActionPerformed(evt);
            }
        });

        addDocumentButton.setLabel("+");
        addDocumentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDocumentButtonActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addDocumentButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removeDocumentButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JavaSearchEngineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LoadText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalwordCount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matchFound, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(JavaSearchEngineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addDocumentButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeDocumentButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(LoadText, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(matchFound, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totalwordCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        searchBtn.getAccessibleContext().setAccessibleName("searchBtn");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void removeDocumentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDocumentButtonActionPerformed
        // TODO add your handling code here:
        int[] selectedRows = jTable.getSelectedRows();
        if (selectedRows.length == 0) {
            JOptionPane.showMessageDialog(null, "No File Selected. Nothing is Removed.");
            return;//get out of method
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        
        for (int rowNumber : selectedRows) {
            model.removeRow(rowNumber);
            count--;
        }
        if (count > 0) {
            matchFound.setText(String.valueOf(count));
        }
    }//GEN-LAST:event_removeDocumentButtonActionPerformed

    private void addDocumentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDocumentButtonActionPerformed
        // TODO add your handling code here:
        //int returnVal = fc.showOpenDialog(UserInput.this);
        //if (returnVal == JFileChooser.APPROVE_OPTION) {
            //File[] files = fc.getSelectedFiles();
            File[] files = new File("/Users/MasqueCrow/documents/Programming Projects/Java Assignments/Assignment1/src/LoadingFiles").listFiles();
            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            for (File file : files) {
                model.addRow(new Object[]{file.getPath(), 0.0});

                System.out.println("Opening: " + file.getName() + ".\n");
            }

        /*} else {
            System.out.println("Open command cancelled by user.\n");
        }*/
    }//GEN-LAST:event_addDocumentButtonActionPerformed
    
    private LinkedHashSet invokeStopWords(LinkedHashSet userinput, ArrayList<String> textDocWords) {
File[] files = new File("/Users/MasqueCrow/documents/Programming Projects/Java Assignments/Assignment1/src/StopWordFile").listFiles(); //stopwords directory
ArrayList<String> stopWordsFilePaths = new ArrayList<String>(); //an arraylist of stopWordsFilePaths
     for (int i = 0; i < files.length; i++) {
            stopWordsFilePaths.add(files[i].getPath()); //store the stopwords file directories into an array of strings

        }
        /*------------BufferedReader*/
        String text = ""; //initalise an empty string
        String line; //used for boolean check whether there is word
        for (String filePath : stopWordsFilePaths) { //iterate over array of String file directions
            try {
                BufferedReader in = new BufferedReader(new FileReader(filePath)); //load the stopwords files directories of the list string array
                while ((line = in.readLine()) != null) { //while there is still word
                    text += line + " ";//store all the words of all documents in a string
                }//while
            } catch (Exception e) {
                System.out.println(e); //prints out runtime error
            }

        }//for loop

        String[] stopWordsArray = text.split(" "); //storing all words in text documents in a string array
        LinkedHashSet uniqueStopWords = new LinkedHashSet(); //created a new LinkedHashSet to store unqiue stopwords
        for (String stopword : stopWordsArray) {
            uniqueStopWords.add(stopword); //stores unique stopwords as it iterates stopwordsArray
           
        }
        
        int stopWordFound = 0;
        int originalInputSize = userinput.size();
        Iterator it = uniqueStopWords.iterator();
        while (it.hasNext()) {
            String wordCheck = it.next().toString();
            if (userinput.contains(wordCheck)) {
                stopWordFound++;
                //userinput.remove(wordCheck);
            }
        }
        
        if (stopWordFound == originalInputSize) {
            return userinput;
        } else {
            it = uniqueStopWords.iterator();
            while (it.hasNext()) {
                String wordCheck = it.next().toString();
                if (userinput.contains(wordCheck)) {
                    userinput.remove(wordCheck);
                }
            }
            return userinput;
        }
        
        
    }
    
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        ArrayList<String> filePaths = new ArrayList<>(); //initialies a string arraylist of filepath 
       filePaths = LoadTextInput.getFilePaths(); //store an arrayList of file paths.
        String userDefinedTerms = searchBar.getText().toLowerCase(); //retrieve user's input and change all words to lowercase
        String[] arrayOfUserDefinedTerms = userDefinedTerms.split(" "); //split words and store into an arrayOfUserDefinedTerms
        LinkedHashSet userinput=new LinkedHashSet(); //initialies a linkedhashset 
       for(String searchWord:arrayOfUserDefinedTerms){
           userinput.add(searchWord); //stores unique user input words 
       }
       
       LinkedHashSet wordsFiltered=new LinkedHashSet();  //create a new LinkedHashSet
       wordsFiltered=invokeStopWords(userinput,LoadTextInput.loadFiles(filePaths));//retrieve all user input that do not contain stopwords
       invokeStopWords(userinput,LoadTextInput.loadFiles(filePaths));
       Iterator iterate=wordsFiltered.iterator(); //create an iterator
       ArrayList<String> arrayWordsFiltered=new ArrayList<>();//create a string arraylist to store filtered words
       while(iterate.hasNext()){
        arrayWordsFiltered.add(iterate.next().toString());//store filtered words
       }
       
       
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();//An implementation of TableModel that uses a Vector of Vectors to store the cell value objects.
        model.setRowCount(0); //set number of rows in the model
        for (int i = 0; i < jTable.getRowCount(); i++) {
            if (wordsFiltered.size()!= 0) { //if there are user input words after filtering, get the file
                String path = (String) model.getValueAt(i, 0);//retrieve string of path
                filePaths.add(path);//seems to be adding additional String of filepaths,commented out 259
                System.out.println(path);
                count++;
            }

        }
        String string = "" + count;
        
        ArrayList<Double> tfidfScores = new ArrayList<Double>(); //create an arraylist of tf-idfScores
        if (arrayWordsFiltered.size() != 0) { //if there are still user's word
            tfidfScores = LoadTextInput.tfidfScoreForDocuments(arrayWordsFiltered.get(0), filePaths);//store tfidf score for first term for SUM with subsequent terms

            if (wordsFiltered.size() > 1) { //check if there is more than one word in the arraylist of wordfiltered
                for (int i = 1; i < arrayWordsFiltered.size(); i++) {
                    ArrayList<Double> tfidfScore2nd = LoadTextInput.tfidfScoreForDocuments(arrayWordsFiltered.get(i), filePaths);//retrieve tdidf for second term
                    for (int j = 0; j < tfidfScore2nd.size(); j++) {
                        tfidfScores.set(j, tfidfScores.get(j) + tfidfScore2nd.get(j));//add tdidfscores for both terms,overide the intital score
                    }
                }
            }//if
        }
        //ArrayListtfidfScores = LoadTextInput.tfidfScoreForDocuments(term, filePaths);
        ArrayList<Pair<String, Double>> pairs = new ArrayList<>();

        for (int i = 0; i < filePaths.size(); i++) {
            pairs.add(new Pair(filePaths.get(i), tfidfScores.get(i)));
            if (tfidfScores.get(i) != 0) {
                model.addRow(new Object[]{filePaths.get(i), tfidfScores.get(i)});
            }
        }

        // http://stackoverflow.com/questions/890254/how-can-i-sort-this-arraylist-the-way-that-i-want
        Collections.sort(pairs, new Comparator<Pair<String, Double>>() {
            @Override
            public int compare(Pair<String, Double> o1, Pair<String, Double> o2) {
                if (o1.second < o2.second) {
                    return 1;
                } else if (o1.second == o2.second) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });

        for (int i = 0; i < jTable.getRowCount(); i++) {
            Pair p = pairs.get(i);
            model.setValueAt(p.first, i, 0);
            model.setValueAt(p.second, i, 1);
        }

        for (int i = 0; i < model.getRowCount(); i++) {
            if (Double.parseDouble(jTable.getValueAt(i, 1).toString()) == 0) {
                model.removeRow(i);
            }
        }
        matchFound.setText("" + model.getRowCount());
    }//GEN-LAST:event_searchBtnActionPerformed

    private void selectDocument(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectDocument
        ArrayList<String> filePath = new ArrayList<String>();
        
        for (int i = 0; i < jTable.getRowCount(); i++) {
            filePath.add(jTable.getValueAt(i, 0).toString());
        }
        
        ArrayList<String> documentData = new ArrayList<String>();
        documentData = LoadTextInput.loadFiles(filePath);
        
        if (jTable.getSelectedRow() != -1) {
            LoadText.setText(documentData.get(jTable.getSelectedRow()));
            numOfWords = LoadTextInput.wordCount(documentData.get(jTable.getSelectedRow()));
            totalwordCount.setText("" + numOfWords);
        }
    }//GEN-LAST:event_selectDocument

    private void matchFoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchFoundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matchFoundActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInput().setVisible(true);

            }

        });

    }
    private JFileChooser fc;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JavaSearchEngineLabel;
    private java.awt.TextArea LoadText;
    private java.awt.Button addDocumentButton;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.TextField matchFound;
    private java.awt.Button removeDocumentButton;
    private java.awt.Button resetBtn;
    private javax.swing.JTextPane searchBar;
    private java.awt.Button searchBtn;
    private java.awt.TextField totalwordCount;
    // End of variables declaration//GEN-END:variables
}

class Pair<F, S> {

    F first;
    S second;

    public Pair(F f, S s) {
        first = f;
        second = s;
    }
}

import java.util.*;
import javax.swing.JFileChooser;
import java.io.File;

public class LoadTextInput {
    
    /*
    getFilePaths stores a collection of filepaths
    inside an arraylist.
    */
    public static ArrayList<String> getFilePaths() {
        File[] files = new File("/Users/MasqueCrow/documents/Programming Projects/Java Assignments/Assignment1/src/LoadingFiles").listFiles();
        ArrayList<String> filePaths = new ArrayList<String>();
        for (int i = 0; i < files.length; i++) {
            filePaths.add(files[i].getPath());
        }
        return filePaths;
    }
    
    /*Counts the number of words in a single text document*/
    public static long wordCount(String data) {
        long words = 0;
        int index = 0;
        boolean prevWhiteSpace = true;
        while (index < data.length()) {
            //Intialise character variable that will be checked.
           
            char c = data.charAt(index++);
            //Determine whether it is a space.
            boolean currWhiteSpace = Character.isWhitespace(c);
            
            //If previous is a space and character checked is not a space,
            if (prevWhiteSpace && !currWhiteSpace) {
                words++;
            }
            //Assign current character's determination of whether it is a spacing as previous.
            prevWhiteSpace = currWhiteSpace;
        }
        return words;
    }

    
    /*Stores text documents in an arraylist named documents */
    public static ArrayList<String> loadFiles(ArrayList<String> documentFilePaths) {

        String text;
        ArrayList<String> documents = new ArrayList<String>();
        try {
        for (String filepath : documentFilePaths) {
            File file = new File(filepath);
            text = "";//reset String data when new files are loaded
            Scanner input = new Scanner(file);

            while (input.hasNext()) {

                text += input.next();
                input.useDelimiter("\t"); //similar to split function 

            }
            documents.add(text);
           
            System.out.println("\n");
            input.close();

        }//for loop
        } catch (Exception e) {
            e.printStackTrace();
        }
        // retrieveHashmap(retriHashMap); //prints out word and no.of occurence
        return documents;
    }

    public static void readFiles(String data) {
        System.out.println(data);
    }

    /* stores the mapping of the word (String) with its frequency of occurence(Integer)
    in HashMap hm */
    public static HashMap<String, Integer> handleHashMap(String data) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>(); //Creates a Hashmap that would be renewed when next document is loaded.
        String textWords;
        textWords = data.replaceAll("\\s+", " "); //Remove all white spaces for storing individual words in a String array
        String[] words = textWords.split(" ");

        // for every word in words
        for (String word : words) {
            int wordAppearCount = 0;

            //if there is non-word charcter,remove it
            String lowerCaseWord = word.toLowerCase().replaceAll("\\W", "");

            if (hm.containsKey(lowerCaseWord)) {
                wordAppearCount = hm.get(lowerCaseWord); //get the integer value where the string word is stored
            }

            boolean wordNotEmpty = !lowerCaseWord.equals("");

            if (wordNotEmpty) { //if there is no non-word character in word[] string array, 
                //Words stored in hashmap are in lower case and have special characters removed.
                hm.put(lowerCaseWord, ++wordAppearCount);
            }

        }// for loop
        return hm;
        // Check keys and values

    }

    public static int tf(HashMap<String, Integer> documenthm, String term) {

        if (documenthm.containsKey(term)) {
            return documenthm.get(term);
        } else {
            return 0;

        }

    }

    public static void main(String[] args) throws Exception {
        String term = "no";

    }

   /* public static double tfidf(String term, int documentIndex, ArrayList<String> filePaths) {
        ArrayList<String> documents = LoadTextInput.loadFiles(filePaths);//store an arraylist of words in documents

        ArrayList<HashMap> hmArr = handleHashMapForEveryDocument(documents);

        double idfValue, tfValue;
        double tf_idf;

        idfValue = idf(term, documents, hmArr);
        tfValue = tf(hmArr.get(documentIndex), term);
        tf_idf = idfValue * tfValue;
        return tf_idf;
    }*/

    public static ArrayList<HashMap> handleHashMapForEveryDocument(ArrayList<String> documents) {
        ArrayList<HashMap> hmArr = new ArrayList<HashMap>();
        for (String document : documents) {

            hmArr.add(handleHashMap(document));
        }
        return hmArr;
    }

    private static double idf(String term, ArrayList<String> documents, ArrayList<HashMap> hmArr) {
        int count = 0;
        double calculateidf;
        int N;
        for (HashMap hm : hmArr) {
            if (hm.containsKey(term)) {
                count++; //the no. of documents which has the term
            }
        }
        N = documents.size();
        System.out.println(count);
        calculateidf = (Math.log((double) N / (double)(count + 1))); //Casted as double, otherwise trucation would occur.
        return calculateidf;
    }

    static ArrayList<Double> tfidfScoreForDocuments(String term, ArrayList<String> filePaths) {
        ArrayList<Double> tfidfScores = new ArrayList<>();
        
        ArrayList<String> documents = LoadTextInput.loadFiles(filePaths);//store an arraylist of words in documents

        ArrayList<HashMap> hmArr = handleHashMapForEveryDocument(documents);

        double idfValue, tfValue;
        double tf_idf;

        idfValue = idf(term, documents, hmArr);
        
        for (HashMap<String, Integer> documentHm : hmArr) {
            tfValue = tf(documentHm, term);
            tf_idf = idfValue * tfValue;
            tfidfScores.add(tf_idf);
        }
        return tfidfScores;
    }
}

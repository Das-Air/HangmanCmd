import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author DasAerus 
 * A Class responsible for handling game Events and sending them to {@link KonsolenAnzeige} to be shown to the user in the Console
 * 
*/


public class Hangman {

    private String begriff;
    private char[] fehler;
    private char[] richtig;

    public Hangman(){

    }

    public static void main(String[] args) {

    }

    /**
     * @param path
     */
    public void neuesWort(String path){
        try{
        File file = new File(path); 
        final RandomAccessFile rndFile = new RandomAccessFile(file, "r");
        final long randomLocation = (long) (Math.random() * rndFile.length());
        rndFile.seek(randomLocation);
        rndFile.readLine(); //will move file pointer to the next line, as it might be in the middle of one due to seek()
        begriff = rndFile.readLine();
        rndFile.close(); 
        }
        catch(FileNotFoundException error){
            System.out.printf("Keine Valide Datei/Dateipfad unter %s!", path);
        }
        catch(IOException error){
            System.out.printf("Fehler während dem Zugriff auf die Datei unter %s!", path);
        }
    }

    //ToDo logic
    //Todo Revise UML Diagram
    //[ ] Wordlist import and actual Wordlist from Mrs. S
    

}

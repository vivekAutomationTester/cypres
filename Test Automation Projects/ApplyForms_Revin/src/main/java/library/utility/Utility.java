package library.utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * The type Utility.
 */
public class Utility {


    /**
     * Gets time stamp.
     *
     * @return the time stamp
     */
// returns Time stamp in yyyy-MM-dd-HHmmss format
    public String getTimeStamp()
    {
        return new SimpleDateFormat("yyyy-MM-dd-HHmmss").format(new Date());
    }

    /**
     * Create directory string.
     *
     * @param directoryPath the directory path
     * @return the string
     */
// Creates folder
    public String createDirectory(String directoryPath)
    {
        new File(directoryPath).mkdir();
        return directoryPath+"/";
    }

    /**
     * Is found boolean.
     *
     * @param filename the filename
     * @return the boolean
     */
// Checks if the file is present
    public static boolean isFound(String filename)
    {
        return new File(filename).exists();
    }

    /**
     * Generate text string.
     *
     * @param fieldSize the field size
     * @return the string
     */
// Generates text using random text
    // Uses Lorem Ipsum to build text
    public static String generateText(int fieldSize)
    {
        StringBuffer myText = new StringBuffer();
        for(int i=0; i<(fieldSize/ "Lorem Ipsum".length()) + 1; i++)
            myText.append("Lorem Ipsum");
        return myText.substring(0, fieldSize);
    }

    /**
     * Gets current time.
     *
     * @return the current time
     */
    public static String getCurrentTime()
    {
        return getCurrentTime("yyyy/MM/dd HH:mm:ss");
    }

    /**
     * Gets current time.
     *
     * @param format the format
     * @return the current time
     */
    public static String getCurrentTime(String format)
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    /**
     * Print current time.
     */
// Prints the time on the console
    // Can be only used for debugging
    public static void printCurrentTime()
    {
        System.out.println(getCurrentTime());
    }

    /**
     * Create pdf string.
     *
     * @param fileName  the file name
     * @param inProject the in project
     * @return the string
     */
// Better Used
    public static String createPdf(String fileName, boolean inProject)
    {
        return CreatePdf.createPdf(fileName, inProject);
    }
}

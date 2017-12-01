/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author joao
 */
public class Logger {

    protected String filePath;
    private final String logName = "LogFile";
    private Date currentDate;
    private FileWriter out;
    private File folder;

    private static Logger instance;

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    /**
     * Constructor
     */
    Logger() {                

        folder = this.createOrReadLogFolder(System.getProperty("user.dir"));

        try {
            createNewFileStream(new Date());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Create a new File Stream
     *
     * @param newDate
     * @throws IOException
     */
    private void createNewFileStream(Date newDate) throws IOException {

        currentDate = newDate;

        if (out != null) {
            out.close();
        }

        File logFile = this.getOrCreateFileForDate(currentDate, folder);

        out = openStream(logFile);
    }

    /**
     * Write message into file
     *
     * @param message
     */
    public void log(String message) {

        Date todaysDate = new Date();

        try {

            if (!isDateToday(currentDate, todaysDate)) {

                createNewFileStream(todaysDate);
            }

            out.write(
                    "Timestamp: "
                    + currentDate.toString()                    
                    + "; Message: "        
                    + message
                    + ";\n"
            );

            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Open the stream
     *
     * @param logFile
     * @return
     * @throws IOException
     */
    private FileWriter openStream(File logFile) throws IOException {
        return new FileWriter(logFile, true);
    }

    /**
     * Create or Read the log folder
     *
     * @param filePath
     * @return
     */
    private File createOrReadLogFolder(String filePath) {
        File logsFolder = new File(filePath + '/' + "logs");
        if (!logsFolder.exists()) {
            System.err.println("INFO: Creating new logs directory in " + filePath);
            logsFolder.mkdir();
        }

        return logsFolder;
    }

    /**
     * Create or Read the log file
     *
     * @param date
     * @param logsFolder
     * @return
     */
    private File getOrCreateFileForDate(Date date, File logsFolder) {

        if (!logsFolder.isDirectory()) {
            throw new IllegalStateException("Folder is not valid");
        }

        String logFileName = this.generatefileFormat(date);
        File logFile = new File(logsFolder.getName(), logFileName);

        try {
            logFile.createNewFile();
            return logFile;
        } catch (IOException e) {
            return null;
        }
    }

    /**
     * Generate the file name format
     *
     * @param date
     * @return
     */
    private String generatefileFormat(Date date) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        String finalLogname = logName + '-' + dateFormat.format(cal.getTime()) + ".log";
        return finalLogname;
    }

    /**
     * Verify the day of the file
     *
     * @param dateFromFile
     * @param currentDate
     * @return
     */
    private boolean isDateToday(Date dateFromFile, Date currentDate) {
        Calendar today = Calendar.getInstance();
        today.clear(Calendar.HOUR);
        today.clear(Calendar.MINUTE);
        today.clear(Calendar.SECOND);
        Date todayDateReseted = today.getTime();
        Calendar dateFromFileCalendar = Calendar.getInstance();
        dateFromFileCalendar.setTime(currentDate);
        dateFromFileCalendar.clear(Calendar.HOUR);
        dateFromFileCalendar.clear(Calendar.MINUTE);
        dateFromFileCalendar.clear(Calendar.SECOND);
        dateFromFileCalendar.setTime(dateFromFile);

        Date dateFromFileReseted = dateFromFileCalendar.getTime();

        return dateFromFileReseted.equals(todayDateReseted);
    }

}

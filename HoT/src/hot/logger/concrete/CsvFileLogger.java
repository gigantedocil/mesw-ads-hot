/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.logger.concrete;

import hot.logger.AbstractLogger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author joao
 */
public class CsvFileLogger extends AbstractLogger {

    private static AbstractLogger instance;

    private CsvFileLogger() {
    }

    public static AbstractLogger getInstance() {
        if (instance == null) {
            instance = new CsvFileLogger();
        }
        return instance;
    }

    @Override
    public String generatefileFormat(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        String finalLogname = super.getLogName() + '-' + dateFormat.format(cal.getTime()) + ".csv";
        return finalLogname;
    }
}

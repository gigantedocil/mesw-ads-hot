/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hot.logger;

/**
 * Enumeration for log level
 *
 * @author adeliahvgoncalves
 *
 */
public enum LoggerLevel {
    
    DEBUG(1),
    WARNING(2),
    SEVERE(3),
    INFO(4),
    ERROR(5);

    private int level;

    private LoggerLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}

package com.example.Jardineria.Auditoria.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoggerManager {
    private static final Logger logger = LoggerFactory.getLogger(LoggerManager.class);
    private static LoggerManager instance;

    private LoggerManager() {
        // Constructor privado para prevenir instanciación directa
    }

    public static synchronized LoggerManager getInstance() {
        if (instance == null) {
            instance = new LoggerManager();
        }
        return instance;
    }

    public void logError(String message) {
        logger.error(message);
    }
}
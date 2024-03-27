package pluggable_selector;
/**
 * Interface comum para sistema de Logs 
 */
interface Logger {
    void log(String message);
}

class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Log no console: " + message);
    }
}

class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Log em arquivo: " + message);
    }
}

class DatabaseLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Log no banco de dados: " + message);
    }
}

/**
 * Classe responsável por gerenciar os logs e Selecionar o tipo de log a ser usado
 * essa classe tambem é chamada de Selector
 */
class LogManager {
    private Logger logger;

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void logMessage(String message) {
        if (logger != null) {
            logger.log(message);
        }
    }
}

// Uso do Pluggable Selector Pattern
public class Main {
    public static void main(String[] args) {
        LogManager logManager = new LogManager();

        Logger logger = new ConsoleLogger(); 
        logManager.setLogger(logger);

        logManager.logMessage("Mensagem de log 1");

        logger = new FileLogger(); 
        logManager.setLogger(logger);
        
        logManager.logMessage("Mensagem de log 2");
    }
}
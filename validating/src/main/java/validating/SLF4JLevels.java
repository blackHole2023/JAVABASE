package validating;

import org.slf4j.*;

public class SLF4JLevels {
    private static Logger log =
            LoggerFactory.getLogger(SLF4JLevels.class);
    public static void main(String[] args) {
        log.trace("Hello");
        log.trace("你好");
        log.debug("Logging");
        log.info("Using");
        log.warn("the SLF4J");
        log.error("Facade");
    }
}
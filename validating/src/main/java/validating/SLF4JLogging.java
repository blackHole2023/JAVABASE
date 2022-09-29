package validating;


import org.slf4j.*;


public class SLF4JLogging {
    private static Logger log =
            LoggerFactory.getLogger(SLF4JLogging.class);
    public static void main(String[] args) {
        log.error("你好");
        log.info("hello logging");
    }
}
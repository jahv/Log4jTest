package jahv.log4j.test;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.apache.log4j.NDC;

public class Log4jTest {

    private static final Logger log = Logger.getLogger(Log4jTest.class.getPackage().getName());
    private static final Logger X = Logger.getLogger("X");

    public static void main(String[] args) {
        log.info("*** data");
//        log.fatal("Hello world 1");
//        log.error("Hello world1");
//        log.warn("Hello world1");
        log.info("Hello world 1");
//        log.debug("Hello world1");
//        log.trace("Hello world1");

        X.info("X logger");

//        NDC.push("127.0.0.1");
//        MDC.put("user", "jahv");
//
//        log.info("Invoking main");
    }

}

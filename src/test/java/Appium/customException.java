package appium;

import org.apache.log4j.Logger;

/**
 * Created by rpalacios on 4/11/16.
 */
public class customException extends Throwable {
    Logger logger = Logger.getLogger(this.getClass());

    public customException(String message) {
        logger.error(message);
    }

}

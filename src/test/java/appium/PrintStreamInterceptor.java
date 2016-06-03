package appium;

public class PrintStreamInterceptor extends java.io.PrintStream {
    org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(this.getClass());
        //java.io.PrintStream ps;

    public PrintStreamInterceptor(java.io.PrintStream original) {
        super(original);
        //logger = DriverInitialization.getLogger();
        logger = Logger.getLogger();
    }

    // You'd want to override other methods too, of course.
    @Override
    public void println(String line) {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        // Element 0 is getStackTrace
        // Element 1 is println
        // Element 2 is the caller
        StackTraceElement caller = stack[2];
        //super.println(caller.getClassName() + "." + caller.getLineNumber() + ": " + line);
        super.println(line);
        if(super.equals(System.out))
            logger.info(caller.getClassName() + "." + caller.getLineNumber() + ": " + line);
        if(super.equals(System.err))
            logger.error(caller.getClassName() + "." + caller.getLineNumber() + ": " + line);
    }

}
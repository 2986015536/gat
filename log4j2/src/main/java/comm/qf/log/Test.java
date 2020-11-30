package comm.qf.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Logger logger = LoggerFactory.getLogger(Test.class);
        while (true){
            logger.trace("堆栈信息");
            logger.debug("调试信息");
            logger.info("普通信息");
            logger.warn("警告信息");
            logger.error("错误信");
            //logger.fatal("严重信息");

            Thread.sleep(1000);
        }

    }
}

package com.qf.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Date;

public class TestLog {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(TestLog.class);

        log.trace("堆栈信息...123");
        log.debug("调试信息...123");
        log.info("普通信息...123");
        log.warn("警告信息...123");
        log.error("错误信息...123");
        log.fatal("严重信息...123");

        System.out.println(new Date());
        System.out.println(new Date(1000));


    }
}

package com.log;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 功能描述: 日志打印功能
 * 项目名称:logprint
 * 创建日期:2020/5/27
 */
public class PrintMain {
    /**
     * 定义日志
     */
        private static Logger logger= LogManager.getLogger(PrintMain.class);

    public static void main(String[] args) {
        for(int i=0;i<11113;i++){
            // 记录trace级别的信息
            logger.trace("log4j2日志输出：This is trace message.");
            // 记录debug级别的信息
            logger.debug("log4j2日志输出：This is debug message.");
            // 记录info级别的信息
            logger.info("log4j2日志输出：This is info message.This is info message.This is info message.This is info message.This is info message.This is info message.This is info message.This is info message.This is info message.");
            // 记录error级别的信息
            logger.error("log4j2日志输出：This is error message.");
        }
    }
}

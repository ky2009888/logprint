package com.log;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * ��������: ��־��ӡ����
 * ��Ŀ����:logprint
 * ��������:2020/5/27
 */
public class PrintMain {
    /**
     * ������־
     */
        private static Logger logger= LogManager.getLogger(PrintMain.class);

    public static void main(String[] args) {
        for(int i=0;i<11113;i++){
            // ��¼trace�������Ϣ
            logger.trace("log4j2��־�����This is trace message.");
            // ��¼debug�������Ϣ
            logger.debug("log4j2��־�����This is debug message.");
            // ��¼info�������Ϣ
            logger.info("log4j2��־�����This is info message.This is info message.This is info message.This is info message.This is info message.This is info message.This is info message.This is info message.This is info message.");
            // ��¼error�������Ϣ
            logger.error("log4j2��־�����This is error message.");
        }
    }
}

//package com.dome.moveftp;
//
//import org.apache.camel.Exchange;
//import org.apache.camel.Processor;
//import org.apache.camel.component.file.GenericFileMessage;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import java.io.File;
//import java.io.RandomAccessFile;
//
///**
// * 逻辑处理
// *
// */
//@Component
//public class LocationFileProcessor implements Processor {
//
//    private static Logger logger = LoggerFactory.getLogger( LocationFileProcessor.class );
//
//    int a=1;
//    @Value("${ftp.local.dir}")
//    private String fileDir;
//
//    @Override
//    public void process(Exchange exchange) throws Exception {
//        GenericFileMessage<RandomAccessFile> inFileMessage = (GenericFileMessage<RandomAccessFile>) exchange.getIn();
//        String fileName = inFileMessage.getGenericFile().getFileName();//文件名
//        System.out.println(fileName);
//        String splitTag = File.separator;//系统文件分隔符
//        logger.error(fileDir + splitTag + fileName);//文件的绝对路径
//
//        logger.error(String.valueOf(a));
//        a++;
//        //逻辑处理
//        if(a>5){
//
//        }
//
//    }
//
//}
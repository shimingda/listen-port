//package com.dome.moveftp;
//
//import org.apache.camel.LoggingLevel;
//import org.apache.camel.builder.RouteBuilder;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
///**
// * ftp文件移动
// *
// */
//@Component
//public class MyRoute extends RouteBuilder {
//    private static Logger logger = LoggerFactory.getLogger( MyRoute.class );
//    @Value("${ftp.server.info}")
//    private String url;
//    @Value("${ftp.local.dir}")
//    private String downloadLocation;
//    @Autowired
//    LocationFileProcessor locationFileProcessor;
//    @Override
//    public void configure() throws Exception {
//        long timestart=System.currentTimeMillis();
//        from(url)
//                .process( locationFileProcessor )
////                .to(downloadLocation)
//                .log(LoggingLevel.ERROR, logger, "Downloaded file ${file:name} complete.");
//        long timeend=System.currentTimeMillis();
//        System.out.println(timeend-timestart);
////        from("D:/ftp/Temp/out")
////                .to("file:D:/ftp/Temp/in")
////                .log(LoggingLevel.ERROR, logger, "Downloaded file ${file:name} complete.");
//    }
//}

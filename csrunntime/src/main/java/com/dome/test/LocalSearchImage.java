//package com.dome.test;
//
//import java.io.File;
//import java.util.Random;
//
///**
// * 本地图片检索测试
// */
//public class LocalSearchImage {
//
//    public static void main(String[] args) {
//        String url =getUrl();
//        long timestart=System.currentTimeMillis();
//        File file=new File(url);
//        boolean falg=file.isFile();
//        if(falg){
//            long timeend=System.currentTimeMillis();
//            System.out.println("time:"+(timeend - timestart));
//        }
//
//    }
//    static String getUrl(){
//        StringBuffer url=new StringBuffer("D:/ftp/test/ftp");
//        Random random=new Random();
//        int dir=random.nextInt(5)+1;
//        url.append("/").append(dir);
//        long name=random.nextInt(15000);
//        url.append("/1 (").append(name).append(")");
//        if (dir%2==0){
//            url.append(" - 副本");
//        }
//       url.append(".jpg");
//        System.out.println(url);
//        return url.toString();
//    }
//}

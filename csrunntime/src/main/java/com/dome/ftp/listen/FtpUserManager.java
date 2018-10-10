package com.dome.ftp.listen;

import org.apache.ftpserver.ftplet.FtpException;
import org.apache.ftpserver.ftplet.UserManager;
import org.apache.ftpserver.usermanager.ClearTextPasswordEncryptor;
import org.apache.ftpserver.usermanager.PasswordEncryptor;
import org.apache.ftpserver.usermanager.PropertiesUserManagerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class FtpUserManager {

    public static final Logger LOGGER = LoggerFactory.getLogger(FtpUserManager.class);

     UserManager getUserManager() throws FtpException {
        String fileName = this.getClass().getClassLoader().getResource("users.properties").getPath();//获取文件路径
        System.out.println(fileName);

        PropertiesUserManagerFactory propusermanagerfactory = new PropertiesUserManagerFactory();
        File file = new File(fileName);
        UserManager usermanager= null;

        if(file.exists()){
            propusermanagerfactory.setFile(file);
            PasswordEncryptor passwordEncryptor=new ClearTextPasswordEncryptor();
            passwordEncryptor.encrypt("clear");
            propusermanagerfactory.setPasswordEncryptor(passwordEncryptor);
            usermanager = propusermanagerfactory.createUserManager();
        }else{
            LOGGER.error("user配置文件不存在");
        }

        return  usermanager;
    }
}



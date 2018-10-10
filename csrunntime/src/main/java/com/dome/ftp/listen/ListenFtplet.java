package com.dome.ftp.listen;

import org.apache.ftpserver.ftplet.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;


@Component
@Scope("prototype")
public class ListenFtplet extends DefaultFtplet {

    public static final Logger LOGGER = LoggerFactory.getLogger(ListenFtplet.class);


    @Override
    public FtpletResult onUploadEnd(FtpSession session, FtpRequest request) throws FtpException, IOException {//System.out.println(session.getFileSystemView().getFile(request.getArgument()).getAbsolutePath());  // 相对于home的路径
        File workingDir = workingDir(session);
        String fileName = request.getArgument();
        System.out.println(workingDir);
        System.out.println(fileName);
        return null;
    }
    private File workingDir(FtpSession session) throws FtpException {
        FtpFile workingDirectory = session.getFileSystemView().getWorkingDirectory();
        String home = session.getUser().getHomeDirectory();
        String absolutePath = workingDirectory.getAbsolutePath().substring(1);
        File workingDir = new File(new File(home), absolutePath);
        return workingDir;
    }

}
package com.practice2;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MainEntry2 {
    
    
    public static Logger test()  {
        //=============================================
        // 기본 로그 제거
        //------------
    	Logger LOG = Logger.getGlobal();
        Logger rootLogger = Logger.getLogger("");
        Handler[] handlers = rootLogger.getHandlers();
        if (handlers[0] instanceof ConsoleHandler) {
            rootLogger.removeHandler(handlers[0]);
        }
        //=============================================
        
        LOG.setLevel(Level.INFO);
    try {    
        Handler handler = new FileHandler("message.log", true);
        
        CustomLogFormatter formatter = new CustomLogFormatter();
        handler.setFormatter(formatter);
        LOG.addHandler(handler);
    }catch (SecurityException e) {
    	   e.printStackTrace();
    } catch (IOException e) {
     e.printStackTrace();
    }
    
    return LOG;
 
        
    }
}
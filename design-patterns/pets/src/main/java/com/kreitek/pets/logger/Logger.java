package com.kreitek.pets.logger;

public class Logger {

    private static volatile Logger instance=null;
    public static int contador=0;



    private void Logger() {
  if (instance != null){
      throw new RuntimeException("Usage getInstance() method to create");
  }

    }

    public static Logger getInstance(){
        if(instance==null){
            synchronized (Logger.class){
                if(instance==null){
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void debug(String StringToDebug){
        contador++;
        System.out.println("[debug]["+contador+"]- "+StringToDebug);
        return;
    }




}

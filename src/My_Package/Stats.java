/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package My_Package;

import java.io.PrintWriter;

/**
 *
 * @author Doru
 */
public class Stats {
    private double nrClienti;
    private double nrCozi;
    private double waiting;
    private double queueEmpty;
    private double service;
    private double avgEmpty;
    private double avgWaiting;
    private double avgService;
    private double timpCurent = 0;
    int peak=0;
    boolean created = false;
    String clienti = null;
    PrintWriter writer = null; 
    
    public Stats(){
        try {
            writer = new PrintWriter("Log.log", "UTF-8");
        } catch (Exception e){}
    }
    
    public void peak(int i){
        peak = i;
    }

    public void tick(){
        timpCurent++;
    }
    
    public void clientAdded(int serveTime,int casa){
        nrClienti++;
        clienti =":   Un cient cu tipul de deservire :"+serveTime+ "  a ajuns la casa: "+casa;
        writeToFile(clienti);
}
        public void clientRemoved(int coada){
        clienti = ":   Clientul a fost deservit si a parasit coada " + coada;
        writeToFile(clienti);
}
    
    public void queueAdded(){
        nrCozi++;
    }
    
    public void paused(){
        writeToFile("   Simularea a fost oprita...");
    }
    
    public void reStart(){
        if(timpCurent == 0){
        writeToFile("   Simularea a fost initializata...");
        }
        else {
            writeToFile("   Simularea a fost reinitializata...");
        }
    }
    
    public void threadStarted(int i){
        writeToFile("   Threadul "+i+" a fost pornit...");
    }
    
        public void threadStopped(int i){
        writeToFile("   Threadul "+i+" a fost oprit...");
    }
    

    public void queueEmpty(){
        queueEmpty++;
    }
        
    public void serviceTime(int time){
        service = service + time;
    }
    
    public void generate(){
        avgEmpty = queueEmpty / nrCozi;
        avgWaiting = waiting / nrClienti;
        avgService = service / nrClienti;
        
//        writer.println("AVG Empty time: "+avgEmpty);
//        writer.println("AVG waiting time: "+avgWaiting);
//        writer.println("AVG Service time: "+avgService);
//        writer.println("Peak hour: "+peak);
        closeFile();
    }
    
    public double getAvgE(){
       return avgEmpty; 
    }
        public double getAvgW(){
        return avgWaiting;
    }
            public double getAvgS(){
        return avgService;
    }
                public double getPh(){
        return peak;
    }
    
    public void service(){
        service++;
    }
    
    public void writeToFile(String text){
       writer.println(timpCurent + text);
    }
    public void closeFile(){
       writer.close();
    }
    
    public void waitingTime(int i){
        waiting = waiting + i;
    }
    
    public int getSimulationTime(){
        return (int)timpCurent;
    }
}

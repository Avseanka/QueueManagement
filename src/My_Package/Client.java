/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package My_Package;

/**
 *
 * @author Doru
 */
public class Client {
   private int timpDeservire=0;
   public int serveTimeInitial;
   public int arrivalTime=0;
   
          public Client(int minRange, int maxRange){
        timpDeservire = minRange + (int)(Math.random()*(maxRange-minRange));
        serveTimeInitial = timpDeservire;
          }
          public int getServeTime(){
              return timpDeservire;
          }
                    public int getServeTimeInitial(){
              return serveTimeInitial;
          }
          
          public void decrement(){
              timpDeservire--;
          }

    void remove() {
        this.remove();
    }
    
    public void setArrivalTime(int arrivalTime){
        this.arrivalTime = arrivalTime;
    }
}

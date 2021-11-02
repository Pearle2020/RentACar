/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;
import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;
import java.util.HashMap;

/**
 *
 * @author tchat
 */
//This method in in charge of creating the calendar of availability 

public class car implements CarInterface {
 private final  int id;
 private Make make;
 private final double rate;
 
 private Map<Month, Boolean[]>map;
  public car(int id, Make make,double rate){
     this.id= id;
     this.make=make;
      this.rate=rate;
   createAvailability();       
   }

    @Override
    public final Map createAvailability() {
       map= new HashMap<>();
         //To change body of generated methods, choose Tools | Templates.
       map.put(Month.JANUARY,new Boolean[31]);
       map.put(Month.FEBRUARY,new Boolean[28]);
       map.put(Month.MARCH,new Boolean[31]);
       map.put(Month.APRIL,new Boolean[30]);
       map.put(Month.MAY,new Boolean[31]);
       map.put(Month.JUNE,new Boolean[30]);
       map.put(Month.JULY,new Boolean[31]);
       map.put(Month.AUGUST,new Boolean[30]);
       map.put(Month.SEPTEMBER,new Boolean[31]);
      map.put(Month.OCTOBER,new Boolean[30]); 
      map.put(Month.NOVEMBER,new Boolean[31]);
      map.put(Month.DECEMBER,new Boolean[30]);
      
      return map;
    }

    @Override
    public Make getMake() {
        return make;
    }

    @Override
    public void setMake(Make make) {
    this.make=make;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getRate() {
       return rate ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRate(double rate) {
         ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean book(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
    
    

   

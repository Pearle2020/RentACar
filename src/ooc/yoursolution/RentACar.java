/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;


/**
 *
 * @author tchat
 */
public class RentACar implements RentACarInterface {
//    print the list of cars using the enum in make.java file
    String Car;
    private List<Car> cars;
    private String name;
    public RentACar(List<car> cars, String name) {
      this.Car=cars; //To change body of generated methods, choose Tools | Templates.
   this.name=name;
    }
    @Override
    public List getCars(){
        return cars; 
    }

    @Override
    public void setCars(List cars) {
        this.cars=cars; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        this.name=name;
}
    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        int currentDay, flag;
        for(Car car: cars){
        if(car.getMake().equals(make)){
        flag=0;
        currentDay=day;
          for(int i=0; i<lengthOfRent;i++){
          if(!car.isAvailable(month,currentDay++)){
          flag=1;
          break; 
          }
          }
          if(flag==0){
          return true;
          }
        }
        }
        return false;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        int currentDay,flag;//To change body of generated methods, choose Tools | Templates.
     if(Car.getMake().equals(make)){
        flag=0;
        currentDay=day;
          for(int i=0; i<lengthOfRent;i++){
          if(!Car.isAvailable(month,currentDay++)){
          flag=1;
          break; 
          }
          }
          if(flag==0){
          return Car.getId();
          }
    }
      return -1;
    
    }
      

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
       if(!checkAvailability(month,day,make,lengthOfRent)){
       return false;
       }
       int carId= getCarAvailable(month,day,make,lengthOfRent);
        for(Car car:cars){
        if(car.getId()==carId&&car.getMake()==make){
        int currentDay=day;
        for(int i=0; i<lengthOfRent;i++){
        car.book(month,currentDay++);
        }
        }
        }
        return true;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfCars() {
        return cars.size(); //To change body of generated methods, choose Tools | Templates.
    }

//    private static class Car {
//
//        public Car() {
//        }
//
//        private void book(Month month, int i) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        private int getId() {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        private Make getMake() {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//    }
//    
    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ooc.enums.Make;

/**
 *
 * @author tchat
 */
public class BookingSystem implements BookingSystemInterface {
@Override
    public RentACarInterface setupRentACar(BufferedReader in)throws IOException {
        
        
        String rc,name;
        List<car> cars= new ArrayList<>();
        name=in.readLine();
         while((rc=in.readLine())!=null){
         String s[]=rc.split(":");
         
         Make make =Make.valueOf(s[0]);
        double rate= Double.parseDouble(s[1]);
         int numCars = Integer.parseInt(s[2]);
         
         for(int t=0; t<numCars; t++){
         Car car =new Car(t,make,rate);
         cars.add(car);
             }
         }
         RentACarInterface rentACarInterface = new RentACar(cars,name);
                 return rentACarInterface;
    }
    
}

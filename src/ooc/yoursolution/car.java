import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;
import java.util.HashMap;
/**
 *
 * @author Erick
 */
public  class Car implements CarInterface {
    
    private int id;
    private Make make;
    private  double dailyRate;
    private Month month;

  
 

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Make getMake() {
        return make;
    }

    @Override
    public void setMake(Make make) {
        this.make = make;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }
}


   

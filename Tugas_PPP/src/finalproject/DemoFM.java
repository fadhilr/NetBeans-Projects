package finalproject;

import java.util.Scanner;

/**
 *
 * @author fauzan and co
 */
public class DemoFM {
    
    public static void testFM(){
       FactoryMethodTemperature factoryMethodTemperature=FactoryMethodTemperature.getInstance();
       FactoryMethodTemperature.getConversion(factoryMethodTemperature);
        
    }
    
    public static void main(String[] args) {
       testFM();
    }
   
}

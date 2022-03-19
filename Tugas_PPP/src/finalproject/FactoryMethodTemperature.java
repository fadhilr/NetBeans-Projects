package finalproject;

import java.util.Scanner;

/**
 *
 * @author fauzan
 */
public class FactoryMethodTemperature {
    private static FactoryMethodTemperature instance=null;
    
    private FactoryMethodTemperature(){}
    
    public static FactoryMethodTemperature getInstance(){
           if(instance==null){
               instance=new FactoryMethodTemperature();
           } 
           return instance;
    }
    
    public static String TEMPERATURE_TYPE="";
    
    public int getTemperature(int temperature){
        if (FactoryMethodTemperature.TEMPERATURE_TYPE.equalsIgnoreCase("celcius")) {
            return new KelvinTemperature().celciusToKelvin(temperature);
        }else if (FactoryMethodTemperature.TEMPERATURE_TYPE.equalsIgnoreCase("kelvin")) {
            return new CelciusTemperature().kelvinToCelcius(temperature);
        }
        
        return temperature;
    }
    
   public static void getConversion(FactoryMethodTemperature factoryMethodTemperature){
       Scanner in=new Scanner(System.in);
        try{
            System.out.print("Choose conversion :"
                    + "\n1.Kelvin to Celcius"
                    + "\n2.Celcius to Kelvin"
                    + "\nInput your choice : ");
           
            int choice=in.nextInt();
            switch(choice){
                case 1: 
                    FactoryMethodTemperature.TEMPERATURE_TYPE="kelvin";
                    break;
                case 2: 
                    FactoryMethodTemperature.TEMPERATURE_TYPE="celcius";
                    break;
                default : 
                    throw new UnsupportedOperationException();
            }
            System.out.print("Input the temperature : ");
            int temp=in.nextInt();
            System.out.println(factoryMethodTemperature.getTemperature(temp));
        }catch(NumberFormatException e){
            System.out.println(e);
        }
   }
}

package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author Samira Rahme
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
         int fahrenheit=0;
         double celsius=0.0;
       
         
        for (String fahrenheitTemp : args) {
            try{
                fahrenheit = Integer.parseInt(fahrenheitTemp);
                celsius = fahrenheitEnCelsius(fahrenheit);

                System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); 
      
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
    }
     }
    
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static double fahrenheitEnCelsius( int f){
      double celsiusTemp = (((double)5)/((double)9))*(f - 32);
        celsiusTemp = ((long)(celsiusTemp * 10))/10.0;

        return celsiusTemp;
     }

}

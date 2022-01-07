package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * Classe qui contient une methode utilitaire pour convertir fahrenheit
 * en celsius 
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      * 
      * Methode qui convertit en celsius la temperature saisie de la ligne de commande
      * et ensuite l'affiche sur la sortie standard
      * 
      *  @param args 
      *            tableau qui contient la valeur de la temperature 
      *            en fahrenheit
      */
     public static void main(String[] args){
       if (args.length == 0) {
            System.out.println("Erreur: Veuillez inserer des nombre valides");
            return;
        }
       
        int fahrenheit = 0;
        float celsius = 0f;
        for (String tempStr : args) {
            try { 
                fahrenheit = Integer.parseInt(tempStr);
                celsius = fahrenheitEnCelsius(fahrenheit);
                System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); 
            } catch(NumberFormatException nfe) {
                System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
            }
        }
        
       
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       // ...
       return question1.FahrenheitCelsius.fahrenheitEnCelsius(f);    // à compléter    en remplaçant la valeur retournée par la fonction de conversion
       // ...
     }

}

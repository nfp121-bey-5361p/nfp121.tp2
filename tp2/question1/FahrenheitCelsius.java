package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            tableau qui contient la valeur de la temperature 
     *            en fahrenheit
     */
    public static void main(String[] args) {
        // pour tous les param?tres de la ligne de commande
        if (args.length == 0) {
            System.out.println("Erreur: Veuillez inserer des nombres valide.");
            return;
        }
        
        int fahrenheit = 0;
        float celsius = 0f;
        for (int i = 0; i < args.length; i++) {
            fahrenheit = Integer.parseInt(args[i]);
            celsius = fahrenheitEnCelsius(fahrenheit);
            System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
        }
                                                                        
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        float celsius = 5f/9 * (f - 32);
        return ((int)(celsius * 10))/10.0f; // à compléter en remplaçant ce return 0.F par la fonction
                    // de conversion
    }

}

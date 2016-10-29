import java.util.ArrayList;

/**
 * Created by HP on 20/10/2016.
 */
public class main {


    public static void main(String[] args) {


        Personne algerien = new Personne("djeziri", "ibtissem", "algérien");
        Personne algerien2 = new Personne("bouguerra", "oussama", "algérien");
        Personne francais = new Personne("chriscian", "jean-pierre", "francais");
        Personne maroccain = new Personne("Mohammed", "amine", "Maroccain");
        Personne tunisien = new Personne("mohamed", "snoussi", "tunisien");
        Personne anglais = new Personne("john", "jordan", "anglais ");

        // les amis de l'algérienne djeziri ibtissem
        algerien.ajouter(algerien2);
        algerien.ajouter(francais);
        algerien.ajouter(maroccain);
        algerien.ajouter(tunisien);
        algerien.ajouter(anglais);
        
        System.out.print(algerien.toString());
        System.out.print("\n");


        //toute la liste
        algerien.afficher();
        //les algériens
        algerien.afficher1();
        //les étrangers 
        algerien.afficher2();
    }
}
//

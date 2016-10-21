import java.util.ArrayList;

/**
 * Created by HP on 20/10/2016.
 */
public class Personne {
    private String nom;
    private String prenom;
    private String nationalite;
    private ArrayList<Personne> listAmis = new ArrayList<>();

    public Personne(String nom, String prenom, String nationalite, ArrayList<Personne> listAmis) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.listAmis = listAmis;
    }

    public Personne(String nom, String prenom, String nationalite) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;

    }


    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    @Override
    public String toString() {

        return "je suis " + nom + " " + prenom + " de " + nationalite;
    }

    public void ajouter(Personne personne) {

        this.listAmis.add(personne);
    }

    public void supprimer(Personne personne) {
        this.listAmis.remove(personne);
    }

    public void afficher() {
        System.out.println("Mes amis sont");
        for (int i = 0; i < listAmis.size(); i++) {
            System.out.println(this.listAmis.get(i).getNom() + " " + this.listAmis.get(i).getPrenom() + this.listAmis.get(i).getNationalite());
        }
    }

    public void afficher1() {
        System.out.println("\n Mes amis algérien sont:");
        for (int i = 0; i < this.listAmis.size(); i++) {
            if (((listAmis.get(i).nationalite).equals(nationalite))) {
                System.out.println(this.listAmis.get(i).getNom() + " " + this.listAmis.get(i).getPrenom() + " " + this.listAmis.get(i).getNationalite());
            }
        }
    }

    public void afficher2() {
        System.out.println("\n Mes amis étrangers sont:");
        for (int i = 0; i < this.listAmis.size(); i++) {
            if (!((listAmis.get(i).nationalite).equals(nationalite))) {
                System.out.println(this.listAmis.get(i).getNom() + " " + this.listAmis.get(i).getPrenom() + " " + this.listAmis.get(i).getNationalite());
            }
        }
    }
}

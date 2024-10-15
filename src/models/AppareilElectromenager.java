package models;

public class AppareilElectromenager {
    private String nom;
    private int puissanceEnWatts;
    private String type;
    private int tempsUtilisationQuotidien;

    // Constructeur
    public AppareilElectromenager(String nom, int puissanceEnWatts, String type, int tempsUtilisationQuotidien) {
        this.nom = nom;
        this.puissanceEnWatts = puissanceEnWatts;
        this.type = type;
        this.tempsUtilisationQuotidien = tempsUtilisationQuotidien;
    }

    // Getters et setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public int getPuissanceEnWatts() { return puissanceEnWatts; }
    public void setPuissanceEnWatts(int puissanceEnWatts) { this.puissanceEnWatts = puissanceEnWatts; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getTempsUtilisationQuotidien() { return tempsUtilisationQuotidien; }
    public void setTempsUtilisationQuotidien(int tempsUtilisationQuotidien) { this.tempsUtilisationQuotidien = tempsUtilisationQuotidien; }

    // Méthode pour calculer la consommation quotidienne en kWh
    public double calculerConsommationQuotidienne() {
        return (puissanceEnWatts / 1000.0) * tempsUtilisationQuotidien;
    }
}
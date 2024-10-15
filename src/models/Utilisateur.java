package models;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    private String nom;
    private String adresse;
    private List<AppareilElectromenager> appareils;

    // Constructeur
    public Utilisateur(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        this.appareils = new ArrayList<>();
    }

    // Getters et Setters
    public String getNom() { return nom; }
    public String getAdresse() { return adresse; }
    public List<AppareilElectromenager> getAppareils() { return appareils; }

    // Ajouter et supprimer un appareil
    public void ajouterAppareil(AppareilElectromenager appareil) { appareils.add(appareil); }
    public void supprimerAppareil(AppareilElectromenager appareil) { appareils.remove(appareil); }
}
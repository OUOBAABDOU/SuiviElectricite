package controllers;

import models.AppareilElectromenager;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GestionAppareil {
    private List<AppareilElectromenager> appareils = new ArrayList<>();

    // Ajouter un appareil
    public void ajouterAppareil(AppareilElectromenager appareil) {
        appareils.add(appareil);
        System.out.println("Appareil ajouté : " + appareil.getNom());
    }

    // Modifier un appareil existant
    public void modifierAppareil(String nomAppareil, int nouvellePuissance, int nouveauTempsUtilisation) {
        Optional<AppareilElectromenager> appareilOpt = appareils.stream()
                .filter(appareil -> appareil.getNom().equals(nomAppareil))
                .findFirst();

        if (appareilOpt.isPresent()) {
            AppareilElectromenager appareil = appareilOpt.get();
            appareil.setPuissanceEnWatts(nouvellePuissance);
            appareil.setTempsUtilisationQuotidien(nouveauTempsUtilisation);
            System.out.println("Appareil '" + nomAppareil + "' mis à jour.");
        } else {
            System.out.println("Erreur : Appareil '" + nomAppareil + "' non trouvé.");
        }
    }

    // Supprimer un appareil
    public void supprimerAppareil(String nomAppareil) {
        appareils.removeIf(appareil -> appareil.getNom().equals(nomAppareil));
        System.out.println("Appareil '" + nomAppareil + "' supprimé.");
    }

    // Lister les appareils
    public List<AppareilElectromenager> listerAppareils() {
        return appareils;
    }
}
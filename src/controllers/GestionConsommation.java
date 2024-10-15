package controllers;

import models.Consommation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestionConsommation {
    private List<Consommation> consommations = new ArrayList<>();

    // Ajouter un relevé de consommation
    public void ajouterConsommation(Consommation consommation) {
        consommations.add(consommation);
    }

    // Calculer la consommation totale sur une période donnée
    public double calculerConsommationTotale(LocalDate debut, LocalDate fin) {
        return consommations.stream()
                .filter(c -> !c.getDate().isBefore(debut) && !c.getDate().isAfter(fin))
                .mapToDouble(Consommation::getConsommationEnergetique)
                .sum();
    }
}
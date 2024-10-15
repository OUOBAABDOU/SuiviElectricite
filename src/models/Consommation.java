package models;

import java.time.LocalDate;

public class Consommation {
    private LocalDate date;
    private AppareilElectromenager appareil;
    private double consommationEnergetique;

    // Constructeur
    public Consommation(LocalDate date, AppareilElectromenager appareil, double consommationEnergetique) {
        this.date = date;
        this.appareil = appareil;
        this.consommationEnergetique = consommationEnergetique;
    }

    // Getters
    public LocalDate getDate() { return date; }
    public AppareilElectromenager getAppareil() { return appareil; }
    public double getConsommationEnergetique() { return consommationEnergetique; }
}
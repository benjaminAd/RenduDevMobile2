package com.example.calendriertrain;

public class TrajetTrain {
    private String depart, destination, duree, nomTrain, heureDepart, heureArrivee, date;

    public TrajetTrain(String depart, String destination, String duree, String nomTrain, String heureDepart, String heureArrivee, String date) {
        this.depart = depart;
        this.destination = destination;
        this.duree = duree;
        this.nomTrain = nomTrain;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
        this.date = date;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getNomTrain() {
        return nomTrain;
    }

    public void setNomTrain(String nomTrain) {
        this.nomTrain = nomTrain;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }

    public String getHeureArrivee() {
        return heureArrivee;
    }

    public void setHeureArrivee(String heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return nomTrain + '\n' +
                "date: " + date + "\n" +
                "heureDepart : " + heureDepart + '\n' +
                "heureArrivee: " + heureArrivee;
    }
}

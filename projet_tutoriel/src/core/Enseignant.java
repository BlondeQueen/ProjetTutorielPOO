/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.Date;

/**
 *
 * @author blonde-queen
 */
// Enseignant.java
public class Enseignant extends Contact {
    private String statut;

    // Constructeur
    public Enseignant(String code, String nom, Date dateNaissance, String adresse, String email, String telNumber,
            String statut) {
        super(code, nom, dateNaissance, adresse, email, telNumber);
        this.statut = statut;
    }

    // Getters et setters
    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}

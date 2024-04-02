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
// Etudiant.java
public class Etudiant extends Contact {
    private String cycle;
    private String niveau;

    // Constructeur
    public Etudiant(String code, String nom, Date dateNaissance, String adresse, String email, String telNumber,
            String cycle, String niveau) {
        super(code, nom, dateNaissance, adresse, email, telNumber);
        this.cycle = cycle;
        this.niveau = niveau;
    }

    // Getters et setters
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}

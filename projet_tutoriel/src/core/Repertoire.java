/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author blonde-queen
 */
import java.util.ArrayList;
import java.util.List;

public class Repertoire {
    private final List<Contact> listeContacts;

    public Repertoire() {
        listeContacts = new ArrayList<>();
    }

    public void ajouterContact(Contact contact) {
        listeContacts.add(contact);
    }

    public void supprimerContact(Contact contact) {
        listeContacts.remove(contact);
    }

    public void modifierContact(Contact contact) {
        // Implementez votre logique de modification ici
    }

    public Contact rechercherContact(String nom) {
        for (Contact contact : listeContacts) {
            if (contact.getNom().equals(nom)) {
                return contact;
            }
        }
        return null;
    }

    public List<Contact> getListeContacts() {
        return listeContacts;
    }
    
}

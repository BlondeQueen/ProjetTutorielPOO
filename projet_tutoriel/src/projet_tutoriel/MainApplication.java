/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_tutoriel;

import core.Agent;
import core.Contact;
import core.Enseignant;
import core.Etudiant;
import core.Repertoire;

/**
 *
 * @author blonde-queen
 */
public class MainApplication {
    public static void main(String[] args) {
        // Création d'un répertoire
        Repertoire repertoire = new Repertoire();

        // Création de quelques contacts
        Contact contact1 = new Contact("001", "John Doe", null, null, null, null);
        Etudiant etudiant1 = new Etudiant("002", "Alice Smith", null, null, null, null, "Cycle 1", "Niveau 2");
        Enseignant enseignant1 = new Enseignant("003", "Bob Johnson", null, null, null, null, "Professeur");
        Agent agent1 = new Agent("004", "Eva Anderson", null, null, null, null, 5000.0, "Agent administratif", "Catégorie A", 3, "Secrétaire");

        // Ajout des contacts au répertoire
        repertoire.ajouterContact(contact1);
        repertoire.ajouterContact(etudiant1);
        repertoire.ajouterContact(enseignant1);
        repertoire.ajouterContact(agent1);

        // Recherche d'un contact par nom
        Contact contactTrouve = repertoire.rechercherContact("Alice Smith");
        if (contactTrouve != null) {
            System.out.println("Contact trouvé : " + contactTrouve.getNom());
        } else {
            System.out.println("Contact non trouvé.");
        }

        // Suppression d'un contact
        repertoire.supprimerContact(etudiant1);

        // Modification d'un contact
        contact1.setNom("Jane Doe");
        repertoire.modifierContact(contact1);
    }
}

package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(1, "toto", "tata", "123 Rue kkjdo", "0123456789", "toto.tata@example.com");

        System.out.println("Informations du client :");
        System.out.println("Numéro de client : " + client1.getNumClient());
        System.out.println("Nom : " + client1.getNom());
        System.out.println("Prénom : " + client1.getPrenom());
        System.out.println("Adresse : " + client1.getAdresse());
        System.out.println("Téléphone : " + client1.getPhone());
        System.out.println("Email : " + client1.getEmail());

        Compte compte1 = new Compte(1001, "2024-01-01", "2024-11-07", "DH");

        System.out.println("\nInformations du compte :");
        System.out.println("Numéro de compte : " + compte1.getNumCompte());
        System.out.println("Date de création : " + compte1.getDateCreation());
        System.out.println("Dernière mise à jour : " + compte1.getDateUpdate());
        System.out.println("Devise : " + compte1.getDevise());

        client1.setNom("Ahmed");
        compte1.setDateUpdate("2024-11-08");

        System.out.println("\nInformations mises à jour :");
        System.out.println("Nom du client mis à jour : " + client1.getNom());
        System.out.println("Date de mise à jour du compte : " + compte1.getDateUpdate());
    }
        }


package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Client {
    private int numClient;
    private String nom;
    private String prenom;
    private String adresse;
    private String phone;
    private String email;
    private String pays; // Pour déterminer le type de transaction selon les critères

    public Client(int numClient, String nom, String prenom, String adresse, String phone, String email, String pays) {
        this.numClient = numClient;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.phone = phone;
        this.email = email;
        this.pays = pays;
    }

    public int getNumClient() { return numClient; }
    public void setNumClient(int numClient) { this.numClient = numClient; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPays() { return pays; }
    public void setPays(String pays) { this.pays = pays; }

    public String toJson() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }

    public static Client fromJson(String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Client.class);
    }
}

package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Date;

public class Compte {
    private int numCompte;
    private Date dateCreation;
    private Date dateUpdate;
    private String devise;

    public Compte(int numCompte, Date dateCreation, Date dateUpdate, String devise) {
        this.numCompte = numCompte;
        this.dateCreation = dateCreation;
        this.dateUpdate = dateUpdate;
        this.devise = devise;
    }

    public int getNumCompte() { return numCompte; }
    public void setNumCompte(int numCompte) { this.numCompte = numCompte; }

    public Date getDateCreation() { return dateCreation; }
    public void setDateCreation(Date dateCreation) { this.dateCreation = dateCreation; }

    public Date getDateUpdate() { return dateUpdate; }
    public void setDateUpdate(Date dateUpdate) { this.dateUpdate = dateUpdate; }

    public String getDevise() { return devise; }
    public void setDevise(String devise) { this.devise = devise; }

    public String toJson() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }

    public static Compte fromJson(String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Compte.class);
    }
}

package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Banque {
    private int id;
    private String pays;


    public Banque(int id, String pays) {
        this.id = id;
        this.pays = pays;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getPays() { return pays; }
    public void setPays(String pays) { this.pays = pays; }

    public String toJson() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }

    public static Banque fromJson(String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Banque.class);
    }
}

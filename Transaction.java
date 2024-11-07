import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Date;

public class Transaction {
    public enum Type { VIRIN, VIREST, VIRMULTA, VIRCHAK }

    private Type type;
    private Date timestamp;
    private String reference;

    public Transaction(Type type, Date timestamp, String reference) {
        this.type = type;
        this.timestamp = timestamp;
        this.reference = reference;
    }

    public Type getType() { return type; }
    public void setType(Type type) { this.type = type; }

    public Date getTimestamp() { return timestamp; }
    public void setTimestamp(Date timestamp) { this.timestamp = timestamp; }

    public String getReference() { return reference; }
    public void setReference(String reference) { this.reference = reference; }

    public static Type determinerTypeTransaction(Client client1, Client client2, Banque banque1, Banque banque2) {
        if (banque1.equals(banque2)) {
            if (client1.getPays().equals(client2.getPays())) {
                return Type.VIRIN;
            } else {
                return Type.VIREST;
            }
        } else if (client1.getPays().equals(client2.getPays())) {
            return Type.VIRMULTA;
        } else {
            return Type.VIRCHAK;
        }
    }

    public String toJson() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }

    public static Transaction fromJson(String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Transaction.class);
    }
}


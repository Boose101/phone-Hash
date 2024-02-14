import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int hashCode() {
        String con = name + "-" + phoneNumber;  
            try {
                byte[] bytesOfMessage = con.getBytes("UTF-8");
                MessageDigest sha = MessageDigest.getInstance("SHA-256");
                byte[] message = sha.digest(bytesOfMessage);
                ByteBuffer buffer = ByteBuffer.wrap(message);
                int hashNum = buffer.getShort();
                return hashNum;
            } catch (Exception e) {
                e.printStackTrace();
            }

        return -1;
    }
}

class phoneBook{
    public static void main(String[] args) {
        Contact fergus = new Contact("Fergus", "911");
        int hash = fergus.hashCode();
        System.out.println("Fergus Hash: " + hash);
        Contact jackob = new Contact("Jackob", "711");
        int jHash = jackob.hashCode();
        System.out.println("Jackob Hash: " + jHash);

        Contact vir = new Contact("Vir", "917");
        int vHash = vir.hashCode();
        System.out.println("Vir Hash: " + vHash);

        Contact darren = new Contact("Darren", "646");
        int dHash = darren.hashCode();
        System.out.println("Darren Hash: " + dHash);




    }
}

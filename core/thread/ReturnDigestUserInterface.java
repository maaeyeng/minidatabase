import javax.xml.bind.*;
import jakarta.xml.bind.DatatypeConverter;
public class ReturnDigestUserInterface {
    public static void main(String[] args) {
        for (String filename : args) {
        // Calculate the digest
        ReturnDigest dr = new ReturnDigest(filename);
        dr.start();
        // Now print the result
        StringBuilder result = new StringBuilder(filename);
        result.append(": ");
        byte[] digest = dr.getDigest();
        result.append(DatatypeConverter.printHexBinary(digest)); // Error  DatatypeConverter 
        System.out.println(result);   // DatatypeConverter cannot be resolved
        }
        }
    
}

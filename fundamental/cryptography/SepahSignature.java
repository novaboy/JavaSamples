package fundamental.cryptography;

import fundamental.calendar.JalaliCalendar;
import sun.misc.BASE64Encoder;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.sql.Timestamp;

public class SepahSignature {
    public static void main(String[] args) throws Exception {

        int merchantCode = 115 ;
        int terminalCode = 12;
        int amount = 2000000;
        String redirectAddress = "http://merchantsite.com/redirectAddress.aspx";
        Timestamp timeStamp = new Timestamp(System.currentTimeMillis());

        int invoiceNumber = 1949945;
        //JalaliCalendar invoiceDate = new JalaliCalendar();

        String invoiceDate = "1387/10/13 12:45:32";
        String mobile ="9124442233";
        String action = "1003" ;
        KeyPair keyPair = getKeyPair();
        System.out.println(timeStamp);

        String str = "#" + merchantCode +"#" + terminalCode + "#" + invoiceNumber +"#" + invoiceDate + "#" + amount + "#" + redirectAddress + "#" + action + "#" + timeStamp + "#" ;
        byte[] data = str.getBytes("UTF8");

        Signature sig = Signature.getInstance("SHA1WithRSA");
        sig.initSign(keyPair.getPrivate());
        sig.update(data);
        byte[] signatureBytes = sig.sign();
        System.out.println("Signature:" + new BASE64Encoder().encode(signatureBytes));

        sig.initVerify(keyPair.getPublic());
        sig.update(data);

        System.out.println(sig.verify(signatureBytes));
    }

    private static KeyPair getKeyPair() throws NoSuchAlgorithmException {
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(1024);
        return kpg.genKeyPair();
    }
}
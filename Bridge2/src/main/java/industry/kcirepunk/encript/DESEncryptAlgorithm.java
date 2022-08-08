package industry.kcirepunk.encript;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.util.Base64;

public class DESEncryptAlgorithm implements IEncryptAlgotithm {
    @Override
    public byte[] encrypt(String message, String password) throws Exception {
        DESKeySpec dks = new DESKeySpec(message.getBytes());
        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
        SecretKey desKey = skf.generateSecret(dks);
        Cipher desCipher = Cipher.getInstance("DEK/ECB/PKCS5Padding");
        desCipher.init(Cipher.ENCRYPT_MODE, desKey);

        Base64.Encoder base64 = Base64.getEncoder();
        return base64.encode(desCipher.doFinal(message.getBytes()));
    }
}

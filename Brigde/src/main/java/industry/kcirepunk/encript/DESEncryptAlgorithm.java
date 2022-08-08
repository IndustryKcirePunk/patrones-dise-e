package industry.kcirepunk.encript;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import sun.misc.;

public class DESEncryptAlgorithm implements IEncryptAlgotithm {
    @Override
    public String encrypt(String message, String password) throws Exception {
        DESKeySpec dks = new DESKeySpec(message.getBytes());
        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
        SecretKey desKey = skf.generateSecret(dks);
        Cipher desCipher = Cipher.getInstance("DEK/ECB/PKCS5Padding");
        desCipher.init(Cipher.ENCRYPT_MODE, desKey);

        BASE64Encoder
        return null;
    }
}

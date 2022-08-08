package industry.kcirepunk.encript;

public class NoEncryptAlgorithm implements IEncryptAlgotithm {
    @Override
    public String encrypt(String message, String password) throws Exception {
        return message;
    }
}

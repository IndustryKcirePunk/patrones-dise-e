package industry.kcirepunk.encript;

public interface IEncryptAlgotithm {
    public byte[] encrypt(String message, String password) throws Exception;
}

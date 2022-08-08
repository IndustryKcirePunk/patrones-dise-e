package industry.kcirepunk;

import industry.kcirepunk.encript.DESEncryptAlgorithm;

public class BridgeMain {
    public static void main(String[] args) throws Exception {
        byte[] resp = new DESEncryptAlgorithm().encrypt("Eick", "Torres");
        System.out.println(resp);
    }
}

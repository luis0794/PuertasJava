package logica;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

public class Encriptacion {
	public String Encriptar(String texto) {
		byte[] encodedBytes = Base64.encodeBase64(texto.getBytes());
		return new String(encodedBytes);
	}
	
	public String Desencriptar(String textoEncriptado) throws Exception {
		byte[] decodedBytes = Base64.decodeBase64(textoEncriptado);
		return new String(decodedBytes);
		
	}
}

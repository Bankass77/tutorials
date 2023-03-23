package certification.tutorials.encryption;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;

public class Exercice02 {

	public static void main(String[] args) {
		try {
			String plainText = "My secret message";

			String algorithm = "RSA";

			// Because RSA is an asymmetric form of key encryption
			// you need to generate a key
			// pair instead of a key.
			KeyPair keyPair = KeyPairGenerator.getInstance(algorithm).generateKeyPair();

			String transformation = algorithm + "/ECB/PKCS1Padding";

			Cipher cipher = Cipher.getInstance(transformation);
			cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());

			byte[] cipherText = new byte[cipher.getOutputSize(plainText.getBytes().length)];
			int encryptedLength = cipher.update(plainText.getBytes(), 0, plainText.getBytes().length, cipherText);
			cipher.doFinal(cipherText, encryptedLength);
			System.out.println("cipherText : " + cipherText);

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (ShortBufferException e) {
			e.printStackTrace();
		}

	}

}

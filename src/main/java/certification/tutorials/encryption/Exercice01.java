package certification.tutorials.encryption;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;

public class Exercice01 {

	public static void main(String[] args) {
		try {
			String algorithm = "AES";
			Key privateKey = KeyGenerator.getInstance(algorithm).generateKey();
			String transformation = algorithm + "/ECB/NoPadding";

			// String transformation= algorithm + "/ECB/PKCS5Padding";

			Cipher cipher = Cipher.getInstance(transformation);

			cipher.init(Cipher.ENCRYPT_MODE, privateKey);

			String plainText = "This is 16 bytes" /* "My secret message" */;
			byte[] cipherText = new byte[cipher.getOutputSize(plainText.getBytes().length)];

			int encryptedLengh = cipher.update(plainText.getBytes(), 0, plainText.getBytes().length, cipherText);
			cipher.doFinal(cipherText, encryptedLengh);
			System.out.println("Cipher : " + cipher.toString());
			System.out.println("CipherText: " + cipherText.toString());

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

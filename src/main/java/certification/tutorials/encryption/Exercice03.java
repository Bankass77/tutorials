package certification.tutorials.encryption;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

public class Exercice03 {

	public static void main(String[] args) {
		try {

			String algorithm = "AES";

			Key secretKey = KeyGenerator.getInstance(algorithm).generateKey();
			String transformation = algorithm + "/CBC/NoPadding";
			Cipher cipher = Cipher.getInstance(transformation);
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			String stringPath = System.getProperty("user.home") + "/javaTemp/res/plaintext.txt";
			Path pathToFile = Path.of(stringPath);
			File plaintext = pathToFile.toFile();

			System.out.println("plaintext: " + plaintext.toString());
			String stringPath2 = System.getProperty("user.home") + "/javaTemp/res/ciphertext.txt";
			File ciphertext = Path.of(stringPath2).toFile();
			System.out.println("CipherText: " + ciphertext.toString());

			if (ciphertext.exists()) {
				ciphertext.delete();
			}
			try (FileInputStream fileInputStream = new FileInputStream(plaintext);
					FileOutputStream fileOutputStream = new FileOutputStream(ciphertext);
					CipherOutputStream cipherOutputStream = new CipherOutputStream(fileOutputStream, cipher)) {

				fileOutputStream.write(cipher.getIV());

				byte[] buffer = new byte[1024];
				int lengh;
				while ((lengh = fileInputStream.read(buffer)) > 0) {
					cipherOutputStream.write(buffer, 0, lengh);
				}

			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

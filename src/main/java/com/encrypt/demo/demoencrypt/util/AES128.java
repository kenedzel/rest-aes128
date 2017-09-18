package com.encrypt.demo.demoencrypt.util;


import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

public class AES128 {

    private static final String SALT = "SALT";
    private static final String IV = "IV";
    private static final String PASSWORD = "Secret";
    private static final int PASSWORD_ITERATIONS = 10;
    private static final int KEY_SIZE = 128;

    public static SecretKey getSecretKey(String data, byte[] saltBytes) {
        SecretKeyFactory secretKeyFactory;
        try {
            secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            PBEKeySpec pbeKeySpec = new PBEKeySpec(data.toCharArray(), saltBytes, PASSWORD_ITERATIONS, KEY_SIZE);
            SecretKey tmp = secretKeyFactory.generateSecret(pbeKeySpec);
            SecretKey secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");
            return secretKey;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String encrypt(String data) throws IOException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException, InvalidKeySpecException {
        byte[] saltBytes = SALT.getBytes("UTF-8");
        byte[] IVBytes = IV.getBytes("UTF-8");

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, getSecretKey(PASSWORD, DatatypeConverter.parseHexBinary(SALT)), new IvParameterSpec(DatatypeConverter.parseHexBinary(IV)));
        byte[] cipherText  = cipher.doFinal(data.getBytes("UTF-8"));

        return new String(Base64.getEncoder().encode(cipherText));
    }
}

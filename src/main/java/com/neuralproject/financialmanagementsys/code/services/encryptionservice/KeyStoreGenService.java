package com.neuralproject.financialmanagementsys.code.services.encryptionservice;


import org.springframework.stereotype.Service;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

@Service
public class KeyStoreGenService {


    private Cipher cipher;

    private KeyStore keyStore ;

    KeyStoreGenService(){
        try {
            this.cipher = Cipher.getInstance("AES");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }
    }


    public boolean generateKeyStore(String secreteKeyOnFile, String username) throws KeyStoreException {
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        try (FileInputStream fileInputStream =  new FileInputStream(new File("")) ) {
            keyStore.setEntry("secretekey" ,
                    new KeyStore.SecretKeyEntry(KeyGenerator.getInstance("PKC12").generateKey()),
                    new KeyStore.PasswordProtection("".toCharArray()));
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return true ;

    }


    public KeyStore getNewKeyStore() throws KeyStoreException {
        return KeyStore.getInstance("PKC12");
    }

}

package com.encrypt.demo.demoencrypt.controller;

import com.encrypt.demo.demoencrypt.model.Response;
import com.encrypt.demo.demoencrypt.util.AES128;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.*;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

@CrossOrigin
@RestController
public class EncryptController {

    @RequestMapping(value = "/encrypt", params = {"data"}, method = RequestMethod.GET)
    public ResponseEntity<Response> encrypt(@RequestParam("data") String data) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException, InvalidKeySpecException {
        Response response = new Response();
        response.setData(AES128.encrypt(data));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

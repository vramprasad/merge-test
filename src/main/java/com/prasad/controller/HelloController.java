package com.prasad.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import  org.springframework.web.bind.annotation.*;
import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
public class HelloController {

    @RequestMapping(value="/healthcheck",method = RequestMethod.GET, produces={MediaType.TEXT_PLAIN_VALUE})
    @ResponseBody
    public ResponseEntity<String> healthcheck() {
        // Added this to check fetch or pull
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String responseText = "merge-test-api Healthcheck @ "+ timeStamp+" - All OK";
        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.TEXT_PLAIN).body(responseText.toString());
    }



}

package com.virus.controller;

import com.virus.service.UploadImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class _Controller {
    @Autowired
    private UploadImageService uploadImageService;

    @PostMapping("/upload-image")
    public ResponseEntity uploadImage(@RequestParam("file") MultipartFile file){
        System.out.println(file.getSize());

        uploadImageService.uploadImage(file);

        return ResponseEntity.ok("Image Upload Successfully");
    }
}

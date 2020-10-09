package com.virus.service;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class UploadImageService {

    public final String IMAGE_URL = "C:\\Users\\Virus\\Downloads\\SpringBoot_UploadImage\\SpringBoot_UploadImage\\src\\main\\resources\\static";

    public void uploadImage(MultipartFile file){
        try{
            Files.copy(file.getInputStream(),Paths.get(IMAGE_URL+"/"+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

package com.hendisantika.uploaddownload;

import com.hendisantika.uploaddownload.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class SpringBootUploadDownloadFileRestApiExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUploadDownloadFileRestApiExampleApplication.class, args);
    }
}

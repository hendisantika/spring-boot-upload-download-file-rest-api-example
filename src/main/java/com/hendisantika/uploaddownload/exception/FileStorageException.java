package com.hendisantika.uploaddownload.exception;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-upload-download-file-rest-api-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-11-28
 * Time: 22:45
 * To change this template use File | Settings | File Templates.
 */
public class FileStorageException extends RuntimeException {
    public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
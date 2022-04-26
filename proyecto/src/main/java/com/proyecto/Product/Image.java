package com.proyecto.Product;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.springframework.web.multipart.MultipartFile;

public class Image {

    public static void saveFile(String uploadDir, String fileName, MultipartFile multipartFile) throws IOException {
        String dir = System.getProperty("user.dir") + "/src/main/resources/static" + uploadDir;

        Path uploadPath = Paths.get(dir);

        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }

        try ( InputStream inputStream = multipartFile.getInputStream()) {
            Path filePath = uploadPath.resolve(fileName);
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioe) {
            throw new IOException("Could not save image file: " + fileName, ioe);
        }
    }

    public static void deleteFile(String uploadDir) throws IOException {
        try {
            String dir = System.getProperty("user.dir") + "/src/main/resources/static" + uploadDir;
            Files.delete(Paths.get(dir));
        } catch (IOException x) {
            throw new IOException("Could not delete image file: " + uploadDir, x);
        }

    }
}

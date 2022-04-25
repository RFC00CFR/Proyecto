package com.proyecto.Product;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.springframework.web.multipart.MultipartFile;

public class Image {

    public static void saveImg(String direccion, String nombre, MultipartFile archivoMulti) throws IOException {
        Path uploadPath = Paths.get(direccion);

        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }

        try ( InputStream inputStream = archivoMulti.getInputStream()) {
            Path filePath = uploadPath.resolve(nombre);


            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioe) {
            throw new IOException("Could not save image file: " + nombre, ioe);
        }
    }
}

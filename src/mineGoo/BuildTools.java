package mineGoo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BuildTools {

    private static Path localPath = Paths.get(System.getProperty("user.home"),"server", "buildtools");

    public static void buildDirectory() {
        try {
            Files.createDirectories(localPath);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}

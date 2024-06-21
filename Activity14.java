package activities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity14 {
	public static void main(String[] args) {
        try {
            // Step 1: Create a new text file using the default File Class
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Step 2: Write some text into the text file
            String content = "This is an example text.";
            FileUtils.writeStringToFile(file, content, "UTF-8");
            System.out.println("Written to file: " + content);

            // Step 3: Use FileUtils.getFile() to get the file object
            FileUtils.getFile(file.getAbsolutePath());

            // Step 4: Read the file using readFileToString() method
            String fileContent = FileUtils.readFileToString(file, "UTF-8");
            System.out.println("Read from file: " + fileContent);

            // Step 5: Create a new directory named 'resources'
            File dir = new File("resources");
            if (!dir.exists()) {
                dir.mkdir();
                System.out.println("Directory created: " + dir.getName());
            }

            // Step 6: Copy the text file into this directory using copyFileToDirectory()
            FileUtils.copyFileToDirectory(file, dir);
            System.out.println("File copied to directory: " + dir.getName());

            // Step 7: Read data from the copied file using FileUtils class
            File copiedFile = new File(dir, "example.txt");
            String copiedFileContent = FileUtils.readFileToString(copiedFile, "UTF-8");
            System.out.println("Read from copied file: " + copiedFileContent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
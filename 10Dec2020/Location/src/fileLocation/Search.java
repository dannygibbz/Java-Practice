package fileLocation;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
 
public class Search
{
    public static void main(String[] args) throws IOException
    {
        Stream<Path> files = Files.walk(Paths.get("./src/fileLocation"));
         
        files.forEach(System.out::println);
         
        files.close();
    }
}


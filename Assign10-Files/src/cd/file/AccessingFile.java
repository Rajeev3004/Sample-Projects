package cd.file;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;

public class AccessingFile 
{
	public static void main(String[] args) throws Exception{
		String filepath="C:\\Users\\rajeev sharma\\Downloads\\Assignment4.txt";		
		SimpleDateFormat cd=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Path path=Paths.get(filepath);
		BasicFileAttributes att=Files.readAttributes(path, BasicFileAttributes.class);
		System.out.println("File Created at: "+cd.format(att.creationTime().toMillis()));
		System.out.println("File last Modified at: "+cd.format(att.lastModifiedTime().toMillis()));
		System.out.println("File last Accessed at: "+cd.format(att.lastAccessTime().toMillis()));
	}

}

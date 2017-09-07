import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;

import javax.activation.MimetypesFileTypeMap;
public class DownloadfromURL {

	public static void main(String[] args) {
		
		URL dl= null;
		File f= null;
		int count = 1;
		String filename = null;
		String readurl = null;
		try{
			f = new File("C:/Users/jagdale/Desktop/ebooks/listofebook.txt");
			//dl = new URL("https://msdnshared.blob.core.windows.net/media/2017/07/Ligman_eBooks_2017.txt");
			//org.apache.commons.io.FileUtils.copyURLToFile(dl, f);
			FileReader read = new FileReader(f);
			BufferedReader br = new BufferedReader(read);
			
			while ((readurl=br.readLine()) != null){
				filename = "Microsoft_free_E-book" + Integer.toString(count);
				f = new File("C:/Users/jagdale/Desktop/ebooks/"+filename);
				dl = new URL(readurl);
				
				org.apache.commons.io.FileUtils.copyURLToFile(dl, f);
				// =  Files.probeContentType(f.toPath());
				//System.out.println(filetype);
				
				URLConnection con = dl.openConnection();
				String filetype = con.getContentType();
				
				 final MimetypesFileTypeMap fileTypeMap = new MimetypesFileTypeMap();
				 System.out.println(fileTypeMap.getContentType(f));
				//FileReader read1 = new  FileReader(f);
				//BufferedReader br1 = new BufferedReader(read1);
				
				System.out.println(readurl);
				System.out.println(filetype);
				count++;
				
			}
			System.out.println(count);
		}
		catch(Exception e){
		e.printStackTrace();
		}
	}
}

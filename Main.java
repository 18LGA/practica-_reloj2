import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int n = Integer.parseInt(br.readLine().trim());
	
	for (int i = 0; i < n; i++) {
	    String hora = br.readLine().trim();
	    String[] partes = hora.split(":");
	    
	    int hh = Integer.parseInt(partes[0]);
	    int mm = Integer.parseInt(partes[1]);
	    
	    int totalReflejo = hh * 60 + mm;
	    int totalReal = 1440 - totalReflejo;
	    
	    if (totalReal == 1440) {
		System.out.println("12:00");
	    } else {
		int hReal = totalReal / 60;
		int mReal = totalReal % 60;
		
	       
		String hStr = (hReal < 10) ? "0" + hReal : "" + hReal;
		String mStr = (mReal < 10) ? "0" + mReal : "" + mReal;
		
		System.out.println(hStr + ":" + mStr);
	    }
	}
	
	br.close();
    }
}

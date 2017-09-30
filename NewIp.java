
import java.net.InetAddress;
import java.net.UnknownHostException;



/**
 *
 * @author thanosbalas
 */
public class NewIp {
    
    public static void main(String[] args) {

	  InetAddress ip;
	  try {

		ip = InetAddress.getLocalHost();
		System.out.println(“New IP address : " + ip.getHostAddress());

	  } catch (UnknownHostException e) {

		e.e.printStackTrace();

	  }

	}

}



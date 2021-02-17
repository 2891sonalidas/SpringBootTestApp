package in.sonali;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentRunner implements CommandLineRunner {
	private static Logger log = LoggerFactory.getLogger(StudentRunner.class); 
	@Override
	public void run(String... args) throws Exception {
		int a=10;
		try {
			log.info("Stared");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		System.out.println("WEL COME TO INDIA"+a);
		log.info("End");

	}

}

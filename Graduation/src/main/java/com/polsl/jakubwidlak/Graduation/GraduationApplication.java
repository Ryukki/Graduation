import Repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraduationApplication implements CommandLineRunner{

	@Autowired
	RatingRepository ratingRepository;



	public static void main(String[] args) {
		SpringApplication.run(GraduationApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

	}
}

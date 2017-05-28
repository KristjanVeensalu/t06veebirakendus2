package Kristjan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class rakendus{

	@RequestMapping("/pyramiid")
	public String pyramiid(double alus, double korgus, double kKorgus){
		double pohjaPindala = 0;
		double kuljePindala = 0;
		double ruumala = 0;
		double taisPindala = 0;

		kuljePindala = ((alus*kKorgus)/2)*4;
		pohjaPindala = (alus*alus)/2;
		taisPindala = kuljePindala+pohjaPindala;
		ruumala = pohjaPindala*korgus;
		return "Pindala on " + taisPindala + " Pohjapindala on " + pohjaPindala + " Kuljepindala on " + kuljePindala + "Ruumala on " + ruumala;
	}
	public static void main(String [] arg){
		SpringApplication.run(rakendus.class, arg);
	}
}
//scl enable rh-maven33 bash
//mvn package
//java -Dserver.port=4545 -jar target/app1.jar
//http://greeny.cs.tlu.ee:4545/tervita?eesnimi=Juku
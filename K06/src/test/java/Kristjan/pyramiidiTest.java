package Kristjan;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)

public class pyramiidiTest{
	@Autowired
	private TestRestTemplate restTemplate;
	@Test
	public void rakendus(){
		assertEquals("Pindala on 32 Pohjapindala on 22 Kuljepindala on 33 Ruumala on 203", this.restTemplate.getForObject("/rakendus?alus=5&korgus=1&kKorgus=2", String.class));
		}
}
package com.gentilmente.fierachallenge;

import com.gentilmente.fierachallenge.domain.Link;
import com.gentilmente.fierachallenge.service.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@SpringBootTest
class FierachallengeApplicationTests {
	@Autowired
	private LinkService linkService;
	private final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@Test
	void contextLoads() {
	}

	@Test
	void testSave() throws Exception {

		Link c = new Link();
		c.setUrl_target("http://example.com");
		Timestamp date = new Timestamp(DATE_TIME_FORMAT.parse("2020-10-18 00:00:00").getTime());
		c.setExpiration(date);
		c.setClicks(4);
		c.setShortened("http://localhost:8080/l/b");
		c.setToken("1234567890");
		c.setValid(1);
		linkService.save(c);

	}
}

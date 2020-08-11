package com.example.cakefactory;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

@SpringBootTest(webEnvironment = DEFINED_PORT)
class CakefactoryApplicationTests {

	private WebClient webClient;

	@BeforeEach
	public void init() throws Exception {
		webClient = new WebClient();
	}

	@AfterEach
	public void close() throws Exception {
		webClient.close();
	}

	@Test
	void contextLoads() {
	}

	@Test
	public void pageTitleIsOk()
			throws Exception {
		HtmlPage page = webClient.getPage("http://localhost:8080/");
		Assertions.assertEquals("Shop Homepage - Cake Factory",
				page.getTitleText());
	}
}

package com.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.model.NewsPojo;

@Component
public class NewsReader implements CommandLineRunner{

	private static void readNews(){
		RestTemplate restTemp= new RestTemplate();
		NewsPojo news=restTemp.getForObject("https://api.currentsapi.services/v1/latest-news/"+ 
				"    -G -d language=en/" + 
				"    -d apiKey=_WJA3BHdOwxQXcYcfWMJF3GI1N6NDY7YKo4M2ufYbvF1Qs-6/", NewsPojo.class);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		readNews();		
	}
}

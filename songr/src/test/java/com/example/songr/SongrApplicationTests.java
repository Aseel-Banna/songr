package com.example.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void albumTest(){

		Album s = new Album();
		s.setTitle("Zay Ma Enti");
		s.setArtist("Amr Diab");
		s.setSongCount(5);
		s.setLength(3600);
		s.setImageUrl("https://i.ytimg.com/vi/NYntUyksG5E/maxresdefault.jpg");
		assertThat(s.getTitle()).isEqualTo("Zay Ma Enti");
		assertThat(s.getArtist()).isEqualTo("Amr Diab");
		assertThat(s.getSongCount()).isEqualTo(5);
		assertThat(s.getLength()).isEqualTo(3600);
		assertThat(s.getImageUrl()).isEqualTo("https://i.ytimg.com/vi/NYntUyksG5E/maxresdefault.jpg");
	}

	@Test
	void testConstructor(){
		Album s = new Album();
		assertThat(s instanceof Album);

	}

}
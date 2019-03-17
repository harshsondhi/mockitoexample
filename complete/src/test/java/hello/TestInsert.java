package hello;

import java.util.ArrayList;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@TestConfiguration
public class TestInsert {
	@Bean
	public String myName() {
		return "HARSH";
	}

	@Bean
	public ArrayList<String> myArraylist() {
		ArrayList<String> ret = new ArrayList<String>();
		ret.add("harsh");
		ret.add("sondhi");
		ret.add("arron");
		return ret;
	}

}

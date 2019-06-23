package springDemo;

import java.util.Random;


import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	private String[] data = {
		"akldjksjdhjasdhjasdlad",
		"dlsadkajslkdjadklajdk",
		"jjjjiiiiiasdasjdjasdkja"
			
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(data.length);
		
		String f = data[index];
		
		return f;
	}

}

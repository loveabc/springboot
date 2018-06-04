package springboot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.imoo.cservice.HelloService;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloService.class)
public class HelloTest {
	
	@Autowired
	private HelloService helloService;
	
	@Test
	public void testLen() {
		int len = helloService.len();
		Assert.assertEquals(10, len);
	}

}

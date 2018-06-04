package springboot;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.imooc.controller.HelloController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloController.class)
@AutoConfigureMockMvc
public class IndexControllerTest {
	@Autowired
	private MockMvc mvc;

	@Test
	public void testHelloController() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().string(equalTo("hello")))
				.andExpect(header().string("abc", "xyz"));
				
	}

}

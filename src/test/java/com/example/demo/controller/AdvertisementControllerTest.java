package com.example.demo.controller;

import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

import com.example.demo.models.Advertisement;

// UNIT-3 (CREATING AUTOMATED COMPONENT TESTS)
@RunWith(SpringJUnit4ClassRunner.class) // same to @RunWith(SpringRunner.class)
@ContextConfiguration // (classes = { WebAppContextConfig.class })
@WebAppConfiguration
public class AdvertisementControllerTest {

	@InjectMocks
	private WebApplicationContext applicationContext; // reused for each test
//	private MockMvc mockMvc;

//	@Before
//	public void setUp() throws Exception {
//		Filter springSecurityFilterChain = null;
//		this.mockMvc = MockMvcBuilders.webAppContextSetup(applicationContext).addFilter(springSecurityFilterChain)
//				.build();
//	}

//	@Test
//	public void readById() throws Exception {
//		String id;
//		mockMvc.perform(buildGetRequest(id)).andExpect(status().isOk())
//				.andExpect(content().contentType(APPLICATION_JSON_UTF8)).andExpect(jsonPath("$.title", is("buy me"))); // com.jayway.jsonpath:json-path
//	}
//
//	private MockHttpServletRequestBuilder buildGetRequest(String id) throws Exception {
//		return get("api/v1.0/ads/" + id).header(AUTHORIZATION, jwt);
//	}

	public static final String PATH = "/api/v1/ads";
	public AdvertisementController controller = new AdvertisementController();

	@Test
	public void getAllAdvertisements() {
		controller.advertisements();
	}

	@Test
	public void getAdvertisement() {
		controller.advertisementById(1);
	}

	@Test
	public void addAdvertisement() throws URISyntaxException {
		Advertisement advertisement = new Advertisement();
		controller.add(advertisement);
	}
}

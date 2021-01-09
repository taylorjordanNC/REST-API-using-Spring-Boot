//package com.example.multimodule.service;
//
//import com.example.multimodule.repository.GoodLocation;
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.util.List;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(MockitoJUnitRunner.class)
//@SpringBootTest(classes = GoodLocationController.class)
//@AutoConfigureMockMvc
//public class GoodLocationControllerTest {
//
//    GoodLocation mockLocation = new GoodLocation(31, "Good Restaurant", "123 Restaurant Ave", "Durham", "North Carolina",
//            "12948", 0.0, 0.0, "", "", "Local Restaurant", 5, true);
//
//    String mockLocationJson = "{\"_id\":31,\"name\":\"Good Restaurant\",\"address\":\"123 Restaurant Ave\",\"city\":\"Durham\",\"state\":\"North Carolina\",\"zipcode\":12948,\"lat\":0.0,\"lng\":0.0,\"phone_number\":\"\",\"website\":\"\",\"category\":\"Local Restaurant\",\"covid_rating\":5,\"minority_owned\":\"TRUE\"}";
//
//    MockMvc mvc;
//
//    @Before
//    public void setUp(){
//        mvc = MockMvcBuilders.standaloneSetup(new GoodLocationController()).build();
//    }
//
//    @Test
//    public void testGetAllGoodLocations() throws Exception {
//        MvcResult result = mvc.perform(get("/findgood/all"))
//                .andExpect(status().isOk())
//                .andReturn();
//        ObjectMapper mapper = new ObjectMapper();
//        List<GoodLocation> actualLocations = mapper.readValue(result.getResponse().getContentAsString(), new TypeReference<>() {});
//        Assert.assertNotNull(actualLocations);
//    }
//
//    @Test
//    public void testGetLocationByCity(){
//
//    }
//
//    @Test
//    public void createGoodLocation(){
//
//    }
//
//    @Test
//    public void updateGoodLocation(){
//
//    }
//
//    @Test
//    public void deleteLocationByName(){
//
//    }
//
//    @Test
//    public void deleteLocationById(){
//
//    }
//    @After
//    public void tearDown(){ }
//
//}

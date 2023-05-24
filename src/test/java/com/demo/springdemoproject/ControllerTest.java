//package com.demo.springdemoproject;
//import com.demo.springdemoproject.controller.UserController;
//import com.demo.springdemoproject.model.Users;
//import com.demo.springdemoproject.repository.UserJPARepository;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.*;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.BDDMockito;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.boot.test.json.JacksonTester;
//import org.springframework.http.MediaType;
//import org.springframework.mock.web.MockHttpServletResponse;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//@ExtendWith(MockitoExtension.class)
//public class ControllerTest {
//    private MockMvc mvc;
//    @Mock
//    private UserJPARepository jparepo;
//
//    @InjectMocks
//    private UserController usercontroller;
//
//    private JacksonTester<Users> jsonUser;
//
//    @BeforeEach
//    public void setup() {
//        // We would need this line if we would not use the MockitoExtension
//        // MockitoAnnotations.initMocks(this);
//        // Here we can't use @AutoConfigureJsonTesters because there isn't a Spring context
//        JacksonTester.initFields(this, new ObjectMapper());
//        // MockMvc standalone approach
//        mvc=MockMvcBuilders.standaloneSetup(usercontroller).build();
////        mvc = MockMvcBuilders.standaloneSetup(superHeroController)
////                .setControllerAdvice(new SuperHeroExceptionHandler())
////                .addFilters(new SuperHeroFilter())
////                .build();
//    }
//
//    @Test
//    public void TestData()throws Exception {
//     BDDMockito.given(jparepo.findByName("John")).willReturn(new Users("John","npprpoc",1000));
//        // when
//        MockHttpServletResponse response = mvc.perform()
//    }
//
//
//}

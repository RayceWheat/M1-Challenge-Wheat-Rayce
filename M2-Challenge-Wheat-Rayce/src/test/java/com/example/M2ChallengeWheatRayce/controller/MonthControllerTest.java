package com.example.M2ChallengeWheatRayce.controller;

import com.example.M2ChallengeWheatRayce.models.Month;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MonthController.class)
public class MonthControllerTest {

    //Copied from class code (MockMVC - Store)
    @Autowired MockMvc mockMvc;

    //Object mapper used to convert Java objects to Json
    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldReturnMonthByNumber() throws Exception {
        //Arrange
        Month february = new Month("February", 2);

        String inputJson = mapper.writeValueAsString(february);

        //Act
        mockMvc.perform(
                get("/month/2")
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print()) // Assert
                .andExpect(content().json(inputJson));
    }


    @Test
    public void shouldReturn422StatusCodeIfNumberIsNotBetween1And2 () throws Exception {
        mockMvc.perform(
                get("/month/0")
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());

    }


    @Test
    public void ShouldReturnRandomMonth() throws Exception {
        //Arrange
        List<Month> monthList = new ArrayList<>(Arrays.asList(
                new Month("January", 1),
                new Month("February", 2),
                new Month("March", 3),
                new Month("April", 4),
                new Month("May", 5),
                new Month("June", 6),
                new Month("July", 7),
                new Month("August", 8),
                new Month("September", 9),
                new Month("October", 10),
                new Month("November", 11),
                new Month("December", 12)
        ));

        String inputJson = mapper.writeValueAsString(monthList);

        //Act
        mockMvc.perform(
                get("/randomMonth")
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print());
    }

}

package com.example.M2ChallengeWheatRayce.controller;

import com.example.M2ChallengeWheatRayce.models.MathRequest;
import com.example.M2ChallengeWheatRayce.models.MathSolution;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MathController.class)
public class MathControllerTest {

    @Autowired MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    //        Add:
//
//        URI: /add
//        HTTP Method: POST
//        Request Body: JSON object with operand1 and operand2
//        Response Body: MathSolution, where answer is sum of operand1 and operand2
//        Error: 422, if missing operand or if operands are not both numbers

    @Test
    public void ShouldAddOperand1andOperand2andReturnSum() throws Exception{
        // Arrange
        MathRequest inputObject = new MathRequest(5, 5);

        MathSolution outputObject = new MathSolution(5, 5, "add", 10);

        //Convert Java Object to Json
        String inputJson = mapper.writeValueAsString(inputObject);

        String outputJson = mapper.writeValueAsString(outputObject);


        //Act
                mockMvc.perform(
                post("/add")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));

    }

    @Test
    public void shouldReturn422StatusCodeIfOperandIsNotThere() throws Exception{
    //Arrange
        MathRequest inputObject = new MathRequest();

        //Convert object into Json

        String inputJson = mapper.writeValueAsString(inputObject);

        //Act
                mockMvc.perform(
                post("/add")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());

    }

    @Test
    public void shouldSubtractOperand1andOperand2() throws Exception{
        //Arrange
        MathRequest inputObject = new MathRequest(10, 5);

        MathSolution outputObject = new MathSolution(10, 5, "subtract", 5);

        //Convert object into Json
        String inputJson = mapper.writeValueAsString(inputObject);

        String outputJson = mapper.writeValueAsString(outputObject);

        //Act
        mockMvc.perform(
                post("/subtract")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void ShouldReturn422StatusCodeIfRequestBodyOperandsAreEmpty() throws Exception{
        {
            //Arrange
            MathRequest inputObject = new MathRequest();

            //Convert object into Json

            String inputJson = mapper.writeValueAsString(inputObject);

            //Act
            mockMvc.perform(
                            post("/subtract")
                                    .content(inputJson)
                                    .contentType(MediaType.APPLICATION_JSON)
                    )
                    .andDo(print())
                    .andExpect(status().isUnprocessableEntity());

        }
    }

    @Test
    public void ShouldMultiplyOperand1AndOperand2() throws Exception {
        //Arrange
        MathRequest inputObject = new MathRequest(10, 4);

        MathSolution outputObject = new MathSolution(10, 4,"multiply", 40);

        String inputJson = mapper.writeValueAsString(inputObject);

        String outputJson = mapper.writeValueAsString(outputObject);

        //Act
        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated()) //Assert
                .andExpect(content().json(outputJson));

    }

    @Test
    public void ShouldReturn422StatusCodeIfOperandIsNotThereForMultiplyRoute() throws Exception {
        //Arrange
        MathRequest inputObject = new MathRequest();

        String inputJson = mapper.writeValueAsString(inputObject);

        //Act
        mockMvc.perform(
                post("/multiply")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void ShouldDivideOperand1andOperand2() throws Exception{
        //Arrange
        MathRequest inputObject = new MathRequest(6, 2);

        MathSolution outputObject = new MathSolution(6, 2,"multiply", 3);

        String inputJson = mapper.writeValueAsString(inputObject);

        String outputJson = mapper.writeValueAsString(outputObject);

        //Act
        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated()) //Assert
                .andExpect(content().json(outputJson));

    }

    @Test
    public void ShouldReturn422StatusCodeIfOperandIsNotThereForDivideRoute() throws Exception {
        //Arrange
        MathRequest inputObject = new MathRequest();

        String inputJson = mapper.writeValueAsString(inputObject);

        //Act
        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }



}
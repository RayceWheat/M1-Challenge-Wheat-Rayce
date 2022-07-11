package com.example.M2ChallengeWheatRayce.controller;

import com.example.M2ChallengeWheatRayce.models.MathRequest;
import com.example.M2ChallengeWheatRayce.models.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class MathController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution addSolution(@RequestBody @Valid MathRequest mathRequest) {

        MathSolution mathSolutionAdd = new MathSolution();

        mathSolutionAdd.setOperand1(mathRequest.getOperand1());
        mathSolutionAdd.setOperand2(mathRequest.getOperand2());
        mathSolutionAdd.setOperation("add");

        int answer = mathSolutionAdd.getOperand1() + mathSolutionAdd.getOperand2();

        mathSolutionAdd.setAnswer(answer);

        return mathSolutionAdd;

    }

    @RequestMapping(value = "/subtract", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution subtractSolution(@RequestBody @Valid MathRequest mathRequest){
        MathSolution mathSolutionSubtract = new MathSolution();

        mathSolutionSubtract.setOperand1(mathRequest.getOperand1());
        mathSolutionSubtract.setOperand2(mathRequest.getOperand2());
        mathSolutionSubtract.setOperation("subtract");

        int answer = mathSolutionSubtract.getOperand1() - mathSolutionSubtract.getOperand2();

        mathSolutionSubtract.setAnswer(answer);

        return mathSolutionSubtract;

    }

    @RequestMapping(value = "/multiply", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution multiplySolution(@RequestBody @Valid MathRequest mathRequest){
        MathSolution mathMultiplySolution = new MathSolution();

        mathMultiplySolution.setOperand1(mathRequest.getOperand1());
        mathMultiplySolution.setOperand2(mathRequest.getOperand2());
        mathMultiplySolution.setOperation("multiply");

        int answer = mathMultiplySolution.getOperand1() * mathMultiplySolution.getOperand2();

        mathMultiplySolution.setAnswer(answer);

        return mathMultiplySolution;
    }


    @RequestMapping(value = "/divide", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution divideSolution(@RequestBody @Valid MathRequest mathRequest){
        MathSolution mathDivideSolution = new MathSolution();

        mathDivideSolution.setOperand1(mathDivideSolution.getOperand1());
        mathDivideSolution.setOperand2(mathRequest.getOperand2());
        mathDivideSolution.setOperation("divide");

        int answer = mathDivideSolution.getOperand1() / mathDivideSolution.getOperand2();

        mathDivideSolution.setAnswer(answer);

        return mathDivideSolution;
    }


}

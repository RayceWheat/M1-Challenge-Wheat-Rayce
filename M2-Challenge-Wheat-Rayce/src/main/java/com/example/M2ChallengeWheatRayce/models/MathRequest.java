package com.example.M2ChallengeWheatRayce.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;

public class MathRequest {

    @Min(value = 1, message = "You must give a number for operand1")
    private int operand1;

    @Min(value = 1, message = "You must give a number for operand2")
    private int operand2;


    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathRequest that = (MathRequest) o;
        return operand1 == that.operand1 && operand2 == that.operand2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand1, operand2);
    }

    public MathRequest() {
    }

    public MathRequest(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
}

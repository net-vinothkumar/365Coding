package com.DaysProgramming.ILoveProgramming.CodeWars;

public class BasicMathsOperation {
    public static void main(String[] args) {
        int firstInput = 1;
        int secondInput = 1;

        System.out.println(basicOperation("+", firstInput, secondInput));
        System.out.println(basicOperation("-", firstInput, secondInput));
        System.out.println(basicOperation("*", firstInput, secondInput));
        System.out.println(basicOperation("/", firstInput, secondInput));

        System.out.println(basicOperationUsingTernary("+", firstInput, secondInput));
    }

    private static int basicOperationUsingTernary(String operation, int firstInput, int secondInput) {
        return operation.equals("+") ? firstInput + secondInput
                : operation.equals("-") ? firstInput - secondInput
                : operation.equals("*") ? firstInput * secondInput
                : operation.equals("/") ? firstInput / secondInput : 0;

    }

    private static int basicOperation(String operation, int firstInput, int secondInput) {
        switch (operation) {
            case "+":
                return firstInput + secondInput;
            case "-":
                return firstInput - secondInput;
            case "*":
                return firstInput * secondInput;
            case "/":
                return firstInput / secondInput;
            default:
                return firstInput + secondInput;
        }
    }
}

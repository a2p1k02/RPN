package nodomain.a2p1k02.calculator;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Calculator {

    private ArrayList<Integer> nums;
    private String op;

    public Calculator() {
        nums = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (!Objects.equals(op, "q")) {
            System.out.print("> ");
            String line = scanner.nextLine();
            op = String.valueOf(line.toCharArray()[0]);
            nums.clear();
            for (int i = 1; i < line.split(" ").length; i++)
                nums.add(Integer.valueOf(line.split(" ")[i]));
            calculate();
        }
    }

    public void calculate() {
        int result = 0;
        switch (op) {
            case "+":
                for (var x : nums) {
                    result += x;
                }
                break;
            case "-":
                result = nums.get(0);
                for (int i = 1; i < nums.size(); i++) {
                    result -= nums.get(i);
                }
                break;
            case "*":
                result = 1;
                for (var x : nums) {
                    result *= x;
                }
                break;
            case "/":
                result = nums.get(0);
                for (int i = 1; i < nums.size(); i++) {
                    result /= nums.get(i);
                }
                break;
        }
        System.out.println(result);
    }
}

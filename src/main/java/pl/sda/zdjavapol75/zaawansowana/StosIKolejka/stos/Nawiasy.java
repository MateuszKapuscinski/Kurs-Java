package pl.sda.zdjavapol75.zaawansowana.StosIKolejka.stos;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Nawiasy {

    public static void main(String[] args) {

        System.out.println(balancedParenthesis("(())"));
        System.out.println(balancedParenthesis("(()))"));
    }

    public static boolean balancedParenthesis(String input) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

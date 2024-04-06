package StackOfStrings;

import java.util.ArrayList;
import java.util.Deque;

public class Stack {
    private Deque<String> data;
    public void push(String item) {
        this.data.push(item);
    }
    public String pop(String item) {
        this.data.pop();
    }
    public String peek(String item) {
        this.data.peek();
    }
    public Boolean isEmpty(String item) {
        return this.data.isEmpty();
    }
}

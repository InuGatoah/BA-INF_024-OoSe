import java.util.ArrayList;
import java.util.List;


interface Stack<T> extends List<T> {
	
	void push(T elem);
	T pop();
}

class MyStack<T> extends ArrayList<T> implements Stack<T> {

	@Override
	public void push(T elem) {
		add(elem);
	}

	@Override
	public T pop() {
		if (size() < 1)
			return null;
		else
			return remove(size() - 1);
	}

}


public class Stackvjezba {

	public static void main(String[] args) {
		Stack<String> stack = new MyStack<>();
		stack.push("Apfel");
		System.out.println(stack);
		stack.push("Orange");
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.push("Erdbeere");
		System.out.println(stack);
		stack.push("Kiwi");
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);

		Stack<Integer> intStack = new MyStack<>();
		intStack.push(42);
		intStack.push(0xDEADBEEF);
		intStack.push(-1);
		System.out.println(intStack);
		intStack.pop();

	}

}

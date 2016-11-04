public interface GenericStack<N extends Number> {

void push(N newValue); // adds an item to top of the stock

N pop(); // removes an item from top of stack

boolean isEmpty(); // checks to see if there are any items in the stack

}

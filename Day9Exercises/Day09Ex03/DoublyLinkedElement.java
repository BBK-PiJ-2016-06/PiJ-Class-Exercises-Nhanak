public class DoublyLinkedElement<T> {

    private T value;
    private DoublyLinkedElement<T> nextElement = null;
    private DoublyLinkedElement<T> prevElement = null;

    public DoublyLinkedElement(T value) { // constructor method
      this.value = value;
    }

    public T getValue() { // retrieves the next value of
      return this.value;
    }

    public void setValue(T newValue) {
      this.value = newValue;
    }

    public DoublyLinkedElement<T> getNextElement() {
      return nextElement;
    }

    public DoublyLinkedElement<T> getPrevElement() {
      return prevElement;
    }

    public void setNextElement(DoublyLinkedElement<T> newElement) {
      this.nextElement = newElement;
    }

    public void setPrevElement(DoublyLinkedElement<T> newElement) {
      this.prevElement = newElement;
    }

}

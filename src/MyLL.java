public class MyLL {

    public void addFirst(Object data) {
        // TODO: Implement this method - replace object with generic
        // Hint: Think about pointer manipulation order!
    }

    public void addLast(Object data) {
        // TODO: Implement this method - replace object with generic
        // Hint: Don't forget the empty list edge case!
    }

    public void add(int index, Object data) {
        // TODO: Implement this method - replace object with generic
        // Hint: Be careful with index bounds and pointer order!
    }

    public int removeFirst() {
        // TODO: Implement this method
        // Hint: What happens when you remove the only element?
        return -1;
    }

    public int removeLast() {
        // TODO: Implement this method
        // Hint: What happens when you remove the only element?
        return -1;
    }

    public boolean remove(Object data) {
        // TODO: Implement this method - replace object with generic
        // Hint: You need the node BEFORE the one you're removing!
        return false;
    }

    public boolean removeFirstOccurrence(Object data) {
        // TODO: Implement this method - replace object with generic
        return false;
    }

    public boolean removeLastOccurrence(Object data) {
        // TODO: Implement this method - replace object with generic
        // Hint: Track the previous node of the last occurrence found
        return false;
    }

    public void clear() {
        // TODO: Implement this method
    }


    public Object get(int index) {
        // TODO: Implement this method - replace object with generic
        // Hint: Use a loop counter to traverse the right number of steps
        return null;
    }

    public Object getFirst() {
        // TODO: Implement this method - replace object with generic
        // Hint: Check if list is empty first!
        return null;
    }

    public Object getLast() {
        // TODO: Implement this method - replace object with generic
        // Hint: Traverse to the end or use tail pointer if available
        return null;
    }


    public boolean contains(Object data) {
        // TODO: Implement this method - replace object with generic
        // Hint: Traverse the entire list checking each node's data
        return false;
    }

    public int indexOf(Object data) {
        // TODO: Implement this method - replace object with generic
        // Hint: Keep track of current index while traversing
        // Return -1 if not found
        return -1;
    }

    public int lastIndexOf(Object data) {
        // TODO: Implement this method - replace object with generic
        // Hint: Track the last found index during traversal
        return -1;
    }

    public Object set(int index, Object data) {
        // TODO: Implement this method - replace object with generic
        // Hint: Similar to get(), but replace the data
        // Returns old value
        return null;
    }

    public void replaceAll(Object oldValue, Object newValue) {
        // TODO: Implement this method - replace object with generic
        // Hint: Traverse and replace all instances of old value with new
    }

    public int size() {
        // TODO: Implement this method
        // Hint: Just return the size field!
        return -1;
    }

    public boolean isEmpty() {
        // TODO: Implement this method
        // Hint: Check if size is 0 or head is null
        return false;
    }

    public void display() {
        // TODO: Implement this method
        // Goal: Print something like "[HEAD] -> 10 -> 20 -> 30 -> [NULL]"
    }

    public Object[] toArray() {
        // TODO: Implement this method - replace object with generic
        // Hint: Create array of size() and populate while traversing
        return null;
    }


}

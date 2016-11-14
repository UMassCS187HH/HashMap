
public class LLNode<T> {
	private T key;
	private LLNode<T> next;
	private int freq;
	
	public LLNode(T t){
		key = t;
		freq = 1;
	}
	
	public LLNode<T> find(T data){
		//return the node containing data
		//return null if it can't be found
		return null;
	}
	
	public boolean contains(T data){
		//true if the hashmap contains the key
		//false otherwise
		return false;
	}
	
	public LLNode<T> last(){
		//return the last node
		return null;
	}
	
	public LLNode<T> getNext() {
		return next;
	}

	public void setNext(LLNode<T> next) {
		//set the next node
	}
	
	public void increment(){
		//increment the freq of the current node
	}
	
	public int get(T data){
		//find the node in the list and return the freq
		//-1 if it can't be found
		return -1;
	}
	public int getFreq(){
		return this.freq;
	}
}

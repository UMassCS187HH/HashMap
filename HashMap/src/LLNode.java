
public class LLNode<T> {
	private T key;
	private LLNode<T> next;
	private int freq;
	
	public LLNode(T t){
		key = t;
		freq = 1;
	}
	
	public LLNode<T> find(T data){
		if(this.key.equals(data))
			return this;
		else if(this.getNext() != null)
			return this.getNext().find(data);
		else
			return null;
	}
	
	public boolean contains(T data){
		if(this.find(data) != null)
			return true;
		return false;
	}
	
	public LLNode<T> last(){
		if(this.getNext() != null)
			return this.getNext().last();
		else
			return this;
	}
	
	public void add(T data){
		this.last().setNext(new LLNode<T>(data));
	}
	public LLNode<T> getNext() {
		return next;
	}

	public void setNext(LLNode<T> next) {
		this.next = next;
	}
	
	public void increment(){
		this.freq++;
	}
	
	public int get(T data){
		if(this.find(data) == null)
			return -1;
		return this.find(data).getFreq();
	}
	public int getFreq(){
		return this.freq;
	}
}


public class LLHashMap<T> {
	private LLNode<T> head;
	public LLHashMap(){
		
	}
	
	public void put(T key){
		if(head == null){
			head = new LLNode<T>(key);
		}else if(this.head.contains(key)){
			this.head.find(key).increment();
		}else{
			this.head.add(key);
		}
	}
	
	public int get(T key){
		return this.head.get(key);
	}
	
	
}

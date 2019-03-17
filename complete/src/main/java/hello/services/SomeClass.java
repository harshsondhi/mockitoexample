package hello.services;

public class SomeClass {
	String id;
	
	public SomeClass() {
		
	}
	
	public SomeClass(String id) {
		super();
		this.id = id;
	}

	public void access(String variable) {
		String tempSt = variable;
		tempSt = tempSt.toUpperCase();
		fuctionOne(tempSt);
		fuctionTwo(); 
		
	}
	
	public void fuctionOne(String var) {
		System.out.print("fuctionOne(String var):====" + var );
	}
	public void fuctionTwo() {
		System.out.print("fuctionOne(String var):====" );
	}

}

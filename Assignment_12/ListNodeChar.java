package in.ineuron;

public class ListNodeChar {

	char val;
	ListNodeChar next;

	public ListNodeChar() {
	}

	ListNodeChar(char val) {
		this.val = val;
	}

	ListNodeChar(char val, ListNodeChar next) {
		this.val = val;
		this.next = next;
	}
}

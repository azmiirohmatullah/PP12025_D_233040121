package pertemuan1;

public class node {

	private int nilai;
	private node Next;
	
	//inisialisasi node
	public node (int nilai) {
		this.nilai = nilai;
	}
	
	//setter next
	public void setNext(node next) {
	    this.Next = next;
	}
	
	//getter next
	public node getNext() {
	    return Next;
	}
	
	//getter nilai
	public int getNilai() {
        return nilai;
    }
}


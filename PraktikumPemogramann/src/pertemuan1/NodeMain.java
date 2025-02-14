package pertemuan1;

public class NodeMain {
	
	    public static void main(String[] args) {
	        // Membuat 2 buah node n1 & n2
	        node n1 = new node(5);
	        node n2 = new node(7);
	        
	        // Menghubungkan n1 ke n2
	        n1.setNext(n2);
	        
	        // Menampilkan Node n1 & n2 dengan pointer p
	        node p = n1;
	        while (p != null) {
	            System.out.printf("%d ", p.getNilai());
	            p = p.getNext(); // Perbaikan di sini
	        }
	   }
}


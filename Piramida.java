package tema15;

public class Piramida {
	
	private int n;

    public Piramida(int n) {
        this.n = n;
    }

    public void Piramida() {
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= i * 2 ; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

	public static void main(String[] args) {
		
		Piramida piramida = new Piramida(4); 
        piramida.Piramida();
	
	}

}

impor java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
   Scanner scanner = new Scanner(System.in);
    String nama;
	System.out.print("Masukkan nama anda: ");
	nama = scanner.nextLine();

	Sysyem.out.println("Hai, "+nama);
	}
}
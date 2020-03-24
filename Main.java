import koneksi.Database;
import model.Guru;
import model.Siswa;
import model.MataPelajaran;

public class Main{
  public static void main(String [] args){
    System.out.println("Ini program main");
    Database.hubungkan();
    Guru.tampilanInfo();
    Siswa.tampilanInfo();
    MataPelajaran.tampilanInfo();
    }
}
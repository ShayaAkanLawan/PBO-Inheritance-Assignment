import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
    ArrayList<Bentuk> listbentuk = new ArrayList<>(); 

    listbentuk.add(new Lingkaran(7, "Biru"));
    listbentuk.add(new BujurSangkar(10, "Merah"));
    listbentuk.add(new Silinder(10, 7, "Kuning"));

    for (Bentuk b: listbentuk){
        b.print();
    }
}
}

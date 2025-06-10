package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika irham = new Matematika(7,3);
        
        System.out.println("Hasil penjumlahan : " +irham.setPenjumlahan());
        System.out.println("Hasil penjumlahan : " +irham.setPengurangan());
        System.out.println("Hasil penjumlahan : " +irham.setPerkalian());
        System.out.println("Hasil penjumlahan : " +irham.setPembagian());
    }
}

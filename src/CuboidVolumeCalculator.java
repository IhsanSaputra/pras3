
public class CuboidVolumeCalculator {

    /**
     * Metode ini menghitung volume dari suatu balok.
     *
     * @param length panjang balok
     * @param width lebar balok
     * @param height tinggi balok
     * @return volume dari balok yang diberikan
     */
    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    /**
     * Metode main untuk menjalankan kelas CuboidVolumeCalculator.
     *
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        // Contoh penggunaan kelas CuboidVolumeCalculator
        double length = 5.0;
        double width = 3.0;
        double height = 2.0;
        CuboidVolumeCalculator calculator = new CuboidVolumeCalculator();
        System.out.println("Volume dari balok dengan panjang " + length + ", lebar " + width + ", dan tinggi " + height + " adalah " + calculator.calculateVolume(length, width, height));
    }
}

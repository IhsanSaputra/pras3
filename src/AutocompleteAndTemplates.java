public class AutocompleteAndTemplates {
    // Atribut
    private String name;
    private int age;

    // Constructor
    public AutocompleteAndTemplates(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method untuk mengambil nilai atribut 'name'
    public String getName() {
        return this.name;
    }

    // Method untuk mengambil nilai atribut 'age'
    public int getAge() {
        return this.age;
    }

    // Method untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("Nama: " + this.name);
        System.out.println("Umur: " + this.age);
    }

    // Metode utama untuk menjalankan kelas
    public static void main(String[] args) {
        // Membuat objek SimpleClass
        AutocompleteAndTemplates obj = new AutocompleteAndTemplates("John Doe", 30);
        // Memanggil method displayInfo
        obj.displayInfo();
    }
}

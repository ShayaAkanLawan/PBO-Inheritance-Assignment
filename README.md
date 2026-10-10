#Pewarisan (Inheritance) & Polimorfisme

Repitori ini berisi program yang mendemonstrasikan penerapan konsep Pemrograman Berorientasi Objek (PBO), khususnya **Pewarisan (*Inheritance*)**, **Polimorfisme**, serta pengolahan data koleksi dinamis menggunakan **`ArrayList`**.

## 🚀 Cara Menjalankan Program (Compile & Run)
Kompilasi seluruh file program secara bersamaan dengan perintah:

   ```bash
   javac Main.java Bentuk.java BujurSangkar.java Lingkaran.java Silinder.java
   ```
Jalankan program utama:

   ```bash
   java Main
   ```

## 💻 Penjelasan Struktur File & Implementasi Kode
### 1. `Bentuk.java` (Superclass / Kelas Induk)
* Atribut terlindung (`protected String warna`).
* *Constructor* dan *getter/setter* untuk pengelolaan warna.
* Method dasar `print()` yang akan ditimpa (*overridden*) oleh kelas turunannya.

### 2. `BujurSangkar.java` (Subclass)
Turunan langsung dari kelas `Bentuk`. Menambahkan atribut `sisi`, menghitung luas persegi, serta meng-*override* method `print()` untuk menampilkan informasi spesifik bujur sangkar.

### 3. `Lingkaran.java` (Subclass)
Turunan langsung dari kelas `Bentuk`. Menambahkan atribut `radius` serta konstanta `PHI`, menghitung luas lingkaran, dan meng-*override* method `print()`.

### 4. `Silinder.java` (Multi-level Inheritance Subclass)
Turunan dari kelas `Lingkaran` (sehingga mewarisi sifat lingkaran sekaligus bentuk). Menambahkan atribut `tinggi`, menghitung volume silinder, serta meng-*override* method `print()`.

### 5. `Main.java` (Entry Point & Demonstrasi ArrayList)
File utama yang mengeksekusi program dengan menerapkan **`ArrayList` berpolimorfisme**.

## 🔍 Poin Utama Implementasi `ArrayList` & Polimorfisme

* **Koleksi Polimorfik (`ArrayList<Bentuk>`)**: 
  Meskipun tipe data dari `ArrayList` adalah `Bentuk` (kelas induk), kita bisa memasukkan berbagai macam objek turunannya secara bersamaan seperti `Lingkaran`, `BujurSangkar`, dan `Silinder` berkat sifat polimorfisme.
* **Perulangan *For-Each* & *Dynamic Method Dispatch***:
  Melalui perulangan *for-each*, program memanggil method `.print()` pada setiap elemen. Java secara otomatis mengenali bentuk asli objek tersebut saat *runtime* dan mengeksekusi versi method `print()` yang sesuai dengan kelas aslinya.

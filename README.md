# Hierarki Pewarisan (Inheritance), Polimorfisme, & ArrayList Bentuk Geometri (Java)

Repitori ini berisi program berbasis konsol Java yang mendemonstrasikan penerapan konsep Pemrograman Berorientasi Objek (PBO), khususnya **Pewarisan (*Inheritance*)**, **Polimorfisme**, serta pengolahan data koleksi dinamis menggunakan **`ArrayList`**.

## 🚀 Cara Menjalankan Program (Compile & Run)

Pastikan Anda sudah menginstal **Java Development Kit (JDK)** di komputer Anda.

1. Simpan seluruh file kode (`Bentuk.java`, `BujurSangkar.java`, `Lingkaran.java`, `Silinder.java`, dan `Main.java`) di dalam **satu folder yang sama**.

2. Buka terminal atau Command Prompt, lalu arahkan ke folder tersebut.

3. Kompilasi seluruh file program secara bersamaan dengan perintah:

   ```bash
   javac Main.java Bentuk.java BujurSangkar.java Lingkaran.java Silinder.java
   ```

4. Jalankan program utama:

   ```bash
   java Main
   ```

## 💻 Penjelasan Struktur File & Implementasi Kode

Proyek ini dibagi menjadi beberapa kelas terpisah untuk menerapkan prinsip modularitas dan hierarki kelas:

### 1. `Bentuk.java` (Superclass / Kelas Induk)
Kelas dasar yang merepresentasikan bentuk umum. Berisi:
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
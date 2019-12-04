# Melakukan Build dengan Gradle pada untuk kasus *Inheritance*

### Berikut langkah-langkahnya:

0. Pastikan sudah menginstall Gradle terlebih dahulu

1. Siapkan **direktori** kerja untuk melakukan build dengan gradle
```
mkdir gradling
cd gradling
```
2. Lakukan proses init pada **direktori** tersebut
```
gradle init
```
3. Masukkan file **Main.java** ke direktori **gradling/src/main/java/gradling/**
4. Tambahkan baris berikut pada line 1 file **Main.java**
```
package gradling;
```
5. Ubah isi file **build.gradle** pada bagian **mainClassName** menjadi:
```
mainClassName = 'gradling.Main'
```
6. Karena belum digunakan hapus file **AppTest.java** pada direktori **src/test/java/gradling**
7. Lakukan perintah berikut pada **direktori** kerja Gradle 
```
./gradlew build
```
8. Ketika suskes, jalankan perintah berikut:
```
gradle run
```
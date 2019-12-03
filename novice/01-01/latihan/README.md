Membuat *executable* JAR pada kasus **Penjumlahan Dua Buah Matriks**

Langkah-langkahnya adalah:

1. Kompilasi file java.
```
javac ../kasus/PenjumlahanMatriks.java
```
2. Membuat berkas Manifest.
```
touch Manifest.1.txt
```
3. Isi berkas Manifest dengan beberapa parameter yang sesuai.
```
Manifest-version: 1.0
Created-By: 1.0 (yaayyuhalaziz)
Main-Class: PenjumlahanMatriks
```
4. Packing sebagai *executable* JAR dengan perintah:
```
jar cfm PenjumlahanMatriks.jar Manifest.1.txt PenjumlahanMatriks.class
```
5. Jalankan berkas *executable* JAR dengan perintah:
```
java -jar PenjumlahanMatriks
```

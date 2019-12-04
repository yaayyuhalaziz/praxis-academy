# Membuat *executable* JAR untuk kasus **Konsep OOP**

### Permasalahan Bangun Datar

#### - Kelas utama BangunDatar dengan method: getLuas dan getKeliling

#### - Kelas BangunDatar (Parent) diturunkan menjadi Kelas (Anak): Persegi, PersegiPanjang, dan Lingkaran

#### - Method getLuas dan getKeliling dalam Kelas BangunDatar dimanipulasi pada Kelas-kelas anak

#### - Khusus Kelas Lingkaran, Kelas tersebut mengimplement interface untuk menyimpan nilai final phi: 3.14

##### NB: karena menerapkan konsep inheritance maka untuk membuat package JAR wajib disebutkan semua kelas (parent dan child)
```
jar cfmv Main.jar Manifest.txt Main.class BangunDatar.class Persegi.class PersegiPanjang.class VarPHI.class Lingkaran.class
```
# Sistem Irigasi Otomatis untuk Pertanian 🌱💧

## Deskripsi  
Sistem ini dirancang untuk membantu petani mengatasi tantangan dalam pengelolaan air untuk irigasi, dengan menggunakan pendekatan **Design Patterns** untuk menciptakan solusi yang efisien, fleksibel, dan dapat disesuaikan.

---

## Permasalahan  
1. **Penggunaan Air yang Boros**  
   - Sistem irigasi tradisional sering menyuplai air secara berlebihan, menyebabkan pemborosan.

2. **Keterlambatan dalam Irigasi**  
   - Ketergantungan pada jadwal manual dapat menyebabkan keterlambatan penyiraman, yang berpotensi merusak hasil panen, terutama saat cuaca panas.

3. **Kurangnya Pemantauan**  
   - Petani tidak memiliki informasi real-time tentang kelembaban tanah, sehingga sulit membuat keputusan yang tepat.

4. **Ketidaksesuaian dengan Jenis Tanaman**  
   - Setiap tanaman memiliki kebutuhan air yang berbeda, tetapi sistem irigasi konvensional tidak dapat menyesuaikan jumlah air secara dinamis.

---

## Solusi dengan Implementasi Design Pattern  

### 1. Factory Method Pattern untuk Jenis Irigasi Berdasarkan Tanaman  
**Masalah yang Diselesaikan**  
Setiap jenis tanaman membutuhkan metode irigasi yang berbeda (misalnya, padi membutuhkan genangan air, sedangkan tanaman buah membutuhkan tetesan air).

**Implementasi**  
Gunakan **Factory Method** untuk membuat objek sistem irigasi yang sesuai dengan jenis tanaman secara dinamis.

---

### 2. Strategy Pattern untuk Menentukan Jadwal Irigasi  
**Masalah yang Diselesaikan**  
Jadwal irigasi bervariasi tergantung pada faktor cuaca, jenis tanah, dan kebutuhan tanaman.

**Implementasi**  
Gunakan **Strategy Pattern** untuk menerapkan berbagai strategi jadwal irigasi, yang dapat disesuaikan berdasarkan kondisi spesifik.

---

### 3. Composite Pattern untuk Mengelola Sensor Kelembaban Tanah  
**Masalah yang Diselesaikan**  
Lahan pertanian besar membutuhkan banyak sensor kelembaban tanah yang harus dikelola sebagai satu kesatuan.

**Implementasi**  
Gunakan **Composite Pattern** untuk mengelola hierarki sensor dan menggabungkan data kelembaban tanah secara terstruktur.

---


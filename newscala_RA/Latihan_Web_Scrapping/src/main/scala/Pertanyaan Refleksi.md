

### 1. Apa fungsi `.select(".quote")`?

`document.select(".quote")` berfungsi untuk **mengambil semua elemen HTML** yang memiliki class `"quote"` dari halaman web. Dalam konteks ini, setiap elemen `<div class="quote">` berisi satu kutipan lengkap, termasuk teks kutipan dan nama penulisnya. Fungsi ini merupakan bagian dari library Jsoup yang menggunakan selector seperti pada CSS.

---

### 2. Bagaimana cara menambahkan scraping ke halaman kedua?

Scraping ke halaman kedua (dan seterusnya) bisa dilakukan dengan cara:
- Mengamati pola URL (misalnya `page/1`, `page/2`, dst.)
- Melakukan loop yang **terus bertambah nomor halamannya**
- **Menghentikan loop** saat tidak ada elemen tombol "Next" (`.next a`) di halaman

Contoh:
```scala
val nextButton = document.select(".next a")
hasNextPage = nextButton.nonEmpty

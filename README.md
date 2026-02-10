# Reflection 1

**Meaningful Names**
- pada code saya, saya sudah mengimplementasikan nama variabel, method, dan class yang dapat mudah dimengerti serta jelas. ex: createProduct, deleteProduct,etc.

**Single Responsibility Principle**
- pada code saya, saya sudah memisahkan masing-masing tanggung jawab code saya dengan MVC. serta semua method yang sudah saya buat hanya melakukan 1 tugas saja. 

**Secure Coding**
- saya menggunakan UUID yang diubah ke string pada saat pembentukan produk yang lebih aman dan juga sudah menerapkan beberapa metode HTTP yang sesuai pada REST

## Mistakes
- Pada fitur delete, saya masih menggunakan method GetMapping instead of DeleteMapping yang lebih sesuai pada best practice sehingga melanggar standar REST
- Redundant pada interface. In default, semua method dalam interface sudah pasti dalam bentuk public sehingga tidak perlu menambahkan public lagi

# Reflection 2
1. Saya rasa unit test memang sangat dibutuhkan untuk mencoba apakah ada celah kesalahan pada code kita. Namun dilain sisi testing cukup menyusahkan menurut saya karena untuk membuat testnya, kita harus kepikiran dulu case-casenya.
Lalu untuk jumlah unit-test yang harus dibuat per-class secara general tidak ada angka pastinya karena sangat tergantung dengan complexity dari code kita namun untuk kasus proyek ini mungkin saya akan mengestimasinya sekitar 9-10 unit test memperkirakan per 1 method bisa banyak edge casenya. 
Menurut saya salah satu cara menilai apakah test kita sudah cukup adalah coverage test yang 100%. Dalam kelas kemarin, Pak Edy sebenarnya sudah mengajarkan kepada kita bahwa tidak ada program yang aman maka dari itu, test yang banyak-banyak juga pasti nanti ada celahnya makanya dalam developing apps kita mengenal maintenance

2. Menurut saya itu akan menurunkan quality of code dari proyeknya karena akan terjadi duplikasi code atau melanggar prinsip Don't Repeat Yourself. Maksudnya adalah ketika kita membuat func test lagi maka kita pasti membuat variabel lagi seperti baseUrl, serverPort, atau method seperti @BeforeEach. Akibatnya jika suatu saat kita ingin mengubah konfigurasi setupnya (misal baseURL), kita harus mengubahnya di semua file 1 per 1 dimana tidak efisien dan berpotensi mengakibatkan human error.
Solusi yang terpikirkan oleh saya adalah dengan inheritance dimana base configuration (variabel konfigurasi sepeerti baseUrl dan method setup) bisa kita berikan di parent class sedangkan test class lainnya bisa mengextend parent class tersebut sehingga kita hanya perlu mengsetup sekali dan code jadi lebih rapi serta mudah di maintenance   
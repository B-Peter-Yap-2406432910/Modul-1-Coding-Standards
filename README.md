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
- 
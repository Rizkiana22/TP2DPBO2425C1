<?php
require_once "class/Laptop.php";  // Import class Laptop
session_start(); // Mulai session (untuk simpan data laptop di browser)

// Inisialisasi Hardcode
if (!isset($_SESSION['laptops'])) {
    $_SESSION['laptops'] = [];

    // Buat beberapa objek Laptop secara hardcode
    $l1 = new Laptop("L001", "ASUS ROG Strix", 20000000, 10, "ASUS", 24, "G15", "Intel i7", 16, 512, "img/AsusRogStrix.jpg");
    $l2 = new Laptop("L002", "MSI Katana", 18000000, 5, "MSI", 24, "GF66", "Intel i5", 8, 512, "img/MsiKatana.jpg");
    $l3 = new Laptop("L003", "Lenovo Legion", 19000000, 7, "Lenovo", 24, "5 Pro", "AMD Ryzen 7", 16, 1024, "img/LenovoLegion.jpg");
    $l4 = new Laptop("L004", "HP Omen", 18500000, 4, "HP", 24, "15-ek", "Intel i7", 16, 512, "img/HPOmen.jpg");
    $l5 = new Laptop("L005", "Acer Predator", 21000000, 6, "Acer", 24, "Helios 300", "Intel i9", 32, 1024, "img/AcerPredator.jpg");

    // Masukkan array laptop ke session
    $_SESSION['laptops'] = [$l1, $l2, $l3, $l4, $l5];
}


// Restart Data Session
if (isset($_GET['Restart'])) {
    session_unset();    // Hapus semua data dari session
    session_destroy();  // Hancurkan session
    header("Location: index.php"); // Reload halaman utama
    exit;
}


// Tambah Laptop Baru (Form POST)
if ($_SERVER["REQUEST_METHOD"] === "POST") {
    $upload_dir = "uploads/"; // Folder untuk simpan gambar
    if (!is_dir($upload_dir)) {
        mkdir($upload_dir, 0777, true); // Buat folder kalau belum ada
    }

    $gambar = "uploads/default.png"; // Default gambar


    // Upload Gambar Laptop
    if (isset($_FILES['gambar']) && $_FILES['gambar']['error'] == UPLOAD_ERR_OK) {
        $allowed_types = ['image/jpeg', 'image/png', 'image/gif']; // Format yang diijinkan
        if (in_array($_FILES['gambar']['type'], $allowed_types) && $_FILES['gambar']['size'] <= 2 * 1024 * 1024) {
            $filename = uniqid() . "_" . basename($_FILES["gambar"]["name"]); // Nama unik
            $target_file = $upload_dir . $filename;
            if (move_uploaded_file($_FILES["gambar"]["tmp_name"], $target_file)) {
                $gambar = $target_file; // Simpan path gambar ke variabel
            }
        }
    }

    
    // Buat Laptop Baru dari Form
    $laptop = new Laptop(
        $_POST['id'],
        $_POST['nama'],
        $_POST['harga'],
        $_POST['stok'],
        $_POST['merk'],
        $_POST['garansi'],
        $_POST['model'],
        $_POST['tipeProsesor'],
        $_POST['ram'],
        $_POST['storage'],
        $gambar
    );

    // Tambahkan laptop ke session
    $_SESSION['laptops'][] = $laptop;
}
?>


<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <title>Manajemen Laptop</title>
</head>
<body>
    <h1>Daftar Laptop</h1>

    <a href="index.php?Restart=1" onclick="return confirm('Restart semua data?')">[Restart Data]</a>

    <h2>Tambah Laptop Baru</h2>
    <form method="POST" enctype="multipart/form-data">
        ID: <input type="text" name="id" required><br>
        Nama: <input type="text" name="nama" required><br>
        Harga: <input type="number" name="harga" required><br>
        Stok: <input type="number" name="stok" required><br>
        Merk: <input type="text" name="merk" required><br>
        Garansi (bulan): <input type="number" name="garansi" required><br>
        Model: <input type="text" name="model" required><br>
        Prosesor: <input type="text" name="tipeProsesor" required><br>
        RAM (GB): <input type="number" name="ram" required><br>
        Storage (GB): <input type="number" name="storage" required><br>
        Gambar: <input type="file" name="gambar" accept="image/*"><br>
        <button type="submit">Tambah</button>
    </form>

    <h2>Data Laptop</h2>
    <table border="1" cellpadding="8" cellspacing="0">
        <tr>
            <th>ID</th>
            <th>Nama</th>
            <th>Harga</th>
            <th>Stok</th>
            <th>Merk</th>
            <th>Garansi</th>
            <th>Model</th>
            <th>Prosesor</th>
            <th>RAM</th>
            <th>Storage</th>
            <th>Gambar</th>
        </tr>
        <?php foreach ($_SESSION['laptops'] as $lp): ?>
            <tr>
                <td><?= $lp->getId(); ?></td>
                <td><?= $lp->getNama(); ?></td>
                <td>Rp <?= number_format($lp->getHarga(), 0, ',', '.'); ?></td>
                <td><?= $lp->getStok(); ?></td>
                <td><?= $lp->getMerk(); ?></td>
                <td><?= $lp->getGaransi(); ?> bulan</td>
                <td><?= $lp->getModel(); ?></td>
                <td><?= $lp->getTipeProsesor(); ?></td>
                <td><?= $lp->getKapasitasRAM(); ?> GB</td>
                <td><?= $lp->getStorage(); ?> GB</td>
                <td><img src="<?= $lp->getGambar(); ?>" width="100"></td>
            </tr>
        <?php endforeach; ?>
    </table>
</body>
</html>

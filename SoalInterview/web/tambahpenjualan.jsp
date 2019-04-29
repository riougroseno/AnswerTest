<%-- 
    Document   : tambahpenjualan
    Created on : Apr 29, 2019, 3:51:17 PM
    Author     : Riougroseno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tambah Data Penjualan</title>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
         
    </head>
    
    <body>
         <nav class="navbar navbar-expand-lg navbar-dark bg-warning">
            <a class="navbar-brand" href="#">Penjualan</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
              <ul class="navbar-nav">
                <li class="nav-item">
                  <a class="nav-link" href="barangController?proses=menuutama">Data Barang</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="penjualanController?proses=menupenjualan">Penjualan</a>
                </li>           
              </ul>
            </div>
           </nav>
        
        <div class="container">
        <h1>Tambah Data Penjualan</h1>
        
        <form  action="penjualanController?data=penjualan&proses=input-penjualan" method="post">
            <div class="form-group">
              <label for="kodeBarang">Tanggal Faktur</label>
              <input type="text" class="form-control" id="kodebarang" name="tanggal_faktur">
            </div>
            <div class="form-group">
              <label for="namaBarang">No Faktur</label>
              <input type="text" class="form-control" id="namabarang" name="no_faktur">
            </div>
             <div class="form-group">
              <label for="hargaJual">Nama Konsumen</label>
              <input type="text" class="form-control" id="hargajual" name="nama_konsumen">
            </div>
             <div class="form-group">
              <label for="hargaBeli">Kode Barang</label>
              <input type="text" class="form-control" id="hargabeli" name="kd_barang">
            </div>
            <div class="form-group">
              <label for="kategori">Jumlah</label>
              <input type="text" class="form-control" id="kategori" name="jumlah">
            </div>
           <div class="form-group">
              <label for="kategori">Harga Satuan</label>
              <input type="text" class="form-control" id="kategori" name="harga_satuan">
            </div>
            <div class="form-group">
              <label for="kategori">Harga Total</label>
              <input type="text" class="form-control" id="kategori" name="harga_total">
            </div>
           
            <button type="submit" value="tambah" class="btn btn-warning">Tambah</button>
          </form>
        </div>
    </body>
</html>

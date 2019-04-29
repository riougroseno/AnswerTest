/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import koneksi.koneksi;
/**
 *
 * @author Riougroseno
 */
public class barangModel {
    
    String kode_barang,nama_barang,harga_jual,harga_beli,satuan,kategori;
     koneksi db = null;
    
     public barangModel() {
        db = new koneksi();
    }
    
    public String getKodeBarang() {
        return kode_barang;
    }

    public void setKodeBarang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getNamaBarang() {
        return nama_barang;
    }

    public void setNamaBarang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getHargaJual() {
        return harga_jual;
    }

    public void setHargaJual(String harga_jual) {
        this.harga_jual = harga_jual;
    }

    public String getHargaBeli() {
        return harga_beli;
    }

    public void setHargaBeli(String harga_beli) {
        this.harga_beli = harga_beli;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public koneksi getDb() {
        return db;
    }

    public void setDb(koneksi db) {
        this.db = db;
    }
   
    public List tampil() {
        List<barangModel> data = new ArrayList<barangModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from barang order by nama_barang asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                barangModel um = new barangModel();
                um.setKodeBarang(rs.getString("kode_barang"));
                um.setNamaBarang(rs.getString("nama_barang"));
                um.setHargaJual(rs.getString("harga_jual")); 
                um.setHargaBeli(rs.getString("harga_beli"));
                um.setSatuan(rs.getString("satuan"));
                um.setKategori(rs.getString("kategori"));
                data.add(um);
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
     
       public void simpan() {
        String sql = "INSERT INTO barang values('" + kode_barang + "', '" + nama_barang + "', '" + harga_jual + "', '" + harga_beli + "','" + satuan + "','" + kategori + "')";
        db.simpanData(sql);
    }
       
        public void update() {
        String sql = "UPDATE barang SET nama_barang='"+nama_barang+"',harga_jual='"+harga_jual+"',harga_beli='"+harga_beli + "',satuan='"+satuan+"',kategori='"+kategori+"' WHERE kode_barang='"+kode_barang+"'";
        db.simpanData(sql);
        }
        
        public void hapus(){
        String sql="DELETE FROM barang WHERE kode_barang='"+kode_barang+"'";
        db.simpanData(sql);
        System.out.println("");
        }
        
        public List cariKDBRG() {
        List<barangModel> data = new ArrayList<barangModel>();
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM barang WHERE kode_barang='"+kode_barang+ "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                barangModel um = new barangModel();
                um.setKodeBarang(rs.getString("kode_barang"));
                um.setNamaBarang(rs.getString("nama_barang"));
                um.setHargaJual(rs.getString("harga_jual")); 
                um.setHargaBeli(rs.getString("harga_beli"));
                um.setSatuan(rs.getString("satuan"));
                um.setKategori(rs.getString("kategori"));
                data.add(um);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari Kode Barang" + ex);
        }
        return data;

    }
    
    
}
    


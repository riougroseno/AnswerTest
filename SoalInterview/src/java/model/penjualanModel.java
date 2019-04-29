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
public class penjualanModel {
    
    
     String tgl_faktur,no_faktur,nama_konsumen,kd_barang,jumlah,harga_satuan,harga_total,stok;

    public penjualanModel(){
        db = new koneksi();
    }
    
    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    koneksi db = null;

    public String getTglFaktur() {
        return tgl_faktur;
    }

    public void setTglFaktur(String tgl_faktur) {
        this.tgl_faktur = tgl_faktur;
    }

    public String getNoFaktur() {
        return no_faktur;
    }

    public void setNoFaktur(String no_faktur) {
        this.no_faktur = no_faktur;
    }

    public String getNamaKonsumen() {
        return nama_konsumen;
    }

    public void setNamaKonsumen(String nama_konsumen) {
        this.nama_konsumen = nama_konsumen;
    }

    public String getKodeBarang() {
        return kd_barang;
    }

    public void setKodeBarang(String kd_barang) {
        this.kd_barang = kd_barang;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getHargaSatuan() {
        return harga_satuan;
    }

    public void setHargaSatuan(String harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    public String getHargaTotal() {
        return harga_total;
    }

    public void setHargaTotal(String harga_total) {
        this.harga_total = harga_total;
    }

    public koneksi getDb() {
        return db;
    }

    public void setDb(koneksi db) {
        this.db = db;
    }
    
    public List tampil() {
        List<penjualanModel> data = new ArrayList<penjualanModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from penjualan ";
            rs = db.ambilData(sql);
            while (rs.next()) {
                penjualanModel um = new penjualanModel();
                um.setTglFaktur(rs.getString("tgl_faktur"));
                um.setNoFaktur(rs.getString("no_faktur"));
                um.setNamaKonsumen(rs.getString("nama_konsumen"));
                um.setKodeBarang(rs.getString("kd_barang"));
                um.setJumlah(rs.getString("jumlah"));
                um.setHargaSatuan(rs.getString("harga_satuan"));
                um.setHargaTotal(rs.getString("harga_total"));
                data.add(um);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
    
       public void simpan() {
        String sql = "INSERT INTO penjualan values('" + tgl_faktur + "', '" + no_faktur + "', '" + nama_konsumen + "', '" + kd_barang + "','"+ jumlah +"','"+ harga_satuan +"','"+ harga_total +"')";
        db.simpanData(sql);
    }
       
        
        public void hapus(){
        String sql="DELETE FROM penjualan WHERE no_faktur='"+no_faktur+"'";
        db.simpanData(sql);
        System.out.println("");
        }
        
        public List cariNOFAKTUR() {
        List<penjualanModel> data = new ArrayList<penjualanModel>();
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM penjualan WHERE no_faktur='"+no_faktur+ "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                penjualanModel pm = new penjualanModel();
                pm.setTglFaktur(rs.getString("tglFaktur"));
                pm.setNoFaktur(rs.getString("no_faktur"));
                pm.setNamaKonsumen(rs.getString("nama_konsumen"));
                pm.setKodeBarang(rs.getString("kd_barang"));
                pm.setJumlah(rs.getString("jumlah"));
                pm.setHargaSatuan(rs.getString("harga_satuan"));
                pm.setHargaTotal(rs.getString("harga_total"));
                data.add(pm);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari Kode Barang" + ex);
        }
        return data;

    }
}

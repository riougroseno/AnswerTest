-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 29, 2019 at 01:26 PM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `soalinterview`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `kode_barang` varchar(128) NOT NULL,
  `nama_barang` varchar(128) NOT NULL,
  `harga_jual` int(128) NOT NULL,
  `harga_beli` int(128) NOT NULL,
  `satuan` varchar(128) NOT NULL,
  `kategori` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kode_barang`, `nama_barang`, `harga_jual`, `harga_beli`, `satuan`, `kategori`) VALUES
('CRZ-101', 'Crooz Denim Blue', 800000, 700000, 'PCS', 'Jeans Blue Indigo'),
('CRZ-109', 'Crooz T-Shirt Black', 100000, 90000, 'PCS', 'T-Shirt'),
('CRZ-201', 'Crooz Waist Bag', 350000, 300000, 'PCS', 'Waist Bag'),
('CRZ-379', 'Crooz Bag BLue Indigo', 750000, 699999, 'PCS', 'Bag Blue Indigo');

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `tgl_faktur` varchar(128) NOT NULL,
  `no_faktur` varchar(128) NOT NULL,
  `nama_konsumen` varchar(128) NOT NULL,
  `kd_barang` varchar(128) NOT NULL,
  `jumlah` varchar(128) NOT NULL,
  `harga_satuan` int(128) NOT NULL,
  `harga_total` int(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`tgl_faktur`, `no_faktur`, `nama_konsumen`, `kd_barang`, `jumlah`, `harga_satuan`, `harga_total`) VALUES
('24 April 2019', '0111124', 'Muhammad Haikal', 'CRZ-201', '3', 350000, 1050000),
('21 April 2019', '0111892', 'Farhan Azmi', 'CRZ-109', '2', 150000, 300000),
('23 April 2019', '0111983', 'Nurcholid', 'CRZ-379', '2', 750000, 1500000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kode_barang`),
  ADD UNIQUE KEY `kode_barang` (`kode_barang`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD UNIQUE KEY `no_faktur` (`no_faktur`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

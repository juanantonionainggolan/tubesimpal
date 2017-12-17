-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 17, 2017 at 08:03 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tubesimpal`
--

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE `dosen` (
  `nip` varchar(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  `alamat` varchar(70) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dosen`
--

INSERT INTO `dosen` (`nip`, `nama`, `email`, `alamat`, `tgl_lahir`, `password`) VALUES
('D12345A', 'George', 'george@gmail.com', 'Jakarta', '1972-05-17', 'george123'),
('D23456B', 'Bridgia', 'bridgia@gmail.com', 'Bandung', '1980-10-13', 'brie123'),
('D34567C', 'Hani', 'hani@gmail.com', 'Surabaya', '1981-06-24', 'hani098'),
('D45678D', 'Patrick', 'patrick@gmail.com', 'Bikini Bottom', '1985-02-14', 'patrick456'),
('D5678E', 'Charlotte', 'charlotte@gmail.com', 'Jakarta', '1983-12-03', 'char345');

-- --------------------------------------------------------

--
-- Table structure for table `jawaban`
--

CREATE TABLE `jawaban` (
  `kode_soal` varchar(10) NOT NULL,
  `jawaban` varchar(50) NOT NULL,
  `nim` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jawaban`
--

INSERT INTO `jawaban` (`kode_soal`, `jawaban`, `nim`) VALUES
('AI1A', 'M1234A_Tugas1', 'M1234A'),
('DAA1A', 'M3456C_Tugas1', 'M3456C'),
('IMK1A', 'M8765R_Tugas1', 'M8765R'),
('IMPAL1A', 'M4097W_Tugas1', 'M4097W'),
('SISOP1A', 'M4567D_Tugas1', 'M4567D');

-- --------------------------------------------------------

--
-- Table structure for table `kehadiran`
--

CREATE TABLE `kehadiran` (
  `nim` varchar(10) NOT NULL,
  `mata_kuliah` varchar(20) NOT NULL,
  `kehadiran` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kehadiran`
--

INSERT INTO `kehadiran` (`nim`, `mata_kuliah`, `kehadiran`) VALUES
('M1234A', 'IMPAL', 100),
('M2345B', 'DAA', 88),
('M3456C', 'AI', 92),
('M4097W', 'IMK', 100),
('M8765R', 'JARKOM', 35);

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nim` varchar(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  `alamat` varchar(70) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`nim`, `nama`, `email`, `alamat`, `tgl_lahir`, `password`) VALUES
('M1234A', 'Juan', 'juan@gmail.com', 'Sukapura', '1997-12-15', 'juan123'),
('M2345B', 'Puff', 'puff@gmail.com', 'Bandung', '1997-12-03', 'puff123'),
('M3456C', 'Sharon', 'sharon@gmail.com', 'Jakarta', '1997-12-31', 'sharon098'),
('M4097W', 'Nana', 'nana@gmail.com', 'Medan', '1997-03-09', 'nana187'),
('M4567D', 'Layla', 'layla@gmail.com', 'Yogyakarta', '1997-10-26', 'layla456'),
('M8765R', 'Miya', 'miya@gmail.com', 'Bali', '1996-08-20', 'miya345');

-- --------------------------------------------------------

--
-- Table structure for table `materi`
--

CREATE TABLE `materi` (
  `kode_materi` varchar(10) NOT NULL,
  `nama_materi` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `materi`
--

INSERT INTO `materi` (`kode_materi`, `nama_materi`) VALUES
('AI1', 'Searching'),
('DAA1', 'Brute Force'),
('IMK1', 'Internationalization'),
('IMPAL1', 'OO Metrics'),
('SISOP1', 'Access Control');

-- --------------------------------------------------------

--
-- Table structure for table `nilai`
--

CREATE TABLE `nilai` (
  `nim` varchar(10) NOT NULL,
  `mata_kuliah` varchar(20) NOT NULL,
  `nilai` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nilai`
--

INSERT INTO `nilai` (`nim`, `mata_kuliah`, `nilai`) VALUES
('M1234A', 'DAA', 85),
('M2345B', 'IMPAL', 90),
('M4097W', 'IMK', 82),
('M4567D', 'AI', 88),
('M3456C', 'JARKOM', 80);

-- --------------------------------------------------------

--
-- Table structure for table `soal`
--

CREATE TABLE `soal` (
  `kode_soal` varchar(10) NOT NULL,
  `kode_materi` varchar(10) NOT NULL,
  `file_soal` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `soal`
--

INSERT INTO `soal` (`kode_soal`, `kode_materi`, `file_soal`) VALUES
('AI1A', 'AI1', 'BFS, BFS'),
('DAA1A', 'DAA1', 'TSP with Greedy'),
('IMK1A', 'IMK1', 'Progress Tubes'),
('IMPAL1A', 'IMPAL1', 'Analisis OO Metrics'),
('SISOP1A', 'SISOP1', 'Review Manajemen I/O');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `jawaban`
--
ALTER TABLE `jawaban`
  ADD KEY `kode_soal` (`kode_soal`),
  ADD KEY `nim` (`nim`);

--
-- Indexes for table `kehadiran`
--
ALTER TABLE `kehadiran`
  ADD KEY `nim` (`nim`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `materi`
--
ALTER TABLE `materi`
  ADD PRIMARY KEY (`kode_materi`);

--
-- Indexes for table `nilai`
--
ALTER TABLE `nilai`
  ADD KEY `nim` (`nim`);

--
-- Indexes for table `soal`
--
ALTER TABLE `soal`
  ADD PRIMARY KEY (`kode_soal`),
  ADD KEY `kode_materi` (`kode_materi`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `jawaban`
--
ALTER TABLE `jawaban`
  ADD CONSTRAINT `jawaban_ibfk_1` FOREIGN KEY (`kode_soal`) REFERENCES `soal` (`kode_soal`) ON DELETE CASCADE,
  ADD CONSTRAINT `jawaban_ibfk_2` FOREIGN KEY (`nim`) REFERENCES `mahasiswa` (`nim`) ON DELETE CASCADE;

--
-- Constraints for table `kehadiran`
--
ALTER TABLE `kehadiran`
  ADD CONSTRAINT `kehadiran_ibfk_1` FOREIGN KEY (`nim`) REFERENCES `mahasiswa` (`nim`) ON DELETE CASCADE;

--
-- Constraints for table `nilai`
--
ALTER TABLE `nilai`
  ADD CONSTRAINT `nilai_ibfk_1` FOREIGN KEY (`nim`) REFERENCES `mahasiswa` (`nim`) ON DELETE CASCADE;

--
-- Constraints for table `soal`
--
ALTER TABLE `soal`
  ADD CONSTRAINT `soal_ibfk_1` FOREIGN KEY (`kode_materi`) REFERENCES `materi` (`kode_materi`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

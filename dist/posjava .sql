-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 31, 2018 at 10:19 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `posjava`
--

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
  `InvoiceId` int(11) NOT NULL,
  `InvoiceDate` datetime NOT NULL,
  `StaffId` varchar(255) NOT NULL,
  `Subtotal` int(25) NOT NULL,
  `Cash` varchar(100) NOT NULL,
  `ChangeCash` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `invoice`
--

INSERT INTO `invoice` (`InvoiceId`, `InvoiceDate`, `StaffId`, `Subtotal`, `Cash`, `ChangeCash`) VALUES
(1, '2018-05-28 00:14:09', '1', 0, '', 0),
(2, '2018-05-28 00:34:21', '1', 0, '', 0),
(3, '2018-05-28 15:59:19', '1', 34, '50', 17),
(4, '2018-05-28 22:44:57', '1', 60, '500', 441),
(5, '2018-05-28 23:24:59', '1', 63, '321', 259),
(6, '2018-05-28 23:27:32', '1', 73, '43', -30),
(7, '2018-05-28 23:29:10', '1', 73, '453', 380),
(8, '2018-05-28 23:29:20', '1', 25, '43', 18),
(9, '2018-05-28 23:31:03', '1', 46, '323', 277),
(10, '2018-05-29 02:17:13', '1', 27, '132', 106),
(11, '2018-05-30 02:00:18', '1', 29, '30', 1),
(12, '2018-05-30 15:44:14', '1', 36, '40', 4),
(13, '2018-05-30 23:35:22', '1', 30, '40', 10),
(14, '2018-05-30 23:36:58', '1', 26, '30', 4),
(15, '2018-05-30 23:39:57', '1', 30, '50', 21),
(16, '2018-05-30 23:49:36', '2', 26, '40', 14),
(17, '2018-05-30 23:56:12', '5', 23, '30', 7);

-- --------------------------------------------------------

--
-- Table structure for table `useraccount`
--

CREATE TABLE `useraccount` (
  `Id` int(11) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `AccessLevel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `useraccount`
--

INSERT INTO `useraccount` (`Id`, `Name`, `username`, `password`, `email`, `AccessLevel`) VALUES
(1, 'Irfan', 'admin', 'admin', 'ifanunik@gmail.com', 1),
(2, 'Farhana', 'fana', '1234', 'fana@gmail.com', 1),
(3, 'Bella', 'bella', '1234', 'bella@gmail.com', 1),
(4, 'azim', 'azim', '1234', 'azim@gmail.com', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`InvoiceId`);

--
-- Indexes for table `useraccount`
--
ALTER TABLE `useraccount`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `invoice`
--
ALTER TABLE `invoice`
  MODIFY `InvoiceId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT for table `useraccount`
--
ALTER TABLE `useraccount`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

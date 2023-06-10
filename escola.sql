-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jun 10, 2023 at 06:39 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `escola`
--

-- --------------------------------------------------------

--
-- Table structure for table `alunos`
--

CREATE TABLE `alunos` (
  `nome` varchar(30) DEFAULT NULL,
  `idade` tinyint(3) DEFAULT NULL,
  `altura` float DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `sexo` varchar(40) DEFAULT NULL,
  `cpf` varchar(14) NOT NULL,
  `data` date DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL,
  `telefone` varchar(14) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `alunos`
--

INSERT INTO `alunos` (`nome`, `idade`, `altura`, `peso`, `sexo`, `cpf`, `data`, `cep`, `telefone`, `email`) VALUES
('Pedro', 75, 189, 98, 'Masculino', '153.823.007-04', '1998-02-26', '24470-300', '(21)99999-9999', 'gbg@bg'),
('Gabriel oii', 30, 170, 87, 'Masculino', '242.424.242-42', '1998-02-26', '24447-030', '(21)99939-4778', 'gabrie2257@gmail.com'),
('rodolfo', 76, 210, 98, 'Masculino', '666.666.666-66', '1970-02-26', '24470-800', '(21)99999-9999', 'roro@roro.gmail');

-- --------------------------------------------------------

--
-- Table structure for table `logins`
--

CREATE TABLE `logins` (
  `login` varchar(30) DEFAULT NULL,
  `senha` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `logins`
--

INSERT INTO `logins` (`login`, `senha`) VALUES
('pedro', '123'),
('gb', '123'),
('pedro', '123');

-- --------------------------------------------------------

--
-- Table structure for table `professores`
--

CREATE TABLE `professores` (
  `nome` varchar(30) DEFAULT NULL,
  `idade` tinyint(3) DEFAULT NULL,
  `sexo` varchar(40) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `cep` varchar(14) DEFAULT NULL,
  `telefone` varchar(14) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `formacao` varchar(50) DEFAULT NULL,
  `materia` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `professores`
--

INSERT INTO `professores` (`nome`, `idade`, `sexo`, `cpf`, `data`, `cep`, `telefone`, `email`, `formacao`, `materia`) VALUES
('Jose', 38, 'Masculino', '222.222.222-22', '1978-02-26', '22222-222', '(  )     -    ', 'jose@jose.com', 'Design', 'Design Thinking'),
('mao', 16, 'Masculino', '999.999.999-99', '1998-02-26', '24470-300', '(21)99999-9999', 'gb@gb', 'artes', 'guerra');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alunos`
--
ALTER TABLE `alunos`
  ADD PRIMARY KEY (`cpf`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

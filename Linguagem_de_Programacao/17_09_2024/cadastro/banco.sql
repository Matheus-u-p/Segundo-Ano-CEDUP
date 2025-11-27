-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 17/09/2024 às 15:35
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `banco`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `clientes`
--

CREATE TABLE `clientes` (
  `id_cliente` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `documento` varchar(50) DEFAULT NULL,
  `genero` varchar(30) DEFAULT NULL,
  `rg` varchar(20) DEFAULT NULL,
  `estadocivil` varchar(20) DEFAULT NULL,
  `datanascimento` date DEFAULT NULL,
  `cep` varchar(50) DEFAULT NULL,
  `endereco` varchar(200) DEFAULT NULL,
  `numero` varchar(11) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  `cidade` varchar(200) DEFAULT NULL,
  `estado` varchar(200) DEFAULT NULL,
  `celular` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `obs` varchar(200) DEFAULT NULL,
  `situacao` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `clientes`
--

INSERT INTO `clientes` (`id_cliente`, `nome`, `documento`, `genero`, `rg`, `estadocivil`, `datanascimento`, `cep`, `endereco`, `numero`, `bairro`, `cidade`, `estado`, `celular`, `email`, `obs`, `situacao`) VALUES
(1, 'rere', '547,227,578-75', 'genero', '68766876', 'Casado(a)', '0000-00-00', '8678678', 'ewew', '142', 'qwewq', 're', 'Tocantins', '(12) 34899-5484', 'ew@', 'teste', 'Ativo'),
(3, 'oi', '468,468,421-56', 'genero', '  ,   ,   -', 'União Estável', '0000-00-00', '44488-485', 'rua2', '226', 'ree', 're', 'Tocantins', '(12) 24444-8874', 'oi@gmail.com', 'Testezinho', 'Ativo'),
(4, '', '   ,   ,   -', 'genero', '  ,   ,   -', '', '1983-02-10', '     -', '', '', '', '', '', '(  )      -', '', '', 'Ativo');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

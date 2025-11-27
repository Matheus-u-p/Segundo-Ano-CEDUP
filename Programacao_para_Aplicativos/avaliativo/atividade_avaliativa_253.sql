-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 09/12/2024 às 19:53
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
-- Banco de dados: `atividade_avaliativa_253`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `produtos_beleza`
--

CREATE TABLE `produtos_beleza` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `unidade_med` char(2) DEFAULT NULL,
  `marca` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Despejando dados para a tabela `produtos_beleza`
--

INSERT INTO `produtos_beleza` (`codigo`, `nome`, `unidade_med`, `marca`) VALUES
(1, 'perfume', 'ml', 'boticario'),
(2, 'maquiagem', 'gm', 'teste'),
(3, 'baton', 'g', 'avon'),
(4, 'base', 'mg', 'jequiti');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `produtos_beleza`
--
ALTER TABLE `produtos_beleza`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `produtos_beleza`
--
ALTER TABLE `produtos_beleza`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

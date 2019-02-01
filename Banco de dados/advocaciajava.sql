-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 27-Nov-2018 às 05:33
-- Versão do servidor: 10.1.34-MariaDB
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `advocaciajava`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `advogado`
--

CREATE TABLE `advogado` (
  `id` int(5) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `oab` int(5) DEFAULT NULL,
  `sexo` varchar(45) DEFAULT NULL,
  `Endereco_idEndereco` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `advogado`
--

INSERT INTO `advogado` (`id`, `email`, `nome`, `oab`, `sexo`, `Endereco_idEndereco`) VALUES
(1, 'kleber@gmail.com', 'Kleber', 12345, 'm', 1),
(2, 'isadora@gmail.com', 'Isadora', 54321, 'f', 2),
(3, 'marcos@legal.com', 'Marcos', 14725, 'm', 3),
(4, 'cadu@analista.com', 'Carlos', 96325, 'm', 4);

-- --------------------------------------------------------

--
-- Estrutura da tabela `audiencia`
--

CREATE TABLE `audiencia` (
  `dataAudiencia` varchar(15) DEFAULT NULL,
  `idAudiencia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `audiencia`
--

INSERT INTO `audiencia` (`dataAudiencia`, `idAudiencia`) VALUES
('21/11/2018', 1),
('25/11/2018', 2),
('26/02/2019', 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `audienciaadvogado`
--

CREATE TABLE `audienciaadvogado` (
  `idAudienciaAdvogado` int(11) NOT NULL,
  `motivoAgendamento` varchar(100) NOT NULL,
  `Audiencia_idAudiencia` int(11) NOT NULL,
  `Advogado_id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `audienciaadvogado`
--

INSERT INTO `audienciaadvogado` (`idAudienciaAdvogado`, `motivoAgendamento`, `Audiencia_idAudiencia`, `Advogado_id`) VALUES
(1, 'Processo de nº 123414', 1, 1),
(2, 'Processo de nº 897856', 2, 2),
(3, 'Processo de nº 456780', 3, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `audienciacliente`
--

CREATE TABLE `audienciacliente` (
  `idAudienciaCliente` int(11) NOT NULL,
  `motivoAgendamento` varchar(100) NOT NULL,
  `Audiencia_idAudiencia` int(11) NOT NULL,
  `Cliente_cpf` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `audienciacliente`
--

INSERT INTO `audienciacliente` (`idAudienciaCliente`, `motivoAgendamento`, `Audiencia_idAudiencia`, `Cliente_cpf`) VALUES
(1, 'Acompanhamento do processo', 1, '123.456.789-10'),
(2, 'Acompanhamento do processo', 2, '987.654.321-10');

-- --------------------------------------------------------

--
-- Estrutura da tabela `audienciajuiz`
--

CREATE TABLE `audienciajuiz` (
  `Audiencia_idAudiencia` int(11) NOT NULL,
  `Juiz_id` int(11) NOT NULL,
  `idAudienciaJuiz` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `audienciajuiz`
--

INSERT INTO `audienciajuiz` (`Audiencia_idAudiencia`, `Juiz_id`, `idAudienciaJuiz`) VALUES
(1, 1, 1),
(2, 2, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `nome` varchar(100) DEFAULT NULL,
  `cpf` varchar(45) NOT NULL,
  `idade` int(5) DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  `Endereco_idEndereco` int(11) NOT NULL,
  `Advogado_id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`nome`, `cpf`, `idade`, `sexo`, `Endereco_idEndereco`, `Advogado_id`) VALUES
('João', '101.202.303-96', 18, 'm', 2, 1),
('Raquel', '123.456.789-10', 34, 'f', 1, 1),
('Pedro', '147.258.369-10', 19, 'm', 4, 2),
('Marcela', '987.654.321-10', 56, 'f', 2, 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `deagendamento`
--

CREATE TABLE `deagendamento` (
  `motivoAgendamento` varchar(200) DEFAULT NULL,
  `idAgendamento` int(11) NOT NULL,
  `dataAgendada` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `deagendamento`
--

INSERT INTO `deagendamento` (`motivoAgendamento`, `idAgendamento`, `dataAgendada`) VALUES
('Incriminar o sr. Albert', 1, '25/11/2018'),
('Processar minha empresa', 2, '02/01/2019');

-- --------------------------------------------------------

--
-- Estrutura da tabela `deagendamentocliente`
--

CREATE TABLE `deagendamentocliente` (
  `DeAgendamento_idAgendamento` int(11) NOT NULL,
  `Cliente_cpf` varchar(45) NOT NULL,
  `idDeAgendamentoCliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `deagendamentocliente`
--

INSERT INTO `deagendamentocliente` (`DeAgendamento_idAgendamento`, `Cliente_cpf`, `idDeAgendamentoCliente`) VALUES
(1, '123.456.789-10', 1),
(1, '147.258.369-10', 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `defuncionario`
--

CREATE TABLE `defuncionario` (
  `dataAgendada` varchar(11) NOT NULL,
  `motivoAgendamento` varchar(200) DEFAULT NULL,
  `idAgendamento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `defuncionario`
--

INSERT INTO `defuncionario` (`dataAgendada`, `motivoAgendamento`, `idAgendamento`) VALUES
('21/11/2018', 'Reunião de rotina', 1),
('22/11/2018', 'Admissão de novo empregado', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `defuncionarioadvogado`
--

CREATE TABLE `defuncionarioadvogado` (
  `DeFuncionario_idAgendamento` int(11) NOT NULL,
  `Advogado_id` int(5) NOT NULL,
  `idDeFuncionarioAdvogado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `defuncionarioadvogado`
--

INSERT INTO `defuncionarioadvogado` (`DeFuncionario_idAgendamento`, `Advogado_id`, `idDeFuncionarioAdvogado`) VALUES
(2, 3, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `defuncionariogerente`
--

CREATE TABLE `defuncionariogerente` (
  `idDeFuncionarioGerente` int(11) NOT NULL,
  `DeFuncionario_idAgendamento` int(11) NOT NULL,
  `Gerente_id` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `defuncionariogerente`
--

INSERT INTO `defuncionariogerente` (`idDeFuncionarioGerente`, `DeFuncionario_idAgendamento`, `Gerente_id`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `endereco`
--

CREATE TABLE `endereco` (
  `idEndereco` int(11) NOT NULL,
  `rua` varchar(100) DEFAULT NULL,
  `numero` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `endereco`
--

INSERT INTO `endereco` (`idEndereco`, `rua`, `numero`) VALUES
(1, 'Areal', 13),
(2, 'Aguas Claras', 23),
(3, 'Ceilândia', 48),
(4, 'Brazlândia', 96),
(5, 'VIcente Pires', 14),
(6, 'Planaltina', 25);

-- --------------------------------------------------------

--
-- Estrutura da tabela `gerente`
--

CREATE TABLE `gerente` (
  `id` int(5) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `cpf` varchar(15) DEFAULT NULL,
  `sexo` varchar(15) DEFAULT NULL,
  `Endereco_idEndereco` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `gerente`
--

INSERT INTO `gerente` (`id`, `email`, `nome`, `cpf`, `sexo`, `Endereco_idEndereco`) VALUES
(1, 'lucas@gmail.com', 'Lucas', '369.258.147-20', 'm', 2),
(2, 'marina@outlook.com', 'Marina', '753.159.023-74', 'f', 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `juiz`
--

CREATE TABLE `juiz` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `juiz`
--

INSERT INTO `juiz` (`id`, `nome`) VALUES
(1, 'Reginaldo'),
(2, 'Edson'),
(3, 'Sergio');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `advogado`
--
ALTER TABLE `advogado`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_Advogado_Endereco1_idx` (`Endereco_idEndereco`);

--
-- Indexes for table `audiencia`
--
ALTER TABLE `audiencia`
  ADD PRIMARY KEY (`idAudiencia`);

--
-- Indexes for table `audienciaadvogado`
--
ALTER TABLE `audienciaadvogado`
  ADD PRIMARY KEY (`Audiencia_idAudiencia`,`Advogado_id`),
  ADD KEY `fk_Audiencia_has_Advogado_Advogado1_idx` (`Advogado_id`),
  ADD KEY `fk_Audiencia_has_Advogado_Audiencia1_idx` (`Audiencia_idAudiencia`);

--
-- Indexes for table `audienciacliente`
--
ALTER TABLE `audienciacliente`
  ADD PRIMARY KEY (`Audiencia_idAudiencia`,`Cliente_cpf`),
  ADD KEY `fk_Audiencia_has_Cliente_Cliente1_idx` (`Cliente_cpf`),
  ADD KEY `fk_Audiencia_has_Cliente_Audiencia1_idx` (`Audiencia_idAudiencia`);

--
-- Indexes for table `audienciajuiz`
--
ALTER TABLE `audienciajuiz`
  ADD PRIMARY KEY (`idAudienciaJuiz`),
  ADD KEY `fk_Audiencia_has_Juiz_Juiz1_idx` (`Juiz_id`),
  ADD KEY `fk_Audiencia_has_Juiz_Audiencia_idx` (`Audiencia_idAudiencia`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cpf`),
  ADD KEY `fk_Cliente_Endereco1_idx` (`Endereco_idEndereco`),
  ADD KEY `fk_Cliente_Advogado1_idx` (`Advogado_id`);

--
-- Indexes for table `deagendamento`
--
ALTER TABLE `deagendamento`
  ADD PRIMARY KEY (`idAgendamento`);

--
-- Indexes for table `deagendamentocliente`
--
ALTER TABLE `deagendamentocliente`
  ADD PRIMARY KEY (`DeAgendamento_idAgendamento`,`Cliente_cpf`),
  ADD KEY `fk_DeAgendamento_has_Cliente_Cliente1_idx` (`Cliente_cpf`),
  ADD KEY `fk_DeAgendamento_has_Cliente_DeAgendamento1_idx` (`DeAgendamento_idAgendamento`);

--
-- Indexes for table `defuncionario`
--
ALTER TABLE `defuncionario`
  ADD PRIMARY KEY (`idAgendamento`);

--
-- Indexes for table `defuncionarioadvogado`
--
ALTER TABLE `defuncionarioadvogado`
  ADD PRIMARY KEY (`idDeFuncionarioAdvogado`),
  ADD KEY `fk_DeFuncionario_has_Advogado_Advogado1_idx` (`Advogado_id`),
  ADD KEY `fk_DeFuncionario_has_Advogado_DeFuncionario1_idx` (`DeFuncionario_idAgendamento`);

--
-- Indexes for table `defuncionariogerente`
--
ALTER TABLE `defuncionariogerente`
  ADD PRIMARY KEY (`idDeFuncionarioGerente`),
  ADD KEY `fk_DeFuncionario_has_Gerente_Gerente1_idx` (`Gerente_id`),
  ADD KEY `fk_DeFuncionario_has_Gerente_DeFuncionario1_idx` (`DeFuncionario_idAgendamento`);

--
-- Indexes for table `endereco`
--
ALTER TABLE `endereco`
  ADD PRIMARY KEY (`idEndereco`);

--
-- Indexes for table `gerente`
--
ALTER TABLE `gerente`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_Gerente_Endereco1_idx` (`Endereco_idEndereco`);

--
-- Indexes for table `juiz`
--
ALTER TABLE `juiz`
  ADD PRIMARY KEY (`id`);

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `advogado`
--
ALTER TABLE `advogado`
  ADD CONSTRAINT `fk_Advogado_Endereco1` FOREIGN KEY (`Endereco_idEndereco`) REFERENCES `endereco` (`idEndereco`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `audienciaadvogado`
--
ALTER TABLE `audienciaadvogado`
  ADD CONSTRAINT `fk_Audiencia_has_Advogado_Advogado1` FOREIGN KEY (`Advogado_id`) REFERENCES `advogado` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_Audiencia_has_Advogado_Audiencia1` FOREIGN KEY (`Audiencia_idAudiencia`) REFERENCES `audiencia` (`idAudiencia`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `audienciacliente`
--
ALTER TABLE `audienciacliente`
  ADD CONSTRAINT `fk_Audiencia_has_Cliente_Audiencia1` FOREIGN KEY (`Audiencia_idAudiencia`) REFERENCES `audiencia` (`idAudiencia`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_Audiencia_has_Cliente_Cliente1` FOREIGN KEY (`Cliente_cpf`) REFERENCES `cliente` (`cpf`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `audienciajuiz`
--
ALTER TABLE `audienciajuiz`
  ADD CONSTRAINT `fk_Audiencia_has_Juiz_Audiencia` FOREIGN KEY (`Audiencia_idAudiencia`) REFERENCES `audiencia` (`idAudiencia`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_Audiencia_has_Juiz_Juiz1` FOREIGN KEY (`Juiz_id`) REFERENCES `juiz` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `fk_Cliente_Advogado1` FOREIGN KEY (`Advogado_id`) REFERENCES `advogado` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_Cliente_Endereco1` FOREIGN KEY (`Endereco_idEndereco`) REFERENCES `endereco` (`idEndereco`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `deagendamentocliente`
--
ALTER TABLE `deagendamentocliente`
  ADD CONSTRAINT `fk_DeAgendamento_has_Cliente_Cliente1` FOREIGN KEY (`Cliente_cpf`) REFERENCES `cliente` (`cpf`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_DeAgendamento_has_Cliente_DeAgendamento1` FOREIGN KEY (`DeAgendamento_idAgendamento`) REFERENCES `deagendamento` (`idAgendamento`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `defuncionarioadvogado`
--
ALTER TABLE `defuncionarioadvogado`
  ADD CONSTRAINT `fk_DeFuncionario_has_Advogado_Advogado1` FOREIGN KEY (`Advogado_id`) REFERENCES `advogado` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_DeFuncionario_has_Advogado_DeFuncionario1` FOREIGN KEY (`DeFuncionario_idAgendamento`) REFERENCES `defuncionario` (`idAgendamento`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `defuncionariogerente`
--
ALTER TABLE `defuncionariogerente`
  ADD CONSTRAINT `fk_DeFuncionario_has_Gerente_DeFuncionario1` FOREIGN KEY (`DeFuncionario_idAgendamento`) REFERENCES `defuncionario` (`idAgendamento`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_DeFuncionario_has_Gerente_Gerente1` FOREIGN KEY (`Gerente_id`) REFERENCES `gerente` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `gerente`
--
ALTER TABLE `gerente`
  ADD CONSTRAINT `fk_Gerente_Endereco1` FOREIGN KEY (`Endereco_idEndereco`) REFERENCES `endereco` (`idEndereco`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

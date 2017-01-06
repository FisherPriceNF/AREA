-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Ven 06 Janvier 2017 à 11:33
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `area`
--

-- --------------------------------------------------------

--
-- Structure de la table `connexion`
--

CREATE TABLE `connexion` (
  `mail_client` varchar(255) NOT NULL COMMENT 'Id du clients.',
  `last_connection` datetime NOT NULL,
  `connect_errors` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='Etat de sauvegarde des comptes.';

--
-- Contenu de la table `connexion`
--

INSERT INTO `connexion` (`mail_client`, `last_connection`, `connect_errors`) VALUES
('lucas_chessa@hotmail.fr', '2017-01-06 12:32:15', 0),
('Nico.Font@ep.eu', '2017-01-06 12:27:32', 0);

-- --------------------------------------------------------

--
-- Structure de la table `membre`
--

CREATE TABLE `membre` (
  `mail_client` varchar(255) NOT NULL COMMENT 'identifiants adresse mail.',
  `password` varchar(32) NOT NULL,
  `nom` varchar(255) NOT NULL COMMENT 'nom du clients.',
  `prenom` varchar(255) NOT NULL COMMENT 'prenom du clients.',
  `facebook_iden` varchar(255) DEFAULT NULL COMMENT 'identifiants facebook.',
  `twitter_iden` varchar(255) DEFAULT NULL COMMENT 'identifiants twitter',
  `skype_iden` varchar(255) DEFAULT NULL COMMENT 'identifiants skype',
  `epitech_iden` varchar(255) DEFAULT NULL COMMENT 'identifiants epitech'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='Table qui défini un membre.';

--
-- Contenu de la table `membre`
--

INSERT INTO `membre` (`mail_client`, `password`, `nom`, `prenom`, `facebook_iden`, `twitter_iden`, `skype_iden`, `epitech_iden`) VALUES
('Nico.Font@ep.eu', 'ab4f63f9ac65152575886860dde480a1', 'Nicolas', 'Fontanet', NULL, NULL, NULL, NULL),
('lucas_chessa@hotmail.fr', 'ed735d55415bee976b771989be8f7005', 'Chessa', 'Lucas', NULL, NULL, NULL, NULL);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `connexion`
--
ALTER TABLE `connexion`
  ADD PRIMARY KEY (`mail_client`),
  ADD UNIQUE KEY `mail_client` (`mail_client`);

--
-- Index pour la table `membre`
--
ALTER TABLE `membre`
  ADD PRIMARY KEY (`mail_client`),
  ADD UNIQUE KEY `mail_client` (`mail_client`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

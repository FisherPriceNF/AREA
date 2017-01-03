-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Mar 03 Janvier 2017 à 10:05
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
  `id_clients` int(10) UNSIGNED NOT NULL COMMENT 'Id du clients.',
  `etat_facebook` tinyint(1) NOT NULL COMMENT 'etat si la sauvegarde active ou pas.',
  `etat_twitter` tinyint(1) NOT NULL COMMENT 'etat si la sauvegarde active ou pas',
  `etat_mail` tinyint(1) NOT NULL COMMENT 'etat si la sauvegarde active ou pas',
  `etat_skype` varchar(255) NOT NULL,
  `etat_epitech` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='Etat de sauvegarde des comptes.';

-- --------------------------------------------------------

--
-- Structure de la table `membres`
--

CREATE TABLE `membres` (
  `id_clients` int(11) UNSIGNED NOT NULL COMMENT 'id du clients.',
  `nom` varchar(255) NOT NULL COMMENT 'nom du clients.',
  `prenom` varchar(255) NOT NULL COMMENT 'prenom du clients.',
  `facebook_iden` varchar(255) DEFAULT NULL COMMENT 'identifiants facebook.',
  `twitter_iden` varchar(255) DEFAULT NULL COMMENT 'identifiants twitter',
  `skype_iden` varchar(255) DEFAULT NULL COMMENT 'identifiants skype',
  `epitech_iden` varchar(255) DEFAULT NULL COMMENT 'identifiants epitech',
  `mail_iden` varchar(255) DEFAULT NULL COMMENT 'identifiants adresse mail.'
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='Table qui défini un membre.';

-- --------------------------------------------------------

--
-- Structure de la table `register`
--

CREATE TABLE `register` (
  `nom_clients` varchar(255) NOT NULL COMMENT 'Nom du clients.',
  `date_register` datetime DEFAULT NULL COMMENT 'Date de register.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Membres enregistrer.';

--
-- Index pour les tables exportées
--

--
-- Index pour la table `connexion`
--
ALTER TABLE `connexion`
  ADD PRIMARY KEY (`id_clients`);

--
-- Index pour la table `membres`
--
ALTER TABLE `membres`
  ADD PRIMARY KEY (`id_clients`);

--
-- Index pour la table `register`
--
ALTER TABLE `register`
  ADD PRIMARY KEY (`nom_clients`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `connexion`
--
ALTER TABLE `connexion`
  MODIFY `id_clients` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Id du clients.';
--
-- AUTO_INCREMENT pour la table `membres`
--
ALTER TABLE `membres`
  MODIFY `id_clients` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id du clients.';
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

DROP TABLE IF EXISTS `patrimonio`;
CREATE TABLE IF NOT EXISTS `patrimonio` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nome` text COLLATE utf8_unicode_ci,
  `descricao` text COLLATE utf8_unicode_ci,
  `composicao` text COLLATE utf8_unicode_ci,
  `localizacao` text COLLATE utf8_unicode_ci,
  `valor` text COLLATE utf8_unicode_ci,
  `data` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `Estado` text COLLATE utf8_unicode_ci,
  `foto` text COLLATE utf8_unicode_ci,
  `criado` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `atualizado` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`),
  UNIQUE KEY `codigo` (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

TRUNCATE TABLE `patrimonio`;
INSERT INTO `patrimonio` (`id`, `codigo`, `nome`, `descricao`, `composicao`, `localizacao`, `valor`, `data`, `Estado`, `foto`, `criado`, `atualizado`) VALUES
(1, 'asdsdfdsfs3', 'nome', 'descricao', 'Composicao', 'localizacao', '3.0', '2016-03-30 03:00:00', 'NOVO', '/home/elder/shared/OneDrive/faculdade/faculdade-2-2016/laboratorio/atividade2/controle_patrimonio/build/classes/br/com/elderxavier/images/no-image.png', '2016-11-11 03:28:55', '2016-11-12 21:57:33'),
(3, 'sdf', 'sdfs', 'sdfsd', 'fdsdf', 'sdfgd', '0.0', '2016-11-12 02:00:00', 'NOVO', '/home/elder/shared/OneDrive/faculdade/faculdade-2-2016/laboratorio/atividade2/controle_patrimonio/build/classes/br/com/elderxavier/images/no-image.png', '2016-11-11 03:42:54', '2016-11-12 20:57:24'),
(6, 'asdg', 'hfd', 'sfg', 'hjh', 'sft', '0.0', '2016-11-12 02:00:00', 'NOVO', '/home/elder/shared/OneDrive/faculdade/faculdade-2-2016/laboratorio/atividade2/controle_patrimonio/build/classes/br/com/elderxavier/images/no-image.png', '2016-11-11 03:49:35', '2016-11-12 20:57:26'),
(7, 'cdfg', 'cfg', 'ghjgf', 'afg', 'fdgh', '10.0', '2016-11-12 02:00:00', 'NOVO', '/home/elder/shared/OneDrive/faculdade/faculdade-2-2016/laboratorio/atividade2/controle_patrimonio/build/classes/br/com/elderxavier/images/no-image.png', '2016-11-11 03:51:29', '2016-11-12 20:57:28'),
(8, 'DSF', 'SDFFS', 'SDFF', 'FFSSD', 'SDFF', '100.0', '2016-11-12 02:00:00', 'NOVO', '/home/elder/shared/OneDrive/faculdade/faculdade-2-2016/laboratorio/atividade2/controle_patrimonio/build/classes/br/com/elderxavier/images/no-image.png', '2016-11-11 03:53:04', '2016-11-12 20:57:30'),
(9, 'jfgfhg', 'dfsaf', 'gffdt', 'ghf', '3yhf', '5000.0', '2016-11-12 02:00:00', 'NOVO', '/home/elder/Documentos/tontos.png', '2016-11-11 04:02:59', '2016-11-12 20:38:41'),
(13, 'asdd2', 'dassa', 'sddda', 'asd', 'dasas', '5000.0', '2016-11-12 02:00:00', 'NOVO', '/home/elder/Documentos/tontos.png', '2016-11-11 04:07:14', '2016-11-12 20:57:55'),
(15, 'asdd23', 'dassa', 'sddda', 'asd', 'dasas', '5000.0', '2016-11-12 02:00:00', 'NOVO', '/home/elder/Documentos/tontos.png', '2016-11-11 04:07:21', '2016-11-12 20:58:05'),
(17, 'sdff', 'sdfs', 'asdfs', 'fsdf', 'sdfs', '1000.0', '2016-11-12 02:00:00', 'NOVO', '/home/elder/Documentos/festa-animal.jpg', '2016-11-11 04:10:25', '2016-11-12 20:50:11'),
(19, 'sdf3', 'fssdf', 'fsdf', 'sdfs', 'sdfs', '1.11', '2016-11-12 02:00:00', 'NOVO', '/home/elder/Documentos/Brasão Taboão da Serra.jpg', '2016-11-11 04:25:38', '2016-11-12 20:49:39'),
(21, 'dfsd5', 'vcvc', 'vcc', 'vvcc', 'vvvc', '120.0', '2016-11-12 02:00:00', 'NOVO', '/home/elder/shared/OneDrive/faculdade/faculdade-2-2016/laboratorio/atividade2/controle_patrimonio/build/classes/br/com/elderxavier/images/no-image.png', '2016-11-11 04:36:52', '2016-11-12 04:23:00'),
(23, 'fsdfs2', 'gsfdNovo', 'ghdg', 'retg', 'ffgdh', '11.77', '2016-01-11 02:00:00', 'RESTAURADO', '/home/elder/shared/OneDrive/faculdade/faculdade-2-2016/laboratorio/atividade2/controle_patrimonio/build/classes/br/com/elderxavier/images/no-image.png', '2016-11-11 04:42:28', '2016-11-12 04:41:59'),
(25, 'sdfs5', 'sdfsdf', 'bgdfsdgf', 'bdvbn', 'gsggfjs', '1000.0', '2016-01-11 02:00:00', 'NOVO', '/home/elder/shared/OneDrive/faculdade/faculdade-2-2016/laboratorio/atividade2/controle_patrimonio/build/classes/br/com/elderxavier/images/no-image.png', '2016-11-11 11:43:39', '2016-11-12 04:18:54'),
(27, 'fgjjh', 'dfgdf', 'srwter', 'gfhfdh', 'ghfghdf', '100.0', '2016-01-11 02:00:00', 'RESTAURADO', '/home/elder/Documentos/tontos.png', '2016-11-11 11:54:43', '2016-11-12 04:18:35'),
(33, 'asdg3', 'hfd', 'sfg', 'hjh', 'sft', '0.0', '2016-11-12 02:00:00', 'NOVO', '/home/elder/Documentos/tontos.png', '2016-11-12 05:34:17', '2016-11-12 05:34:33');
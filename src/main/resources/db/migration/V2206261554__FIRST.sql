CREATE TABLE `grocery` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(90) COLLATE utf8mb4_unicode_ci NOT NULL,
  `manufacturer` varchar(90) COLLATE utf8mb4_unicode_ci NOT NULL,
  `available_days` int unsigned NOT NULL,
  `entered` tinyint NOT NULL,
  `entered_at` datetime NOT NULL,
  `created_at` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

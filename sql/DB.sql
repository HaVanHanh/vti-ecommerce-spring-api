
-- ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root';
-- FLUSH PRIVILEGES;
-- create database
DROP DATABASE IF EXISTS express_typeorm_database;
CREATE DATABASE express_typeorm_database;
USE express_typeorm_database;

-- create table: users
DROP TABLE IF EXISTS users;
CREATE TABLE users(

  id						TINYINT  AUTO_INCREMENT PRIMARY KEY,
  firstName 				NVARCHAR(100),
  lastName					NVARCHAR(100),
  email 					VARCHAR(255) UNIQUE,
  `password`				VARCHAR(60) DEFAULT "password",  -- using Bcrypt
  `status` 					BIT ,
  `avatar` 					VARCHAR(1000),
  `language` 				TINYINT

);

CREATE TABLE `role` (
 `id` TINYINT(11) NOT NULL AUTO_INCREMENT,
 `name` varchar(255) NOT NULL,
 PRIMARY KEY (`id`)
);

CREATE TABLE `user_role` (
 `user_id` TINYINT(11) NOT NULL,
 `role_id` TINYINT(11) NOT NULL,
 PRIMARY KEY (`user_id`,`role_id`)
);

-- ALTER TABLE users
-- ADD FOREIGN KEY (roleID) REFERENCES `role`(roleID);

-- create table: categories
DROP TABLE IF EXISTS categories;
CREATE TABLE categories(

  id						TINYINT  AUTO_INCREMENT PRIMARY KEY,
  `name` 					NVARCHAR(100) UNIQUE,
  slug						VARCHAR(100),
  `description` 			VARCHAR(100),
  `image`					NVARCHAR(2083),
  `status` 					BIT ,
  `avatar` 					VARCHAR(1000),
  id_parent					TINYINT ,
  FOREIGN KEY (id_parent) REFERENCES categories(id) 	
);


-- create table: categories
DROP TABLE IF EXISTS products;
CREATE TABLE products(
  id						TINYINT  AUTO_INCREMENT PRIMARY KEY,
  `name` 					NVARCHAR(100),
  sku						VARCHAR(100),
  `description` 			VARCHAR(100),
  `short_description`		VARCHAR(100),
  `image` 					VARCHAR(2083) ,
  `list_price` 				INT,
  `sell_price`				INT,
  `status`					BOOLEAN,
  id_category				TINYINT ,
   FOREIGN KEY (id_category) REFERENCES categories(id) 
);
/*
============================INSERT DATA============================

=================================================================== 
*/

-- INSERT INTO `role`
-- VALUE	( 0,		"ROLE_ADMIN" ),
-- 		( 1,		"ROLE_MEMBER" );


INSERT INTO users (firstName,	lastName,		email,
							
				`password`,		`status`,		`avatar`,		`language`)
VALUES
				('Hà ',			'Văn Hanh',			'hanhhanoi1999@gmail.com',	'$2y$12$SxySj10lkuA18p.S73ZAPuQCJI/FB1Rs/JAARvE.Fit6Lx/ljRZDe',		1, 		1,		1),
				('Vũ ',			'Văn Hùng',			'hung1212121@gmail.com',	'$2y$12$SxySj10lkuA18p.S73ZAPuQCJI/FB1Rs/JAARvE.Fit6Lx/ljRZDe',		1, 		1,		1),
				('Nguyễn ',		'Văn Hoàng',		'hoang1212121@gmail.com',	'$2y$12$SxySj10lkuA18p.S73ZAPuQCJI/FB1Rs/JAARvE.Fit6Lx/ljRZDe',		1, 		1,		1),
				('Phạm ',		'Tiến Anh',			'tanh12121219@gmail.com',	'$2y$12$SxySj10lkuA18p.S73ZAPuQCJI/FB1Rs/JAARvE.Fit6Lx/ljRZDe',		1, 		1,		1),
				('Phạm ',		'Văn Hiệu',			'vhieu1212121@gmail.com',	'$2y$12$SxySj10lkuA18p.S73ZAPuQCJI/FB1Rs/JAARvE.Fit6Lx/ljRZDe',		1, 		1,		1),
				('Phạm ',		'Thị Mai',			'maithi1212121@gmail.com',	'$2y$12$SxySj10lkuA18p.S73ZAPuQCJI/FB1Rs/JAARvE.Fit6Lx/ljRZDe',		1, 		1,		1),
				('Nguyễn ',		'Trung Hiếu',		'hieu1212121@gmail.com',	'$2y$12$SxySj10lkuA18p.S73ZAPuQCJI/FB1Rs/JAARvE.Fit6Lx/ljRZDe',		1, 		1,		1);
  
  
  /*
  samsungLogo: string = 'https://3dwarehouse.sketchup.com/warehouse/v1.0/publiccontent/37941423-e2c5-4002-9643-e09861ccc11f';
  xiaomiLogo: string = 'https://2.bp.blogspot.com/-o4mrxDVmfEc/XDRS4dJK_uI/AAAAAAAACko/RmHfTEdfh8gYHYkCLFcfP-OFHqf8ojBSwCLcBGAs/w1200-h630-p-k-no-nu/Xiaomi-logo.jpg';
  appleLogo: string = 'https://img.adsangtao.com/2018/10/19865af1-iconsiam.jpg';
  lgLogo: string = 'https://i.ytimg.com/vi/lPenrjRWbw8/maxresdefault.jpg';
  sonyLogo: string = 'https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/09b224b1-0efe-48b7-9375-849e413ff1ef/dc9r397-da6a2ef2-c61d-42da-bfa1-1fe6eeb3b238.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOiIsImlzcyI6InVybjphcHA6Iiwib2JqIjpbW3sicGF0aCI6IlwvZlwvMDliMjI0YjEtMGVmZS00OGI3LTkzNzUtODQ5ZTQxM2ZmMWVmXC9kYzlyMzk3LWRhNmEyZWYyLWM2MWQtNDJkYS1iZmExLTFmZTZlZWIzYjIzOC5wbmcifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6ZmlsZS5kb3dubG9hZCJdfQ.Lc0VEElO82A5-CpRtBIxsVvocYInaPFSgCMTzVgZaMg';
  vsmartLogo: string = 'https://vsmart.net/eu-vi/EuropeTheme/images/default.jpg';
  oppoLogo: string = 'https://cellphones.com.vn/sforum/wp-content/uploads/2019/09/oppo-reno-logo-a.jpg';
  
  */
INSERT INTO categories 
					(`name`,				`slug`,						`description`,					`image`,		`status`,		`avatar`)
VALUES	
					('Samsung',				'slug',						'description',					'https://st.quantrimang.com/photos/image/112012/06/samsung.jpg',												1, 			'avatar' ),
					('Apple ',				'slug',						'description',					'https://img.adsangtao.com/2018/10/19865af1-iconsiam.jpg',														1, 			'avatar' ),
					('Xiaomi',				'slug',						'description',					'https://vnrom.net/wp-content/uploads/2016/12/Xiaomi-logo.jpg',													1, 			'avatar' ),
					('LG',					'slug',						'description',					'https://dienlanhphucthinh.com/wp-content/uploads/2017/02/bao-hanh-sua-chua-tivi-lg-quan-1.jpg',			    1, 			'avatar' ),
					('LG1',					'slug',						'description',					'https://dienlanhphucthinh.com/wp-content/uploads/2017/02/bao-hanh-sua-chua-tivi-lg-quan-1.jpg',			    1, 			'avatar' ),
					('LG2',					'slug',						'description',					'https://dienlanhphucthinh.com/wp-content/uploads/2017/02/bao-hanh-sua-chua-tivi-lg-quan-1.jpg',			    1, 			'avatar' ),
					('Vsmart',				'slug',						'description',					'https://vsmart.net/eu-vi/EuropeTheme/images/default.jpg',			   											1, 			'avatar' );
                   
-- INSERT INTO categories 
-- 					(`name`,				`slug`,						`description`,						`image`,		`status`,		`avatar`)				
-- VALUES	
-- 					('Samsung',				'slug',						'Điện thoại hãng samsung',			'image1',			1, 			'avatar'	),		
-- 					('Apple ',				'slug',						'Điện thoại hãng Apple',			'image1',			1, 			'avatar'	),		
-- 					('Xiaomi',				'slug',						'Điện thoại hãng Xiaomi',			'image1',			1, 			'avatar'	),	
-- 					('LG',					'slug',						'Điện thoại hãng LG',				'image1',			1, 			'avatar'	),	
-- 					('Vsmart',				'slug',						'Điện thoại hãng Vsmart',			'image1',			1, 			'avatar'	);


-- `id_parent`)

-- ,			1),
-- ,			1),
-- ,			1),
-- ,			1),
-- , 			1);






INSERT INTO `products` (`name`, 					sku,						`description`, 			`short_description`,		`image`, 					
 
						`list_price`, 				`sell_price`,				`status`,					id_category		)
VALUES
	('iphone 7',			'sku_iphone7',			'Iphone 7 description',			'ihone 7 short_description',	'https://cdn.tgdd.vn/Products/Images/42/74110/iphone-7-gold-400x400.jpg',											1212,	12,		true,	2	),
	('iphone 8',			'sku_iphone8',			'Iphone 8 description',			'ihone 8 short_description',	'https://didongthongminh.vn/upload_images/2019/11/iphone8-plus-space-gray.png',										1212,	12,		true,	2	),
	('iphone x',			'sku_iphonex',			'Iphone x description',			'ihone x short_description',	'https://didongthongminh.vn/upload_images/2019/11/iphone8-plus-space-gray.png',										1212,	12,		true,	2	),
	('iphone xs',			'sku_iphonexs',			'Iphone xs description',		'ihone xs short_description',	'https://didongthongminh.vn/upload_images/2019/11/iphone8-plus-space-gray.png',										1212,	12,		true,	2	),
	('iphone 6',			'sku_iphone6',			'Iphone 6 description',			'ihone 6 short_description',	'https://didongviet.vn/pub/media/catalog/product//i/p/iphone-6-plus-16gb-quoc-te-like-new-didongviet-2_1_1.jpg',	1212,	12,		true,	2	),
	('iphone 4',			'sku_iphone4',			'Iphone 4 description',			'ihone 4 short_description',	'https://alofone.vn/wp-content/uploads/2019/07/dien-thoai-iphone-4-8gb-300x300.jpg',								1212,	12,		true,	2	);
  
  
  INSERT INTO `products` (`name`, 					sku,						`description`, 			`short_description`,		`image`, 					
 
						`list_price`, 				`sell_price`,				`status`,					id_category		)
VALUES
	('Samsung Galaxy Note 10+',					'Samsung Galaxy Note 10+',				'Samsung Galaxy Note 10+',					'Samsung Galaxy Note 10+',			    'https://cdn.tgdd.vn/Products/Images/42/206176/samsung-galaxy-note-10-plus-031220-101259-600x600.jpg',		1212,	12,		true,	1	),
	('Điện thoại Samsung Galaxy A21s ',			'Điện thoại Samsung Galaxy A21s ',		'Điện thoại Samsung Galaxy A21s ',			'Điện thoại Samsung Galaxy A21s ',		'https://cdn.tgdd.vn/Products/Images/42/219314/samsung-galaxy-a21s-055620-045659-600x600.jpg',				1212,	12,		true,	1	),
	('Samsung Galaxy ABC',						'Samsung Galaxy ABC',					'Samsung Galaxy ABC',						'Samsung Galaxy ABC',			        'https://cdn.tgdd.vn/Products/Images/42/225063/samsung-galaxy-note-20-ultra-5g-063420-123447-600x600.jpg',	1212,	12,		true,	1	),
	('Samsung Galaxy A31',						'Samsung Galaxy A31',					'Samsung Galaxy A31',					    'Samsung Galaxy A31',					'https://cdn.tgdd.vn/Products/Images/42/216174/samsung-galaxy-a31-055720-045750-600x600.jpg',				1212,	12,		true,	1	),
	('Samsung Galaxy A50s',						'Samsung Galaxy A50s',					'Samsung Galaxy A50s',						'Samsung Galaxy A50s',					'https://cdn.tgdd.vn/Products/Images/42/207641/samsung-galaxy-a50s-050020-050032-600x600.jpg',				1212,	12,		true,	1	),
	('Samsung Galaxy A20s 64GB',				'Samsung Galaxy A20s 64GB',				'Samsung Galaxy A20s 64GB',					'Samsung Galaxy A20s 64GB',			    'https://cdn.tgdd.vn/Products/Images/42/204404/samsung-galaxy-a20s-055520-045512-600x600.jpg',				1212,	12,		true,	1	);
  
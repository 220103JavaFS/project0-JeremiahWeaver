DROP TABLE IF EXISTS madden;

DROP TABLE IF EXISTS success;

/* DROP TABLE IF EXTISTS superbowls; */

DROP TABLE IF EXISTS rookie;

DROP TABLE IF EXISTS collector;

DROP TABLE IF EXISTS collections;

DROP TABLE IF EXISTS card;

CREATE TABLE madden(
	player_first_name VARCHAR(50) PRIMARY KEY,
	player_last_name VARCHAR(50),
	year_active INT
	);
	
CREATE TABLE success(
	player_last_name VARCHAR (50),
	player_postion VARCHAR(10),
	rookie_team VARCHAR(30),
	active BOOLEAN,
	super_bowls INT,
	pro_bowls INT,
	hall_of_fame BOOLEAN,
	player_number INT PRIMARY KEY
);

/*CREATE TABLE superbowls(
	super_bowl_number INT PRIMARY KEY,
	super_bowl_winner VARCHAR(50),
	super_bowl_loser VARCHAR(50),
	winner_score INT,
	loser_score INT,
	mvp_last_name VARCHAR FORIENG KEY (50)
);  I realized that this was not player specific and would be way to large. */

CREATE TABLE rookie(
	player_last_name VARCHAR(50),
	rookie_number INT,
	rookie_team VARCHAR(30),
	draft_number INT,
	rookie_year INT PRIMARY KEY
);

CREATE TABLE card(
	card_id SERIAL PRIMARY KEY,
	player_first_name VARCHAR(50),
	player_last_name VARCHAR(50),
	player_postion VARCHAR(10),
	rookie_year INT,
	madden_card BOOLEAN,
	success_card BOOLEAN,
	rookie_card BOOLEAN
);


INSERT INTO madden(player_first_name, player_last_name, year_active)
	VALUES('tom', 'brady', 21),
 ('jerry','rice', 19),
 ('lawrence', 'taylor', 12),
 ('jim', 'brown', 8),
 ('joe', 'montana',  15),
 ('peyton', 'manning', 17),
 ('barry', 'sanders',  9),
 ('reggie', 'white',  15),
 ('walter', 'payton', 12),
 ('johnny', 'unitas', 17);

INSERT INTO success(player_last_name, player_postion, rookie_team, active, super_bowls, pro_bowls, hall_of_fame, player_number)
	VALUES('brady', 'qb', 'patriots', TRUE, 9, 14, FALSE, 12),
	('rice', 'wr', '49ers', FALSE, 4, 13, TRUE, 80),
	('talyor', 'lb', 'giants', FALSE, 2, 10, TRUE, 56),
	('brown', 'rb', 'browns', FALSE, 0, 9, TRUE, 32),
	('montana', 'qb', '49ers', FALSE, 4, 8, TRUE, 16),
	('manning', 'qb', 'colts', FALSE, 4, 14, TRUE, 18),
	('sanders', 'rb', 'lions', FALSE, 0, 10, TRUE, 20),
	('white', 'dl', 'eagles', FALSE, 2, 13, TRUE, 91),
	('payton', 'rb', 'bears', FALSE, 1, 9, TRUE, 34),
	('unitas', 'qb', 'steelers', FALSE, 1, 10, TRUE, 19);

/*INSERT INT superbowls(super_bowl_number,super_bowl_winner,super_bowl_loser, winner_score, loser_score, mvp_last_name)*/

INSERT INTO rookie(player_last_name, rookie_number, rookie_team, draft_number, rookie_year)
	VALUES('brady', 12, 'patriots', 199, 2000),
	('rice', 80, '49ers', 16, 1985),
	('taylor', 56, 'giants', 2, 1981),
	('brown', 32, 'browns', 6, 1957),
	('montana', 16, '49ers', 82, 1979),
	('manning', 18, 'colts', 1, 1998),
	('sanders', 20, 'lions', 3, 1989),
	('white', 91, 'eagles', 4, 1984),
	('payton', 34, 'bears', 4, 1975),
	('unitas', 19, 'steelers', 102, 1955);

INSERT INTO card(player_first_name, player_last_name, player_postion, rookie_year, madden_card, success_card, rookie_card)
	Values('tom', 'brady', 'qb', 2000, FALSE, FALSE, TRUE),
	('jerry', 'rice', 'wr', 1985, FALSE, FALSE, TRUE),
	('lawrence', 'taylor', 'lb', 1981, FALSE, FALSE, TRUE),
	('jim', 'brown', 'rb', 1957, FALSE, FALSE, TRUE),
	('joe', 'montana', 'qb', 1979, FALSE, FALSE, TRUE),
	('peyton', 'manning', 'qb', 1998, FALSE, FALSE, TRUE),
	('barry', 'sanders', 'rb', 1989, FALSE, FALSE, TRUE),
	('reggie', 'white', 'dl', 1984, FALSE, FALSE, TRUE),
	('walter', 'payton', 'rb', 1975, FALSE, FALSE, TRUE),
	('johnny', 'unitas', 'qb', 1955, FALSE, FALSE, TRUE),
	('tom', 'brady', 'qb', 2000, FALSE, TRUE, FALSE),
	('jerry', 'rice', 'wr', 1985, FALSE, TRUE, FALSE),
	('lawrence', 'taylor', 'lb', 1981, FALSE, TRUE, FALSE),
	('jim', 'brown', 'rb', 1957, FALSE, TRUE, FALSE),
	('joe', 'montana', 'qb', 1979, FALSE, TRUE, FALSE),
	('peyton', 'manning', 'qb', 1998, FALSE, TRUE, FALSE),
	('barry', 'sanders', 'rb', 1989, FALSE, TRUE, FALSE),
	('reggie', 'white', 'dl', 1984, FALSE, TRUE, FALSE),
	('walter', 'payton', 'rb', 1975, FALSE, TRUE, FALSE),
	('johnny', 'unitas', 'qb', 1955, FALSE, TRUE, FALSE),
	('tom', 'brady', 'qb', 2000, TRUE, FALSE, FALSE),
	('jerry', 'rice', 'wr', 1985, TRUE, FALSE, FALSE),
	('lawrence', 'taylor', 'lb', 1981, TRUE, FALSE, FALSE),
	('jim', 'brown', 'rb', 1957, TRUE, FALSE, FALSE),
	('joe', 'montana', 'qb', 1979, TRUE, FALSE, FALSE),
	('peyton', 'manning', 'qb', 1998, TRUE, FALSE, FALSE),
	('barry', 'sanders', 'rb', 1989, TRUE, FALSE, FALSE),
	('reggie', 'white', 'dl', 1984, TRUE, FALSE, FALSE),
	('walter', 'payton', 'rb', 1975, TRUE, FALSE, FALSE),
	('johnny', 'unitas', 'qb', 1955, TRUE, FALSE, FALSE);
	
	
 CREATE TABLE collector( /* the error was a missing ";" for some reason I got an ERROR on the word create so I moved this table into collector.*/
	collector_allias VARCHAR(50),
	collector_stlye VARCHAR(50) PRIMARY KEY,
	collector_collection INT 
); 

INSERT INTO collector(collector_allias, collector_stlye, collector_collection)
	VALUES('rookiefinder', 'pristine', 3/10),
	('signatures', 'scribled', 8/20),
	('do not know what i have', 'bent', 15/30),
	('successful', 'incases and plastic', 30/30),
	('duplicates', 'scarcthed', 17/30),
	('over priced', 'in plastic', 4/10);

CREATE TABLE collections( /*the syntax error may have been a missing ";" before  All the sudden got a ERROR with the word key word CREATE not sure why. maybe I need a second data Script.*/
	collector_allias VARCHAR(50) PRIMARY KEY,
	collected_madden BOOLEAN,
	collected_success BOOLEAN,
	collected_rookies BOOLEAN
);

INSERT INTO collections(collector_allias, collected_madden, collected_success, collected_rookies)
	VALUES('rookiefinder', FALSE, FALSE, TRUE),
	('signatures', FALSE, TRUE, TRUE),
	('do not know what i have', TRUE, TRUE, TRUE),
	('successful', TRUE, TRUE, TRUE),
	('duplicates', TRUE, TRUE, TRUE),
	('over priced', FALSE, TRUE, FALSE);
COMMIT
	

 /*  After my first Attempt I realized that this was not going match what is looking for so this stays to show what I have learned and to 
 	improvement in my project. a documentation if you will.
	 
 
 DROP TABLE IF EXISTS animal;

 DROP TABLE IF EXISTS food;

 DROP TABLE IF EXISTS land;

 CREATE TABLE animal(
	card_name VARCHAR(50),
	card_attack INT,
	card_defense INT,
	card_energy INT
	);


 CREATE TABLE food(
	card_name VARCHAR(50),
	card_attack INT,
	card_defense INT,
	card_energy INT
 );
	
 CREATE TABLE land(
	card_name VARCHAR(50),
	card_attack INT,
	card_defense INT,
	card_energy INT
 );
	
 INSERT INTO animal(
	card_name, 
	card_attack, 
	card_defense, 
	card_energy)
	VALUES('gorilla', 100, 25, -3),
	('horse', 15, 85, -2),
	('lion', 100, 100, -10),
	('turkey', 10, 10, -1);
	
 INSERT INTO food(
	card_name, 
	card_attack, 
	card_defense, 
	card_energy)
	VALUES('banana', 0, +75, +3),
	('carcas', +30, +30, -10),
	('corn', +5, +5, 0),
	('hay', +45,-35, +5);
	
 INSERT INTO land(
	card_name, 
	card_attack, 
	card_defense, 
	card_energy)
	VALUES('desert', 0, 0, 0),
	('forrest', 0, 0, 0),
	('jungle', 0, 0, 0),
	('mountains', 0, 0, 0); */
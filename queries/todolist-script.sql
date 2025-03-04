create database todolist;

use todolist;

create table user(
	id int auto_increment unique,
    userName varchar(255),
    userPassword varchar(255),
    userEmail varchar(255),
    
    primary key (id)
);


create table player(
	id int auto_increment unique,
    userId int,
    playerName varchar(255),
    playerXp int,
    playerLvl int,
    strength int,
	intelligence int,
	constitution int,
	charisma int,
    
    primary key(id),
    
    foreign key (userId) references user(id) 
);

create table quest(
	id int auto_increment,
    playerId int,
    questName varchar(255),
    questDesc varchar(255),
    questStatus boolean,
    questValue boolean,

	primary key(id),
    
    foreign key(playerId) references player(id)
);

create table dailyQuest(
	id int auto_increment,
    questId int,
    refreshQuest boolean,
    
    primary key (id),
    foreign key (questId) references quest(id)

);

create table specialQuest(
	id int auto_increment,
    questId int,
    bonusXp int,
    
    primary key (id),
    foreign key (questId) references quest(id)
);
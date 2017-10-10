CREATE DATABASE Searches;
USE Searches;
CREATE TABLE Users (
	User_id     INT     NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Session_id  VARCHAR(32),
    Member      BIT, /*0-False; 1-True*/
    Member_id   INT
);

CREATE TABLE Flights (
    Flight_id   INT     NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Departure   VARCHAR(4), /*IATA code of the airport to depart from*/
    Arrival     VARCHAR(4), /*IATA code of the airport to arrive in*/
    Airline     VARCHAR(64),
    Depart_time DATETIME,
    Arrive_time DATETIME,
    Cost        DECIMAL(38, 2),
    Currency    VARCHAR(8),
    User_id     INT
);

CREATE TABLE Hotels (
    Hotel_id    INT     NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Name        VARCHAR(64),
    Address     VARCHAR(128),
    URL         VARCHAR(128),
    Cost        DECIMAL(38, 2), /*Estimated by initial search*/
    Currency    VARCHAR(8),
    Check_in    DATETIME,
    Check_out   DATETIME,
    More_rooms  VARCHAR(256), /*URL to load more room options*/
    User_id     INT
);

CREATE TABLE Amenities (
    Type_id     INT     NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Description VARCHAR(64)
);

CREATE TABLE Rooms (
    Room_id     INT     NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Cost        DECIMAL(38, 2),
    Room_type   VARCHAR(128),
    Bed_type    VARCHAR(32),
    Number_beds INT,
    Hotel_id    INT
);

CREATE TABLE Hotel_Amenities (
    HA_id           INT     NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Hotel_id        INT,
    Amenitity_id   INT
);

CREATE TABLE Car_Companies (
    Company_id  INT     NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Company     VARCHAR(64),
    Airport     VARCHAR(4), /*IATA code of nearest airport*/
    User_id     INT
);

CREATE TABLE Car_Rates (
    Rate_id         INT     NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Price           DECIMAL(8,2),
    Currency        VARCHAR(8),
    Rate_type       VARCHAR(16), /*Weekly, Daily, etc.*/
    Car_category    VARCHAR(32), /*Compact, Fullsize, Standard, etc.*/
    Company_id      INT          /*Index of Cars table which this belongs to*/
);

CREATE TABLE Sights (
    Sight_id    INT     NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Sight       VARCHAR(64),
    Image       VARCHAR(256),
    Rating      INT,
    Description VARCHAR(2048),
    Wiki        VARCHAR(128),
    User_id     INT
);
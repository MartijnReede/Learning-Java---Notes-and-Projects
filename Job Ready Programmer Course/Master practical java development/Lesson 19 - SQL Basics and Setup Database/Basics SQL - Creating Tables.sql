-- Creates a new database.
CREATE DATABASE name_of_database

-- Deletes database.
DROP DATABASE name_of_database

-- Deletes a complete table.
DROP TABLE name_of_table;

-- Creates a table. Each table should at least have 1 column from the start. 
CREATE TABLE name_of_table (test_column INT);

-- Adds a column to an excisting table.
ALTER TABLE name_of_table ADD another_column VARCHAR(45); 

-- Creates a new table with two columns. The band id-will be automatically generated because of
-- the AUTO_INCREMENT keyword. Both of the columns cant have a null-value so bands without a name
-- or band_id cannot be added to the database. The primary key is set to band_id, which uniquely
-- identifies each band.
CREATE TABLE bands (
    band_id INT NOT NULL AUTO_INCREMENT,
    band_name VARCHAR(50) NOT NULL,
    PRIMARY KEY(band_id)
    );

-- Creates a second table with four columns. In this table a foreign key is set. This means that 
-- sql wont let us create an album if it doesn't have a band_id that is already in the bands table. 
-- Also, if a band is deleted that still has albums in the database, sql won't let us delete the band
-- unless the albums are deleted as well. 
CREATE TABLE albums (
    album_id INT NOT NULL AUTO_INCREMENT,
    band_id INT NOT NULL,
    album_name VARCHAR(45) NOT NULL,
    release_year INT,
    PRIMARY KEY (album_id),
    FOREIGN KEY (band_id) REFERENCES bands(band_id)

-- Adds three bands to the database. 
INSERT INTO bands (band_name)
VALUES ("Metallica"), ("Fleetwood Mac"), ("De josty band");
);

-- Adds two albums to the database. Adding data to multiple columns at the same time. 
INSERT INTO albums(album_name, band_id, release_year)
VALUES("Ride the lightning", 1, 1984),
      ("Rumours", 2, 1977);

-- Updates data which is allready in the database. The WHERE statement should refer to a primary key. 
UPDATE albums
SET release_year = 1995
WHERE album_id  = 3;

-- Deletes every row from the albums table. 
DELETE FROM albums

-- Deletes single row from the albums table.
DELETE FROM albums WHERE album_id = 1; 
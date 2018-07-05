-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 05, 2018 at 06:45 PM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `room_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `entity`
--

CREATE TABLE `entity` (
  `entityId` int(11) NOT NULL,
  `entityType` enum('guest','room','todo') NOT NULL,
  `createdBy` int(11) NOT NULL,
  `updatedBy` int(11) NOT NULL,
  `createdDate` date NOT NULL,
  `updatedDate` date NOT NULL,
  `entityArchived` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `entity`
--

INSERT INTO `entity` (`entityId`, `entityType`, `createdBy`, `updatedBy`, `createdDate`, `updatedDate`, `entityArchived`) VALUES
(1, 'room', 1, 1, '2018-07-06', '2018-07-06', 0),
(2, 'room', 2, 2, '2018-07-06', '2018-07-06', 0),
(3, 'guest', 3, 3, '2018-07-06', '2018-07-06', 0),
(4, 'todo', 3, 3, '2018-07-06', '2018-07-06', 0);

-- --------------------------------------------------------

--
-- Table structure for table `guest`
--

CREATE TABLE `guest` (
  `guestId` int(11) NOT NULL,
  `roomId` int(11) NOT NULL,
  `entityId` int(11) NOT NULL,
  `guestName` varchar(100) NOT NULL,
  `pax` int(11) NOT NULL,
  `paid` enum('None','Partial','Full') NOT NULL DEFAULT 'None',
  `checkIn` date NOT NULL,
  `checkOut` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `guest`
--

INSERT INTO `guest` (`guestId`, `roomId`, `entityId`, `guestName`, `pax`, `paid`, `checkIn`, `checkOut`) VALUES
(1, 2, 3, 'Help Me God', 5, 'None', '2018-07-06', '2018-07-06');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `roomId` int(11) NOT NULL,
  `entId` int(11) NOT NULL,
  `roomName` varchar(100) NOT NULL,
  `roomCapacity` int(11) NOT NULL,
  `roomVacancy` tinyint(1) NOT NULL DEFAULT '1',
  `roomArchived` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`roomId`, `entId`, `roomName`, `roomCapacity`, `roomVacancy`, `roomArchived`) VALUES
(1, 1, 'Room of the Heavenly Bodies', 10, 1, 0),
(2, 2, 'Room for the Wicked', 2, 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `todo`
--

CREATE TABLE `todo` (
  `todoId` int(11) NOT NULL,
  `roomId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `entityId` int(11) NOT NULL,
  `toDo` varchar(200) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `todo`
--

INSERT INTO `todo` (`todoId`, `roomId`, `userId`, `entityId`, `toDo`, `status`) VALUES
(1, 2, 1, 4, 'Some guy broke the door', 0);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `userId` int(11) NOT NULL,
  `realName` varchar(100) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `createdDate` date NOT NULL,
  `updatedDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userId`, `realName`, `Username`, `Password`, `createdDate`, `updatedDate`) VALUES
(1, 'Kasey Cuyos', 'Cake', '8C6976E5B5410415BDE908BD4DEE15DFB167A9C873FC4BB8A81F6F2AB448A918', '2018-07-06', '2018-07-06'),
(2, 'Daniel Ubanan', 'Dan', '8C6976E5B5410415BDE908BD4DEE15DFB167A9C873FC4BB8A81F6F2AB448A918', '2018-07-06', '2018-07-06'),
(3, 'Renz Bernados', 'Gay', '8C6976E5B5410415BDE908BD4DEE15DFB167A9C873FC4BB8A81F6F2AB448A918', '2018-07-06', '2018-07-06');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `entity`
--
ALTER TABLE `entity`
  ADD PRIMARY KEY (`entityId`),
  ADD KEY `fk_ent_user_cb` (`createdBy`),
  ADD KEY `fk_ent_user_ub` (`updatedBy`);

--
-- Indexes for table `guest`
--
ALTER TABLE `guest`
  ADD PRIMARY KEY (`guestId`),
  ADD KEY `fk_guest_ent_ei` (`entityId`),
  ADD KEY `fk_guest_room_ri` (`roomId`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`roomId`),
  ADD KEY `fk_room_ent_ei` (`entId`);

--
-- Indexes for table `todo`
--
ALTER TABLE `todo`
  ADD PRIMARY KEY (`todoId`),
  ADD KEY `fk_todo_ent_ei` (`entityId`),
  ADD KEY `fk_todo_room_ei` (`roomId`),
  ADD KEY `fk_todo_user_ui` (`userId`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userId`),
  ADD KEY `fk_user_ent_entid` (`realName`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `entity`
--
ALTER TABLE `entity`
  MODIFY `entityId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `guest`
--
ALTER TABLE `guest`
  MODIFY `guestId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `room`
--
ALTER TABLE `room`
  MODIFY `roomId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `todo`
--
ALTER TABLE `todo`
  MODIFY `todoId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `userId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `entity`
--
ALTER TABLE `entity`
  ADD CONSTRAINT `fk_ent_user_cb` FOREIGN KEY (`createdBy`) REFERENCES `user` (`userId`),
  ADD CONSTRAINT `fk_ent_user_ub` FOREIGN KEY (`updatedBy`) REFERENCES `user` (`userId`);

--
-- Constraints for table `guest`
--
ALTER TABLE `guest`
  ADD CONSTRAINT `fk_guest_ent_ei` FOREIGN KEY (`entityId`) REFERENCES `entity` (`entityId`),
  ADD CONSTRAINT `fk_guest_room_ri` FOREIGN KEY (`roomId`) REFERENCES `room` (`roomId`);

--
-- Constraints for table `room`
--
ALTER TABLE `room`
  ADD CONSTRAINT `fk_room_ent_ei` FOREIGN KEY (`entId`) REFERENCES `entity` (`entityId`);

--
-- Constraints for table `todo`
--
ALTER TABLE `todo`
  ADD CONSTRAINT `fk_todo_ent_ei` FOREIGN KEY (`entityId`) REFERENCES `entity` (`entityId`),
  ADD CONSTRAINT `fk_todo_room_ei` FOREIGN KEY (`roomId`) REFERENCES `room` (`roomId`),
  ADD CONSTRAINT `fk_todo_user_ui` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

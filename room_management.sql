-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 06, 2018 at 06:02 AM
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
-- Table structure for table `guest`
--

CREATE TABLE `guest` (
  `guestId` int(11) NOT NULL,
  `guestName` varchar(100) NOT NULL,
  `guestPax` int(11) NOT NULL,
  `guestPaid` enum('None','Partial','Full') NOT NULL DEFAULT 'None',
  `createdBy` int(11) NOT NULL,
  `updatedBy` int(11) NOT NULL,
  `createdDate` date NOT NULL,
  `updatedDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `guest`
--

INSERT INTO `guest` (`guestId`, `guestName`, `guestPax`, `guestPaid`, `createdBy`, `updatedBy`, `createdDate`, `updatedDate`) VALUES
(1, 'Stephen King', 2, 'Full', 3, 2, '2018-07-06', '2018-07-07');

-- --------------------------------------------------------

--
-- Table structure for table `reservations`
--

CREATE TABLE `reservations` (
  `reservationId` int(11) NOT NULL,
  `guestId` int(11) NOT NULL,
  `roomId` int(11) NOT NULL,
  `createdBy` int(11) NOT NULL,
  `updatedBy` int(11) NOT NULL,
  `checkInDate` date NOT NULL,
  `checkOutDate` date NOT NULL,
  `createdDate` date NOT NULL,
  `updatedDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reservations`
--

INSERT INTO `reservations` (`reservationId`, `guestId`, `roomId`, `createdBy`, `updatedBy`, `checkInDate`, `checkOutDate`, `createdDate`, `updatedDate`) VALUES
(1, 1, 2, 3, 3, '2018-07-06', '2018-07-17', '2018-07-06', '2018-07-06');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `roomId` int(11) NOT NULL,
  `roomName` varchar(100) NOT NULL,
  `roomCapacity` int(11) NOT NULL,
  `roomVacancy` tinyint(1) NOT NULL DEFAULT '1',
  `roomRate` float NOT NULL,
  `createdBy` int(11) NOT NULL,
  `updatedBy` int(11) NOT NULL,
  `createdDate` date NOT NULL,
  `updatedDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`roomId`, `roomName`, `roomCapacity`, `roomVacancy`, `roomRate`, `createdBy`, `updatedBy`, `createdDate`, `updatedDate`) VALUES
(1, 'Room of the Giants', 10, 1, 50000, 1, 1, '2018-07-06', '2018-07-06'),
(2, 'Room of the Midgets', 2, 1, 10000, 2, 2, '2018-07-06', '2018-07-06');

-- --------------------------------------------------------

--
-- Table structure for table `todo`
--

CREATE TABLE `todo` (
  `todoId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `roomId` int(11) NOT NULL,
  `toDo` varchar(1000) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '0',
  `createdBy` int(11) NOT NULL,
  `updatedBy` int(11) NOT NULL,
  `createdDate` date NOT NULL,
  `updatedDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `todo`
--

INSERT INTO `todo` (`todoId`, `userId`, `roomId`, `toDo`, `status`, `createdBy`, `updatedBy`, `createdDate`, `updatedDate`) VALUES
(1, 3, 2, 'Bed broken', 0, 3, 3, '2018-07-06', '2018-07-06');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `userId` int(11) NOT NULL,
  `realName` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `createdDate` date NOT NULL,
  `updatedDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userId`, `realName`, `username`, `password`, `createdDate`, `updatedDate`) VALUES
(1, 'Kasey Cuyos', 'Cake', '8C6976E5B5410415BDE908BD4DEE15DFB167A9C873FC4BB8A81F6F2AB448A918', '2018-07-06', '2018-07-06'),
(2, 'Renz Bernados', 'Renz', '8C6976E5B5410415BDE908BD4DEE15DFB167A9C873FC4BB8A81F6F2AB448A918', '2018-07-06', '2018-07-06'),
(3, 'Daniel Ubanan', 'Dan', '8C6976E5B5410415BDE908BD4DEE15DFB167A9C873FC4BB8A81F6F2AB448A918', '2018-07-06', '2018-07-06');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `guest`
--
ALTER TABLE `guest`
  ADD PRIMARY KEY (`guestId`),
  ADD KEY `fk_guest_user_cb` (`createdBy`),
  ADD KEY `fk_guest_user_ub` (`updatedBy`);

--
-- Indexes for table `reservations`
--
ALTER TABLE `reservations`
  ADD PRIMARY KEY (`reservationId`),
  ADD KEY `fk_res_room_ri` (`roomId`),
  ADD KEY `fk_res_guest_gi` (`guestId`),
  ADD KEY `fk_res_user_cb` (`createdBy`),
  ADD KEY `fk_res_user_ub` (`updatedBy`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`roomId`),
  ADD KEY `fk_room_user_cb` (`createdBy`),
  ADD KEY `fk_room_user_ub` (`updatedBy`);

--
-- Indexes for table `todo`
--
ALTER TABLE `todo`
  ADD PRIMARY KEY (`todoId`),
  ADD KEY `fk_todo_user_ui` (`userId`),
  ADD KEY `fk_todo_room_ri` (`roomId`),
  ADD KEY `fk_todo_user_cb` (`createdBy`),
  ADD KEY `fk_todo_user_up` (`updatedBy`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `guest`
--
ALTER TABLE `guest`
  MODIFY `guestId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `reservations`
--
ALTER TABLE `reservations`
  MODIFY `reservationId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

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
-- Constraints for table `guest`
--
ALTER TABLE `guest`
  ADD CONSTRAINT `fk_guest_user_cb` FOREIGN KEY (`createdBy`) REFERENCES `user` (`userId`),
  ADD CONSTRAINT `fk_guest_user_ub` FOREIGN KEY (`updatedBy`) REFERENCES `user` (`userId`);

--
-- Constraints for table `reservations`
--
ALTER TABLE `reservations`
  ADD CONSTRAINT `fk_res_guest_gi` FOREIGN KEY (`guestId`) REFERENCES `guest` (`guestId`),
  ADD CONSTRAINT `fk_res_room_ri` FOREIGN KEY (`roomId`) REFERENCES `room` (`roomId`),
  ADD CONSTRAINT `fk_res_user_cb` FOREIGN KEY (`createdBy`) REFERENCES `user` (`userId`),
  ADD CONSTRAINT `fk_res_user_ub` FOREIGN KEY (`updatedBy`) REFERENCES `user` (`userId`);

--
-- Constraints for table `room`
--
ALTER TABLE `room`
  ADD CONSTRAINT `fk_room_user_cb` FOREIGN KEY (`createdBy`) REFERENCES `user` (`userId`),
  ADD CONSTRAINT `fk_room_user_ub` FOREIGN KEY (`updatedBy`) REFERENCES `user` (`userId`);

--
-- Constraints for table `todo`
--
ALTER TABLE `todo`
  ADD CONSTRAINT `fk_todo_room_ri` FOREIGN KEY (`roomId`) REFERENCES `room` (`roomId`),
  ADD CONSTRAINT `fk_todo_user_cb` FOREIGN KEY (`createdBy`) REFERENCES `user` (`userId`),
  ADD CONSTRAINT `fk_todo_user_ui` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`),
  ADD CONSTRAINT `fk_todo_user_up` FOREIGN KEY (`updatedBy`) REFERENCES `user` (`userId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

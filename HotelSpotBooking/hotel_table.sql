CREATE DATABASE `hotel`;
USE `hotel`;
CREATE TABLE `hotel_table` (
  `ID` int(10) UNSIGNED NOT NULL,
  `name` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `room_type` varchar(45) NOT NULL,
  `price` float NOT NULL,
  `available_rooms` int(10) UNSIGNED NOT NULL,
  `total_rooms` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hotel_table`
--

INSERT INTO `hotel_table` (`ID`, `name`, `location`, `room_type`, `price`, `available_rooms`, `total_rooms`) VALUES
(1, 'The Willow Hill Ooty', 'XYZ', 'Deluxe_Single', 2400, 10, 10),
(2, 'The Willow Hill Ooty', 'XYZ', 'Deluxe_Double', 2500, 4, 10),
(3, 'The Willow Hill Ooty', 'XYZ', 'DeluxeSuite_Single', 2900, 8, 10),
(4, 'The Willow Hill Ooty', 'XYZ', 'DeluxeSuite_Double', 3000, 2, 10),
(5, 'The Willow Hill Ooty', 'XYZ', 'Heritage_Single', 3100, 0, 10),
(6, 'The Willow Hill Ooty', 'XYZ', 'Heritage_Double', 3200, 7, 10),
(7, 'The Willow Hill Ooty', 'XYZ', 'HeritageTriple_Single', 3300, 10, 10),
(8, 'The Willow Hill Ooty', 'XYZ', 'HeritageTriple_Double', 3400, 6, 10),
(9, 'Nahar Residency Hotel Ooty ', 'ABCD', 'Deluxe_Single', 2500, 7, 10),
(10, 'Nahar Residency Hotel Ooty ', 'ABCD', 'Deluxe_Double', 2800, 9, 10),
(11, 'Nahar Residency Hotel Ooty ', 'ABCD', 'DeluxeSuite_Single', 3000, 10, 10),
(12, 'Nahar Residency Hotel Ooty ', 'ABCD', 'DeluxeSuite_Double', 3200, 3, 10),
(13, 'Nahar Residency Hotel Ooty ', 'ABCD', 'Heritage_Single', 3400, 7, 10),
(14, 'Nahar Residency Hotel Ooty ', 'ABCD', 'Heritage_Double', 3500, 5, 10),
(15, 'Nahar Residency Hotel Ooty ', 'ABCD', 'HeritageTriple_Single', 3800, 8, 10),
(16, 'Nahar Residency Hotel Ooty ', 'ABCD', 'HeritageTriple_Double', 4000, 1, 10),
(17, 'Holiday Inn Gem Park Ooty', 'xxxxxxx', 'Deluxe_Single', 3400, 4, 10),
(18, 'Holiday Inn Gem Park Ooty', 'xxxxxxx', 'Deluxe_Double', 3700, 8, 10);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hotel_table`
--
ALTER TABLE `hotel_table`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `hotel_table`
--
ALTER TABLE `hotel_table`
  MODIFY `ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

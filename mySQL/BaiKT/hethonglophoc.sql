-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 20, 2023 at 06:45 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hethonglophoc`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE `attendance` (
  `id` int(11) NOT NULL,
  `teacher_id` int(11) NOT NULL,
  `classStudent_id` int(11) NOT NULL,
  `attendanceDate` date NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`id`, `teacher_id`, `classStudent_id`, `attendanceDate`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 2, 1, '2020-01-08', 22, '2023-06-20 16:07:09', '2023-06-20 16:07:09', NULL),
(2, 3, 1, '2020-01-04', 23, '2023-06-20 16:07:09', '2023-06-20 16:07:09', NULL),
(3, 4, 2, '2020-01-07', 22, '2023-06-20 16:07:09', '2023-06-20 16:07:09', NULL),
(4, 5, 3, '2020-01-02', 22, '2023-06-20 16:07:09', '2023-06-20 16:07:09', NULL),
(5, 2, 4, '2020-01-03', 22, '2023-06-20 16:07:09', '2023-06-20 16:07:09', NULL),
(6, 3, 4, '2020-01-03', 22, '2023-06-20 16:07:09', '2023-06-20 16:07:09', NULL),
(7, 4, 5, '2020-05-08', 22, '2023-06-20 16:07:09', '2023-06-20 16:07:09', NULL),
(8, 3, 6, '2020-04-08', 22, '2023-06-20 16:07:09', '2023-06-20 16:07:09', NULL),
(9, 2, 7, '2020-03-08', 23, '2023-06-20 16:07:09', '2023-06-20 16:07:09', NULL),
(10, 3, 8, '2020-01-09', 22, '2023-06-20 16:07:09', '2023-06-20 16:07:09', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `descrition` text DEFAULT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `name`, `descrition`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'Người mới bắt đầu', NULL, 4, '2023-06-20 15:05:57', '2023-06-20 15:05:57', NULL),
(2, 'Sinh viên CNTT', NULL, 4, '2023-06-20 15:05:57', '2023-06-20 15:05:57', NULL),
(3, 'Lập trình viên', NULL, 4, '2023-06-20 15:05:57', '2023-06-20 15:05:57', NULL),
(4, 'Học sinh', NULL, 4, '2023-06-20 15:05:57', '2023-06-20 15:05:57', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `classes`
--

CREATE TABLE `classes` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `teacher_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `startDate` date DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `classes`
--

INSERT INTO `classes` (`id`, `name`, `teacher_id`, `course_id`, `startDate`, `endDate`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'Lớp A', 2, 1, '2020-02-01', '2020-09-01', 11, '2023-06-20 15:34:49', '2023-06-20 15:34:49', NULL),
(2, 'Lớp B', 3, 2, '2020-02-01', '2020-09-01', 13, '2023-06-20 15:34:49', '2023-06-20 15:34:49', NULL),
(3, 'Lớp C', 4, 3, '2020-03-01', '2020-09-01', 11, '2023-06-20 15:34:49', '2023-06-20 15:34:49', NULL),
(4, 'Lớp D', 5, 4, '2020-04-01', '2020-09-01', 11, '2023-06-20 15:34:49', '2023-06-20 15:34:49', NULL),
(5, 'Lớp E', 6, 5, '2020-02-01', '2020-09-01', 11, '2023-06-20 15:34:49', '2023-06-20 15:34:49', NULL),
(6, 'Lớp F', 2, 6, '2020-02-01', '2020-09-01', 11, '2023-06-20 15:34:49', '2023-06-20 15:34:49', NULL),
(7, 'Lớp G', 3, 7, '2020-02-01', '2020-09-01', 11, '2023-06-20 15:34:49', '2023-06-20 15:34:49', NULL),
(8, 'Lớp H', 4, 8, '2020-02-01', '2020-09-01', 11, '2023-06-20 15:34:49', '2023-06-20 15:34:49', NULL),
(9, 'Lớp I', 5, 9, '2020-01-01', '2020-09-01', 11, '2023-06-20 15:34:49', '2023-06-20 15:34:49', NULL),
(10, 'Lớp L', 2, 11, '2020-01-01', '2020-04-01', 12, '2023-06-20 15:34:49', '2023-06-20 15:34:49', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `classlesson`
--

CREATE TABLE `classlesson` (
  `id` int(11) NOT NULL,
  `class_id` int(11) NOT NULL,
  `lesson_id` int(11) NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `classlesson`
--

INSERT INTO `classlesson` (`id`, `class_id`, `lesson_id`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 1, 1, 20, '2023-06-20 15:51:48', '2023-06-20 15:51:48', NULL),
(2, 2, 1, 20, '2023-06-20 15:51:48', '2023-06-20 15:51:48', NULL),
(3, 3, 7, 20, '2023-06-20 15:51:48', '2023-06-20 15:51:48', NULL),
(4, 4, 6, 20, '2023-06-20 15:51:48', '2023-06-20 15:51:48', NULL),
(5, 5, 5, 20, '2023-06-20 15:51:48', '2023-06-20 15:51:48', NULL),
(6, 6, 4, 20, '2023-06-20 15:51:48', '2023-06-20 15:51:48', NULL),
(7, 7, 1, 20, '2023-06-20 15:51:48', '2023-06-20 15:51:48', NULL),
(8, 8, 1, 20, '2023-06-20 15:51:48', '2023-06-20 15:51:48', NULL),
(9, 8, 2, 20, '2023-06-20 15:51:48', '2023-06-20 15:51:48', NULL),
(10, 8, 3, 21, '2023-06-20 15:51:48', '2023-06-20 15:51:48', NULL),
(11, 9, 9, 20, '2023-06-20 15:51:48', '2023-06-20 15:51:48', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `classstudent`
--

CREATE TABLE `classstudent` (
  `id` int(11) NOT NULL,
  `admin_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `class_id` int(11) NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `classstudent`
--

INSERT INTO `classstudent` (`id`, `admin_id`, `student_id`, `class_id`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 1, 8, 1, 14, '2023-06-20 15:39:23', '2023-06-20 15:39:23', NULL),
(2, 1, 8, 2, 15, '2023-06-20 15:39:23', '2023-06-20 15:39:23', NULL),
(3, 1, 9, 2, 14, '2023-06-20 15:39:23', '2023-06-20 15:39:23', NULL),
(4, 1, 10, 2, 14, '2023-06-20 15:39:23', '2023-06-20 15:39:23', NULL),
(5, 1, 11, 2, 14, '2023-06-20 15:39:23', '2023-06-20 15:39:23', NULL),
(6, 1, 12, 2, 14, '2023-06-20 15:39:23', '2023-06-20 15:39:23', NULL),
(7, 1, 13, 2, 14, '2023-06-20 15:39:23', '2023-06-20 15:39:23', NULL),
(8, 1, 14, 2, 14, '2023-06-20 15:39:23', '2023-06-20 15:39:23', NULL),
(9, 1, 15, 2, 14, '2023-06-20 15:39:23', '2023-06-20 15:39:23', NULL),
(10, 1, 16, 2, 14, '2023-06-20 15:39:23', '2023-06-20 15:39:23', NULL),
(11, 1, 9, 3, 14, '2023-06-20 15:39:23', '2023-06-20 15:39:23', NULL),
(12, 1, 10, 3, 14, '2023-06-20 15:39:23', '2023-06-20 15:39:23', NULL),
(13, 1, 11, 3, 14, '2023-06-20 15:39:23', '2023-06-20 15:39:23', NULL),
(14, 1, 12, 7, 14, '2023-06-20 15:39:23', '2023-06-20 15:39:23', NULL),
(15, 1, 13, 6, 14, '2023-06-20 15:39:23', '2023-06-20 15:39:23', NULL),
(16, 1, 14, 3, 15, '2023-06-20 15:39:23', '2023-06-20 15:39:23', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `classweekday`
--

CREATE TABLE `classweekday` (
  `id` int(11) NOT NULL,
  `class_id` int(11) NOT NULL,
  `weekday_id` int(11) NOT NULL,
  `hours` varchar(50) NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `classweekday`
--

INSERT INTO `classweekday` (`id`, `class_id`, `weekday_id`, `hours`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 1, 1, '3', 16, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(2, 1, 3, '3', 16, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(3, 1, 5, '3', 16, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(4, 2, 2, '3', 16, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(5, 2, 4, '3', 16, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(6, 2, 6, '3', 16, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(7, 3, 3, '3', 16, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(8, 3, 5, '3', 16, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(9, 3, 6, '3', 16, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(10, 4, 2, '3', 16, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(11, 4, 4, '3', 16, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(12, 4, 6, '3', 16, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(13, 5, 6, '3', 17, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(14, 5, 6, '3', 16, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(15, 5, 6, '3', 17, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(16, 6, 2, '3', 16, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(17, 7, 5, '3', 16, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(18, 8, 3, '3', 16, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(19, 9, 2, '3', 16, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL),
(20, 10, 1, '3', 16, '2023-06-20 15:46:53', '2023-06-20 15:46:53', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `description` text DEFAULT NULL,
  `price` double NOT NULL,
  `term` varchar(100) NOT NULL,
  `category_id` int(11) NOT NULL,
  `form_id` int(11) NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`id`, `name`, `description`, `price`, `term`, `category_id`, `form_id`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'Bootcamp Full Stack Web', 'des', 1000, '7 Tháng', 1, 1, 1, '2023-06-20 15:26:08', '2023-06-20 15:28:47', NULL),
(2, 'Web Frontend + React', 'des', 1000, '5 Tháng', 1, 1, 1, '2023-06-20 15:26:08', '2023-06-20 15:28:47', NULL),
(3, 'Fullstack Java Spring Boot', 'des', 1000, '6 Tháng', 1, 1, 1, '2023-06-20 15:26:08', '2023-06-20 15:28:47', NULL),
(4, 'Google Flutter', 'des', 1000, '5 Tháng', 1, 1, 1, '2023-06-20 15:26:08', '2023-06-20 15:28:47', NULL),
(5, 'Java Spring Boot', 'des', 800, '3 Tháng', 2, 2, 1, '2023-06-20 15:26:08', '2023-06-20 15:28:47', NULL),
(6, 'PHP Laravel', 'des', 800, '3 Tháng', 2, 2, 1, '2023-06-20 15:26:08', '2023-06-20 15:28:47', NULL),
(7, 'ReactJs', 'des', 800, '3 Tháng', 2, 2, 1, '2023-06-20 15:26:08', '2023-06-20 15:28:47', NULL),
(8, 'DevOps', 'des', 1000, '3 Tháng', 3, 2, 1, '2023-06-20 15:26:08', '2023-06-20 15:28:47', NULL),
(9, 'Amazon Web Service', 'des', 1000, '3 Tháng', 1, 3, 1, '2023-06-20 15:26:08', '2023-06-20 15:28:47', NULL),
(10, 'Lego Robot Inventor', 'des', 500, '3 Tháng', 4, 2, 1, '2023-06-20 15:26:08', '2023-06-20 15:28:47', NULL),
(11, 'Java Cơ Bản', 'des', 1000, '2 Tháng', 1, 3, 1, '2023-06-20 15:26:08', '2023-06-20 15:28:47', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `forms`
--

CREATE TABLE `forms` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `forms`
--

INSERT INTO `forms` (`id`, `name`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'Dài hạn', 1, '2023-06-20 15:07:39', '2023-06-20 15:07:39', NULL),
(2, 'Ngắn hạn', 1, '2023-06-20 15:07:39', '2023-06-20 15:07:39', NULL),
(3, 'Online', 1, '2023-06-20 15:07:39', '2023-06-20 15:07:39', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `grades`
--

CREATE TABLE `grades` (
  `id` int(11) NOT NULL,
  `teacher_id` int(11) NOT NULL,
  `classStudent_id` int(11) NOT NULL,
  `grade` float DEFAULT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `grades`
--

INSERT INTO `grades` (`id`, `teacher_id`, `classStudent_id`, `grade`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 2, 1, 8, 26, '2023-06-20 16:13:29', '2023-06-20 16:13:29', NULL),
(2, 3, 2, 7, 26, '2023-06-20 16:13:29', '2023-06-20 16:13:29', NULL),
(3, 4, 3, 7, 26, '2023-06-20 16:13:29', '2023-06-20 16:13:29', NULL),
(4, 4, 4, 9, 26, '2023-06-20 16:13:29', '2023-06-20 16:13:29', NULL),
(5, 4, 5, 10, 26, '2023-06-20 16:13:29', '2023-06-20 16:13:29', NULL),
(6, 3, 1, 6, 27, '2023-06-20 16:13:29', '2023-06-20 16:13:29', NULL),
(7, 5, 7, 6, 27, '2023-06-20 16:13:29', '2023-06-20 16:13:29', NULL),
(8, 6, 6, 10, 26, '2023-06-20 16:13:29', '2023-06-20 16:13:29', NULL),
(9, 5, 10, 8, 26, '2023-06-20 16:13:29', '2023-06-20 16:13:29', NULL),
(10, 2, 9, 8, 26, '2023-06-20 16:13:29', '2023-06-20 16:13:29', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `lessons`
--

CREATE TABLE `lessons` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `content` text NOT NULL,
  `teacher_id` int(11) NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `lessons`
--

INSERT INTO `lessons` (`id`, `name`, `content`, `teacher_id`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'Bai1', 'noidung', 2, 18, '2023-06-20 15:49:03', '2023-06-20 15:49:03', NULL),
(2, 'Bai2', 'noidung', 3, 18, '2023-06-20 15:49:03', '2023-06-20 15:49:03', NULL),
(3, 'Bai3', 'noidung', 4, 18, '2023-06-20 15:49:03', '2023-06-20 15:49:03', NULL),
(4, 'Bai4', 'noidung', 2, 18, '2023-06-20 15:49:03', '2023-06-20 15:49:03', NULL),
(5, 'Bai5', 'noidung', 2, 18, '2023-06-20 15:49:03', '2023-06-20 15:49:03', NULL),
(6, 'Bai6', 'noidung', 5, 18, '2023-06-20 15:49:03', '2023-06-20 15:49:03', NULL),
(7, 'Bai1', 'noidung', 2, 18, '2023-06-20 15:49:03', '2023-06-20 15:49:03', NULL),
(8, 'Bai1', 'noidung', 6, 18, '2023-06-20 15:49:03', '2023-06-20 15:49:03', NULL),
(9, 'Bai2', 'noidung', 2, 18, '2023-06-20 15:49:03', '2023-06-20 15:49:03', NULL),
(10, 'Bai1', 'noidung', 7, 18, '2023-06-20 15:49:03', '2023-06-20 15:49:03', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `id` int(11) NOT NULL,
  `paymentDate` date NOT NULL,
  `admin_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `class_id` int(11) NOT NULL,
  `amount` double DEFAULT NULL,
  `paymentMethod_id` int(11) NOT NULL,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`id`, `paymentDate`, `admin_id`, `student_id`, `class_id`, `amount`, `paymentMethod_id`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, '2020-01-02', 1, 8, 2, 1000, 2, 24, '2023-06-20 16:18:33', '2023-06-20 16:18:33', NULL),
(2, '2020-01-02', 1, 9, 1, 1000, 2, 24, '2023-06-20 16:18:33', '2023-06-20 16:18:33', NULL),
(3, '2020-01-02', 1, 10, 3, 1000, 2, 24, '2023-06-20 16:18:33', '2023-06-20 16:18:33', NULL),
(4, '2020-01-02', 1, 11, 4, 1000, 2, 24, '2023-06-20 16:18:33', '2023-06-20 16:18:33', NULL),
(5, '2020-01-02', 1, 12, 5, 1000, 1, 24, '2023-06-20 16:18:33', '2023-06-20 16:18:33', NULL),
(6, '2020-01-02', 1, 13, 6, 1000, 2, 24, '2023-06-20 16:18:33', '2023-06-20 16:18:33', NULL),
(7, '2020-01-02', 1, 14, 2, 1000, 1, 25, '2023-06-20 16:18:33', '2023-06-20 16:18:33', NULL),
(8, '2020-01-02', 1, 15, 4, 1000, 1, 24, '2023-06-20 16:18:33', '2023-06-20 16:18:33', NULL),
(9, '2020-01-02', 1, 16, 4, 1000, 2, 24, '2023-06-20 16:18:33', '2023-06-20 16:18:33', NULL),
(10, '2020-01-02', 1, 17, 4, 1000, 2, 24, '2023-06-20 16:18:33', '2023-06-20 16:18:33', NULL),
(11, '2020-01-02', 1, 18, 2, 1000, 2, 25, '2023-06-20 16:18:33', '2023-06-20 16:18:33', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `paymentmethod`
--

CREATE TABLE `paymentmethod` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `paymentmethod`
--

INSERT INTO `paymentmethod` (`id`, `name`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'Tiền mặt', '2023-06-20 16:15:25', '2023-06-20 16:15:25', NULL),
(2, 'Chuyển khoản', '2023-06-20 16:15:25', '2023-06-20 16:15:25', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE `roles` (
  `id` int(11) NOT NULL,
  `key1` varchar(20) NOT NULL,
  `role` varchar(50) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`id`, `key1`, `role`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'users', 'student', '2023-06-20 14:28:59', '2023-06-20 14:28:59', NULL),
(2, 'users', 'admin', '2023-06-20 14:28:59', '2023-06-20 14:28:59', NULL),
(3, 'users', 'teacher', '2023-06-20 14:28:59', '2023-06-20 14:28:59', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `status1`
--

CREATE TABLE `status1` (
  `id` int(11) NOT NULL,
  `key1` varchar(20) NOT NULL,
  `value1` varchar(50) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `status1`
--

INSERT INTO `status1` (`id`, `key1`, `value1`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'users', 'active', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(2, 'users', 'block', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(3, 'users', 'ban', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(4, 'category', 'active', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(5, 'category', 'non-active', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(6, 'forms', 'active', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(7, 'forms', 'non-active', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(8, 'courses', 'active', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(9, 'courses', 'non-active', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(10, 'courses', 'upcoming', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(11, 'classes', 'active', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(12, 'classes', 'non-active', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(13, 'classes', 'upcoming', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(14, 'classeStudent', 'added', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(15, 'classeStudent', 'remove', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(16, 'classeWeekday', 'added', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(17, 'classeWeekday', 'remove', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(18, 'lessons', 'add', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(19, 'lessons', 'remove', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(20, 'classLessons', 'add', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(21, 'classLessons', 'remove', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(22, 'attendance', 'attended', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(23, 'attendance', 'not-attended', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(24, 'payment', 'paided', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(25, 'payment', 'unpaid', '2023-06-20 14:46:59', '2023-06-20 14:46:59', NULL),
(26, 'grades', 'pass', '2023-06-20 16:11:14', '2023-06-20 16:11:14', NULL),
(27, 'grades', 'failed', '2023-06-20 16:11:14', '2023-06-20 16:11:14', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `dateBirth` date DEFAULT NULL,
  `phoneNumber` varchar(12) NOT NULL,
  `address` varchar(255) NOT NULL,
  `email` varchar(100) NOT NULL,
  `userName` varchar(50) NOT NULL,
  `passwords` varchar(50) NOT NULL,
  `joinDate` date NOT NULL,
  `role_id` int(11) NOT NULL DEFAULT 1,
  `status_id` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `dateBirth`, `phoneNumber`, `address`, `email`, `userName`, `passwords`, `joinDate`, `role_id`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'Nguyen Van A', '1990-01-01', '0123456789', 'Ha Noi', 'nguyenvana@gmail.com', 'nguyenvana', 'password1', '2019-12-01', 2, 1, '2023-06-20 14:57:52', '2023-06-20 15:08:59', NULL),
(2, 'Tran Thi B', '1995-05-05', '0987124321', 'Ho Chi Minh', 'tranthib@gmail.com', 'tranthib', 'password2', '2019-12-01', 3, 1, '2023-06-20 14:57:52', '2023-06-20 15:08:59', NULL),
(3, 'Le Van C', '2000-02-02', '0999999999', 'Da Nang', 'levanc@gmail.com', 'levanc', 'password3', '2019-12-01', 3, 1, '2023-06-20 14:57:52', '2023-06-20 15:08:59', NULL),
(4, 'Pham Thi D', '1988-08-08', '0888888888', 'Hai Phong', 'phamthid@gmail.com', 'phamthid', 'password4', '2019-12-01', 3, 1, '2023-06-20 14:57:52', '2023-06-20 15:08:59', NULL),
(5, 'Hoang Van E', '1992-12-12', '0977777777', 'Bac Ninh', 'hoangvane@gmail.com', 'hoangvane', 'password5', '2019-12-01', 3, 1, '2023-06-20 14:57:52', '2023-06-20 15:08:59', NULL),
(6, 'Nguyen Thi F', '1998-06-06', '0966666666', 'Can Tho', 'nguyenthif@gmail.com', 'nguyenthif', 'password6', '2019-12-01', 3, 1, '2023-06-20 14:57:52', '2023-06-20 15:08:59', NULL),
(7, 'Tran Van G', '1995-03-03', '0944444444', 'Hue', 'tranvang@gmail.com', 'tranvang', 'password7', '2019-12-01', 3, 1, '2023-06-20 14:57:52', '2023-06-20 15:08:59', NULL),
(8, 'Le Thi H', '1999-04-04', '0911091111', 'Quang Binh', 'lethih@gmail.com', 'lethih', 'password8', '2020-01-01', 1, 1, '2023-06-20 14:57:52', '2023-06-20 14:59:36', NULL),
(9, 'Pham Van I', '1986-09-09', '0899129999', 'Ninh Binh', 'phamvani@gmail.com', 'phamvani', 'password9', '2020-01-01', 1, 1, '2023-06-20 14:57:52', '2023-06-20 14:59:36', NULL),
(10, 'Hoang Thi K', '1994-07-07', '0922234222', 'Binh Dinh', 'hoangthik@gmail.com', 'hoangthik', 'password10', '2020-01-01', 1, 1, '2023-06-20 14:57:52', '2023-06-20 14:59:36', NULL),
(11, 'Nguyen Van L', '1991-10-10', '0933243333', 'Thanh Hoa', 'nguyenvanl@gmail.com', 'nguyenvanl', 'password11', '2020-01-01', 1, 1, '2023-06-20 14:57:52', '2023-06-20 14:59:36', NULL),
(12, 'Tran Thi M', '1996-11-11', '0951255555', 'Binh Thuan', 'tranthim@gmail.com', 'tranthim', 'password12', '2020-01-01', 1, 1, '2023-06-20 14:57:52', '2023-06-20 14:59:36', NULL),
(13, 'Le Van N', '2001-01-01', '0912323678', 'Vinh Phuc', 'levann@gmail.com', 'levann', 'password13', '2020-01-01', 1, 1, '2023-06-20 14:57:52', '2023-06-20 14:59:36', NULL),
(14, 'Pham Thi O', '1989-02-02', '0971343210', 'Quang Tri', 'phamthio@gmail.com', 'phamthio', 'password14', '2020-01-01', 1, 1, '2023-06-20 14:57:52', '2023-06-20 15:10:20', NULL),
(15, 'Hoang Van P', '1993-03-03', '0983454321', 'Ha Tinh', 'hoangvanp@gmail.com', 'hoangvanp', 'password15', '2020-01-01', 1, 1, '2023-06-20 14:57:52', '2023-06-20 15:10:20', NULL),
(16, 'Nguyen Thi Q', '1997-04-04', '0912345678', 'Dong Nai', 'nguyenthiq@gmail.com', 'nguyenthiq', 'password16', '2020-01-01', 1, 1, '2023-06-20 14:57:52', '2023-06-20 15:10:20', NULL),
(17, 'Tran Van R', '1994-05-05', '0987754321', 'Lam Dong', 'tranvanr@gmail.com', 'tranvanr', 'password17', '2020-01-01', 1, 1, '2023-06-20 14:57:52', '2023-06-20 15:10:20', NULL),
(18, 'Le Thi S', '1998-06-06', '09123456723', 'Kien Giang', 'lethis@gmail.com', 'lethis', 'password18', '2020-01-01', 1, 1, '2023-06-20 14:57:52', '2023-06-20 15:10:20', NULL),
(19, 'Pham Van T', '1987-07-07', '0912346578', 'Thai Nguyen', 'phamvant@gmail.com', 'phamvant', 'password19', '2020-01-01', 1, 2, '2023-06-20 14:57:52', '2023-06-20 15:10:20', NULL),
(20, 'Hoang Thi U', '1995-08-08', '0912343678', 'Soc Trang', 'hoangthiu@gmail.com', 'hoangthiu', 'password20', '2020-01-01', 1, 3, '2023-06-20 14:57:52', '2023-06-20 15:10:20', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `weekday`
--

CREATE TABLE `weekday` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `weekday`
--

INSERT INTO `weekday` (`id`, `name`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'Thứ 2', '2023-06-20 15:41:38', '2023-06-20 15:41:38', NULL),
(2, 'Thứ 3', '2023-06-20 15:41:38', '2023-06-20 15:41:38', NULL),
(3, 'Thứ 4', '2023-06-20 15:41:38', '2023-06-20 15:41:38', NULL),
(4, 'Thứ 5', '2023-06-20 15:41:38', '2023-06-20 15:41:38', NULL),
(5, 'Thứ 6', '2023-06-20 15:41:38', '2023-06-20 15:41:38', NULL),
(6, 'Thứ 7', '2023-06-20 15:41:38', '2023-06-20 15:41:38', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `attendance`
--
ALTER TABLE `attendance`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_attendance_teacher` (`teacher_id`),
  ADD KEY `fk_attendance_classstudent` (`classStudent_id`),
  ADD KEY `fk_attendance_status1` (`status_id`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_category_status1` (`status_id`);

--
-- Indexes for table `classes`
--
ALTER TABLE `classes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_classes_teacher` (`teacher_id`),
  ADD KEY `fk_classes_courses` (`course_id`),
  ADD KEY `fk_classes_status1` (`status_id`);

--
-- Indexes for table `classlesson`
--
ALTER TABLE `classlesson`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_classLesson_classes` (`class_id`),
  ADD KEY `fk_classLesson_lessons` (`lesson_id`),
  ADD KEY `fk_classLesson_status1` (`status_id`);

--
-- Indexes for table `classstudent`
--
ALTER TABLE `classstudent`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_classStudent_admin` (`admin_id`),
  ADD KEY `fk_classStudent_student` (`student_id`),
  ADD KEY `fk_classStudent_classes` (`class_id`),
  ADD KEY `fk_classStudent_status1` (`status_id`);

--
-- Indexes for table `classweekday`
--
ALTER TABLE `classweekday`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_classWeekday_classes` (`class_id`),
  ADD KEY `fk_classWeekday_weekday` (`weekday_id`),
  ADD KEY `fk_classWeekday_status1` (`status_id`);

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_courses_category` (`category_id`),
  ADD KEY `fk_courses_forms` (`form_id`),
  ADD KEY `fk_courses_status1` (`status_id`);

--
-- Indexes for table `forms`
--
ALTER TABLE `forms`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_forms_status1` (`status_id`);

--
-- Indexes for table `grades`
--
ALTER TABLE `grades`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_grades_teacher` (`teacher_id`),
  ADD KEY `fk_grades_classstudent` (`classStudent_id`),
  ADD KEY `fk_grades_status1` (`status_id`);

--
-- Indexes for table `lessons`
--
ALTER TABLE `lessons`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_lessons_teacher` (`teacher_id`),
  ADD KEY `fk_lessons_status1` (`status_id`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_payment_admin` (`admin_id`),
  ADD KEY `fk_payment_student` (`student_id`),
  ADD KEY `fk_payment_classes` (`class_id`),
  ADD KEY `fk_payment_paymentMethod` (`paymentMethod_id`),
  ADD KEY `fk_payment_status1` (`status_id`);

--
-- Indexes for table `paymentmethod`
--
ALTER TABLE `paymentmethod`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `status1`
--
ALTER TABLE `status1`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `phoneNumber` (`phoneNumber`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `userName` (`userName`),
  ADD KEY `fk_users_roles` (`role_id`),
  ADD KEY `fk_users_status1` (`status_id`);

--
-- Indexes for table `weekday`
--
ALTER TABLE `weekday`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `attendance`
--
ALTER TABLE `attendance`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `classes`
--
ALTER TABLE `classes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `classlesson`
--
ALTER TABLE `classlesson`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `classstudent`
--
ALTER TABLE `classstudent`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `classweekday`
--
ALTER TABLE `classweekday`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `courses`
--
ALTER TABLE `courses`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `forms`
--
ALTER TABLE `forms`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `grades`
--
ALTER TABLE `grades`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `lessons`
--
ALTER TABLE `lessons`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `paymentmethod`
--
ALTER TABLE `paymentmethod`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `status1`
--
ALTER TABLE `status1`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;

--
-- AUTO_INCREMENT for table `weekday`
--
ALTER TABLE `weekday`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `attendance`
--
ALTER TABLE `attendance`
  ADD CONSTRAINT `fk_attendance_classstudent` FOREIGN KEY (`classStudent_id`) REFERENCES `classstudent` (`id`),
  ADD CONSTRAINT `fk_attendance_status1` FOREIGN KEY (`status_id`) REFERENCES `status1` (`id`),
  ADD CONSTRAINT `fk_attendance_teacher` FOREIGN KEY (`teacher_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `category`
--
ALTER TABLE `category`
  ADD CONSTRAINT `fk_category_status1` FOREIGN KEY (`status_id`) REFERENCES `status1` (`id`);

--
-- Constraints for table `classes`
--
ALTER TABLE `classes`
  ADD CONSTRAINT `fk_classes_courses` FOREIGN KEY (`course_id`) REFERENCES `courses` (`id`),
  ADD CONSTRAINT `fk_classes_status1` FOREIGN KEY (`status_id`) REFERENCES `status1` (`id`),
  ADD CONSTRAINT `fk_classes_teacher` FOREIGN KEY (`teacher_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `classlesson`
--
ALTER TABLE `classlesson`
  ADD CONSTRAINT `fk_classLesson_classes` FOREIGN KEY (`class_id`) REFERENCES `classes` (`id`),
  ADD CONSTRAINT `fk_classLesson_lessons` FOREIGN KEY (`lesson_id`) REFERENCES `lessons` (`id`),
  ADD CONSTRAINT `fk_classLesson_status1` FOREIGN KEY (`status_id`) REFERENCES `status1` (`id`);

--
-- Constraints for table `classstudent`
--
ALTER TABLE `classstudent`
  ADD CONSTRAINT `fk_classStudent_admin` FOREIGN KEY (`admin_id`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `fk_classStudent_classes` FOREIGN KEY (`class_id`) REFERENCES `classes` (`id`),
  ADD CONSTRAINT `fk_classStudent_status1` FOREIGN KEY (`status_id`) REFERENCES `status1` (`id`),
  ADD CONSTRAINT `fk_classStudent_student` FOREIGN KEY (`student_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `classweekday`
--
ALTER TABLE `classweekday`
  ADD CONSTRAINT `fk_classWeekday_classes` FOREIGN KEY (`class_id`) REFERENCES `classes` (`id`),
  ADD CONSTRAINT `fk_classWeekday_status1` FOREIGN KEY (`status_id`) REFERENCES `status1` (`id`),
  ADD CONSTRAINT `fk_classWeekday_weekday` FOREIGN KEY (`weekday_id`) REFERENCES `weekday` (`id`);

--
-- Constraints for table `courses`
--
ALTER TABLE `courses`
  ADD CONSTRAINT `fk_courses_category` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`),
  ADD CONSTRAINT `fk_courses_forms` FOREIGN KEY (`form_id`) REFERENCES `forms` (`id`),
  ADD CONSTRAINT `fk_courses_status1` FOREIGN KEY (`status_id`) REFERENCES `status1` (`id`);

--
-- Constraints for table `forms`
--
ALTER TABLE `forms`
  ADD CONSTRAINT `fk_forms_status1` FOREIGN KEY (`status_id`) REFERENCES `status1` (`id`);

--
-- Constraints for table `grades`
--
ALTER TABLE `grades`
  ADD CONSTRAINT `fk_grades_classstudent` FOREIGN KEY (`classStudent_id`) REFERENCES `classstudent` (`id`),
  ADD CONSTRAINT `fk_grades_status1` FOREIGN KEY (`status_id`) REFERENCES `status1` (`id`),
  ADD CONSTRAINT `fk_grades_teacher` FOREIGN KEY (`teacher_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `lessons`
--
ALTER TABLE `lessons`
  ADD CONSTRAINT `fk_lessons_status1` FOREIGN KEY (`status_id`) REFERENCES `status1` (`id`),
  ADD CONSTRAINT `fk_lessons_teacher` FOREIGN KEY (`teacher_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `fk_payment_admin` FOREIGN KEY (`admin_id`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `fk_payment_classes` FOREIGN KEY (`class_id`) REFERENCES `classes` (`id`),
  ADD CONSTRAINT `fk_payment_paymentMethod` FOREIGN KEY (`paymentMethod_id`) REFERENCES `paymentmethod` (`id`),
  ADD CONSTRAINT `fk_payment_status1` FOREIGN KEY (`status_id`) REFERENCES `status1` (`id`),
  ADD CONSTRAINT `fk_payment_student` FOREIGN KEY (`student_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `fk_users_roles` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`),
  ADD CONSTRAINT `fk_users_status1` FOREIGN KEY (`status_id`) REFERENCES `status1` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

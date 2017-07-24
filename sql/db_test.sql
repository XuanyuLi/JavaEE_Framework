DROP DATABASE IF EXISTS db_test;
CREATE DATABASE db_test;

# user table
DROP TABLE IF EXISTS db_test.user;
CREATE TABLE db_test.user (
  id       INT AUTO_INCREMENT PRIMARY KEY COMMENT 'PK',
  username VARCHAR(255) COMMENT '用户名',
  password VARCHAR(255) COMMENT '密码',
  lastTime DATETIME
  COMMENT '登录时间'
)COMMENT '用户表';

DROP TABLE IF EXISTS db_test.book;
CREATE TABLE db_test.book (
  id       INT AUTO_INCREMENT PRIMARY KEY COMMENT 'PK',
  title VARCHAR(255) COMMENT '书名',
  author VARCHAR(255) COMMENT '作者',
  date DATE COMMENT '出版时间',
  price DECIMAL(6,2) COMMENT '定价'
)COMMENT '图书表';

DROP TABLE IF EXISTS db_test.student;
CREATE TABLE db_test.student(
  id INT AUTO_INCREMENT PRIMARY KEY COMMENT 'PK',
  name VARCHAR(255) NOT NULL UNIQUE COMMENT '姓名',
  age INT COMMENT '年龄',
  heignt DOUBLE COMMENT '身高',
  married VARCHAR(255) COMMENT '婚否'
)COMMENT '学生表';

SELECT *
FROM db_test.student;

SELECT *
FROM db_test.user;

SELECT *
FROM db_test.book;

INSERT INTO db_test.book VALUE (NULL ,"MySql","tester","2017-01-01",111.22);

drop database if EXISTS `question`;
create database `question`;

use question;

drop table if EXISTS `users`;
create table `users`(
`id` int(10) PRIMARY KEY comment=`id 主键`,
`name` varchar(20) comment=`用户名`,
`password` varchar(20) comment=`密码`,
`last_login_time` TIMESTAMP comment=`最后登录时间`,
`error_count` int(2) DEFAULT 0 comment=`错误次数`,
`last_error_time` TIMESTAMP comment=`最后密码错误时间`,
`deleteed` tinyint(1) DEFAULT 0 comment=`删除标识`,
`last_prompt_time` TIMESTAMP COMMENT=`上次提示时间`
)comment=`用户表`;

drop table if EXISTS `posts`;
create table `posts`(
`id` int(20) PRIMARY KEY comment=`id 主键`,
`title` varchar(100) comment=`标题`,
`users_id` int(10) COMMENT=`创建人`,
`content` BLOB COMMENT=`内容`,
`question_time` TIMESTAMP COMMENT=`发帖时间`,
`deleteed` tinyint(1) DEFAULT 0 `删除标识`
) COMMENT=`提问帖子表`;

drop table if EXISTS `answers`;
create table `answers`(
`id` int (20) PRIMARY KEY COMMENT=`id 主键`,
`users_id` int(10) COMMENT=`回答人`,
`content` blob COMMENT=`回答内容`,
`time` timestamp COMMENT=`回答时间`,
`support` int(6) comment=`支持数`,
`against` int(6) comment=`反对数`,
`deleteed` tinyint(1) DEFAULT 0 COMMENT=`删除标识`
)comment=`回答表`;
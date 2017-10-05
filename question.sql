drop database if EXISTS `question`;
create database `question`;

use question;

drop table if EXISTS `tb_users`;
create table `tb_users`(
`id` int(10) AUTO_INCREMENT comment 'id 主键',
`name` varchar(20) comment '用户名',
`password` varchar(20) comment '密码',
`last_login_time` TIMESTAMP comment '最后登录时间',
`error_count` int(2) DEFAULT 0 comment '错误次数',
`last_error_time` TIMESTAMP comment '最后密码错误时间',
`deleteed` tinyint(1) DEFAULT 0 comment '删除标识',
`last_prompt_time` TIMESTAMP COMMENT '上次提示时间',
primary key(`id`)
)comment '用户表' AUTO_INCREMENT=100;

drop table if EXISTS `tb_posts`;
create table `tb_posts`(
`id` int(20) AUTO_INCREMENT comment 'id 主键',
`title` varchar(100) comment '标题',
`users_id` int(10) COMMENT '创建人',
`type_id` int(20) comment'类型编号',
`content` BLOB COMMENT '内容',
`question_time` TIMESTAMP COMMENT '发帖时间',
`deleteed` tinyint(1) DEFAULT 0 comment '删除标识',
primary key(`id`)
) COMMENT '提问帖子表' AUTO_INCREMENT=100;

drop table if EXISTS `tb_answers`;
create table `tb_answers`(
`id` int (20) AUTO_INCREMENT COMMENT 'id 主键',
`users_id` int(10) COMMENT '回答人',
`content` blob COMMENT '回答内容',
`answers_time` timestamp COMMENT '回答时间',
`support` int(6) comment '支持数',
`against` int(6) comment '反对数',
`deleteed` tinyint(1) DEFAULT 0 COMMENT '删除标识',
primary key(`id`)
)comment '回答表' AUTO_INCREMENT=100;

drop table if exists `tb_posts_type`;
create table `tb_posts_type`(
`id` int (20) AUTO_INCREMENT comment 'id 主键',
`type_name` varchar(50) comment '类型名',
`create_time` timestamp comment '类型创建时间',
`deleteed` tinyint(1) comment '删除标识',
primary key(`id`)
)comment'帖子类型表' AUTO_INCREMENT=100;
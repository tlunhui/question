drop database if EXISTS `question`;
create database `question`;

use question;

drop table if EXISTS `users`;
create table `tb_users`(
`id` int(10) AUTO_INCREMENT comment 'id 主键',
`name` varchar(20) comment '用户名',
`pwd` varchar(20) comment '密码',
`nickname` varchar(20) comment '昵称',
`create_date` timestamp comment '创建时间',
`last_login_time` TIMESTAMP comment '最后登录时间',
`error_count` int(2) DEFAULT 0 comment '错误次数',
`last_error_time` TIMESTAMP comment '最后密码错误时间',
`deleteed` tinyint(1) DEFAULT 0 comment '删除标识',
`last_prompt_time` TIMESTAMP COMMENT '上次提示时间',
primary key(`id`)
)comment '用户表' AUTO_INCREMENT=100;

drop table if EXISTS `problem`;
create table `tb_problem`(
`problem_id` int(20) AUTO_INCREMENT comment 'id 主键',
`title` varchar(100) comment '标题',
`users_id` int(10) COMMENT '创建人',
`users_name` int(10) COMMENT '创建人名字',
`create_time` TIMESTAMP COMMENT '发帖时间',
`update_time` timestamp comment '最后修改时间',
`vote_count` int(10) default 0 comment '赞数量',
`view_count` int(10) default 0 comment '查看数量',
`answer_count` int(10) default 0 comment '回答数',
`content` BLOB COMMENT '内容',
`deleteed` tinyint(1) DEFAULT 0 comment '删除标识',
primary key(`problem_id`)
) COMMENT '提问帖子表' AUTO_INCREMENT=100;

drop table if EXISTS `answer`;
create table `tb_answer`(
`answer_id` int (20) AUTO_INCREMENT COMMENT 'id 主键',
`create_time` timestamp COMMENT '回答时间',
`users_id` int(10) COMMENT '回答人',
`users_name` int(10) COMMENT '回答人名字',
`agree_count` int(10) default 0 comment '同意数',
`opposition_count` int(10) default 0 comment '反对数',
`adopt` tinyint(1) default 0 comment '是否采纳',
`deleteed` tinyint(1) DEFAULT 0 COMMENT '删除标识',
`feed_back` int(10) default 0 comment '回复数',
`content` blob COMMENT '回答内容',
`problem_id` int(20) comment'问题编号',
primary key(`answer_id`)
)comment '回答表' AUTO_INCREMENT=100;

drop table if exists `label`;
create table `tb_label`(
`label_id` int (20) AUTO_INCREMENT comment 'id 主键',
`label_name` varchar(50) comment '类型名',
`deleteFlag` tinyint(1) default 0 comment '删除标识',
primary key(`label_id`)
)comment'帖子类型表' AUTO_INCREMENT=100;

drop table if exists `problem_laber`;
create table `tb_problem_laber`(
`id` int(20) auto_increment comment '主键',
`label_id` int (20)  comment '标签id',
`problem_id` int(20) comment '帖子id',
primary key(`id`)
) comment '帖子标签表' auto_increment=100;
/*创建数据库bbs_test*/
CREATE DATABASE BBS_test

/*使用bbs_test数据库*/
USE bbs_test

/*创建用户信息详细表t_user_specific*/
CREATE TABLE t_user_specific(
u_id INT PRIMARY KEY AUTO_INCREMENT,
/*用户昵称*/
u_name VARCHAR(20),
/*mysql 5系列版本，char或者varchar中的数值，代表字符数，即一个汉字，字母或数字为一个字符。*/
u_sex CHAR(1),
/*密码的最大长度16位*/
u_password VARCHAR(16) NOT NULL,

u_phone VARCHAR(20),

u_email VARCHAR(100),
/*用户个性签名*/
u_sign TEXT,
/*用户头像地址*/
u_icon_url VARCHAR(100),
/*用户经验值*/
u_experience INT,
/*用户等级*/
u_rank INT,
/*用户注册日期*/
u_registration_date DATE,
/*用户状态，0黑名单，-1注销，1正常。*/
u_status TINYINT
) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;
/*drop table t_user_specific;*/

/*创建用户信息简略表，用于登陆和查询，两者的数据一致性将由事务来保证*/
CREATE TABLE t_user_simple(
u_id INT PRIMARY KEY AUTO_INCREMENT,
u_name VARCHAR(20),
u_password VARCHAR(16) NOT NULL,
u_icon_url VARCHAR(100)
) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

/*主贴表*/
CREATE TABLE t_topic(
/*主题帖id*/
tp_id INT PRIMARY KEY AUTO_INCREMENT,
/*用户id*/
u_id INT,
/*分类id*/
ct_id INT,
/*限制主题标题在200个字以内*/
tp_title VARCHAR(200),
/*创建日期*/
create_date DATE,
/*状态 0代表帖子已完结，不可回复，1代表可回复*/
tp_status TINYINT
) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

/*主题帖内容id，采用事务保持数据一致性*/
CREATE TABLE t_topic_content(
tpc_id INT PRIMARY KEY AUTO_INCREMENT,
/*主题帖的id*/
tp_id  INT,
/*主题帖内容,字段值过大，出于查询性能考虑，单独成表*/
tp_content TEXT,
/*该字段会被经常查询，故建立索引已提高查询速度*/
INDEX (tp_id)
) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

/*主题帖各项指标表，采用事务保持数据一致性*/
CREATE TABLE t_topic_indicators(
tpi_id INT PRIMARY KEY AUTO_INCREMENT,
/*主题帖的id*/
tp_id INT,
/*回复量*/
reply_count INT ,
/*浏览量*/
read_count INT,
/*赞数*/
agree_count INT,
/*踩数*/
disagree_count INT,
/*该字段会被经常查询，故建立索引已提高查询速度*/
INDEX (tp_id)
) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

/*跟帖表*/
CREATE TABLE t_reply(
/*跟帖id*/
tr_id INT PRIMARY KEY AUTO_INCREMENT,
/*主题帖的id*/
tp_id INT,
/*跟帖用户id*/
u_id INT,
/*最后编辑时间*/
last_edit_time TIME,
/*该字段会被经常查询，故建立索引已提高查询速度*/
INDEX (tp_id)
) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

/*跟帖内容表*，采用事务保证数据一致性*/
CREATE TABLE t_reply_content(
trc_id INT PRIMARY KEY AUTO_INCREMENT,
/*跟帖的id*/
tr_id INT,
/*跟帖的内容，字段值过大，出于查询性能考虑，单独成表*/
tr_content TEXT,
/*该字段会被经常查询，故建立索引已提高查询速度*/
INDEX (tr_id)
) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

/*跟帖各项指标表，采用事务保证数据一致性*/
CREATE TABLE t_reply_indicators(
tri_id INT PRIMARY KEY AUTO_INCREMENT,
/*跟帖的id*/
tr_id INT,
/*赞数*/
agree_count INT,
/*踩数*/
disagree_count INT,
/*该字段会被经常查询，故建立索引已提高查询速度*/
INDEX (tr_id)
) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

/*分类表*/
CREATE TABLE t_category(
/*分类id*/
ct_id SMALLINT PRIMARY KEY AUTO_INCREMENT,
/*限定分类名称在10字以内*/
ct_name VARCHAR(10)
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;




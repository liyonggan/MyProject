create table t_sequence
(
	id  VARCHAR(20)  comment '主键',
	seq_num int comment '当前id',
    primary key (id)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;
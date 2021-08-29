create table sys_login_log
(
	id  int NOT NULL AUTO_INCREMENT comment '主键',
	title VARCHAR(20) comment '日志标题',
	loginName VARCHAR(50) comment '登陆名',
	loginTime TIMESTAMP comment '登陆时间',
	loginIp VARCHAR(15) comment '登陆ip',
	loginLocation VARCHAR(20) comment '登陆地址',
	browser VARCHAR(10) comment '浏览器类型',
	os VARCHAR(10) comment '操作系统',
	type int comment '类型：1登录系统 2退出系统',
	msg VARCHAR(100) comment '提示消息',
	status int comment '登录状态：1成功 2失败',
    create_time date comment '创建时间',
    update_user int comment '更新人',
    update_time date comment '更新时间',
    create_user int comment '创建人',
    mark int comment '有效标识1正常0删除',
    primary key (id)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;
create table sys_oper_log
(
	id  int NOT NULL AUTO_INCREMENT comment '主键',
	title VARCHAR(20) comment '模块标题',
	businessType int comment '业务类型：0其它 1新增 2修改 3删除',
	method VARCHAR(20) comment '方法名称',
	requestMethod VARCHAR(10) comment '请求方式',
	operatorType int comment '操作类别：0其它 1后台用户 2手机端用户',
	operName VARCHAR(50) comment '操作人员',
	operUrl VARCHAR(100) comment '请求url',
	operIp VARCHAR(15) comment '主机地址',
	operLocation VARCHAR(20) comment '操作地点',
	operParam VARCHAR(100) comment '请求参数',
	jsonResult VARCHAR(120) comment '返回参数',
	status int comment '操作状态：1正常 2异常',
	errorMsg VARCHAR(100) comment '错误参数',
    create_time date comment '创建时间',
    update_user int comment '更新人',
    update_time date comment '更新时间',
    create_user int comment '创建人',
    mark int comment '有效标识1正常0删除',
    primary key (id)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;
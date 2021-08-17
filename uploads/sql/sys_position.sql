create table sys_position
(
	id  int comment '用户id',
    create_time date comment '创建时间',
    name varchar(20) comment '菜单名称',
    update_user int comment '更新人',
    update_time date comment '更新时间',
    create_user int comment '创建人',
    status int comment '是否显示：1显示 2不显示',
    sort int comment '显示顺序',
    mark int comment '有效标识1正常0删除',
    primary key (id)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;
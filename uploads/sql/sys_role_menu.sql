create table sys_role_menu
(
	id  int comment '主键',
	role_id int comment '角色ID',
	menu_id int comment '菜单ID',
    create_time date comment '创建时间',
    update_user int comment '更新人',
    update_time date comment '更新时间',
    create_user int comment '创建人',
    mark int comment '有效标识1正常0删除',
    primary key (id)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;
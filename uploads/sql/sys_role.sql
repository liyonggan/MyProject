create table sys_role
(
	id  int comment '主键',
	name int comment '角色名称',
	rules int comment '角色拥有的菜单ID，多个规则","隔开',
	status int comment '状态：1正常 2禁用',
	sort int comment '排序',
    create_time date comment '创建时间',
    update_user int comment '更新人',
    update_time date comment '更新时间',
    create_user int comment '创建人',
    mark int comment '有效标识1正常0删除',
    primary key (id)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;
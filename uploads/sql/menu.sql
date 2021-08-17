create table menu
(
	id  int comment '用户id',
    note varchar(100) comment '备注',
    icon varchar(50) comment '图标',
    update_user varchar(20) comment '更新人',
    permission varchar(20) comment '权限标识',
    pid int comment '上级id',
    update_time date comment '更新时间',
    sort int comment '显示顺序',
    type int comment '类型:1模块2导航3菜单4节点',
    url varchar(100) comment 'url地址',
    param varchar(50) comment '参数',
    create_time date comment '创建时间',
    name varchar(20) comment '菜单名称',
    is_public int comment '是否公共：1是 2否',
    create_user varchar(20) comment '创建人',
    status int comment '是否显示：1显示 2不显示',
    mark int comment '有效标识1正常0删除',
    primary key (id)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;
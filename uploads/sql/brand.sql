create table brand
(
	id  int comment '商品id',
    logo varchar(50) comment '品牌logo',
    name varchar(50) comment '品牌名称',
    country varchar(20) comment '国家/地区',
    status int comment '是否禁用：1正常 0禁用',
    description varchar(100) comment '品牌描述',
    create_time date comment '创建时间',
    update_user int comment '更新人',
    update_time date comment '更新时间',
    create_user int comment '创建人',
    mark int comment '有效标识1正常0删除',
    primary key (id)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;
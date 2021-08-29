create table product
(
	id  int comment '产品id',
	brand_id int comment '所属品牌id',
    name varchar(50) comment '产品名称',
    price DOUBLE comment '价格',
    unit varchar(5) comment '金额单位',
    inventory int comment '库存',
    sold int comment '已出售',
    country varchar(20) comment '国家/地区',
    status int comment '是否禁用：1正常 0禁用',
    create_time TIMESTAMP comment '创建时间',
    update_user int comment '更新人',
    update_time TIMESTAMP comment '更新时间',
    create_user int comment '创建人',
    mark int comment '有效标识1正常0删除',
    primary key (id)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;
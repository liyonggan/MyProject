create table user
(
	id  int comment '用户id' primary key not null auto_increment,
    realname varchar(50) comment '真实姓名',
    nickname varchar(50) comment '昵称',
    gender int comment '性别1男2女3保密',
    avatar varchar(50) comment '头像',
    mobile varchar(20) comment '手机号',
    email varchar(20) comment '邮箱',
    birthday date comment '出生日期',
    dept_id int comment '部门id',
    level_id int comment '职级id',
    position_id int comment '岗位id',
    country varchar(20) comment '国家',
    address varchar(100) comment '详细地址',
    city_name varchar(50) comment'城市',
    username varchar(20) comment '登陆用户名',
    password varchar(100) comment '登陆密码',
    salt varchar(50) comment '盐加密',
    role_ids varchar(50) comment '用户角色id',
    login_ip varchar(15) comment '最近登陆ip',
    create_user int comment '创建人id',
    update_user int comment '更新人id',
    mark int comment '有效标识1正常0删除',
    status int comment '有效标识1正常0删除',
    note varchar(100) comment '备注',
    city_id int comment '城市id',
    login_num int comment '登陆次数',
    login_time date comment '登陆时间',
    intro varchar(100) comment '个人简介',
    sort int comment '显示顺序',
    province_id int comment '省份id',
    tags varchar(50) comment '个性标签',
    district_id int comment '区县id',
    update_time date comment'更新时间',
    create_time date comment'更新时间'
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;



CREATE TABLE `user` (
   `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
   `realname` varchar(50) DEFAULT NULL COMMENT '真实姓名',
   `nickname` varchar(50) DEFAULT NULL COMMENT '昵称',
   `gender` int(11) DEFAULT NULL COMMENT '性别1男2女3保密',
   `avatar` varchar(50) DEFAULT NULL COMMENT '头像',
   `mobile` varchar(20) DEFAULT NULL COMMENT '手机号',
   `email` varchar(20) DEFAULT NULL COMMENT '邮箱',
   `birthday` date DEFAULT NULL COMMENT '出生日期',
   `dept_id` int(11) DEFAULT NULL COMMENT '部门id',
   `level_id` int(11) DEFAULT NULL COMMENT '职级id',
   `position_id` int(11) DEFAULT NULL COMMENT '岗位id',
   `country` varchar(20) DEFAULT NULL COMMENT '国家',
   `address` varchar(100) DEFAULT NULL COMMENT '详细地址',
   `city_name` varchar(50) DEFAULT NULL COMMENT '城市',
   `username` varchar(20) DEFAULT NULL COMMENT '登陆用户名',
   `password` varchar(100) DEFAULT NULL COMMENT '登陆密码',
   `salt` varchar(50) DEFAULT NULL COMMENT '盐加密',
   `role_ids` varchar(50) DEFAULT NULL COMMENT '用户角色id',
   `login_ip` varchar(15) DEFAULT NULL COMMENT '最近登陆ip',
   `create_user` int(11) DEFAULT NULL COMMENT '创建人id',
   `update_user` int(11) DEFAULT NULL COMMENT '更新人id',
   `mark` int(11) DEFAULT NULL COMMENT '有效标识1正常0删除',
   `status` int(11) DEFAULT NULL COMMENT '有效标识1正常0删除',
   `note` varchar(100) DEFAULT NULL COMMENT '备注',
   `city_id` int(11) DEFAULT NULL COMMENT '城市id',
   `login_num` int(11) DEFAULT NULL COMMENT '登陆次数',
   `login_time` date DEFAULT NULL COMMENT '登陆时间',
   `intro` varchar(100) DEFAULT NULL COMMENT '个人简介',
   `sort` int(11) DEFAULT NULL COMMENT '显示顺序',
   `province_id` int(11) DEFAULT NULL COMMENT '省份id',
   `tags` varchar(50) DEFAULT NULL COMMENT '个性标签',
   `district_id` int(11) DEFAULT NULL COMMENT '区县id',
   `update_time` timestamp,
   `create_time` timestamp,
   PRIMARY KEY (`id`),
   UNIQUE KEY `username` (`username`, `status`)
 ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;
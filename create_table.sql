
CREATE TABLE water_system_code (
                                   id int auto_increment,
                                   code varchar(2) NOT NULL comment "编码",
                                   name varchar(20) DEFAULT NULL comment "名称",
                                   PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `log` (
                       id int auto_increment,
                       user_id varchar(10) NOT NULL comment "用户id",
                       log_time datetime NOT NULL comment "日志时间",
                       log_message text comment "信息",
                       PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

CREATE TABLE `hydrologic_station` (
                                      id int auto_increment,
                                      h_name varchar(20) NOT NULL comment "测站名称",
                                      h_code varchar(8) NOT NULL comment "测站编码",
                                      r_system varchar(2) DEFAULT NULL comment "水系",
                                      longitude double(10,6) DEFAULT NULL comment "经度",
                                      latitude double(10,6) DEFAULT NULL comment "纬度",
                                      mean_annual_runoff double DEFAULT NULL comment "多年平均径流量(亿m3)",
                                      maximum_discharge double DEFAULT NULL comment "实测最大流量",
                                      maximum_time datetime DEFAULT NULL comment "最大流量测量时间",
                                      minimum_discharge double DEFAULT NULL comment "实测最小流量",
                                      minimum_time datetime DEFAULT NULL comment "最小流量时间",
                                      PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;


CREATE TABLE `gauging_station` (
                                   id int auto_increment,
                                   h_name varchar(20) NOT NULL comment "测站名称",
                                   h_code varchar(8) NOT NULL DEFAULT '00000000' comment "测站编码",
                                   r_system varchar(2) DEFAULT NULL  comment "水系",
                                   longitude double(10,6) DEFAULT NULL comment "经度",
                                   latitude double(10,6) DEFAULT NULL comment "纬度",
                                   highest_water_level double DEFAULT NULL comment "实测最高水位",
                                   highest_water_time datetime DEFAULT NULL comment "实测最高水位时间",
                                   low_water_level double DEFAULT NULL comment "实测最低水位",
                                   low_water_time datetime DEFAULT NULL  comment "实测最低水位时间",
                                   PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;


CREATE TABLE `rainfall_station` (
                                    id int auto_increment,
                                    h_name varchar(20) NOT NULL comment "测站名称",
                                    h_code varchar(8) NOT NULL comment "测站编码",
                                    r_system varchar(2) DEFAULT NULL comment "水系",
                                    longitude double(10,6) DEFAULT NULL comment "经度",
                                    latitude double(10,6) DEFAULT NULL comment "纬度",
                                    avg_fall double DEFAULT NULL comment "多年平均降雨量（mm）",
                                    max_fall double DEFAULT NULL comment "实测年最大降雨量（mm）",
                                    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;


CREATE TABLE `sys_user`  (
                             `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
                             `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
                             `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                             `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
                             `dept_id` bigint(20) NULL DEFAULT NULL,
                             `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
                             `mobile` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
                             `status` tinyint(255) NULL DEFAULT NULL COMMENT '状态 0:禁用，1:正常',
                             `user_id_create` bigint(255) NULL DEFAULT NULL COMMENT '创建用户id',
                             `gmt_create` datetime NULL DEFAULT NULL COMMENT '创建时间',
                             `gmt_modified` datetime NULL DEFAULT NULL COMMENT '修改时间',
                             `sex` bigint(32) NULL DEFAULT NULL COMMENT '性别',
                             `birth` datetime NULL DEFAULT NULL COMMENT '出身日期',
                             `pic_id` bigint(32) NULL DEFAULT NULL,
                             `live_address` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '现居住地',
                             `hobby` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '爱好',
                             `province` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '省份',
                             `city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所在城市',
                             `district` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所在地区',
                             `wechat` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '微信',
                             `alipay` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付宝',
                             `post_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮政编码',
                             `major` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所学专业',
                             PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 160 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统用户表' ROW_FORMAT = DYNAMIC;

CREATE TABLE `sys_user_role`  (
                                  `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                  `user_id` bigint(20) NULL DEFAULT NULL COMMENT '用户ID',
                                  `role_id` bigint(20) NULL DEFAULT NULL COMMENT '角色ID',
                                  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 180 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户与角色对应关系' ROW_FORMAT = DYNAMIC;


CREATE TABLE `sys_role_menu`  (
                                  `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                  `role_id` bigint(20) NULL DEFAULT NULL COMMENT '角色ID',
                                  `menu_id` bigint(20) NULL DEFAULT NULL COMMENT '菜单ID',
                                  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3463 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色与菜单对应关系' ROW_FORMAT = DYNAMIC;


CREATE TABLE `sys_role`  (
                             `role_id` bigint(20) NOT NULL AUTO_INCREMENT,
                             `role_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
                             `role_sign` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色标识',
                             `remark` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
                             `user_id_create` bigint(255) NULL DEFAULT NULL COMMENT '创建用户id',
                             `gmt_create` datetime NULL DEFAULT NULL COMMENT '创建时间',
                             `gmt_modified` datetime NULL DEFAULT NULL COMMENT '创建时间',
                             PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 57 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色' ROW_FORMAT = DYNAMIC;

CREATE TABLE `sys_menu`  (
                             `menu_id` bigint(20) NOT NULL AUTO_INCREMENT,
                             `parent_id` bigint(20) NULL DEFAULT NULL COMMENT '父菜单ID，一级菜单为0',
                             `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单名称',
                             `url` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单URL',
                             `perms` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '授权(多个用逗号分隔，如：user:list,user:create)',
                             `type` int(11) NULL DEFAULT NULL COMMENT '类型   0：目录   1：菜单   2：按钮',
                             `icon` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单图标',
                             `order_num` int(11) NULL DEFAULT NULL COMMENT '排序',
                             `gmt_create` datetime NULL DEFAULT NULL COMMENT '创建时间',
                             `component` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                             `gmt_modified` datetime NULL DEFAULT NULL COMMENT '修改时间',
                             `redirect` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
                             PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 107 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '菜单管理' ROW_FORMAT = DYNAMIC;




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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3


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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3


CREATE TABLE `user` (
                        id int auto_increment,
                        user_id varchar(10) NOT NULL comment "用户id",
                        psd varchar(20) DEFAULT NULL comment "密码",
                        administrator int DEFAULT '0' comment "是否管理员",
                        PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3


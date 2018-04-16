CREATE TABLE `car_brand` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建者',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) DEFAULT NULL COMMENT '更新者',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `del_flag` varchar(1) NOT NULL DEFAULT '0' COMMENT '删除标记（0：正常；1：删除）',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注信息',
  `brand_name` varchar(50) NOT NULL COMMENT '品牌名称',
  `brand_no` varchar(50) NOT NULL COMMENT '品牌编号',
  `brand_logo` varchar(255) NOT NULL COMMENT '品牌logo',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车辆品牌';

CREATE TABLE `car_train` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建者',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) DEFAULT NULL COMMENT '更新者',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '删除标记（0：正常；1：删除）',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注信息',
  `train_names` varchar(255) NOT NULL COMMENT '车系名称',
  `train_no` varchar(255) NOT NULL COMMENT '车系编号',
  `brand_id` varchar(32) NOT NULL COMMENT '所属品牌id',
  `train_logo` varchar(255) NOT NULL COMMENT '车系Logo',
  `train_img` varchar(255) NOT NULL COMMENT '车系图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车系';


-- 用户
CREATE TABLE `sys_user` (
  `id` bigint(18) NOT NULL COMMENT '主键',
  `username` varchar(64) DEFAULT '' COMMENT '用户名',
  `password` varchar(128) DEFAULT '' COMMENT '密码',
  `aliasName` varchar(128) DEFAULT '' COMMENT '真实姓名',
  `unitId` bigint(18) DEFAULT NULL COMMENT '所属单位id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
-- 角色
CREATE TABLE `sys_role` (
  `id` bigint(18) NOT NULL COMMENT '主键',
  `name` varchar(64) DEFAULT '' COMMENT '角色名称',
  `desc` varchar(256) DEFAULT '' COMMENT '角色描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
-- 权限
CREATE TABLE `sys_auth` (
  `id` bigint(18) NOT NULL COMMENT '主键',
  `name` varchar(64) DEFAULT '' COMMENT '权限名称',
  `desc` varchar(256) DEFAULT '' COMMENT '权限描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
-- 用户-菜单
CREATE TABLE `sys_menu` (
  `menu_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父菜单ID，一级菜单为0',
  `name` varchar(50) DEFAULT NULL COMMENT '菜单名称',
  `url` varchar(200) DEFAULT NULL COMMENT '菜单URL',
  `perms` varchar(500) DEFAULT NULL COMMENT '授权(多个用逗号分隔，如：user:list,user:create)',
  `type` int(11) DEFAULT NULL COMMENT '类型   0：目录   1：菜单   2：按钮',
  `icon` varchar(50) DEFAULT NULL COMMENT '菜单图标',
  `order_num` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=429841963683864 DEFAULT CHARSET=utf8 COMMENT='菜单管理';
-- 用户-角色
CREATE TABLE `sys_ref_user_role` (
  `id` bigint(18) NOT NULL COMMENT '主键',
  `userId` bigint(18) NOT NULL COMMENT '用户id\r\n',
  `roleId` bigint(18) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
-- 用户-权限
CREATE TABLE `sys_ref_role_auth` (
  `id` bigint(18) NOT NULL COMMENT '主键',
  `roleId` bigint(18) NOT NULL COMMENT '角色id',
  `authId` bigint(18) NOT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
-- 用户-角色
CREATE TABLE `sys_ref_role_menu` (
  `id` bigint(18) NOT NULL COMMENT '主键id',
  `role_id` bigint(18) DEFAULT NULL,
  `menu_id` bigint(18) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


--- 数据初始化
INSERT INTO `sys_user` VALUES ('425259112656896', 'admin', '$2a$10$b.8MlZ0QKBSEyJ23Re2bSOMeDCqGHd42gcgs9.4rpmVo80yuAEDjK', '梁宽', null);
INSERT INTO `sys_role` VALUES ('429841963683847', 'admin', '系统管理员');
INSERT INTO `sys_auth` VALUES ('429873379758085', 'admin', '系统管理');

INSERT INTO `sys_menu` VALUES ('429841963683842', '429841963683840', '权限管理', 'sys/auth', null, '1', 'menu', null);
INSERT INTO `sys_menu` VALUES ('429841963683843', '429841963683840', '角色管理', 'sys/role', null, '1', 'menu', null);
INSERT INTO `sys_menu` VALUES ('429841963683844', '429841963683840', '人员管理', 'sys/user', null, '1', 'menu', null);
INSERT INTO `sys_menu` VALUES ('429841963683845', '0', '系统管理', '', null, '0', '', null);
INSERT INTO `sys_menu` VALUES ('429841963683846', '429841963683845', '菜单管理', 'sys/menu', null, '1', 'menu', null);

INSERT INTO `sys_ref_user_role` VALUES ('429841963683848', '425259112656896', '429841963683847');
INSERT INTO `sys_ref_role_auth` VALUES ('429873379758086', '429841963683847', '429873379758085');
INSERT INTO `sys_ref_role_menu` VALUES ('429873379758081', '429841963683847', '429841963683842');
INSERT INTO `sys_ref_role_menu` VALUES ('429873379758082', '429841963683847', '429841963683843');
INSERT INTO `sys_ref_role_menu` VALUES ('429873379758083', '429841963683847', '429841963683844');
INSERT INTO `sys_ref_role_menu` VALUES ('429873379758084', '429841963683847', '429841963683845');
INSERT INTO `sys_ref_role_menu` VALUES ('429873379758085', '429841963683847', '429841963683846');

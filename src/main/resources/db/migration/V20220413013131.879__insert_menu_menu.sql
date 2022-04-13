INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, 'erupt', '2022-04-13 01:31:31', 'erupt', '2022-04-13 01:31:31', 'cio4areo', NULL, 'Menu', NULL, NULL, '1', 'table', 'Menu', null);

set @parentId = @@identity;

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:31', NULL, NULL, '5oOJOrd6', NULL, '新增', NULL, '10', '1', 'button', 'Menu@ADD', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:31', NULL, NULL, 'cbyxM10J', NULL, '修改', NULL, '20', '1', 'button', 'Menu@EDIT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:31', NULL, NULL, 'ZUuViOjs', NULL, '删除', NULL, '30', '1', 'button', 'Menu@DELETE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:31', NULL, NULL, 'QmSMf4Uc', NULL, '导出', NULL, '40', '1', 'button', 'Menu@EXPORT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:31', NULL, NULL, 'n0r5UZ42', NULL, '导入', NULL, '50', '1', 'button', 'Menu@IMPORTABLE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:31', NULL, NULL, 'P2p3Vudl', NULL, '详情', NULL, '60', '1', 'button', 'Menu@VIEW_DETAIL', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, 'erupt', '2022-04-13 01:30:59', 'erupt', '2022-04-13 01:30:59', 'qfFLw2me', NULL, 'Department', NULL, NULL, '1', 'table', 'Department', null);

set @parentId = @@identity;

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:30:59', NULL, NULL, '3tb5sWmL', NULL, '新增', NULL, '10', '1', 'button', 'Department@ADD', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:30:59', NULL, NULL, 'mWTQJdaK', NULL, '修改', NULL, '20', '1', 'button', 'Department@EDIT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:30:59', NULL, NULL, 'vxTyj2iA', NULL, '删除', NULL, '30', '1', 'button', 'Department@DELETE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:30:59', NULL, NULL, 'bYCEQ1zl', NULL, '导出', NULL, '40', '1', 'button', 'Department@EXPORT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:30:59', NULL, NULL, 'M0ILkVQ1', NULL, '导入', NULL, '50', '1', 'button', 'Department@IMPORTABLE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:30:59', NULL, NULL, 'q8Bd9Fnv', NULL, '详情', NULL, '60', '1', 'button', 'Department@VIEW_DETAIL', @parentId);

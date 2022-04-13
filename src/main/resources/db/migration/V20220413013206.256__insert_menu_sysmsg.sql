INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, 'erupt', '2022-04-13 01:32:06', 'erupt', '2022-04-13 01:32:06', 'A8vT7ypa', NULL, 'Sysmsg', NULL, NULL, '1', 'table', 'Sysmsg', null);

set @parentId = @@identity;

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:32:06', NULL, NULL, 'F1KDDp9a', NULL, '新增', NULL, '10', '1', 'button', 'Sysmsg@ADD', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:32:06', NULL, NULL, 'SAEUawpm', NULL, '修改', NULL, '20', '1', 'button', 'Sysmsg@EDIT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:32:06', NULL, NULL, 'wOTpT4dE', NULL, '删除', NULL, '30', '1', 'button', 'Sysmsg@DELETE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:32:06', NULL, NULL, 'KFaUATys', NULL, '导出', NULL, '40', '1', 'button', 'Sysmsg@EXPORT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:32:06', NULL, NULL, 'nQiRgTNf', NULL, '导入', NULL, '50', '1', 'button', 'Sysmsg@IMPORTABLE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:32:06', NULL, NULL, 'RE2QTdqZ', NULL, '详情', NULL, '60', '1', 'button', 'Sysmsg@VIEW_DETAIL', @parentId);

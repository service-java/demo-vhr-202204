INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, 'erupt', '2022-04-13 01:30:56', 'erupt', '2022-04-13 01:30:56', 'oBrSeyEA', NULL, 'Appraise', NULL, NULL, '1', 'table', 'Appraise', null);

set @parentId = @@identity;

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:30:56', NULL, NULL, 'cIpfavMT', NULL, '新增', NULL, '10', '1', 'button', 'Appraise@ADD', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:30:56', NULL, NULL, '7F7wp9vK', NULL, '修改', NULL, '20', '1', 'button', 'Appraise@EDIT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:30:56', NULL, NULL, 'fCh6nGaZ', NULL, '删除', NULL, '30', '1', 'button', 'Appraise@DELETE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:30:56', NULL, NULL, 'UYxPYdg4', NULL, '导出', NULL, '40', '1', 'button', 'Appraise@EXPORT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:30:56', NULL, NULL, 'LHIy2yYC', NULL, '导入', NULL, '50', '1', 'button', 'Appraise@IMPORTABLE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:30:56', NULL, NULL, 'fZ2SQXfP', NULL, '详情', NULL, '60', '1', 'button', 'Appraise@VIEW_DETAIL', @parentId);

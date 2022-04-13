INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, 'erupt', '2022-04-13 01:31:28', 'erupt', '2022-04-13 01:31:28', 'HFhyppDF', NULL, 'MailSendLog', NULL, NULL, '1', 'table', 'MailSendLog', null);

set @parentId = @@identity;

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:28', NULL, NULL, 'H1aHi9yT', NULL, '新增', NULL, '10', '1', 'button', 'MailSendLog@ADD', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:28', NULL, NULL, 'YG5suMtC', NULL, '修改', NULL, '20', '1', 'button', 'MailSendLog@EDIT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:28', NULL, NULL, 'Qtf6SN3Y', NULL, '删除', NULL, '30', '1', 'button', 'MailSendLog@DELETE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:28', NULL, NULL, 'Su1DPbzF', NULL, '导出', NULL, '40', '1', 'button', 'MailSendLog@EXPORT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:28', NULL, NULL, 'geu0RVQn', NULL, '导入', NULL, '50', '1', 'button', 'MailSendLog@IMPORTABLE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:28', NULL, NULL, 'V2p6ffwh', NULL, '详情', NULL, '60', '1', 'button', 'MailSendLog@VIEW_DETAIL', @parentId);

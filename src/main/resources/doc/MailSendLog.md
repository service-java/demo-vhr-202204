# mail_send_log

无注释


| 名称 | 数据类型 | 长度  |  说明 |
| :--: | :--- | :------: |  :----: |
|msgId | varchar| 255 |     |
|empId | integer| 10 |     |
|status | integer| 10 |    0发送中，1发送成功，2发送失败 |
|routeKey | varchar| 255 |     |
|exchange | varchar| 255 |     |
|count | integer| 10 |    重试次数 |
|tryTime | date| 10 |    第一次重试时间 |
|createTime | date| 10 |     |
|updateTime | date| 10 |     |

cols
===
```sql
msgId,empId,status,routeKey,exchange,count,tryTime,createTime,updateTime
```


pageMailSendLog
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from mail_send_log
```


jsonMap
===
```json
{
    "msgid":"msgId",
    "empid":"empId",
    "status":"status",
    "routekey":"routeKey",
    "exchange":"exchange",
    "count":"count",
    "trytime":"tryTime",
    "createtime":"createTime",
    "updatetime":"updateTime"
}
```
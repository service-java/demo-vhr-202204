cols
===
```sql
id,title,message,createDate
```


pageMsgcontent
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from msgcontent
```


jsonMap
===
```json
{
    "id":"id",
    "title":"title",
    "message":"message",
    "createdate":"createDate"
}
```
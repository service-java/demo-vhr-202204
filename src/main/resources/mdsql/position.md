cols
===
```sql
id,name,createDate,enabled
```


pagePosition
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from position
```


jsonMap
===
```json
{
    "id":"id",
    "name":"name",
    "createdate":"createDate",
    "enabled":"enabled"
}
```
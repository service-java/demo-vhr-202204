cols
===
```sql
id,name,titleLevel,createDate,enabled
```


pageJoblevel
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from joblevel
```


jsonMap
===
```json
{
    "id":"id",
    "name":"name",
    "titlelevel":"titleLevel",
    "createdate":"createDate",
    "enabled":"enabled"
}
```
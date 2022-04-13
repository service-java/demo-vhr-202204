cols
===
```sql
id,name
```


pageNation
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from nation
```


jsonMap
===
```json
{
    "id":"id",
    "name":"name"
}
```
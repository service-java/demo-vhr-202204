cols
===
```sql
id,addDate,operate,hrid
```


pageOplog
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from oplog
```


jsonMap
===
```json
{
    "id":"id",
    "adddate":"addDate",
    "operate":"operate",
    "hrid":"hrid"
}
```
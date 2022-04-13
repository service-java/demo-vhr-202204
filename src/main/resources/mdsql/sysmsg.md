cols
===
```sql
id,mid,type,hrid,state
```


pageSysmsg
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from sysmsg
```


jsonMap
===
```json
{
    "id":"id",
    "mid":"mid",
    "type":"type",
    "hrid":"hrid",
    "state":"state"
}
```
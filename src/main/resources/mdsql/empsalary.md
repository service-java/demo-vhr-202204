cols
===
```sql
id,eid,sid
```


pageEmpsalary
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from empsalary
```


jsonMap
===
```json
{
    "id":"id",
    "eid":"eid",
    "sid":"sid"
}
```
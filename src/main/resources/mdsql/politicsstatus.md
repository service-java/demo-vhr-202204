cols
===
```sql
id,name
```


pagePoliticsstatus
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from politicsstatus
```


jsonMap
===
```json
{
    "id":"id",
    "name":"name"
}
```
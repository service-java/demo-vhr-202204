cols
===
```sql
id,name,nameZh
```


pageRole
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from role
```


jsonMap
===
```json
{
    "id":"id",
    "name":"name",
    "namezh":"nameZh"
}
```
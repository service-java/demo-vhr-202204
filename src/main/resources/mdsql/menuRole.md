cols
===
```sql
id,mid,rid
```


pageMenuRole
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from menu_role
```


jsonMap
===
```json
{
    "id":"id",
    "mid":"mid",
    "rid":"rid"
}
```
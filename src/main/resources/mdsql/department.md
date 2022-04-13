cols
===
```sql
id,name,parentId,depPath,enabled,isParent
```


pageDepartment
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from department
```


jsonMap
===
```json
{
    "id":"id",
    "name":"name",
    "parentid":"parentId",
    "deppath":"depPath",
    "enabled":"enabled",
    "isparent":"isParent"
}
```
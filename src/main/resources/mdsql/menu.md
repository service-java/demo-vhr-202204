cols
===
```sql
id,url,path,component,name,iconCls,keepAlive,requireAuth,parentId,enabled
```


pageMenu
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from menu
```


jsonMap
===
```json
{
    "id":"id",
    "url":"url",
    "path":"path",
    "component":"component",
    "name":"name",
    "iconcls":"iconCls",
    "keepalive":"keepAlive",
    "requireauth":"requireAuth",
    "parentid":"parentId",
    "enabled":"enabled"
}
```
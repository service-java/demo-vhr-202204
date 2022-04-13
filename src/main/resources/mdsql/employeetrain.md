cols
===
```sql
id,eid,trainDate,trainContent,remark
```


pageEmployeetrain
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from employeetrain
```


jsonMap
===
```json
{
    "id":"id",
    "eid":"eid",
    "traindate":"trainDate",
    "traincontent":"trainContent",
    "remark":"remark"
}
```
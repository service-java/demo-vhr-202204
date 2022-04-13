cols
===
```sql
id,eid,ecDate,ecReason,ecPoint,ecType,remark
```


pageEmployeeec
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from employeeec
```


jsonMap
===
```json
{
    "id":"id",
    "eid":"eid",
    "ecdate":"ecDate",
    "ecreason":"ecReason",
    "ecpoint":"ecPoint",
    "ectype":"ecType",
    "remark":"remark"
}
```
cols
===
```sql
id,eid,afterDepId,afterJobId,removeDate,reason,remark
```


pageEmployeeremove
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from employeeremove
```


jsonMap
===
```json
{
    "id":"id",
    "eid":"eid",
    "afterdepid":"afterDepId",
    "afterjobid":"afterJobId",
    "removedate":"removeDate",
    "reason":"reason",
    "remark":"remark"
}
```
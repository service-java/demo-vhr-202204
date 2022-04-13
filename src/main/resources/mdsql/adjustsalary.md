cols
===
```sql
id,eid,asDate,beforeSalary,afterSalary,reason,remark
```


pageAdjustsalary
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from adjustsalary
```


jsonMap
===
```json
{
    "id":"id",
    "eid":"eid",
    "asdate":"asDate",
    "beforesalary":"beforeSalary",
    "aftersalary":"afterSalary",
    "reason":"reason",
    "remark":"remark"
}
```
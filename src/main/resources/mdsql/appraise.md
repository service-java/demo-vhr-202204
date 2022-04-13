cols
===
```sql
id,eid,appDate,appResult,appContent,remark
```


pageAppraise
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from appraise
```


jsonMap
===
```json
{
    "id":"id",
    "eid":"eid",
    "appdate":"appDate",
    "appresult":"appResult",
    "appcontent":"appContent",
    "remark":"remark"
}
```
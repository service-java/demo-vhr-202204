cols
===
```sql
id,basicSalary,bonus,lunchSalary,trafficSalary,allSalary,pensionBase,pensionPer,createDate,medicalBase,medicalPer,accumulationFundBase,accumulationFundPer,name
```


pageSalary
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from salary
```


jsonMap
===
```json
{
    "id":"id",
    "basicsalary":"basicSalary",
    "bonus":"bonus",
    "lunchsalary":"lunchSalary",
    "trafficsalary":"trafficSalary",
    "allsalary":"allSalary",
    "pensionbase":"pensionBase",
    "pensionper":"pensionPer",
    "createdate":"createDate",
    "medicalbase":"medicalBase",
    "medicalper":"medicalPer",
    "accumulationfundbase":"accumulationFundBase",
    "accumulationfundper":"accumulationFundPer",
    "name":"name"
}
```
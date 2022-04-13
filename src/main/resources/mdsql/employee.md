cols
===
```sql
id,name,gender,birthday,idCard,wedlock,nationId,nativePlace,politicId,email,phone,address,departmentId,jobLevelId,posId,engageForm,tiptopDegree,specialty,school,beginDate,workState,workID,contractTerm,conversionTime,notWorkDate,beginContract,endContract,workAge
```


pageEmployee
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from employee
```


jsonMap
===
```json
{
    "id":"id",
    "name":"name",
    "gender":"gender",
    "birthday":"birthday",
    "idcard":"idCard",
    "wedlock":"wedlock",
    "nationid":"nationId",
    "nativeplace":"nativePlace",
    "politicid":"politicId",
    "email":"email",
    "phone":"phone",
    "address":"address",
    "departmentid":"departmentId",
    "joblevelid":"jobLevelId",
    "posid":"posId",
    "engageform":"engageForm",
    "tiptopdegree":"tiptopDegree",
    "specialty":"specialty",
    "school":"school",
    "begindate":"beginDate",
    "workstate":"workState",
    "workid":"workID",
    "contractterm":"contractTerm",
    "conversiontime":"conversionTime",
    "notworkdate":"notWorkDate",
    "begincontract":"beginContract",
    "endcontract":"endContract",
    "workage":"workAge"
}
```
cols
===
```sql
id,name,phone,telephone,address,enabled,username,password,userface,remark
```


pageHr
===
```sql
select
-- @pageTag(){
   #{use("cols")}
-- @}
from hr
```


jsonMap
===
```json
{
    "id":"id",
    "name":"name",
    "phone":"phone",
    "telephone":"telephone",
    "address":"address",
    "enabled":"enabled",
    "username":"username",
    "password":"password",
    "userface":"userface",
    "remark":"remark"
}
```
# Script-Transportes-SAP-Windows
Script basado en el shell de Windows, para automatizar la tarea de aplicar transportes en los ambientes.

#Opciones de importación SAP (Unconditional Modes)
| Code | SAP  GUI Description | Explanation|
| :---: | :---: | :---: |
|0 |Leave Transport request in Queue for Later Import| Overtaker, leave the respective task in the buffer, mark it to be imported again (1 or I).|
|1 |Import Transport Request Again| Repeat the import of the transport request from the beginning.|
|2 |Overwrite Originals| Overwrite original objects.|
|6 |Overwrite Objects in Unconfirmed Repairs| Overwrite repaired objects (that are object being in a unconfirmed repair).|
|9 |Ignore Non-Permitted Transport Type| Ignore that this type of transport request currently may not be imported.|
|8 |Ignore Non-Permitted Table Class| ignore restrictions arising from table classes.|
|3 |Ignore Predecessor Relations| Not used any more.|
|4 |Ignore Invalid Component Version| Ignore incorrect component version (as of 7.02 used again)|
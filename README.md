# Script-Transportes-SAP-Windows
Script basado en el shell de Windows, para automatizar la tarea de aplicar transportes en los ambientes.

#Opciones de importación SAP (Unconditional Modes)
| Code | Description |
|--- | --- | 
| 0 | overtaker, leave the respective task in the buffer, mark it to be imported again (1 or I).|
| 1 | repeat the import of the transport request from the beginning.|
| 2 | overwrite original objects.|
| 3 | not used any more.|
| 4 | not used any more.|
| 6 | overwrite repaired objects (that are object being in a unconfirmed repair).|
| 8 | ignore restrictions arising from table classes.|
| 9 | ignore that this type of transport request currently may not be imported.|
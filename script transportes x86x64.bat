:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
:: @authors: Isaac Amezcua, Yanuen Gonzalez.
:: @company: Kio Networks
:: @scope: Internal Use
::
:: This sofware is provided by the contributors as is. Hence, any express or implied
:: or express warranties, including but not limited to the implied warranties of
:: merchantability and fitness for a particular purpose are disclaimed.
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

@echo off
setlocal EnableDelayedExpansion

echo ###############################################################################
echo ###                                                                         ###
echo ###           Bienvenido al script de aplicacion de transportes SAP.        ###
echo ###                                                                         ###
echo ###############################################################################
echo.

REM Configura la variable de entorno %AMBIENTE% en caso de que no se haya hecho previamente.
REM En esta variable, se especifica la ruta del archivo .PFL, del ambiente actual, necesario para la aplicacion de transportes.
IF NOT DEFINED AMBIENTE (
	echo [ERR] No se encontro la ruta del .PFL
	TIMEOUT /T 1 > nul
	echo [INF] Para continuar, es necesario definir la ruta del archivo .PFL
	TIMEOUT /T 1 > nul
:setambiente
	set /P AMBIENTE=[INP] Ingrese la ruta del archivo .PFL: 
	IF [!AMBIENTE!] EQU [] ( 
		goto :setambiente
	) ELSE	(
		SETX /M AMBIENTE !AMBIENTE!
	)
)

IF DEFINED AMBIENTE echo [INF] El archivo .PFL se configuro con la ruta !AMBIENTE! .

REM Configura la variable de entorno %OPCIONES% en caso de que no se haya hecho previamente.
REM En esta variable, se especifican las opciones de importacion.
IF NOT DEFINED OPCIONES (
	echo [ERR] No se definieron las opciones de aplicacion de transportes.
	TIMEOUT /T 1 > nul
	TIMEOUT /T 1 > nul
:setenvironment
	set /P OPCIONES=[INF] Para continuar, definalas aqui ^( Sintaxis: U[0^|1^|2^|3^|4^|6^|8^|9]^): 
	IF [!OPCIONES!] EQU [] ( 
		goto :setenvironment
	) ELSE	(
		SETX /M OPCIONES !OPCIONES!
	)
)

IF DEFINED OPCIONES echo [INF] Configuracion de opciones para aplicacion de transportes: !OPCIONES! .

echo.

set filename=%1
set /a count=0
set /P sid=[INP] Ingresa el SID del cliente: 
set /P cliente=[USR] Ingresa el mandante al que se aplicaran los transportes: 

REM TO-DO: VAlidar.......

for /F "tokens=*" %%L in (%filename%) DO (
	set /a count=!count!+1
) 

echo [INF] El archivo "%filename%", cuenta con: %count% ordenes de transporte.

REM Agregar al bufer
for /F "tokens=*" %%B in (%filename%) DO (
	echo [INF] Agregando al bufer: %%B
	tp addtobuffer %%B !sid! client=!cliente! pf=%AMBIENTE%
	set /a codigo_retorno=!ERRORLEVEL!
	echo [CRT] !codigo_retorno!
	if !codigo_retorno! GTR 0 (
		echo %%B Cod=!codigo_retorno! >> Delbuffer_%filename%.error
		echo [WARN] Revisa la siguiente orden: %%B con código de retorno: !codigo_retorno! .
		goto :eof
	)  else (
		echo %%B !codigo_retorno! >> Delbuffer_%filename%.log
	)
)

REM Importar los transportes
for /F "tokens=*" %%B in (%filename%) DO (
	echo [INF] Aplicando el transporte: %%B
	tp import %%B !sid! client=!cliente! pf=%AMBIENTE% %OPC%
	set /a codigo_retorno=!ERRORLEVEL!
	echo [CRT] !codigo_retorno!
	if !codigo_retorno! GTR 0 (
		echo %%B Cod=!codigo_retorno! >> Delimport_%filename%.error
		echo [WARN] Revisa la siguiente orden: %%B con código de retorno: !codigo_retorno! .
		goto :eof
	)  else (
		echo %%B !codigo_retorno! >> Delimport_%filename%.log
	)
)

:eof

timeout /t 5

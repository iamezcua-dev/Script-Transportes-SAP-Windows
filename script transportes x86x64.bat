:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
:: @authors: Yanuen Gonzalez, Isaac Amezcua, Alejandro Robles.
:: @company: Kio Networks
:: @scope: Internal Use
::
:: This sofware is provided by the contributors as is. Hence, any express or implied
:: or express warranties, including but not limited to the implied warranties of
:: merchantability and fitness for a particular purpose are disclaimed.
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

@echo off
setlocal EnableDelayedExpansion

set filename=%1
set /a count=0
set /P sid=[USR] Ingresa el SID del cliente:
set /P cliente=[USR] Ingresa el mandante al que se aplicaran los transportes:


for /F "tokens=*" %%L in (%filename%) DO (
	set /a count=!count!+1
) 

echo [INF] El archivo "%filename%", cuenta con: %count% ordenes de transporte.

REM Agregar al bufer
for /F "tokens=*" %%B in (%filename%) DO (
	echo [INF] Agregando al bufer: %%B
	tp addtobuffer %%B !sid! client=!cliente! pf=\\ALECCDEV\sapmnt\trans\bin\TP_DOMAIN_AED.PFL
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
	tp import %%B !sid! client=!cliente! pf=\\ALECCDEV\sapmnt\trans\bin\TP_DOMAIN_AED.PFL
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
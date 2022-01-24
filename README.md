Spring-Boot Camel

#Instalar

mvn clean install

#Crear secrets

oc create -f secret.yml

#Crear Propiedades*********** Por favor verifique los valores correspodientes a su ambiente

#Para desplegar en ambiente Development

oc create configmap saldoencargos --from-literal=quickstart.endpoint_SaldoEncargos_Path="/TESTPRUEBA" --from-literal=quickstart.urlBroker="tcp://broker-amq-tcp.proyectopagos-dev.svc.cluster.local:61616" --from-literal=quickstart.TimeOutBroker="3000" --from-literal=quickstart.jdbcConnection_="jdbc:sqlserver://localhost:1433;databasename=master" --from-literal=quickstart.jdbcUserName_="INT_WS" --from-literal=quickstart.jdbcPassword_="sistemas" --from-literal=quickstart.urlEndpoint_servie="testprueba-proyectopagos-dev.cloudappsdesa.fiduprevisora.com.co/fxf/saldoEncargos/testprueba" --from-literal=quickstart.codigoRespuesta_ErrorGeneral="500" --from-literal=quickstart.codigo_ErrorEstructura="500" --from-literal=quickstart.descripcion_ErrorEstructura="Error en estructura de la peticion" --from-literal=quickstart.codigo_ErrorInterno="500" --from-literal=quickstart.descripcion_ErrorInterno="Error interno del servicio" --from-literal=quickstart.codigo_ErrorProveedor="500" --from-literal=quickstart.descripcion_ErrorProveedor="Error de conexion con el proveedor" --from-literal=quickstart.codigo_ErrorTimeOut="500" --from-literal=quickstart.descripcion_ErrorTimeOut="Error de Time Out" --from-literal=quickstart.descripcion_ErrorProcedure="Error al ejecutar procedimiento almacenado" --from-literal=quickstart.query_user_key="user_key" --from-literal=quickstart.query_value="" --from-literal=quickstart.urlElasticSearch="orquestadorbroker-proyectopagos-dev.cloudappsdesa.fiduprevisora.com.co/log/OrquestadorBroker/enviarLog"



#Desplegar en OpenShift
mvn clean -DskipTests fabric8:deploy -Popenshift

#To list all the running pods:

oc get pods
Log oc logs# testingreo

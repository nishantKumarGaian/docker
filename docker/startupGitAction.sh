#!/bin/bash
set -e

export service_name=test-service
export application_pkg=com.sl

export app_path=/etc/conf/$service_name

export jvm_options="-Dspring.config.location=$app_path/ -Dspring.profiles.active=dev";

#if [ -z "$apm_url" ];
#then
#    echo "\$apm_url is empty"
#else
#    export jvm_options="$jvm_options -javaagent:/etc/skywalking-apm/skywalking-agent.jar \
#        -Dskywalking.collector.backend_service=skywalking-oap.default.svc.cluster.local:11800 \
#        -Dskywalking.agent.service_name=$service_name \
#        -Dskywalking.logging.dir=/var/logs/ \
#        -Dskywalking.logging.max_file_size=100000
#        -Dskywalking.logging.max_history_files=2"
#fi

echo "Staring $service_name"

echo "jvm options :  $jvm_options"

exec java $jvm_options -jar test-service.jar

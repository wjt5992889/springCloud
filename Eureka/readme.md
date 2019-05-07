#introduction
>Eureka is a REST (Representational State Transfer) based service 
that is primarily used in the AWS cloud for locating services for the purpose of load balancing 
and failover of middle-tier servers. We call this service, the Eureka Server. Eureka also comes with a Java-based client component,the Eureka Client, which makes interactions with the service much easier. The client also has a built-in load balancer that does basic round-robin load balancing.

>Eureka支持服务动态扩容、缩容、失效剔除。

>Eureka提供了完整的Service Registry和Service Discovery实现，与现有Spring Cloud完美融合。

#architecture
Eureka server       <-------register/renew/cancel-------      service provider
Eureka server       <-------get registy-------                service consumer 
service provider    <-------remote call-------                service consumer     


>Register（服务注册）
>Renew（服务续约）
>Cancel（服务下线） 

#cmd
使用命令可以启动独立的jar保程序。
java -jar XXX.jar
Linux环境下，后台启动命令
nohup java -jar xxx.jar &
备注： Linux查看端口对于的启动程序命令,XXXX代表端口号
netstat -anp|grep XXXX
通过以上命令查到程序对于的信息（包括PID）。如果想停止，可以通过PID（进程ID）杀死相关进程。
kill -9 PID
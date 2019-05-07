#Spring Cloud Notes
==============================================
##Spring Cloud Sub Project
* ###Spring Cloud Config：
>配置管理开发工具包，可以让你把配置放到远程服务器，目前支持本地存储、Git以及Subversion。
* ###Spring Cloud Bus：
>事件、消息总线，用于在集群（例如，配置变化事件）中传播状态变化，可与Spring Cloud Config联合实现热部署。
* ###Spring Cloud Netflix：
>针对多种Netflix组件提供的开发工具包，其中包括Eureka、Hystrix、Zuul、Archaius等。
* ###Netflix Eureka：
>云端负载均衡，一个基于 REST 的服务，用于定位服务，以实现云端的负载均衡和中间层服务器的故障转移。
* ###Netflix Hystrix：
>容错管理工具，旨在通过控制服务和第三方库的节点,从而对延迟和故障提供更强大的容错能力。
* ###Netflix Zuul：
>边缘服务工具，是提供动态路由，监控，弹性，安全等的边缘服务。
* ###Netflix Archaius：
>配置管理API，包含一系列配置管理API，提供动态类型化属性、线程安全配置操作、轮询框架、回调机制等功能。
* ###Spring Cloud for Cloud Foundry：
>通过Oauth2协议绑定服务到CloudFoundry，CloudFoundry是VMware推出的开源PaaS云平台。
* ###Spring Cloud Sleuth：
>日志收集工具包，封装了Dapper,Zipkin和HTrace操作。
* ###Spring Cloud Data Flow：
>大数据操作工具，通过命令行方式操作数据流。
* ###Spring Cloud Security：
>安全工具包，为你的应用程序添加安全控制，主要是指OAuth2。
* ###Spring Cloud Consul：
>封装了Consul操作，consul是一个服务发现与配置工具，与Docker容器可以无缝集成。
* ###Spring Cloud Zookeeper：
>操作Zookeeper的工具包，用于使用zookeeper方式的服务注册和发现。
* ###Spring Cloud Stream：
>数据流操作开发包，封装了与Redis,Rabbit、Kafka等发送接收消息。
* ###Spring Cloud CLI：
>基于 Spring Boot CLI，可以让你以命令行方式快速建立云组件。


##Micro Service Dev 
* ###Codebase：
>从一个代码库部署到多个环境。
* ###Dependencies：
>使用显式的声明隔离依赖，即模块单独运行，并可以显式管理依赖。
* ###Config：
>在系统外部存储配置信息。
* ###Backing Services：
>把支持性服务看做是资源，支持性服务包括数据库、消息队列、缓冲服务器等。
* ###Build, release, run：
>严格的划分编译、构建、运行阶段，每个阶段由工具进行管理。
* ###Processes：
>应用作为无状态执行。
* ###Port binding：
>经由端口绑定导出服务，优先选择 HTTP API 作为通用的集成框架。
* ###Concurrency：
>并发性使用水平扩展实现，对于web就是水平扩展web应用实现。
* ###Disposability：
>服务可处置性，任何服务可以随意终止或启动。
* ###Dev/prod parity：
>开发和生产环境保持高度一致，一键式部署。
* ###Logs：
>将日志看做是事件流来管理，所有参与的服务均使用该方式处理日志。
* ###Admin processes：
>管理任务作为一次性的过程运行（使用脚本管理服务启动和停止）。
# cloud-all
环境搭建
nacos 配置中心，服务的注册和发现
服务的注册：登记
服务的提供者把自己的元数据信息注册到nacos的内存中，供服务的消费方调用；
服务的发现：调用
服务的消费方直接通过服务的提供者的服务名去nacos上获取该提供者的元注册信息，然后返回到调用方的实例列表中，然后调用方直接对提供方的服务发起远程http调用，完成服务之间的传输；
服务的心跳
nacosClient （各个微服务）每隔5s向nacos-server发送心跳，检查nacosClinet的服务可用性，防止服务被踢下线，保证nacosClient服务的正常运行；
服务同步
nacos集群之间互相不同服务实例，保证服务信息的一致性；
服务的健康检查
服务的动态感知上线下线
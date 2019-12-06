# springsession
session缓存服务器
spring:session:expirations:(Set 结构)
    用户 ttl 过期时间记录 这个 k 中的值是一个时间戳，
    根据这个 Session 过期时刻滚动至下一分钟而计算得出。 
    这个 k 的过期时间为 Session 的最大过期时间 +5 分钟。
    
spring:session:sessions:(Hash 结构) 
    maxInactiveInterval：过期时间间隔 
    creationTime：创建时间
    lastAccessedTime：最后访问时间 
    sessionAttr：Attributes 中的数据 存储 Session 的详细信息，
    包括 Session 的过期时间间隔、最后的访问时间、attributes 的值。
    这个 k 的过期时间为 Session 的最大过期时间 +5 分钟。

spring:session:sessions:expires:(String 结构)
    过期时间记录 这个 k-v 不存储任何有用数据，只是表示 Session 过期而设置。 
    这个 k 在 Redis 中的过期时间即为 Session 的过期时间间隔。



01-session-service1
01-session-service2
    使用redis实现session共享
    都使用同一个namespace
    service1设置值，在service2中可取取到session中的值

02-session-mongodb-service1
02-session-mongodb-service2
    使用mongodb方式实现session共享
    maxInactiveIntervalInSeconds：设置 Session 失效时间 
    collectionName：设置 MongoDB 的 Collections 的名称
    bind_ip=0.0.0.0 mongodb配置文件中加入，不然其他ip访问不到服务
    
    mongodb中的存储内容
    { "_id" : "fe3f6cea-c3e2-426b-a47a-cf21c5b848cb", "created" : ISODate("2019-07-12T12:46:48.916Z"), "accessed" : ISODate("2019-07-12T12:46:48.919Z"), "interval" : "PT30M", "principal" : null, "expireAt" : ISODate("2019-07-12T13:16:48.919Z"), "attr" : BinData(0,"rO0ABXNyABFqYXZhLnV0aWwuSGFzaE1hcAUH2sHDFmDRAwACRgAKbG9h ZEZhY3RvckkACXRocmVzaG9sZHhwP0AAAAAAAAx3CAAAABAAAAABdAAFdXNlcnN zcgAcY29tLmJqc3h0Lm1vbmdvLmRvbWFpbi5Vc2Vyc5EM02IkljhzAgACTAAIdXNlcm5hbW
    V0ABJMamF2YS9sYW5nL1N0cmluZztMAAd1c2VycHdkcQB+AAR4cHQABWFkbWludAAF YWRtaW54")}

# springsession
session缓存服务器
spring:session:expirations:(Set 结构)用户 ttl 过期时间记录 这个 k 中的值是一个时间戳，根据这个 Session 过期时刻滚动至下一分钟而计算得出。 这个 k 的过期时间为 Session 的最大过期时间 +5 分钟。
spring:session:sessions:(Hash 结构) maxInactiveInterval：过期时间间隔 creationTime：创建时间
lastAccessedTime：最后访问时间 sessionAttr：Attributes 中的数据 存储 Session 的详细信息，包括 Session 的过期时间间隔、最后的访问时间、attributes 的值。这个 k 的过期时间为 Session 的最大过期时间 +5 分钟。
spring:session:sessions:expires:(String 结构)过期时间记录 这个 k-v 不存储任何有用数据，只是表示 Session 过期而设置。 这个 k 在 Redis 中的过期时间即为 Session 的过期时间间隔。


都使用同一个namespace
01-session-service1
向seesion中存入数据

01-session-service2
向session中取出数据

``
#1 redis 常见数据结构
string
hash
set
zset 压缩列表+跳表
list
bitmap
geo
hyperlog

#2 redis 底层数据结构
简单动态字符串（SDS, Simple Dynamic String）：
Redis的字符串对象使用的是SDS，它是一个为运行时修改字符串而设计的动态字符串。SDS不仅保存字符串数据，还保存字符串的长度，使得对字符串长度的获取非常快速。

链表（Linked List）：
Redis的列表（list）数据结构使用双向链表实现，每个列表项（list node）由一个指针连接到前一个和后一个元素。

字典（Hash Table）：
Redis的哈希表（hash）和集合（set）使用字典实现。字典是一个数组，其中的每个元素是一个指向另一个数据结构的指针，这个数据结构可以是列表、压缩列表或跳跃表。

压缩列表（Ziplist）：
当列表和哈希表的元素数量较少且每个元素的体积较小时，Redis使用压缩列表作为它们的底层实现。压缩列表是一个连续内存区域，可以高效地存储一系列小元素。

整数集合（Intset）：
整数集合用于有序集合（sorted set）中，当所有元素都是整数且元素数量较少时使用。整数集合是一个数组，其中的元素按照从小到大的顺序排列。

跳跃表（Skiplist）：
当列表或有序集合的元素数量较多或元素体积较大时，Redis使用跳跃表作为它们的底层实现。跳跃表是一种有序数据结构，可以快速地进行查找、插入和删除操作。

#2 redis 常见命令
set key value
get key
setnx key value timeout
hset key field value
hget key field
hgetall key
lpush key value
lrange key start end
lpop key
rpush key value
rpop key
sadd key value
smembers key
srem key value
zadd key score member
zrem key member
zrevrange key start end
zrevrangebyscore key max min

#3 redis 常见问题
1、缓存击穿
缓存预热、互斥锁
2、缓存穿透
缓存空对象、布隆过滤器
3、缓存雪崩
集群部署，过期时间随机，热点数据永不过期
缓存预热：

#4 redis 常见问题
数据库不一致问题：
双删策略：
双删策略有什么问题
延迟双删策略
延迟双删策略有什么问题
基于binlog+canel+kafka的方案


大key如何处理
缓存过期策略
淘汰策略

#5、redis 持久化
rdb save bgsave 快照 一段时间内的快照
aof 追加命令
4.0之后混合持久化

#6、redis 集群
主从模式
哨兵模式 主观下线 客观下线
集群模式 16384哈希槽
状态复制机机制

#7 redis 线上问题
慢查询问题
连接池配置
数据同步问题 使用一致性hash算法


#redis 内存模型
1、内存模型
I/O 线程模型
socket监听
文件描述符
文件分发器
queue
文件请求、处理、返回




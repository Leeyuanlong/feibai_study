# 《Redis使用手册》随书示例程序源码



本项目展示了《Redis使用手册》一书的随书示例程序源码，其中包含缓存、锁、登录会话、社交关系、时间线、消息队列等多个经典的 Redis 应用示例，是学习和研究 Redis 的绝佳资源。

要了解关于《Redis使用手册》的更多信息，请访问书本的读者服务网站： [RedisGuide.com](http://redisguide.com/) 。

## 组织方式

本项目根据示例程序在书本中出现的大章对其进行归类，比如 ``string`` 文件夹就存放了书本《字符串》一章中的所有示例程序代码，而 ``sorted_set`` 文件夹则存放了书本《有序集合》一章中的所有示例程序代码，以此类推。

本项目的所有示例程序均配有相应的测试文件，这些文件与被测试程序处于同一文件夹之下，并且按照 Python 惯例以 ``test_*.py`` 格式进行命名：比如缓存程序 ``cache.py`` 的测试文件就为 ``test_cache.py`` ，而锁程序 ``lock.py`` 的测试文件则为 ``test_lock.py`` 等等。

## 版本要求

- Redis 5.0 或以上
- Python 3.7.3 或以上
- redis-py 3.2.1 或以上

## 注意事项

警告！本项目的测试代码在运行时会**清空 Redis 数据库**，请确保你仅在测试环境中运行本项目的测试代码。

本项目不负担任何因为使用本项目而造成的数据丢失责任。

## 许可证明

本项目中的所有代码均采用[知识共享署名-非商业性使用-相同方式共享](https://creativecommons.org/licenses/by-nc-sa/2.5/cn/)进行许可。![CC协议](https://licensebuttons.net/l/by-nc-sa/2.5/cn/88x31.png)

根据协议，你可以在非商业项目中使用本项目，又或者以相同方式修改和共享本项目，但是必需指出该项目的出处，也即是“《Redis使用手册》”或者“RedisGuide.com”。

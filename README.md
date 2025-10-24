# Spring Gateway

# 🔍Trouble
```groovy
ava.net.UnknownHostException: Failed to resolve 'DESKTOP-12MCCAQ.mshome.net' [A(1)] after 2 queries 
	at io.netty.resolver.dns.DnsResolveContext.finishResolve(DnsResolveContext.java:1150) ~[netty-resolver-dns-4.1.127.Final.jar:4.1.127.Final]
	Suppressed: reactor.core.publisher.FluxOnAssembly$OnAssemblyException: 
Error has been observed at the following site(s):
	*__checkpoint ⇢ org.springframework.cloud.gateway.filter.WeightCalculatorWebFilter [DefaultWebFilterChain]
	*__checkpoint ⇢ HTTP GET "/routines/hello" [ExceptionHandlingWebHandler]
Original Stack Trace:
		at io.netty.resolver.dns.DnsResolveContext.finishResolve(DnsResolveContext.java:1150) ~[netty-resolver-dns-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.resolver.dns.DnsResolveContext.tryToFinishResolve(DnsResolveContext.java:1097) ~[netty-resolver-dns-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.resolver.dns.DnsResolveContext.query(DnsResolveContext.java:455) ~[netty-resolver-dns-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.resolver.dns.DnsResolveContext.onResponse(DnsResolveContext.java:686) ~[netty-resolver-dns-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.resolver.dns.DnsResolveContext.access$500(DnsResolveContext.java:70) ~[netty-resolver-dns-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.resolver.dns.DnsResolveContext$2.operationComplete(DnsResolveContext.java:513) ~[netty-resolver-dns-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:603) ~[netty-common-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.util.concurrent.DefaultPromise.notifyListeners0(DefaultPromise.java:596) ~[netty-common-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:572) ~[netty-common-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:505) ~[netty-common-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:649) ~[netty-common-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.util.concurrent.DefaultPromise.setSuccess0(DefaultPromise.java:638) ~[netty-common-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.util.concurrent.DefaultPromise.trySuccess(DefaultPromise.java:118) ~[netty-common-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.resolver.dns.DnsQueryContext.trySuccess(DnsQueryContext.java:308) ~[netty-resolver-dns-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.resolver.dns.DnsQueryContext.finishSuccess(DnsQueryContext.java:299) ~[netty-resolver-dns-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.resolver.dns.DnsNameResolver$DnsResponseHandler.channelRead(DnsNameResolver.java:1491) ~[netty-resolver-dns-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444) ~[netty-transport-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420) ~[netty-transport-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412) ~[netty-transport-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107) ~[netty-codec-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444) ~[netty-transport-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420) ~[netty-transport-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412) ~[netty-transport-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1357) ~[netty-transport-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440) ~[netty-transport-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420) ~[netty-transport-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:868) ~[netty-transport-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.channel.nio.AbstractNioMessageChannel$NioMessageUnsafe.read(AbstractNioMessageChannel.java:97) ~[netty-transport-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796) ~[netty-transport-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732) ~[netty-transport-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658) ~[netty-transport-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562) ~[netty-transport-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998) ~[netty-common-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74) ~[netty-common-4.1.127.Final.jar:4.1.127.Final]
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30) ~[netty-common-4.1.127.Final.jar:4.1.127.Final]
		at java.base/java.lang.Thread.run(Thread.java:1447) ~[na:na]
Caused by: io.netty.resolver.dns.DnsErrorCauseException: Query failed with NXDOMAIN
	at io.netty.resolver.dns.DnsResolveContext.onResponse(..)(Unknown Source) ~[netty-resolver-dns-4.1.127.Final.jar:4.1.127.Final]

2025-10-24T16:02:17.494+09:00 DEBUG 9992 --- [gateway-service] [ctor-http-nio-2] r.n.http.server.HttpServerOperations     : [0d01f226-2, L:/[0:0:0:0:0:0:0:1]:9000 - R:/[0:0:0:0:0:0:0:1]:51564] Last HTTP response frame
2025-10-24T16:02:17.494+09:00 DEBUG 9992 --- [gateway-service] [ctor-http-nio-2] r.n.http.server.HttpServerOperations     : [0d01f226-2, L:/[0:0:0:0:0:0:0:1]:9000 - R:/[0:0:0:0:0:0:0:1]:51564] Headers are not sent before onComplete().
2025-10-24T16:02:17.496+09:00 DEBUG 9992 --- [gateway-service] [ctor-http-nio-2] r.n.http.server.HttpServerOperations     : [0d01f226-2, L:/[0:0:0:0:0:0:0:1]:9000 - R:/[0:0:0:0:0:0:0:1]:51564] Decreasing pending responses count: 0
2025-10-24T16:02:17.496+09:00 DEBUG 9992 --- [gateway-service] [ctor-http-nio-2] r.n.http.server.HttpServerOperations     : [0d01f226-2, L:/[0:0:0:0:0:0:0:1]:9000 - R:/[0:0:0:0:0:0:0:1]:51564] Last HTTP packet was sent, terminating the channel
2025-10-24T16:02:42.152+09:00 DEBUG 9992 --- [gateway-service] [reshExecutor-%d] o.s.c.g.r.RouteDefinitionRouteLocator    : RouteDefinition routine-service applying {_genkey_0=/routines/**} to Path
2025-10-24T16:02:42.155+09:00 DEBUG 9992 --- [gateway-service] [reshExecutor-%d] o.s.c.g.r.RouteDefinitionRouteLocator    : RouteDefinition routine-service applying filter {_genkey_0=/routines/(?<segment>.*), _genkey_1=/${segment}} to RewritePath
2025-10-24T16:02:42.157+09:00 DEBUG 9992 --- [gateway-service] [reshExecutor-%d] o.s.c.g.r.RouteDefinitionRouteLocator    : RouteDefinition matched: routine-service
2025-10-24T16:03:12.174+09:00 DEBUG 9992 --- [gateway-service] [reshExecutor-%d] o.s.c.g.r.RouteDefinitionRouteLocator    : RouteDefinition routine-service applying {_genkey_0=/routines/**} to Path
2025-10-24T16:03:12.181+09:00 DEBUG 9992 --- [gateway-service] [reshExecutor-%d] o.s.c.g.r.RouteDefinitionRouteLocator    : RouteDefinition routine-service applying filter {_genkey_0=/routines/(?<segment>.*), _genkey_1=/${segment}} to RewritePath
2025-10-24T16:03:12.185+09:00 DEBUG 9992 --- [gateway-service] [reshExecutor-%d] o.s.c.g.r.RouteDefinitionRouteLocator    : RouteDefinition matched: routine-service
```
<img width="1867" height="212" alt="image" src="https://github.com/user-attachments/assets/b6a87183-fbb1-4071-8296-773661b3061d" />
- 유레카에 등록되었지만 유레카에 등록된 이름으로 DNS 검색하여 문제
## 해결
<details>
	<summary>시도 순서</summary>
	1. 웹 검색과 공식 문서에서 Spring cloud를 찾아 보았다. 
	2. 디스커버리 클라이언트 서버에 eureka.instance.prefer-ip-address:true로 설정하여도 문제가 해결되지 않았다.
	3. 주소의 문제인가 싶어 cmd 창에서 ipconfig를 사용해 내 주소를 알아내 서버에 주소를 바꿔 보았다.
	4. 문제가 끝내 해결되지 않아 캐시 무효화로 모든 캐시를 삭제 해보았지만 유레카 서버와 클라이언트는 DESKTOP... 서버 이름으로 등록된다.
	5. Local의 DNS 문제인지 hosts 파일을 검사해보았다.
 </details>
 - ip-address만 적는게 아니라 instance-id와 함께 명시해야 유레카 서버에 정상적으로 등록되었다.
 ```groovy
 eureka:
  instance:
    prefer-ip-address: true
    ip-address: 192.168.0.1
    instance-id: ${eureka.instance.ip-address}:${server.port}
 ```
 <img width="1861" height="152" alt="image" src="https://github.com/user-attachments/assets/b8d88031-93d6-4d35-8824-fefa669668fd" />

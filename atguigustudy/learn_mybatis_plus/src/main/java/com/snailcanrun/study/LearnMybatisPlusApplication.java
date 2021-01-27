package com.snailcanrun.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@ServletComponentScan(basePackages = "com.snailcanrun.study")
@SpringBootApplication
public class LearnMybatisPlusApplication /*implements CommandLineRunner*/ {

    public static void main(String[] args) {
        SpringApplication.run(LearnMybatisPlusApplication.class, args);
    }
//    @Autowired
//    NettyServer nettyServer;
//
//    @Override
//    public void run(String... args) throws Exception {
//        ChannelFuture start = nettyServer.start();
//        Runtime.getRuntime().addShutdownHook(new Thread(){
//            @Override
//            public void run() {
//                nettyServer.destroy();
//            }
//        });
//        start.channel().closeFuture().syncUninterruptibly();
//
//    }
}

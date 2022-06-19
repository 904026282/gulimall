package com.example.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


@SpringBootTest
class GulimallThirdPartyApplicationTests {
    @Autowired
    OSSClient ossClient;

    @Test
    void contextLoads() {
    }

    @Test
    void oss() throws FileNotFoundException {
        // 上传文件流。
        InputStream inputStream = new FileInputStream("D:\\资料\\3.大型电商--谷粒商城\\1.分布式基础（全栈开发篇）\\Default.jpg");
        ossClient.putObject("wangyangyang", "Default.jpg", inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();

        System.out.println("上传成功");
    }
}

package com.snailcanrun.study.converter;

import com.snailcanrun.study.entity.User;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * author:zhouyiqiu
 * createTime:2021/1/22 15:21
 */
public class MyMessageConverter implements HttpMessageConverter<User> {

    /**
     * controller里面参数满足什么条件的时候，标注@RequestBody可以使用本MessageConverter接口对应的参数
     * @param aClass
     * @param mediaType
     * @return
     */
    @Override
    public boolean canRead(Class<?> aClass, MediaType mediaType) {
        return false;
    }

    /**
     * controller里面返回值满足什么条件的时候,标注@ResponseBody即可以使用本MessageConverter返回自定的数据格式给浏览器
     * @param aClass
     * @param mediaType
     * @return
     */
    @Override
    public boolean canWrite(Class<?> aClass, MediaType mediaType) {
        return aClass.isAssignableFrom(User.class);
    }

    /**
     * 服务器要统计所有MessageConverter都能写出哪些内容类型
     *
     * application/x-zyq
     * @return
     */
    @Override
    public List<MediaType> getSupportedMediaTypes() {
        return MediaType.parseMediaTypes("application/x-zyq");
    }

    @Override
    public User read(Class<? extends User> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    public void write(User user, MediaType mediaType, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        String data = user.getUsername()+";"+user.getPassword();

        OutputStream body = httpOutputMessage.getBody();
        body.write(data.getBytes());
    }
}

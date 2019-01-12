package com.moon.ancientpoetry.common.util;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/11 16:18
 * @Description:
 */
public class MailUtil {
    public static void sendTextEmail(String subject, String content, String toEmailAccount)
    {
        //
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

        Properties javaMailProperties = new Properties();
        javaMailProperties.put("mail.smtp.auth", "true");//一定要引号引起来
        javaMailProperties.put("mail.smtp.timeout", "25000");
        javaMailProperties.put("mail.smtp.socketFactory.fallback", "false");
        mailSender.setJavaMailProperties(javaMailProperties);
        // 参考QQ邮箱帮助中心
        mailSender.setHost("smtp.qq.com"); // QQ邮箱smtp发送服务器地址
        mailSender.setPort(587);// 端口号
        mailSender.setUsername("429454208@qq.com"); // 使用你自己的账号
        mailSender.setPassword("fuyklksldqpmbjee"); // 授权码-发短信获取
        MimeMessage mailMessage = mailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage);

        try
        {
            messageHelper.setFrom("429454208@qq.com"); // 发件人邮箱
            messageHelper.setTo(toEmailAccount); // 收件人邮箱
            messageHelper.setSubject(subject); // 标题

            messageHelper.setText(content, true);

            mailSender.send(mailMessage);
        }
        catch (MessagingException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        sendTextEmail("测试","12312312312", "epay_two@163.com");
    }
}

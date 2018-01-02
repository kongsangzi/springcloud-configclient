package cn.et;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class Config {

	@Value("${driverClass}")
	private String driverClass;
	
	@Value("${password2}")
	private String password2;
	
	@Value("${url}")
	private String url;
	
	@Value("${userid}")
	private String userid;
	
	@Bean
	public DataSource myDataSource(){
		DruidDataSource dds=new DruidDataSource();
		dds.setUrl(url);
		dds.setDriverClassName(driverClass);
		dds.setUsername(userid);
		dds.setPassword(password2);
		return dds;
	}
}

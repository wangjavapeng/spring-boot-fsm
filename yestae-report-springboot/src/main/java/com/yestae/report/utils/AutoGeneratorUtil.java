package com.yestae.report.utils;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 
 * 自动生成映射工具类
 *
 */
public class AutoGeneratorUtil {

	public static void main(String[] args) {
		AutoGenerator mpg = new AutoGenerator();

		// 全局配置
		GlobalConfig gc = new GlobalConfig();
		gc.setOutputDir("C:\\Users\\wangpeng\\Desktop\\report");
		gc.setFileOverride(true);
		// 开启 activeRecord 模式
		gc.setActiveRecord(false);
		// XML 二级缓存
		gc.setEnableCache(false);
		// XML ResultMap
		gc.setBaseResultMap(true);
		// XML columList
		gc.setBaseColumnList(false);
		gc.setAuthor("wp");
		gc.setServiceImplName("%sService");
		mpg.setGlobalConfig(gc);

		// 数据源配置
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setDbType(DbType.MYSQL);
		dsc.setTypeConvert(new MySqlTypeConvert());
		dsc.setDriverName("com.mysql.jdbc.Driver");
		dsc.setUsername("root");
		dsc.setPassword("root");
		dsc.setUrl("jdbc:mysql://127.0.0.1:3306/spring-machine-test?useUnicode=true&characterEncoding=utf8&useSSL=false");
		mpg.setDataSource(dsc);

		// 策略配置
		StrategyConfig strategy = new StrategyConfig();
		strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
		strategy.setInclude(new String[] { "order_test" }); // 需要生成的表
		// 自定义实体父类
//		strategy.setSuperEntityClass("com.yestae.common.entity.BaseEntity");
		// 自定义实体，公共字段
		// strategy.setSuperEntityColumns(new String[] { "test_id", "age" });
		// 自定义 mapper 父类
		strategy.setSuperMapperClass("com.baomidou.mybatisplus.mapper.BaseMapper");
		// 自定义 service 父类
		strategy.setSuperServiceClass("com.baomidou.mybatisplus.service.IService");
		// 自定义 service 实现类父类
		strategy.setSuperServiceImplClass("com.baomidou.mybatisplus.service.impl.ServiceImpl");
		mpg.setStrategy(strategy);

		// 包配置
		PackageConfig pc = new PackageConfig();
		pc.setModuleName("order");
		pc.setParent("com.yestae");// 自定义包路径
		mpg.setPackageInfo(pc);
		// 执行生成
		mpg.execute();
	}

}

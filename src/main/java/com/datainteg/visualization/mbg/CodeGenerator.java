package com.datainteg.visualization.mbg;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.builder.GeneratorBuilder;
import com.baomidou.mybatisplus.generator.config.po.LikeTable;
import com.baomidou.mybatisplus.generator.config.querys.ClickHouseQuery;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CodeGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(CodeGenerator.class);
    private static final String REPLACE_LOCAL_PATH = "/target/classes/";
    private static final String JAVA_PATH = "/src/main/java";

    public static void main(String[] args) {

        // 获取项目路径
        String projectPath = ClassLoader.getSystemResource("").getPath().replace(REPLACE_LOCAL_PATH, "");
        // 全局配置
        GlobalConfig gc = GeneratorBuilder.globalConfigBuilder()
                .fileOverride().openDir(false)
                .outputDir(projectPath + JAVA_PATH)
                .author("generator")
                .commentDate("yyyy-MM-dd").build();

        LOGGER.error(projectPath + JAVA_PATH);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig
                .Builder("jdbc:clickhouse://localhost:8123", "default", "")
                .dbQuery(new ClickHouseQuery())
                .schema("dm")
                .build();


        // 包配置
        PackageConfig pc = GeneratorBuilder
                .packageConfigBuilder()
                .parent("com.datainteg.visualization")
                .entity("mbg.model")
                .mapper("mbg.mapper")
                .build();

        // 策略配置
        StrategyConfig strategy = GeneratorBuilder.strategyConfigBuilder()
                .likeTable(new LikeTable("info"))
                .addTablePrefix()
                .controllerBuilder().enableHyphenStyle()
                .entityBuilder()
                .enableTableFieldAnnotation()
                .naming(NamingStrategy.underline_to_camel)
                .columnNaming(NamingStrategy.underline_to_camel)
                .versionColumnName("version").logicDeleteColumnName("isDelete")
                .enableLombok()
                .build();

        //配置模板
        TemplateConfig templateConfig = GeneratorBuilder.templateConfigBuilder().build();

        // 代码生成器
        AutoGenerator mpg = new AutoGenerator(dsc)
                .global(gc)
                .strategy(strategy)
                .template(templateConfig)
                .packageInfo(pc);

        mpg.execute(new FreemarkerTemplateEngine());

    }
}

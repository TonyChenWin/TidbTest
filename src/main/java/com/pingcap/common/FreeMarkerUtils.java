package com.pingcap.common;


import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;
import org.springframework.util.ResourceUtils;

public class FreeMarkerUtils {

    public static Configuration getCfg() throws Exception {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_22);
        cfg.setDirectoryForTemplateLoading(ResourceUtils.getFile("classpath:templates"));
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        return cfg;
    }
}

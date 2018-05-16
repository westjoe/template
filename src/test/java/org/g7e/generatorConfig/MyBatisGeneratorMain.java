package org.g7e.generatorConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MyBatisGeneratorMain {
	//private static final Logger LOGGER = LoggerFactory.getLogger(MyBatisGeneratorMain.class);

	@Test
	public void generator() throws Exception {
		try {
			List<String> warnings = new ArrayList<String>();
			boolean overwrite = true;
			String file = getClass().getResource("/generatorConfig/generatorConfig.xml").getFile();
			File configFile = new File(file);
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp.parseConfiguration(configFile);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
			myBatisGenerator.generate(null);
		} catch (Exception e) {
			//LOGGER.error(e.getMessage(), e);
			throw e;
		}
	}
	
	
	
}

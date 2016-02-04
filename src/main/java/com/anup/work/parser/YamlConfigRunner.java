package com.anup.work.parser;

import com.anup.work.pojo.Configuration;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

public class YamlConfigRunner {
    public void parse() throws Exception {
        Yaml yaml = new Yaml();

        String fileName = "src/main/resources/sample.yml";
        try {
            //InputStream in = (FileInputStream )this.getClass().getClassLoader().getResourceAsStream("sample.yml);
            InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("sample.yml");
            //String s = new String(Files.readAllBytes(Paths.get(fileName)));
            //.getResourceAsStream("/sample.yml");
            //String s = new String(Files.readAllBytes(Paths.get(fileName)));

            //URL url = this.getClass().getClassLoader().getResource("sample.yml");
            //File file = new File(url.toURI());
            //Configuration config = yaml.loadAs( new FileInputStream(file), Configuration.class );
            Configuration config = yaml.loadAs( resourceAsStream, Configuration.class );
            System.out.println( config.toString() );
        }
        catch (Exception ex){
            //ex.printStackTrace();
            throw ex;
        }
    }
}
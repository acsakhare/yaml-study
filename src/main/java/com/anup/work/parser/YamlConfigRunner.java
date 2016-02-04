package com.anup.work.parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.anup.work.pojo.Configuration;
import org.yaml.snakeyaml.Yaml;

public class YamlConfigRunner {
    public static void parse() throws Exception {
        Yaml yaml = new Yaml();

        try( InputStream in = Files.newInputStream( Paths.get("src/resources/sample.yml") ) ) {
            Configuration config = yaml.loadAs( in, Configuration.class );
            System.out.println( config.toString() );
        }
    }
}
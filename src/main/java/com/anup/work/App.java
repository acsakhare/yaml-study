package com.anup.work;

import com.anup.work.parser.YamlConfigRunner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        new YamlConfigRunner().parse();
    }
}

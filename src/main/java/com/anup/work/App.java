package com.anup.work;

import com.anup.work.parser.YamlConfigRunner;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        YamlConfigRunner.parse();
    }
}

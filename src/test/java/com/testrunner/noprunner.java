package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\DELL\\Desktop\\workspace\\cucmber\\src\\test\\java\\feature\\cu.feature",
glue ="stepdefentions",
monochrome =true
,
dryRun = false,
tags = "@smoketest",
plugin= {"pretty",
		
		
}
		)


public class noprunner{ 

}

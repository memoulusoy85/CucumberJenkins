package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


        @RunWith(Cucumber.class)
        @CucumberOptions(
                plugin = {"json:target/cucumber.json",
                           "html:target/default-html-reports",
                            "rerun:target/rerun.txt"},
                features = "src/test/resources/features",
                glue = "com/vytrack/step_definitions",
                dryRun = false,
                tags = "@login"
                //tags = "@login and not @wip" //run all login but not @wip
                //tags = "@driver or @store_manager"
               // tags = "@driver and @VYT-123"   // tags = "@login"

        )
        public class CukesRunner {


        }
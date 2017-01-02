package io.github.ycoulon.sample.test;

import org.activiti.app.conf.ActivitiEngineConfiguration;
import org.activiti.app.conf.ApplicationConfiguration;
import org.activiti.app.conf.DatabaseConfiguration;
import org.activiti.app.conf.JacksonConfiguration;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ycoulon on 01/01/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ActivitiEngineConfiguration.class, DatabaseConfiguration.class, JacksonConfiguration.class})
public class SampleTest {
    @Test
    public void testIntroProcess() {


        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        assertNotNull(processEngine);
    }
}

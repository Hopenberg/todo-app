package io.hopenberg.apps.controller;

import io.hopenberg.apps.TaskConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    final private DataSourceProperties dataProperties;
    final private TaskConfigurationProperties taskProperties;

    public InfoController(final DataSourceProperties dataProperties, final TaskConfigurationProperties taskProperties) {
        this.dataProperties = dataProperties;
        this.taskProperties = taskProperties;
    }

    @GetMapping("/info/url")
    String url() {
        return dataProperties.getUrl();
    }

    @GetMapping("/info/prop")
    boolean allowMultipleTasksFromTemplate() {
        return taskProperties.getTemplate().isAllowMultipleTasks();
    }
}

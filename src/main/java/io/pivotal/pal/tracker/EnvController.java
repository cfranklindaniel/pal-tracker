package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EnvController {

    public String port;
    public String memoryLimit;
    public String cfInstanceIndex;
    public String cfInstanceAddr;

    public EnvController(@Value("${port:NOT SET}") String port, @Value("${memory.limit:NOT SET}") String memoryLimit, @Value("${cf.instance.index: NOT SET}") String cfInstanceIndex, @Value("${cf.instance.addr:NOT SET}") String cfInstanceAddr) {

        this.port = port;
        this.memoryLimit = memoryLimit;
        this.cfInstanceIndex =cfInstanceIndex;
        this.cfInstanceAddr = cfInstanceAddr;

    }

    @GetMapping("/env")
    public Map<String, String> getEnv() {

        Map<String, String> env = new HashMap<String, String>();

        env.put("PORT", this.port);
        env.put("MEMORY_LIMIT", this.port);
        env.put("CF_INSTANCE_INDEX", this.port);
        env.put("CF_INSTANCE_ADDR", this.port);

        return env;
    }
}

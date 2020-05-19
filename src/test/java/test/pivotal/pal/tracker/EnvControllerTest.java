package test.pivotal.pal.tracker;

import org.junit.jupiter.api.Test;

import java.util.Map;
import io.pivotal.pal.tracker.EnvController;

import static org.assertj.core.api.Assertions.assertThat;

public class EnvControllerTest {
    @Test
    public void getEnv() throws Exception {
        EnvController controller = new EnvController(
            "NOT SET",
            "NOT SET",
            "NOT SET",
            "NOT SET"
        );

        Map<String, String> env = controller.getEnv();

        assertThat(env.get("PORT")).isEqualTo("NOT SET");
        assertThat(env.get("MEMORY_LIMIT")).isEqualTo("NOT SET");
        assertThat(env.get("CF_INSTANCE_INDEX")).isEqualTo("NOT SET");
        assertThat(env.get("CF_INSTANCE_ADDR")).isEqualTo("NOT SET");
    }

}
